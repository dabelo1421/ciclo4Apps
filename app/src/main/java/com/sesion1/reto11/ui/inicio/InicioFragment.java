package com.sesion1.reto11.ui.inicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.sesion1.reto11.R;
import com.sesion1.reto11.databinding.FragmentHomeBinding;
import com.sesion1.reto11.databinding.FragmentInicioBinding;
import com.sesion1.reto11.ui.home.HomeViewModel;

public class InicioFragment extends Fragment {

    View vista;
    Button btnProductos;


    private InicioModel inicioModel;
    private FragmentInicioBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){

        inicioModel = new ViewModelProvider(this).get(InicioModel.class);

        binding = FragmentInicioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textInicio;

        inicioModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });return root;
}
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
