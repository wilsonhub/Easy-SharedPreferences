package org.wilsonapps.localstorage;

import android.content.Context;
import android.graphics.Bitmap;

import org.wilsonapps.localstorage.utilities.Preferences;
import org.wilsonapps.localstorage.utilities.DB;

import java.util.ArrayList;

/*
 * Copyright @Wilson
 */

public class LocalStorage {
    private static Preferences mPrefs;
    private static DB db;

    public static void initLibrary(Context mContext) {
        mPrefs = new Preferences(mContext);
        db = new DB(mContext);
    }

    public static void setString(String key, String value) {
        mPrefs.setString(key, value);
    }

    public static String getString(String key) {
        return mPrefs.getString(key);
    }

    public static void setInt(String key, int value) {
        mPrefs.setInt(key, value);
    }

    public static int getInt(String key) {
        return mPrefs.getInt(key);
    }

    public static void setDouble(String key, double value) {
        mPrefs.setDouble(key, value);
    }

    public static double getDouble(String key) {
        return mPrefs.getDouble(key);
    }

    public static void setLong(String key, long value) {
        mPrefs.setLong(key, value);
    }

    public static long getLong(String key) {
        return mPrefs.getLong(key);
    }

    public static void setBoolean(String key, boolean value) {
        mPrefs.setBoolean(key, value);
    }

    public static boolean getBoolean(String key) {
        return mPrefs.getBoolean(key);
    }

    public static void setObject(String key, Object obj) {
        db.putObject(key, obj);
    }

    public static <T> T getObject(String key, Class<T> classOfT) {
        return db.getObject(key, classOfT);
    }

    public static void setListObject(String key, ArrayList<Object> obj) {
        db.putListObject(key, obj);
    }

    public static ArrayList<Object> getListObject(String key, Class<?> mClass) {
        return db.getListObject(key, mClass);
    }

    public static String saveImage(String theFolder, String theImageName, Bitmap theBitmap) {
        return db.putImage(theFolder, theImageName, theBitmap);
    }

    public static Bitmap getSavedImage(String imagePath) {
        return db.getImage(imagePath);
    }

    public static void clearKey(String key) {
        if (mPrefs != null)
            mPrefs.clearKey(key);
    }

    public static void clearAll() {
        if (mPrefs != null)
            mPrefs.clearPreferences();
    }
}
