package aknay.daggertestapp.Dagger;

import android.app.Application;

import javax.inject.Singleton;

import aknay.daggertestapp.Pojo.DaggerTestClass;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    DaggerTestClass provideDaggerTestClass() {
        return new DaggerTestClass();
    }
}