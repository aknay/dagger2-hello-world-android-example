package aknay.daggertestapp.Dagger;

import android.app.Application;

public class DaggerTestApp extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        //Must Follow Dagger<Your App Component Name>
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}