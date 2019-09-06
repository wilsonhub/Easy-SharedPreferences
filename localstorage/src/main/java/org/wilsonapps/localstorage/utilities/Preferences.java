package org.wilsonapps.localstorage.utilities;

import android.content.Context;

/*
 * Copyright @Wilson
 */
public class Preferences extends PrefManager {

    public Preferences(Context context) {
        super(context);
    }

    public void setString(String key, String value) {
        setString(key, value);
    }

    public String getString(String key) {
        return getString(key, "");
    }

    public void setInt(String key, int value) {
        setInt(key, value);
    }

    public int getInt(String key) {
        return getInt(key, 0);
    }

    public void setBoolean(String key, boolean value) {
        setBoolean(key, value);
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, true);
    }

    public void setDouble(String key, double value) {
        setDouble(key, value);
    }

    public double getDouble(String key) {
        return getDouble(key, 0);
    }


    public void setLong(String key, long value) {
        setLong(key, value);
    }

    public long getLong(String key) {
        return getLong(key, 0);
    }


}