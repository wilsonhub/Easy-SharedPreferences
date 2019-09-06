package org.wilsonapps.localstorage.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/*
 * Copyright @Wilson
 */
public class PrefManager {

    protected Context mContext;

    protected PrefManager(Context context) {
        this.mContext = context;
    }

    /**
     * Store some string in SharedPreferences using a key value and the data
     *
     * @param key
     * @param value
     */

    protected void setString(String key, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        sp.edit().putString(key, value).apply();
    }

    /**
     * Get string value from SharedPreferences using key value
     *
     * @param key
     * @param def
     * @return a string
     */

    protected String getString(String key, String def) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        return prefs.getString(key, def);
    }

    /**
     * Store some boolean value in SharedPreferences using a key value and the
     * data
     *
     * @param key
     * @param value
     */

    protected void setBoolean(String key, boolean value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        sp.edit().putBoolean(key, value).apply();
    }

    /**
     * Get boolean value from SharedPreferences using key value
     *
     * @param key
     * @param def
     * @return a boolean value
     */

    protected boolean getBoolean(String key, boolean def) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        return prefs.getBoolean(key, def);
    }

    /**
     * Store some integer value in SharedPreferences using a key value and the
     * data
     *
     * @param key
     * @param value
     */

    protected void setInt(String key, int value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        sp.edit().putString(key, Integer.toString(value)).apply();
    }

    /**
     * Get integer value from SharedPreferences using key value
     *
     * @param key
     * @param def
     * @return a integer value
     */

    protected int getInt(String key, int def) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        return Integer.parseInt(prefs.getString(key, Integer.toString(def)));
    }

    /**
     * Store some Long value in SharedPreferences using a key value and the data
     *
     * @param key
     * @param value
     */

    protected void setLong(String key, long value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        sp.edit().putString(key, Long.toString(value)).apply();
    }

    /**
     * Get Long value from SharedPreferences using key value
     *
     * @param key
     * @param def
     * @return a Long value
     */

    protected long getLong(String key, long def) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        return Long.parseLong(prefs.getString(key, Long.toString(def)));
    }

    /**
     * Store some Double value in SharedPreferences using a key value and the
     * data
     *
     * @param key
     * @param value
     */

    protected void setDouble(String key, double value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        sp.edit().putString(key, Double.toString(value)).apply();
    }

    /**
     * Get Double value from SharedPreferences using key value
     *
     * @param key
     * @param def
     * @return a Double value
     */

    protected double getDouble(String key, double def) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        return Double.parseDouble(prefs.getString(key, Double.toString(def)));
    }

    public void clearPreferences() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.apply();
    }

    public void clearKey(String key) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext.getApplicationContext());
        SharedPreferences.Editor editor = sp.edit();
        editor.remove(key);
        editor.apply();
    }
}
