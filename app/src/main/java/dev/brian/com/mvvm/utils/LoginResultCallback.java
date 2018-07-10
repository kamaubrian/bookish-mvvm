package dev.brian.com.mvvm.utils;

public interface LoginResultCallback {
    void onSuccess(String message);
    void onError(String message);
}
