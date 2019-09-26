package edu.cnm.deepdive.lcdemo;

import static edu.cnm.deepdive.lcdemo.MainActivity.LOG_TAG;

import android.app.Application;
import android.util.Log;

public class LifecycleApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Log.d(LOG_TAG, "LifecycleApplication::onCreate");
  }

}
