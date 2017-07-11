package mx.nakva.dagger2test.App;

import android.app.Application;

/**
 * Created by Juancho on 11/07/17.
 * Nakva
 * linanjm90@gmail.com
 */

public class Dagger2TestApplication extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.appComponent = this.initDagger(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    protected AppComponent initDagger(Dagger2TestApplication application) {
        return DaggerAppComponent.builder().appModule(new AppModule(application)).build();
    }
}
