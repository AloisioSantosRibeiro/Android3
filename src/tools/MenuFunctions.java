package tools;

import android.app.Activity;
import android.content.Intent;
import android.v3.ThemeColorActivity;
import android.v3.ThemeDarkActivity;
import android.v3.ThemeDarkLightActivity;
import android.v3.ThemeImageActivity;
import android.v3.ThemeLightActivity;


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
    
    
    public static void fOpenColorThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeColorActivity.class);
    	origin.startActivity(intent);
    }
    
    
    public static void fOpenImageThemeActivity(Activity origin) {
    	Intent intent = new Intent(origin, ThemeImageActivity.class);
    	origin.startActivity(intent);
    }

}
