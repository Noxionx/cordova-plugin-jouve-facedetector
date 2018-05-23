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
      callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, "Start Face Detector !"));
      return true;
    }
    
    if (action.equals("stop")) {
      Log.d(TAG, "stop");
      callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, "Stop Face Detector !"));
      return true;
    }

    callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR));
    return false;
  }

}