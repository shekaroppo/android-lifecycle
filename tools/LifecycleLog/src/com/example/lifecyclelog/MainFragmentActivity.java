package com.example.lifecyclelog;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.util.Log;
import android.view.Menu;

import static com.example.lifecyclelog.Util.recLifeCycle;

/**
 * A standard v4 support version of Activity.
 */
public class MainFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        recLifeCycle(getClass(), "→☐");
        super.onCreate(savedInstanceState);
        recLifeCycle(getClass(), "☐→");
        setContentView(R.layout.activity_main_compat);

        FragmentManager.enableDebugLogging(true);
        LoaderManager.enableDebugLogging(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        recLifeCycle(getClass(), "→☐");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        recLifeCycle(getClass(), "→☐");
        super.onActivityResult(requestCode, resultCode, data);
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    public void onAttachedToWindow() {
        recLifeCycle(getClass(), "→☐");
        super.onAttachedToWindow();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        recLifeCycle(getClass(), "→☐");
        super.onAttachFragment(fragment);
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        recLifeCycle(getClass(), "→☐");
        super.onConfigurationChanged(newConfig);
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    public void onContentChanged() {
        recLifeCycle(getClass(), "→☐");
        super.onContentChanged();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onDestroy() {
        recLifeCycle(getClass(), "→☐");
        super.onDestroy();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        recLifeCycle(getClass(), "→☐");
        super.onNewIntent(intent);
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onPause() {
        recLifeCycle(getClass(), "→☐");
        super.onPause();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        recLifeCycle(getClass(), "→☐");
        super.onPostCreate(savedInstanceState);
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    protected void onPostResume() {
        recLifeCycle(getClass(), "→☐");
        super.onPostResume();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onRestart() {
        recLifeCycle(getClass(), "→☐");
        super.onRestart();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onResume() {
        recLifeCycle(getClass(), "→☐");
        super.onResume();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onResumeFragments() {
        recLifeCycle(getClass(), "→☐");
        super.onResumeFragments();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        recLifeCycle(getClass(), "→☐");
        super.onSaveInstanceState(outState);
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        recLifeCycle(getClass(), "→☐");
        super.onWindowFocusChanged(hasFocus);
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onUserLeaveHint() {
        recLifeCycle(getClass(), "→☐");
        super.onUserLeaveHint();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    protected void onStart() {
        recLifeCycle(getClass(), "→☐");
        super.onStart();
        recLifeCycle(getClass(), "☐→");

    }

    @Override
    protected void onStop() {
        recLifeCycle(getClass(), "→☐");
        super.onStop();
        recLifeCycle(getClass(), "☐→");
    }

    @Override
    public void onUserInteraction() {
        recLifeCycle(getClass(), "→☐");
        super.onUserInteraction();
        recLifeCycle(getClass(), "☐→");
    }


}