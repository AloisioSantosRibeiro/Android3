package android.v3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ThemeColorTitleRedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme_color_title_red);
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
		getMenuInflater().inflate(R.menu.theme_color_title_red, menu);
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
	    		Toast.makeText(ThemeColorTitleRedActivity.this, R.string.action_help, Toast.LENGTH_SHORT).show();
	    		return true;
	    	case R.id.action_ThemesAndroid:
	    		tools.MenuFunctions.fOpenDarkLightThemeActivity(this);
	    		return true;
	    	case R.id.action_ThemesColoredTitles:
	    		tools.MenuFunctions.fOpenThemeColorTitleRedActivity(this);
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

	
	public void fOpenThemeColorTitleBlue(View view) {
		tools.MenuFunctions.fOpenThemeColorTitleBlueActivity(this);
	}
	
	
	public void fOpenThemeColorTitleGreen(View view) {
		tools.MenuFunctions.fOpenThemeColorTitleGreenActivity(this);
	}
}
