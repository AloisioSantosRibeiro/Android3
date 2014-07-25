package tools;

import android.app.Activity;
import android.content.Intent;
import android.v3.ThemeColorTitleBlueActivity;
import android.v3.ThemeColorTitleGreenActivity;
import android.v3.ThemeColorTitleRedActivity;
import android.v3.ThemeDarkActivity;
import android.v3.ThemeDarkLightActivity;
import android.v3.ThemeLightActivity;
import android.v3.ThemeImageActivity;
import android.v3.ThemeHideActionBarActivity;
import android.v3.ActionBarOverlayActivity;
import android.v3.Portrait_Landscape_Activity;


public class MenuFunctions {
	
    public static void fOpenDarkThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeDarkActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenLightThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeLightActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenDarkLightThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeDarkLightActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenThemeColorTitleBlueActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorTitleBlueActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenThemeColorTitleGreenActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorTitleGreenActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenThemeColorTitleRedActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorTitleRedActivity.class);
    	origin.startActivity(intent);
    }
    
        
    public static void fOpenThemeImageActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeImageActivity.class);
    	origin.startActivity(intent);
    }
    

    public static void fOpenThemeHideActionBarActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeHideActionBarActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenOverlayActionBarThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ActionBarOverlayActivity.class);
    	origin.startActivity(intent);
	}
	
    
    public static void fOpenPortraitLandscapeActivity(Activity origin) {
    	Intent intent = new Intent(origin, Portrait_Landscape_Activity.class);
    	origin.startActivity(intent);
    }
}
