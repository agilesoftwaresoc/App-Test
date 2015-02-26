package com.aptitudeguru.dashboard;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.epapyrus.plugpdf.SimpleDocumentReader;
import com.epapyrus.plugpdf.SimpleReaderFactory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class Tquants extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quantative_layout);
		
		
		
		Button btn_q1 = (Button) findViewById(R.id.btn_q1);

		
		btn_q1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec1.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}

			}
		});

		Button btn_q2 = (Button) findViewById(R.id.btn_q2);

		
		btn_q2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec2.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
			}
		});

		 
		Button btn_q4 = (Button) findViewById(R.id.btn_q4);

		 
		btn_q4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec3.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
			}
		});

		 
		Button btn_q5 = (Button) findViewById(R.id.btn_q5);

		 
		btn_q5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec5.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
				
			}
		});

		 
		Button btn_q6 = (Button) findViewById(R.id.btn_q6);

		 
		btn_q6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String fileName = new String("sec6.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
	         
				
			}
		});

		 
		Button btn_q7 = (Button) findViewById(R.id.btn_q7);

		 
		btn_q7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec7.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
	         
				
			}
		});

		 
		Button btn_q8 = (Button) findViewById(R.id.btn_q8);

		 
		btn_q8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec8.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
				
			}
		});

		 
		Button btn_q10 = (Button) findViewById(R.id.btn_q10);

		 
		btn_q10.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec10.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
			}
		});

		 
		Button btn_q11 = (Button) findViewById(R.id.btn_q11);

		 
		btn_q11.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String fileName = new String("sec11.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
				
			}
		});

		 
		Button btn_q12 = (Button) findViewById(R.id.btn_q12);

		 
		btn_q12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec12.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
			}
		});

		 
		Button btn_q13 = (Button) findViewById(R.id.btn_q13);

		 
		btn_q13.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec13.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
				
			}
		});

		
		 
		Button btn_q15 = (Button) findViewById(R.id.btn_q15);

		 
		btn_q15.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec15.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
			}
		});
		 
		Button btn_q16 = (Button) findViewById(R.id.btn_q16);

		 
		btn_q16.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec16.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
			}
		});

		 
		Button btn_q17 = (Button) findViewById(R.id.btn_q17);

		 
		btn_q17.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				String fileName = new String("sec17.pdf");
				AssetManager am = getResources().getAssets();
		 
				try {
					InputStream is = am.open(fileName);
					Context c = view.getContext();
				    Activity a = (Activity) c;
		 
					int size = is.available();
		            if (size > 0) {
						byte[] data = new byte[size];
						is.read(data);
						SimpleDocumentReader v = SimpleReaderFactory.createSimpleViewer(a,null);
						v.openData(data, data.length, "");
		                        }
					is.close();
				} catch (Exception ex) {
					Log.e("KS", "error ", ex);
				}
			}
		});
		Button btn_home = (Button) findViewById(R.id.btn_home);

		// Dashboard Friends button
		Button btn_fav = (Button) findViewById(R.id.btn_fav);

		// Dashboard Messages button
		Button btn_score = (Button) findViewById(R.id.btn_score);

		// Dashboard Places button
		Button btn_tutorial = (Button) findViewById(R.id.btn_tutorial);

		// Dashboard Events button
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

		/**
		 * Handling all button click events
		 * */

		// Listening to News Feed button click
		btn_home.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(),
						AndroidDashboardDesignActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		// Listening Friends button click
		btn_fav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(), FavPage.class);

				startActivity(i);
			}
		});

		// Listening Messages button click
		btn_score.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(), scoremenu.class);
				startActivity(i);
			}
		});

		 
		btn_tutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				Intent i = new Intent(getApplicationContext(),
						Tutorialpage.class);
				startActivity(i);
			}
		});

		// Listening to Events button click
		btn_about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				Intent i = new Intent(getApplicationContext(),
						AboutUs.class);
				startActivity(i);
			}
		});
		
		

		
	
			
		}

}
