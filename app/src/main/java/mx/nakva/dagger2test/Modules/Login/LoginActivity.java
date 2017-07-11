package mx.nakva.dagger2test.Modules.Login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mx.nakva.dagger2test.App.Dagger2TestApplication;
import mx.nakva.dagger2test.R;

/**
 * Created by Juancho on 11/07/17.
 * Nakva
 * linanjm90@gmail.com
 */

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.inputEmail)
    EditText inputEmail;

    @BindView(R.id.inputPassword)
    EditText inputPassword;

    @Inject
    LoginPresenter mPresenter;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((Dagger2TestApplication)getApplication()).getAppComponent().inject(this);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    public void onClickLogin() {
        this.mPresenter.onClickLoginButton();
    }
}
