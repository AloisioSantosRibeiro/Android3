package android.v3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ThemeDarkActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme_dark);
		// Show the Up button in the action bar.
		setupActionBar();
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
		getMenuInflater().inflate(R.menu.menu_theme_dark, menu);
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
	    	case R.id.action_ThemesAndroid:
	    		tools.MenuFunctions.fOpenDarkThemeActivity(this);
	    		return true;
	    	case R.id.action_ThemesColoredTitles:
	    		tools.MenuFunctions.fOpenThemeColorTitleGreenActivity(this);
	    		return true;
	    	case R.id.action_ThemesImage:
	    		tools.MenuFunctions.fOpenThemeImageActivity(this);
	    		return true;
	    	case R.id.action_ThemesHideActionBar:
	    		tools.MenuFunctions.fOpenThemeHideActionBarActivity(this);
	    		return true;
	    	case R.id.action_ThemesOverlayActionBar:
	    		tools.MenuFunctions.fOpenOverlayActionBarThemeActivity(this);
	    		return true;
		}
		return super.onOptionsItemSelected(item);
	}

	
	public void fOpenLightThemeActivity(View view) {
		tools.MenuFunctions.fOpenLightThemeActivity(this);
	}

	
	public void fOpenDarkLightThemeActivity(View view) {
		tools.MenuFunctions.fOpenDarkLightThemeActivity(this);
	}

	
	public void fHideActionBar(View button_hideActionBar) {
		getActionBar().hide();
	}

	
	public void fShowActionBar(View button_showActionBar) {
		getActionBar().show();
	}
}
