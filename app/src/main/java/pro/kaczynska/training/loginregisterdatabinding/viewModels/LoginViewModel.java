package pro.kaczynska.training.loginregisterdatabinding.viewModels;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;

import java.util.regex.Pattern;


import pro.kaczynska.training.loginregisterdatabinding.BR;
import pro.kaczynska.training.loginregisterdatabinding.R;
import pro.kaczynska.training.loginregisterdatabinding.adapters.SimpleTextWatcher;
import pro.kaczynska.training.loginregisterdatabinding.models.User;

public class LoginViewModel extends BaseObservable {
//    private String email;
public ObservableString email = new ObservableString();
    private String password;
    private Context context;
    private String errorEmailMessage;
    private boolean errorEmailEnabled;
    private static final String EMPTY_STRING = "";
    private User user;

    private static final String EMAIL_ADDRESS_PATTERN =
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+";


    public LoginViewModel(Context context) {
        this.context = context;
        user = new User(context.getResources());
    }

    @Bindable
    public TextWatcher getOnUsernameChanged() {
        return new SimpleTextWatcher() {
            @Override
            public void onTextChanged(@NonNull String newValue) {
//                String emailString = newValue.trim();
//                boolean isEmailValid = isEmailValidOnFly(emailString);
//
//                setErrorEmailMessage(EMPTY_STRING);
//                setErrorEmailEnabled(false);
//                if (!isEmailValid) {
//                    setErrorEmailMessage(context.getResources().getString(R.string.error_message));
//                    setErrorEmailEnabled(true);
//                    return;
//                }
//                boolean accountExists = accountExists(emailString);
//                boolean isChanged = (user.getEmail() != null) && !(emailString.equals(user.getEmail()));
//                if (!accountExists && isChanged) {
//                    setEmail(emailString);
//                }
            }
        };
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);

    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getErrorEmailMessage() {
        return errorEmailMessage;
    }

    @Bindable
    public void setErrorEmailMessage(String errorMessage) {
        errorEmailMessage = errorMessage;
        notifyPropertyChanged(BR.errorEmailMessage);
    }
    @Bindable
    public boolean getErrorEmailEnabled() {
        return errorEmailEnabled;
    }
    @Bindable
    public void setErrorEmailEnabled(boolean isEnabled) {
        errorEmailEnabled = isEnabled;
    }

    private boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    private boolean isEmailValidOnFly(String emailString) {
        return isValid(emailString, EMAIL_ADDRESS_PATTERN);
    }

    private boolean isEmailValid(String emailString) {
        return !TextUtils.isEmpty(emailString) && Patterns.EMAIL_ADDRESS.matcher(emailString).matches();
    }

    private boolean accountExists(String emailString) {
        return user.getEmail().equals(emailString);
    }

    public boolean isValid(String input, String PATTERN) {
        Pattern pattern = Pattern.compile(PATTERN);
        return pattern.matcher(input).matches();
    }

    public boolean isValidPassword(String s) {
        final String PASSWORD_PATTERN = context.getResources().getString(R.string.password_pattern);
        return !TextUtils.isEmpty(s) && isValid(s, PASSWORD_PATTERN);
    }

    @BindingAdapter("android:errorEmailEnabled")
    public static void setErrorEnabled(TextInputLayout layout, boolean isEnabled) {
        layout.setErrorEnabled(isEnabled);
    }

    @BindingAdapter("android:errorMessage")
    public static void setError(TextInputLayout layout, String message) {
        layout.setError(message);
    }
}
