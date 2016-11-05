package com.example.mac13.permissions;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by mac13 on 05.11.16.
 */
public class Settings {

    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    private static Settings instance;


    public static void initialize(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sharedPreferences.edit();
    }


    public static void saveString(String key, String s) {
        editor.putString(key, s);
        commit();
    }

    public static void saveBoolean(String key, boolean b) {
        editor.putBoolean(key, b);
        commit();
    }

    public static void saveInteger(String key, int i){
        editor.putInt(key,i);
        commit();
    }

    private static void commit() {
        editor.commit();
    }

    public static String getString(String key) {
        return sharedPreferences.getString(key, "");
    }

    public static boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }
    public static int getInteger(String key) {
        return sharedPreferences.getInt(key,0);
    }
}
