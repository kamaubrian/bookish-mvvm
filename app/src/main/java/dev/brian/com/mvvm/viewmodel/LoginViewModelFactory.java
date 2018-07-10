package dev.brian.com.mvvm.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import dev.brian.com.mvvm.utils.LoginResultCallback;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private LoginResultCallback loginResultCallback;

    public LoginViewModelFactory(LoginResultCallback resultCallback){
        this.loginResultCallback = resultCallback;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return( T) new LoginViewModel(loginResultCallback);
    }
}
