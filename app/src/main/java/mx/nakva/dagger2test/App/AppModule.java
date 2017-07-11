package mx.nakva.dagger2test.App;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Juancho on 11/07/17.
 * Nakva
 * linanjm90@gmail.com
 */

@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.application;
    }
}
