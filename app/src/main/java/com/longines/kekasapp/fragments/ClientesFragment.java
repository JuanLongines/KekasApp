package com.longines.kekasapp.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.longines.kekasapp.R;
import com.longines.kekasapp.adapters.ClienteAdapter;
import com.longines.kekasapp.interfaces.ClienteInterface;
import com.longines.kekasapp.models.Platillo;
import com.longines.kekasapp.presenters.ClientePresenter;

import java.util.ArrayList;
import java.util.List;

public class ClientesFragment extends Fragment implements ClienteInterface.View, View.OnClickListener {

    private ClientePresenter presenter;

    public ClientesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new ClientePresenter(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_clientes, container, false);
        bindUI(view);
        RecyclerView rvCliente = view.findViewById(R.id.rvCliente);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rvCliente.setLayoutManager(llm);
        List<Platillo> platillos = new ArrayList<>();

        ClienteAdapter adapter = new ClienteAdapter(platillos, R.layout.item_cliente);
        rvCliente.setAdapter(adapter);
        return view;
    }

    private void bindUI(View view) {
        FloatingActionButton fab = view.findViewById(R.id.crearCliente);
        fab.setOnClickListener(this);
    }

    @Override
    public void openDialog() {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            fragmentTransaction.remove(prev);
        }
        fragmentTransaction.addToBackStack(null);
        CrearClienteDialogFragment dialogFragment = new CrearClienteDialogFragment(); //here MyDialog is my custom dialog
        dialogFragment.show(fragmentTransaction, "dialog");
    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void startLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void onClick(View item) {
        switch (item.getId()) {
            case R.id.crearCliente:
                presenter.openDialog();
                break;
        }
    }
}
