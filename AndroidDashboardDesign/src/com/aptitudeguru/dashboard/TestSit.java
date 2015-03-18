package com.aptitudeguru.dashboard;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

import com.epapyrus.plugpdf.core.annotation.acroform.TextField;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import androidhive.dashboard.R;



public class TestSit extends Activity implements OnClickListener {

	TextView t1,t2;
	TextField te1;
	//Hello
	
	int count=1;
	int start=1;
	
	static int min=0,sec=0;;
	int index1=0,index=0,index3=0;
	int b[]=new int[40];
	int ans[]=new int[40];
	int ansindex=0;
	//NewsFeedActivity n=new NewsFeedActivity();
    String cat="";
	int click=0;
	int a[]=new int[40]; 
	int initial[]=new int[40];
	int initans[]=new int[40];
	int givenans[]=new int[40];
	int gotoclick[]=new int[20];
	
	Random r=new Random();
	int STATIC_INTEGER_VALUE=1;
	String PUBLIC_STATIC_STRING_IDENTIFIER;
	final Context context = this;
	String time;
	
	   DatabaseHandler db = new DatabaseHandler(this);

	  // String category="7777";
	   	 private Button startB;
	   	 public TextView text;
	 
	   	 int k1=0;
		   	
	   @Override
       public void onActivityResult(int requestCode,int resultCode,Intent data)
       {
        super.onActivityResult(requestCode, resultCode, data);
        String extraData=data.getStringExtra("ComingFrom");
        int j1=Integer.parseInt(extraData);
        Log.d("passed id: ", j1+"");
        Log.d("getting",extraData);
        Log.d("getting",extraData);
        int j2=a[j1];
        click=j1;
        
        CTable q=db.getC(j2,cat);
        //i=i+1;
        String j= q.getQues();
        t1.setText(j);
        t2.setText("   "+(j1+1)+"/20");
        Log.d("id: ", j2+"");
        
       }
	   
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.test);
	        
	        Bundle bundle = getIntent().getExtras();
	         cat = bundle.getString("cat");
	        start=bundle.getInt("start");
	        Log.d("category",cat);

	   	  text = (TextView) this.findViewById(R.id.timer);
	        
	       AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

			TextView title = new TextView(context);
           title.setText("Aptitude App");
           title.setBackgroundColor(Color.DKGRAY);
           title.setPadding(10, 10, 10, 10);
           title.setGravity(Gravity.CENTER);
           title.setTextColor(Color.WHITE);
           title.setTextSize(20);
           alertDialogBuilder.setCustomTitle(title);
 
			// set dialog message
			alertDialogBuilder
				.setMessage("Start Test?")
				.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						
						     //next
							dialog.cancel();
					}
				  })
				.setNegativeButton("No",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
					
						TestSit.this.finish();
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
			
	   	
	      /**
	         * Creating all buttons instances
	         * */
	        // Dashboard News feed button
	        Button btn_home = (Button) findViewById(R.id.btn_home);
	        
	        // Dashboard Friends button
	        Button btn_fav = (Button) findViewById(R.id.btn_fav);
	        
	        // Dashboard Messages button
	        Button btn_hint = (Button) findViewById(R.id.btn_hint);
	        
	        // Dashboard Places button
	        Button btn_goto = (Button) findViewById(R.id.btn_goto);
	        
	        // Dashboard Events button
	        Button btn_help = (Button) findViewById(R.id.btn_help);
			
			btn_help.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(),
						help1.class);

					startActivity(i);
				}
			});
			
	        Button btn_finish = (Button) findViewById(R.id.btn_finish);
	        
	        // PAUSE TEST CODE
	        Button btn_pause = (Button) findViewById(R.id.btn_pause);
	        
	        //EditText editText = (EditText) findViewById(R.id.search);

	        /**
	         * Handling all button click events
	         * */
       
	        //This needs to turn into "Submit Answer" Button instead.
	        btn_finish.setOnClickListener(new OnClickListener() {
	        	 
	    		@Override
	    		public void onClick(View arg0) {
	     
	    			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
	     
	    			
	    			TextView title = new TextView(context);
		            title.setText("Aptitude App");
		            title.setBackgroundColor(Color.DKGRAY);
		            title.setPadding(10, 10, 10, 10);
		            title.setGravity(Gravity.CENTER);
		            title.setTextColor(Color.WHITE);
		            title.setTextSize(20);
		            alertDialogBuilder.setCustomTitle(title);

	    			
	    			// set title
	    		//alertDialogBuilder.setTitle();
	     
	    			// set dialog message
	    			alertDialogBuilder
	    				.setMessage("Click yes to exit!")
	    				.setCancelable(false)
	    				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
	    					public void onClick(DialogInterface dialog,int id) {
	    						// if this button is clicked, close
	    						// current activity
	    						Intent i = new Intent(getApplicationContext(), ShowScorec.class);
	    					    time=text.getText()+"";
	    					 
	    					    sec=sec+40;
	    					    String timetaken=min+"."+sec+"";
	    					    
	    					   
	    					    double timetak=Float.parseFloat(timetaken);
	    					    
	    					   
	    					    double tt=20.00-timetak;
	    					    
	    					  DecimalFormat df = new DecimalFormat("00.00");
	    					    String j=df.format(tt);
	    					   // Log.d("foramted tt",tt+"");
	    					  //  String j=String.format("%.2g%n",tt);
	    					  //  Log.d("tt", j+"");
	    					    
	    					    
	    						i.putExtra("score", ans);
	    						i.putExtra("givenans", givenans);
	    						i.putExtra("allid", a);
	    						i.putExtra("tt", j);
	    						i.putExtra("category", cat);
	    						
	          					startActivity(i);
	    						TestSit.this.finish();
	    					}
	    				  })
	    				.setNegativeButton("No",new DialogInterface.OnClickListener() {
	    					public void onClick(DialogInterface dialog,int id) {
	    						// if this button is clicked, just close
	    						// the dialog box and do nothing
	    						dialog.cancel();
	    						
	    					}
	    				});
	     
	    				// create alert dialog
	    				AlertDialog alertDialog = alertDialogBuilder.create();
	     
	    				// show it
	    				
	    				alertDialog.show();
	    				
	    			}
	    		});
	    	
	        
	       // Listening Friends button click
	        /*btn_fav.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					//Intent i = new Intent(getApplicationContext(), FriendsActivity.class);
					//startActivity(i);
					
						
									int val=a[click];
									CTable q=db.getC(val,cat);
									String ques=q.getQues();
									String sol=q.getSol();
									db.addFav(new Favourite(ques,op1,op2,op3,op4,sol));
									
									 Toast.makeText(getApplicationContext(), "Added To Favourite",Toast.LENGTH_SHORT).show();
									
								

							// show it
							
					
				}
			});*/
	        
	        // Listening Messages button click
	        btn_hint.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), Hint.class);
					i.putExtra("cat", cat);
					startActivity(i);
				}
			});
	        
	        // Listening to Places button click
	        btn_goto.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(),Calender.class);   
					i.putExtra("gotoclick", gotoclick);
					i.putExtra("click", click);
					startActivityForResult(i, STATIC_INTEGER_VALUE);
				}
			});
	        
	        // Listening to Events button click
	   
	        
	        Log.d("outside","outside");
	        int g=0;
		       List<CTable> quants = db.getAllC(cat);       
		        for (CTable cn : quants) {
		        	
		        	if(g==38)
		        		break;
		        	else
		        	{
		        		g++;
		        	Log.d("insidee","insidee");
		        	count=cn.getID();
		        	String sol1=cn.getSol();
		        	int sol=0;
		        	if(sol1.equalsIgnoreCase("a"))
		        		sol=1;
		        	else if(sol1.equalsIgnoreCase("b"))
		        		sol=2;
		        	else if(sol1.equalsIgnoreCase("c"))
		        		sol=3;
		        	else
		        		sol=4;
		        	//int j=r.nextInt(2);
		        	//int k=(count+j+1);
				   //  count=k;
				     initial[index3]=count;
				     initans[index3]=sol;
		          index3=index3+1;
		        	}
		        }       
		        
				 count=r.nextInt(3);
			        count=count+1;
			      
			        t1=(TextView) findViewById(R.id.textView1);
			        t2=(TextView) findViewById(R.id.questrack);
			        
			      //  te=(textfield) findViewById(R.id.textField);
			        
			       
			        Log.d("Reading: ", "Reading all contacts.."); 
	       
	     
			        CTable q=db.getC(initial[count],cat);
				       
				      a[index++]=initial[count];
				       givenans[0]=initans[count];
				       t2.setText("   "+"1/20");
				        String j= q.getQues();
				    
				        t1.setText(j);
						
			    for(int x=1;x<20;x++)
			      {
			    	  int  k=(count+1);
					    count=k;
					     a[index]=initial[k];
					     givenans[index]=initans[k];
					     index=index+1;
			      }
	 }
	    
	    //timer
	 
		   	 
		   	

		   	   public void onFinish() {
		   	   text.setText("Time's up!");
		         	AlertDialog alertDialog = new AlertDialog.Builder(
                    TestSit.this).create();

              
	     
	    			
	    			TextView title = new TextView(context);
		            title.setText("Aptitude App");
		            title.setBackgroundColor(Color.DKGRAY);
		            title.setPadding(10, 10, 10, 10);
		            title.setGravity(Gravity.CENTER);
		            title.setTextColor(Color.WHITE);
		            title.setTextSize(20);
		            alertDialog.setCustomTitle(title);
		         	
		            
                   // Setting Dialog Title
                 // alertDialog.setTitle("Apptitude App");

                  // Setting Dialog Message
                  alertDialog.setMessage("TIME'S UP");
                
                  // Setting Icon to Dialog
                  alertDialog.setIcon(R.drawable.about);

                  // Setting OK Button
                  alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                	  public void onClick(DialogInterface dialog, int which) {
                		  // Write your code here to execute after dialog closed
                		  Intent i = new Intent(getApplicationContext(), ShowScorec.class);
                		  time=text.getText()+"";
	    					 
  					    sec=sec+40;
  					    String timetaken=min+"."+sec+"";
  					    
  					   
  					    double timetak=Float.parseFloat(timetaken);
  					    
  					   
  					    double tt=20.00-timetak;
  					    
  					  DecimalFormat df = new DecimalFormat("00.00");
  					    String j=df.format(tt);
  					    i.putExtra("tt", j);

  						i.putExtra("score", ans);
  						i.putExtra("givenans", givenans);
  						i.putExtra("allid", a);
						i.putExtra("category", cat);
        					startActivity(i);
  						TestSit.this.finish();
                		  
                	  }
    });
                  
                  
                  
                  

    // Showing Alert Message
    alertDialog.show();
		   	   
		   	  }
		   	
		   	  

		   	 }

	 
	

