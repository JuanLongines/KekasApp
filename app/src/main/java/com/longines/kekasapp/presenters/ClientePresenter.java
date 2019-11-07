package com.longines.kekasapp.presenters;

import com.longines.kekasapp.interactors.ClienteModel;
import com.longines.kekasapp.interfaces.ClienteInterface;

public class ClientePresenter implements ClienteInterface.Presenter {

    ClienteInterface.View view;
    ClienteInterface.Model model;

    public ClientePresenter(ClienteInterface.View view) {
        this.view = view;
        this.model = new ClienteModel(this);
    }

    @Override
    public void openDialog() {
        if (view != null) {
            view.openDialog();
        }
    }
}
