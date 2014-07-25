package android.v3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "v3.android3.MESSAGE";

	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

    	// Eclipse code
//    	getMenuInflater().inflate(R.menu.menu_main, menu);
//      return true;
    	
    	// Android's page code
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu_main, menu);
    	return super.onCreateOptionsMenu(menu);
    }

    
    public boolean onOptionsItemSelected(MenuItem item) {
    	// Handle presses on the action bar items
    	switch (item.getItemId()) {
    		case R.id.action_help:
	    		Toast.makeText(MainActivity.this, R.string.action_help, Toast.LENGTH_SHORT).show();
	    		return true;
    		case R.id.action_ThemesAndroid:
    			tools.MenuFunctions.fOpenLightThemeActivity(this);
    			return true;
	    	case R.id.action_ThemesColoredTitles:
	    		tools.MenuFunctions.fOpenThemeColorTitleBlueActivity(this);
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
	    	case R.id.action_Portrait_Landscape:
	    		tools.MenuFunctions.fOpenPortraitLandscapeActivity(this);
	    		return true;
	   		default:
	   			return super.onOptionsItemSelected(item);
    	}
    }
    
    
    /** Called when the user presses the Send button */
    public void sendMessage(View view) {
    	// Do something in response to button
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
}
