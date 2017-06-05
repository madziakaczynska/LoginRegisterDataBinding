package pro.kaczynska.training.loginregisterdatabinding.models;

import android.content.res.Resources;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import pro.kaczynska.training.loginregisterdatabinding.R;

/**
 * Created by Pavone on 04.06.2017.
 */

public class User extends BaseObservable {
    private String email;
    private String password;

    public User(Resources resources) {
        email = resources.getString(R.string.email_value);
        password = resources.getString(R.string.password_value);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    @Bindable
    public String getPassword() {
        return password;
    }
}
