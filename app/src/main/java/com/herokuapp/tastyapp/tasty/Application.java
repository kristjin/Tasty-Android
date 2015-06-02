package com.herokuapp.tastyapp.tasty;

import android.content.Context;
import android.content.SharedPreferences;

import com.parse.Parse;
import com.parse.ParseObject;

public class Application extends android.app.Application {
    // Debugging switch
    public static final boolean APPDEBUG = false;

    // Debugging tag for the application
    public static final String APPTAG = "Tasty!";


    private static SharedPreferences preferences;

    private static ConfigHelper configHelper;

    public Application() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //TODO: Move this shit out of the code to be compiled and put it somewhere safe
        //TODO: Change these keys because they've been uploaded to github already
        Parse.initialize(this, "1vcAj3ditfJMLBObl7krESKT83qVEWF1NqUzXsym",
                "MCCbml5Pr7MI9QS2az7AA4omPPTEm7cxThqj4nZ3");

        preferences = getSharedPreferences("com.herokuapp.tastyapp", Context.MODE_PRIVATE);

        configHelper = new ConfigHelper();
        configHelper.fetchConfigIfNeeded();
    }

    public static ConfigHelper getConfigHelper() {
        return configHelper;
    }

}