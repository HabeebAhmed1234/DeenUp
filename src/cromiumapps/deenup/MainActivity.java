package cromiumapps.deenup;

import java.util.Timer;
import java.util.TimerTask;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window; 
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;

public class MainActivity extends Activity { 

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_main);
		
		ImageView splash = (ImageView) findViewById(R.id.background);
		splash.setScaleType(ScaleType.FIT_XY);
		
		ImageButton fb_btn = (ImageButton) findViewById(R.id.facebook_button);
		fb_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.FB.me/DeenUPBasketball"));
                    startActivity(myWebLink);
			}
        });
		
		ImageButton yt_btn = (ImageButton) findViewById(R.id.youtube_button);
		yt_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.youtube.com/user/DeenUPBasketball"));
                    startActivity(myWebLink);
			}
        });
		
		ImageButton clothing_btn = (ImageButton) findViewById(R.id.clothing_button);
		clothing_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.DeenUPGear.com"));
                    startActivity(myWebLink);
			}
        });
		
		ImageButton twitter_btn = (ImageButton) findViewById(R.id.twitter_button);
		twitter_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.Twitter.com/DeenUPAthletics"));
                    startActivity(myWebLink);
			}
        });
		
		ImageButton website_btn = (ImageButton) findViewById(R.id.website_button);
		website_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.DeenUPAthletics.com"));
                    startActivity(myWebLink);
			}
        });
		

	}

}
