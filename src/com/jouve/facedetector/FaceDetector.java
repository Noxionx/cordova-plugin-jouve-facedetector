package com.jouve.facedetector;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;

public class FaceDetector extends CordovaPlugin {
  private static final String TAG = "FaceDetector";

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
    if (action.equals("start")) {
      callbackContext.success("Start Face Detector !");
      return true;
    }
    
    if (action.equals("stop")) {
      callbackContext.success("Stop Face Detector !");
      return true;
    }

    callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR));
    return false;
  }

}