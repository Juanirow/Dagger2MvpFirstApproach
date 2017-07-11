package mx.nakva.dagger2test.Modules.Login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mx.nakva.dagger2test.R;

/**
 * Created by Juancho on 11/07/17.
 * Nakva
 * linanjm90@gmail.com
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
