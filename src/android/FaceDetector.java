package com.jouve.facedetector;

import android.util.Log;

import org.apache.cordova.LOG;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;

public class FaceDetector extends CordovaPlugin {
  private static final String TAG = "FaceDetector";

  private CallbackContext callbackContext;

  @Override
	public void initialize(final CordovaInterface cordova, final CordovaWebView cvWebView) {
    super.initialize(cordova, cvWebView);
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if (action.equals("start")) {
      Log.d(TAG, "start");
    } else if (action.equals("stop")) {
      Log.d(TAG, "stop");
    } else if (action.equals("update")) {
      Log.d(TAG, "update");
      callbackContext.success();
    } else {
      return false;
    }

    PluginResult result = new PluginResult(PluginResult.Status.NO_RESULT, "");
    result.setKeepCallback(true);
    callbackContext.sendPluginResult(result);
    return true;
  }

}