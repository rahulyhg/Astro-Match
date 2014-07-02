package com.mishrasoft.AstroMatch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DateEntryActivity extends Activity {
	
	public String setDate(Date birthday) throws ParseException
	{
		//sdf just for comparison sake later
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//set the birthday
		Date yourbirthday = birthday;
		//compare dates for signs
		if ((yourbirthday.after(sdf.parse("2012-03-24")) || (yourbirthday.equals(sdf.parse("2012-03-24")))) && (yourbirthday.before(sdf.parse("2012-04-19")) || yourbirthday.equals(sdf.parse("2012-04-19"))))
			return "Aries";
		else if ((yourbirthday.after(sdf.parse("2012-04-20")) || (yourbirthday.equals(sdf.parse("2012-04-20")))) && (yourbirthday.before(sdf.parse("2012-05-20")) || yourbirthday.equals(sdf.parse("2012-05-20"))))
			return "Taurus";
		else if ((yourbirthday.after(sdf.parse("2012-05-21")) || (yourbirthday.equals(sdf.parse("2012-05-21")))) && (yourbirthday.before(sdf.parse("2012-06-20")) || yourbirthday.equals(sdf.parse("2012-06-20"))))
			return "Gemini";
		else if ((yourbirthday.after(sdf.parse("2012-06-21")) || (yourbirthday.equals(sdf.parse("2012-06-21")))) && (yourbirthday.before(sdf.parse("2012-07-22")) || yourbirthday.equals(sdf.parse("2012-07-22"))))
			return "Cancer";
		else if ((yourbirthday.after(sdf.parse("2012-07-23")) || (yourbirthday.equals(sdf.parse("2012-07-23")))) && (yourbirthday.before(sdf.parse("2012-08-22")) || yourbirthday.equals(sdf.parse("2012-08-22"))))
			return "Leo";
		else if ((yourbirthday.after(sdf.parse("2012-08-23")) || (yourbirthday.equals(sdf.parse("2012-08-23")))) && (yourbirthday.before(sdf.parse("2012-09-22")) || yourbirthday.equals(sdf.parse("2012-09-22"))))
			return "Virgo";
		else if ((yourbirthday.after(sdf.parse("2012-09-23")) || (yourbirthday.equals(sdf.parse("2012-09-23")))) && (yourbirthday.before(sdf.parse("2012-10-22")) || yourbirthday.equals(sdf.parse("2012-10-22"))))
			return "Libra";
		else if ((yourbirthday.after(sdf.parse("2012-10-23")) || (yourbirthday.equals(sdf.parse("2012-10-23")))) && (yourbirthday.before(sdf.parse("2012-11-21")) || yourbirthday.equals(sdf.parse("2012-11-21"))))
			return "Scorpio";
		else if ((yourbirthday.after(sdf.parse("2012-11-22")) || (yourbirthday.equals(sdf.parse("2012-11-22")))) && (yourbirthday.before(sdf.parse("2012-12-21")) || yourbirthday.equals(sdf.parse("2012-12-21"))))
			return "Sagittarius";
		else if ((yourbirthday.after(sdf.parse("2012-12-22")) || (yourbirthday.equals(sdf.parse("2012-12-22")))) || (yourbirthday.before(sdf.parse("2012-01-19")) || yourbirthday.equals(sdf.parse("2012-01-19"))))
			return "Capricorn";
		else if ((yourbirthday.after(sdf.parse("2012-01-20")) || (yourbirthday.equals(sdf.parse("2012-01-20")))) && (yourbirthday.before(sdf.parse("2012-02-18")) || yourbirthday.equals(sdf.parse("2012-02-18"))))
			return "Aquarius";
		else if ((yourbirthday.after(sdf.parse("2012-02-19")) || (yourbirthday.equals(sdf.parse("2012-02-19")))) && (yourbirthday.before(sdf.parse("2012-03-20")) || yourbirthday.equals(sdf.parse("2012-03-20"))))
			return "Pisces";
		else
			return null;
	}
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.main);
        getWindow().setBackgroundDrawableResource(R.drawable.background); 
        
        ImageView splash = (ImageView) findViewById(R.id.imageView1);
        Animation fadeOut = new AlphaAnimation(1, 0);
        fadeOut.setInterpolator(new AccelerateInterpolator()); //and this
        fadeOut.setStartOffset(2000);
        fadeOut.setDuration(2000);
        splash.setAnimation(fadeOut);
        splash.setVisibility(View.INVISIBLE);
               
//        // Create the adView
//        AdView adView = new AdView(this, AdSize.BANNER, "a15005e3c3624e3");
//
//        // Lookup your LinearLayout assuming it’s been given
//        // the attribute android:id="@+id/mainLayout"
//        LinearLayout layout = (LinearLayout)findViewById(R.id.layout1);
//
//        // Add the adView to it
//        layout.addView(adView);
//
//        // Initiate a generic request to load it with an ad
//        adView.loadAd(new AdRequest());
//        
        //set the about button
        final AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(this).create();
        TextView about = (TextView) findViewById(R.id.textView7);
        about.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				alertDialog.setTitle("About");
				alertDialog.setMessage("Astro Match\u00a9 is a simple relationship predictor based on the principles of western Astrology. Astro Match\u00a9 does not guarantee the results of the prediction. If you'd like to find out more about Synastry in western Astrology, we recommend \"Love Signs\" by Linda Goodman.");
				Message listener = null;
				alertDialog.setButton("OK", listener);
				alertDialog.show();
			}
		});	
        
        //register the date pickers real quick
        final DatePicker yourbirthdaypicker = (DatePicker) findViewById(R.id.datePicker1);
        final DatePicker hisbirthdaypicker = (DatePicker) findViewById(R.id.datePicker2);
        
        //disable keyboard entry
        yourbirthdaypicker.setDescendantFocusability(DatePicker.FOCUS_BLOCK_DESCENDANTS);
        hisbirthdaypicker.setDescendantFocusability(DatePicker.FOCUS_BLOCK_DESCENDANTS);
        
        //set the button
        Button findout = (Button) findViewById(R.id.button1);
        findout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //convert the dates to signs
            	try {
                    Date ybirthday =  new Date(112, yourbirthdaypicker.getMonth(), yourbirthdaypicker.getDayOfMonth());
        			ResultActivity.setYourSign(setDate(ybirthday));
        		} catch (ParseException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
            	try {
                    Date hbirthday =  new Date(112, hisbirthdaypicker.getMonth(), hisbirthdaypicker.getDayOfMonth());           
        			ResultActivity.setHisSign(setDate(hbirthday));
        		} catch (ParseException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}            	
            	
            	Intent i = new Intent(DateEntryActivity.this, ResultActivity.class);
            	startActivity(i);
            } 
         });
     }
}