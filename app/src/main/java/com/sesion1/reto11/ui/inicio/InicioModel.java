package com.sesion1.reto11.ui.inicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InicioModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InicioModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Inicio");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
