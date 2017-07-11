package mx.nakva.dagger2test.Dagger.Modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mx.nakva.dagger2test.Modules.Login.LoginPresenter;

/**
 * Created by Juancho on 11/07/17.
 * Nakva
 * linanjm90@gmail.com
 */

@Module
public class PresenterModule {

    @Provides
    @Singleton
    LoginPresenter provideLoginPresenter() {
        return new LoginPresenter();
    }


}
