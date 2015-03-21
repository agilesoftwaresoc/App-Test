package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.app.AlertDialog;

import java.io.*;
import java.util.List;


import java.util.Locale;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class AndroidDashboardDesignActivity extends Activity {
	private static final int DATABASE_VERSION = 1;

	
	private static final String DATABASE_NAME = "aptitudedatabase";
	
	String local = Locale.getDefault().toString();


	private static final String TABLE_QUANTS = "quants";
	final Context context = this;

	public void copydb(InputStream inputstream, OutputStream outputStream)
			throws IOException {
		byte[] buffer = new byte[1024];
		int length = 0;
		while ((length = inputstream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		inputstream.close();
		outputStream.close();
	}

	@Override
	public void onBackPressed() {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

		TextView title = new TextView(context);
		title.setText("Aptitude App");
		title.setBackgroundColor(Color.DKGRAY);
		title.setPadding(10, 10, 10, 10);
		title.setGravity(Gravity.CENTER);
		title.setTextColor(Color.WHITE);
		title.setTextSize(20);
		alertDialogBuilder.setCustomTitle(title);

	
		alertDialogBuilder
				.setMessage("Click yes to exit!")
				.setCancelable(false)
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {

								finish();
								System.exit(0);

							}
						})
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {

						dialog.cancel();
					}
				});

		AlertDialog alertDialog = alertDialogBuilder.create();

	
		alertDialog.show();

		return;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard_layout);
		DatabaseHandlerFR db = new DatabaseHandlerFR(this);

		try {
			String datapath = "/data/data/" + getPackageName() + "/databases";
			File f = new File(datapath);
			if (!f.exists()) {
				f.mkdirs();
				f.createNewFile();
				
				//test
				
					if(local=="fr"){
						copydb(getBaseContext().getAssets().open("aptitudedatabase"),
								new FileOutputStream(datapath + "/aptitudedatabase"));
					}
					else{
					}
					
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}

		
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

		
		Button btn_quants = (Button) findViewById(R.id.btn_quants);

		
		Button btn_language = (Button) findViewById(R.id.btn_language);

		
		Button btn_verbal = (Button) findViewById(R.id.btn_verbal);

		
		Button btn_compfun = (Button) findViewById(R.id.btn_compfun);

	
		Button btn_puzzles = (Button) findViewById(R.id.btn_puzzles);

		
		Button btn_allinone = (Button) findViewById(R.id.btn_allinone);

		Button btn_langchange = (Button) findViewById(R.id.btn_langchange);
		Button btn_sitjudge = (Button) findViewById(R.id.btn_sitjudge);
		
		btn_quants.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				Intent i = new Intent(getApplicationContext(),
						Quantitative.class);
				startActivity(i);
			}
		});

	
		btn_language.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), Language.class);
				startActivity(i);
			}
		});

		
		btn_verbal.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), Verbal.class);
				startActivity(i);
			}
		});

		
		btn_compfun.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
						ComputerFundamentals.class);
				startActivity(i);
			}
		});

		
		btn_puzzles.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), Puzzles.class);
				startActivity(i);
			}
		});

		
		btn_allinone.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), AllInOne.class);
				startActivity(i);
			}
		});
		
	btn_sitjudge.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Intent i = new Intent(getApplicationContext(), TestSit.class);
				startActivity(i);
				
			}
		});
		
		
		btn_langchange.setOnClickListener(new View.OnClickListener()
		{
			
		  
		  @Override
		  public void onClick(View view)
		  {
			  Intent i = new Intent(getApplicationContext(), TestSit.class);
			  startActivity(i);
		  }
		});
		 

		}
}