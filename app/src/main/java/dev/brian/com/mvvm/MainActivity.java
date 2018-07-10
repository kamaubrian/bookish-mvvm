package dev.brian.com.mvvm;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import dev.brian.com.mvvm.databinding.ActivityMainBinding;
import dev.brian.com.mvvm.utils.LoginResultCallback;
import dev.brian.com.mvvm.viewmodel.LoginViewModel;
import dev.brian.com.mvvm.viewmodel.LoginViewModelFactory;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements LoginResultCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(this,new LoginViewModelFactory(this)).get(LoginViewModel.class));
    }

    @Override
    public void onSuccess(String message) {
        Toasty.success(this,"Login Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String message) {
        Toasty.error(this,"Login Failed",Toast.LENGTH_SHORT).show();
    }
}
