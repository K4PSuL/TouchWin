package com.iia.touchwin.views;

import com.iia.touchwin.R;
import com.iia.touchwin.entities.Player;
import com.iia.touchwin.utils.Const;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;

class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		SharedPreferences mySetting = this.getSharedPreferences(
				Const.PREFERENCES_CONNECTION, Context.MODE_PRIVATE);

		
		SharedPreferences settings = this.getSharedPreferences("connexion",Context.MODE_PRIVATE);
		
		SharedPreferences.Editor editor = settings.edit();
		Player thePlayer = new Player();
		Bundle dataBundle = new Bundle();
		dataBundle.putSerializable(Const.BUNDLE_PLAYER, (Player) thePlayer);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
