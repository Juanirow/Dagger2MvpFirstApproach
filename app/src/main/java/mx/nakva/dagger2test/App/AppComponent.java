package mx.nakva.dagger2test.App;

import javax.inject.Singleton;

import dagger.Component;
import mx.nakva.dagger2test.Dagger.Modules.PresenterModule;
import mx.nakva.dagger2test.Modules.Login.LoginActivity;

/**
 * Created by Juancho on 11/07/17.
 * Nakva
 * linanjm90@gmail.com
 */

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class})
public interface AppComponent {

    void inject(LoginActivity target);

}
