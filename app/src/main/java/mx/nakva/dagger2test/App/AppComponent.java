package mx.nakva.dagger2test.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Juancho on 11/07/17.
 * Nakva
 * linanjm90@gmail.com
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

}
