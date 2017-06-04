package pro.kaczynska.training.loginregisterdatabindingactivity.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Pavone on 04.06.2017.
 */

public class User extends BaseObservable {
    private String email;
    private String password;

    @Bindable
    public String getEmail() {
        return email;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    @Bindable
    public void setEmail(String email) {
        this.email = email;
    }

    @Bindable
    public void setPassword(String password) {
        this.password = password;
    }
}
