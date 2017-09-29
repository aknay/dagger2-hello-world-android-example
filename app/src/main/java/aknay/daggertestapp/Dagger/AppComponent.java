package aknay.daggertestapp.Dagger;

import javax.inject.Singleton;

import aknay.daggertestapp.MainActivity;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
