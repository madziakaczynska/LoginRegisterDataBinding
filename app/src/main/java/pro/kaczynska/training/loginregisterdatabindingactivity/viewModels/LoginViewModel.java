package pro.kaczynska.training.loginregisterdatabindingactivity.viewModels;

import pro.kaczynska.training.loginregisterdatabindingactivity.models.User;

/**
 * Created by Pavone on 04.06.2017.
 */

public class LoginViewModel {
    private User user;

    public String getEmail() {
        return user.getEmail();
    }
    public String getPassword() {
        return user.getPassword();
    }
}
