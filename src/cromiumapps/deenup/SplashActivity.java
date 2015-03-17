package cromiumapps.deenup;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class SplashActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_splash);
		
		ImageView splash = (ImageView) findViewById(R.id.splash);
		splash.setScaleType(ScaleType.FIT_XY);
		
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {

		    public void run() {
		    	startMainActivity();
		    }

		}, 3000); 
	}
	
	public void startMainActivity()
	{
		Intent intent = new Intent(this, MainActivity.class);
	    startActivity(intent);
	    finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_splash, menu);
		return true;
	}
	

}
