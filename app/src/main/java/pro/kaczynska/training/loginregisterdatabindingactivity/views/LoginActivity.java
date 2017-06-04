package pro.kaczynska.training.loginregisterdatabindingactivity.views;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pro.kaczynska.training.loginregisterdatabindingactivity.R;
import pro.kaczynska.training.loginregisterdatabindingactivity.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

    }
}
