package android.v3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Portrait_Landscape_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Toast.makeText(Portrait_Landscape_Activity.this, R.string.callback_onCreate, Toast.LENGTH_SHORT).show();

        // Set the user interface layout for this Activity
        // The layout file is defined in the project res/layout/main_activity.xml file
		setContentView(R.layout.activity_portrait_landscape);

		// Show the Up button in the action bar.
		setupActionBar();
	}


	@Override
	protected void onStart() {
		super.onStart();
		Toast.makeText(Portrait_Landscape_Activity.this, R.string.callback_onStart, Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText(Portrait_Landscape_Activity.this, R.string.callback_onResume, Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(Portrait_Landscape_Activity.this, R.string.callback_onRestart, Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(Portrait_Landscape_Activity.this, R.string.callback_onPause, Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(Portrait_Landscape_Activity.this, R.string.callback_onStop, Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(Portrait_Landscape_Activity.this, R.string.callback_onDestroy, Toast.LENGTH_SHORT).show();
	}

	
	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_portrait_landscape, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				// This ID represents the Home or Up button. In the case of this
				// activity, the Up button is shown. Use NavUtils to allow users
				// to navigate up one level in the application structure. For
				// more details, see the Navigation pattern on Android Design:
				//
				// http://developer.android.com/design/patterns/navigation.html#up-vs-back
				//
				NavUtils.navigateUpFromSameTask(this);
				return true;
			case R.id.action_help:
	    		Toast.makeText(Portrait_Landscape_Activity.this, R.string.action_help, Toast.LENGTH_SHORT).show();
	    		return true;
			case R.id.action_warning:
				Toast.makeText(Portrait_Landscape_Activity.this, R.string.action_warning, Toast.LENGTH_SHORT).show();
		}
		return super.onOptionsItemSelected(item);
	}

}
