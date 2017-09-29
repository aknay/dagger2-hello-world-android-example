package aknay.daggertestapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import aknay.daggertestapp.Dagger.DaggerTestApp;
import aknay.daggertestapp.Pojo.DaggerTestClass;

public class MainActivity extends AppCompatActivity {
    @Inject DaggerTestClass mDaggerTestClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((DaggerTestApp) getApplication()).getAppComponent().inject(this);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", mDaggerTestClass.getString("Dagger 2"));
    }
}
