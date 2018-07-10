package dev.brian.com.mvvm.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;

import dev.brian.com.mvvm.model.User;
import dev.brian.com.mvvm.utils.LoginResultCallback;

public class LoginViewModel extends ViewModel {

    private User user;
    private LoginResultCallback loginResultCallback;

    public LoginViewModel(LoginResultCallback resultCallback){
        this.loginResultCallback = resultCallback;
        this.user = new User();
    }

    public TextWatcher getEmailTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setEmail(editable.toString());
            }
        };
    }
    public TextWatcher getPasswordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setPassword(editable.toString());
            }
        };
    }
}
