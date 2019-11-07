package com.longines.kekasapp.activities;

import android.os.Bundle;

import com.longines.kekasapp.R;
import com.longines.kekasapp.fragments.ClientesFragment;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        loadFragment(R.id.fragment_container, new ClientesFragment());
    }
}
