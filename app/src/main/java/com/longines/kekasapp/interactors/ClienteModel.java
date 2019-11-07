package com.longines.kekasapp.interactors;

import com.longines.kekasapp.interfaces.ClienteInterface;
import com.longines.kekasapp.presenters.ClientePresenter;

public class ClienteModel implements ClienteInterface.Model {
    ClienteInterface.Presenter presenter;

    public ClienteModel(ClientePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void openDialog() {

    }
}
