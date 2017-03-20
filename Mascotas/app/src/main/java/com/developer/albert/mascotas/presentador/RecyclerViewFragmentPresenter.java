package com.developer.albert.mascotas.presentador;

import android.content.Context;


import com.developer.albert.mascotas.fragment.IRecyclerViewFragmentView;
import com.developer.albert.mascotas.model.ConstructorMascotas;
import com.developer.albert.mascotas.model.Mascota;

import java.util.ArrayList;

/**
 * Created by anahisalgado on 21/04/16.
 */
public class RecyclerViewFragmentPresenter implements IRecylerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context, Integer Opcion) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotas(Opcion);


    }

    @Override
    public void obtenerMascotas(Integer opcion) {
        if (opcion == 1)
        {
            constructorMascotas = new ConstructorMascotas(context);
            mascotas = constructorMascotas.obtenerDatos();
            mostrarMascotasRV();
        }
        else
        {
            constructorMascotas = new ConstructorMascotas(context);
            mascotas = constructorMascotas.obtenerDatosFavoritos();
            mostrarMascotasRV();
        }

    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }

}