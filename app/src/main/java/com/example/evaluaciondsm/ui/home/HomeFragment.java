package com.example.evaluaciondsm.ui.home;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.evaluaciondsm.AdminSQLiteOpenHelper;
import com.example.evaluaciondsm.databinding.FragmentHomeBinding;
import com.google.android.material.textfield.TextInputEditText;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private EditText txt_code, txt_price, txt_description;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        txt_code = binding.txtCode;
        txt_price = binding.txtPrice;
        txt_description = binding.txtDescription;

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });

        binding.btnSearchP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search();
            }
        });

        binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });

        binding.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    //Metodo para guardar los productos
    public void save() {
        String codigo = txt_code.getPrivateImeOptions();
        String precio = txt_code.getTransitionName();
        String description = txt_description.getFontFeatureSettings();

        //Confirmacion
            //Si los campos están vacíos, Toast de aviso.
            //Campos necesarios: Código, Precio y Descripción
        Toast.makeText(getContext(), "Favor rellene los campos necesarios", Toast.LENGTH_SHORT).show();

        //Si los campos están completos, Toas de confirmacion
        Toast.makeText(getContext(), "Confirmación de registro: " + codigo + " " + precio + " " + description, Toast.LENGTH_SHORT).show();
    }

    //Metodo para buscar productos
    public void search() {

        //Ingresar a la base de datos
        //Extraer los datos
        //Imprimir los datos

        //Confirmación
            //Si los campos están vacíos, Toast de aviso
            //Campos necesarios: Código
        Toast.makeText(getContext(), "Favor rellene los campos necesarios", Toast.LENGTH_SHORT).show();

        //Si los campos están completos, Toas de confirmacion
        Toast.makeText(getContext(), "Confirmación de busqueda", Toast.LENGTH_SHORT).show();
    }

    public void delete() {
        //Ingresar a la base de datos
        //Buscar los datos
        //Borrar los datos

        //Confirmación
            //Si los campos están vacíos o no existe en la DB, Toast de aviso.
            //Campos necesarios: Código
        Toast.makeText(getContext(), "Favor rellene los campos necesarios", Toast.LENGTH_SHORT).show();

        //Si los campos están completos, Toas de confirmacion
        Toast.makeText(getContext(), "Confirmación de eliminación", Toast.LENGTH_SHORT).show();
    }

    public void edit() {
        //Ingresar a la base de datos
        //Buscar los datos
        //Editar los datos

        //Confirmación
            //Si los campos están vacíos o no existe en la DB, Toast de aviso.
            //Campos necesarios: Código, Precio, Descripción
        Toast.makeText(getContext(), "Favor rellene los campos necesarios", Toast.LENGTH_SHORT).show();

        //Si los campos están completos, Toas de confirmacion
        Toast.makeText(getContext(), "Confirmación de edición", Toast.LENGTH_SHORT).show();
    }

    public void cleanForm() {
    }

}