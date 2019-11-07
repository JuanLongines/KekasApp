package com.longines.kekasapp.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.longines.kekasapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CrearClienteDialogFragment extends DialogFragment {


    public CrearClienteDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crear_cliente_dialog, container, false);
    }

}
