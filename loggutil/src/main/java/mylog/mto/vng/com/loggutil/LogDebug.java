package mylog.mto.vng.com.loggutil;

import android.util.Log;

/**
 * Created by LAP11100-local on 1/8/2018.
 */

public class LogDebug {
    private static final String TAG = LogDebug.class.getName();

    public static void dd(String message){
        Log.d(TAG, "NghiaNPT . . . .: "+message);
    }
}
