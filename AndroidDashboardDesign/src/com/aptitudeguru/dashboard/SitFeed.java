package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

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


public class SitFeed  extends Activity{
String sol;
TextView t1;
final Context context = this;


@Override
public void onActivityResult(int requestCode,int resultCode,Intent data)
{
 super.onActivityResult(requestCode, resultCode, data);


}


public void onCreate (Bundle savedInstanceState)
{
	
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sitfeed);
	Bundle bundle = getIntent().getExtras();
	
	t1 = (TextView) findViewById(R.id.t1);
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
				Intent i = new Intent(getApplicationContext(), AndroidDashboardDesignActivity.class);
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
	sol = bundle.getString("SolSelected");
	
	t1.setText("");
	if(sol.equals("a") || sol.equals("A"))
	{
		t1.setText("You have selected A - Apologize that the book is unavailable"
				+ " and suggest he try Morethanpens.co.uk or another online retailer instead. \n \n"
				+ "This is the least effective response as you are not giving" 
				+ "the customer any direct help and you are unaware as to whether the customer"
				+ "has access to a computer is able to shop online");
					
		
	}
	else if(sol.equals("b") || sol.equals("B"))
	{
		t1.setText("You chose B - Offer to order the book for the customer" 
					+ "and let him know how long this will take. Offer to call him when the book arrives.\n\n"
					+ "This is the most effective response as you are trying to give the customer what he wants"
					+ "without him having to do too much more. By telling the customer"
					+ "how long it will take to order, he can make an informed decision"
					+ "as to whether he wishes to take this option."
					);
					
	}
	else if (sol.equals("c")|| sol.equals("C"))
	{
		t1.setText("You chose C - Give the customer the ISBN(Book serial number)" 
				+	"of the book so that he  can easily and quickly search it out elsewhere, either online or at another bookshop."
				+ "\n\n"	
				+ "A reasonable response but you are doing little to directly "
				+ "help the customer find the book; he will still have to make quite an effort himself.");
	}
	else if (sol.equals("d")|| sol.equals("D"))
	{
		t1.setText("You chose D - Suggest he try the Alphston branch of More"
					+ "Than Pens (which is the nearest neighbouring town, 40 minutes"
					+ "drive away) or other bookshops in Saldringham. \n \n"
					+ "(Not a particularly appropriate response as it is, almost certainly, "
					+ "obvious to the customer that he could try elsewhere and"
					+ "so your response is not adding any value to what he already knows. You have managed to make"
					+ "him aware of an alternative branch of More Than Pens, which is positive,"
					+ "but perhaps you could have offered to ring that branch to check the availability of the book before the customer set off to Alpston. You could haveimproved this response by giving the"
					+ "customer specific details of other local bookshops and how to find"
					+ "them as well as the address of the Alpston More Than Pens branch.");
	}
	else
	{
		t1.setText("lol");
	}
	
	
	
	
}
}
