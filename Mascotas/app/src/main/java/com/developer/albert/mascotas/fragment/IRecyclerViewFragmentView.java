package com.developer.albert.mascotas.fragment;


import com.developer.albert.mascotas.adapter.MascotaAdaptador;
import com.developer.albert.mascotas.model.Mascota;

import java.util.ArrayList;

/**
 * Created by anahisalgado on 21/04/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
