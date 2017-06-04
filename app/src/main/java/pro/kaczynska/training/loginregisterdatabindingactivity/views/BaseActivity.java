package pro.kaczynska.training.loginregisterdatabindingactivity.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import pro.kaczynska.training.loginregisterdatabindingactivity.R;

/**
 * Created by Pavone on 04.06.2017.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
