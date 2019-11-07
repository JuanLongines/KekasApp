package com.longines.kekasapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class BaseActivity extends AppCompatActivity {

    protected void next(Bundle bundle, Class<?> activity, boolean destroy) {
        Intent intent = new Intent(this, activity);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
        if (destroy) finish();
    }

    protected void showShortToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    protected void loadFragment(int layout, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(layout, fragment).commit();
    }
}
