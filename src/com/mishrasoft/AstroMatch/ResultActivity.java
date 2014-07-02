package com.mishrasoft.AstroMatch;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ResultActivity extends Activity {

	public static String yoursign="";
	public static String hissign="";
	
	public static void setYourSign(String sign)
	{
		yoursign=sign;
	}
	
	public static void setHisSign(String sign)
	{
		hissign=sign;
	}
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.resultlayout);
        getWindow().setBackgroundDrawableResource(R.drawable.background);

        // Lookup your LinearLayout assuming it’s been given
        // the attribute android:id="@+id/mainLayout"
        LinearLayout layout = (LinearLayout)findViewById(R.id.layout2);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
        	     LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
         
       //set the back button
        TextView backbutton = (TextView) findViewById(R.id.textView6);
        backbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish(); }});
        
        //set the google link
        TextView googlelink = (TextView) findViewById(R.id.textView5);
        googlelink.setPaintFlags(googlelink.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        googlelink.setText("Google: " + yoursign + " " + hissign);
        googlelink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?rlz=1C1PRFB_enUS479US479&sugexp=chrome,mod=14&sourceid=chrome&ie=UTF-8&q=" + yoursign + "+" + hissign));
            	startActivity(browserIntent);
            	}
            });
        
        //set the matchelevel text
        TextView matchlevel = (TextView) findViewById(R.id.textView3);
        
        //set the description text
        TextView description = (TextView) findViewById(R.id.textView4);

       if (yoursign.equals("Aries"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
     		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Taurus"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Gemini"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Cancer"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
       }
       
       else if (yoursign.equals("Leo"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Virgo"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
       }
       
       else if (yoursign.equals("Libra"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Scorpio"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
       }
       
       else if (yoursign.equals("Sagittarius"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Capricorn"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Aquarius"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
       
       else if (yoursign.equals("Pisces"))
       {
    	   if (hissign.equals("Aries"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Taurus"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Gemini"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Cancer"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Leo"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Virgo"))
    	   {
    		   matchlevel.setText("COLD");
    		   matchlevel.setTextColor(Color.CYAN);
    		   description.setTextSize(25);
    		   description.setText("You guys might want to rethink your relationship...");
    	   }
    	   else if (hissign.equals("Libra"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Scorpio"))
    	   {
    		   matchlevel.setText("HOT");
    		   matchlevel.setTextColor(Color.parseColor("#8e2323"));
    		   description.setText("You guys make a great match!");
    	   }
    	   else if (hissign.equals("Sagittarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Capricorn"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Aquarius"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
    	   else if (hissign.equals("Pisces"))
    	   {
    		   matchlevel.setText("MILD");
    		   matchlevel.setTextColor(Color.YELLOW);
    		   description.setText("You guys make a good match.");
    	   }
       }
              
     }
    
   }