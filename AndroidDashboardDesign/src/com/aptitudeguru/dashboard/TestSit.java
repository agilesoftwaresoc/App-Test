package com.aptitudeguru.dashboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

import com.epapyrus.plugpdf.core.annotation.acroform.TextField;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
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



public class TestSit extends Activity{

	TextView t1,t2;
	
	EditText EditText1;
	String sol = "";
	final Context context = this;
	//DatabaseHandler db = new DatabaseHandler(this);
	
		   	
	   @Override
       public void onActivityResult(int requestCode,int resultCode,Intent data)
       {
        super.onActivityResult(requestCode, resultCode, data);
	   
	   
       }
	   
	   
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sittest);
	        
	        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

			TextView title = new TextView(context);
			
			Button btn_home = (Button) findViewById(R.id.btn_home);

			
			Button btn_fav = (Button) findViewById(R.id.btn_fav);

			
			Button btn_score = (Button) findViewById(R.id.btn_score);

			
			Button btn_soundon = (Button) findViewById(R.id.btn_tutorial);

		
			Button btn_about = (Button) findViewById(R.id.btn_about);
			 Button btn_help = (Button) findViewById(R.id.btn_help);
			 btn_help.setOnClickListener(new View.OnClickListener() {

		  			@Override
		  			public void onClick(View view) {
		  			
		  				Intent i = new Intent(getApplicationContext(),
		  					Help.class);

		  				startActivity(i);
		  			}
		  		});

				
				btn_home.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						Intent i = new Intent(getApplicationContext(),AndroidDashboardDesignActivity.class);
						startActivity(i);
					}
				});

				
				btn_fav.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						
						Intent i = new Intent(getApplicationContext(), FavPage.class);
						startActivity(i);
					}
				});

				
				btn_score.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						
						Intent i = new Intent(getApplicationContext(), scoremenu.class);
						startActivity(i);
					}
				});

				
				btn_soundon.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						
						Intent i = new Intent(getApplicationContext(),
								Tutorialpage.class);
						startActivity(i);
					}
				});

				
				btn_about.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View view) {
						
						Intent i = new Intent(getApplicationContext(), AboutUs.class);
						startActivity(i);
					}
				});
           title.setText("Aptitude App");
           title.setBackgroundColor(Color.DKGRAY);
           title.setPadding(10, 10, 10, 10);
           title.setGravity(Gravity.CENTER);
           title.setTextColor(Color.WHITE);
           title.setTextSize(20);
           alertDialogBuilder.setCustomTitle(title);
           t1 = (TextView) this.findViewById(R.id.t1);
           String j;
    	   j ="Scenario 1: \n \n \n"
    			 +
    			 "You are a Retail Assistant working in the Saldringham branch of More Than Pens plc, a national stationer's chain." +
    "More Than Pens has over 1000 stores, primarily in the UK, including 451 travel outlets at airports, train stations and motorway service areas and 627 high street stores. \n" +
    "More Than Pens sells a wide range of newspapers, magazines, books, stationery and impulse products; most branches are open 7 days a week between 8.30am and 5.30pm.\n" +
    "As a Retail Assistant you are responsible for providing exceptional customer service whilst demonstrating product knowledge to maximise sales.\n " +
    "You work primarily in the book section of the Saldringham branch, however all the branch staff work as a unified team and therefore you are often required to work in other sections throughout the store.\n" +
    "\n" +
    "Situation 1:\n" +
    "A customer has been browsing in your section for about 10 minutes and is looking increasingly dissatisfied and frustrated.\n" +
    "He approaches you and asks whether you have a particular book that he is looking for, and after checking on your computer, you have to inform him that it is currently out of stock.\n \n" +
    "Answer A) Apologise that the book is unavailable and suggest he try Morethanpens.co.uk or another online retailer instead.\n \n" +
    "Answer B) Offer to order the book for the customer and let him know how long this will take. Offer to call him when the book arrives.\n \n" +
    "Answer C) Give the customer the ISBN (book serial number) of the book so that he can easily and quickly search it out elsewhere, either online or at another bookshop.\n \n" +
    "Answer D) Suggest he try the Alpston branch of More Than Pens (which is the nearest neighbouring town, 40 minutes drive away) or other bookshops in Saldringham. \n \n";
    	   

    	   t1.setText(j);
    	   
    	   
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
			
	      Button btn_submit = (Button) findViewById(R.id.btn_submit);
	      EditText1 = (EditText) findViewById(R.id.EditText1);
	        /**
	         * Handling all button click events
	         * */
       
	        //This needs to turn into "Submit Answer" Button instead.
	        btn_submit.setOnClickListener(new OnClickListener() {
	        	 
	    		@Override
	    		public void onClick(View arg0) {
	    			
	    		
	    		AlertDialog.Builder wrongdata = new AlertDialog.Builder(context);
	    			wrongdata.create();
	    			
	    			TextView title = new TextView(context);
		            title.setText("Aptitude App");
		            title.setBackgroundColor(Color.DKGRAY);
		           title.setPadding(10, 10, 10, 10);
		            title.setGravity(Gravity.CENTER);
		           title.setTextColor(Color.WHITE);
		            title.setTextSize(20);
		            
		            
	    						
		            sol = EditText1.getText().toString();
		            System.out.println(sol);
	    		    			if(sol.equals("a") || sol.equals("A") ||sol.equals("b") || sol.equals("B") || sol.equals("c")|| sol.equals("C") || sol.equals("d") || sol.equals("D"))
	    		    			{
	    		    				Intent i = new Intent(getApplicationContext(), SitFeed.class);
	    	    					i.putExtra("SolSelected", sol);
	    	          				startActivity(i);
	    	    			
	    		    			}
	    		    			else
	    		    			{
	    		    				
	    		    				wrongdata.setMessage("Wrong input, please choose either A B C or D");
	    		    				wrongdata.setCancelable(true);
	    		    				wrongdata.show();
	    		    			}

	    			}
	    		});

			  
				        
				        
	 }
	    
		   	   @SuppressWarnings("deprecation")
			public void onFinish() {
		   		   
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
		
                  // Setting Dialog Message
                  alertDialog.setMessage("TIME'S UP");
                
                  // Setting Icon to Dialog
                  alertDialog.setIcon(R.drawable.about);

                  // Setting OK Button
                  alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                	  public void onClick(DialogInterface dialog, int which) {
                		  // Write your code here to execute after dialog closed
                		 // Intent i = new Intent(getApplicationContext(), ShowSitFeed.class);
        					//startActivity(i);
  						TestSit.this.finish();
                		  
                	  }
    });
                  
                  
                  
                  

    // Showing Alert Message
    alertDialog.show();
		   	   
		   	  }

		   	
		   	  

		   	 }

	 
	

