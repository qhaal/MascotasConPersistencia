package com.developer.albert.mascotas.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.albert.mascotas.R;
import com.developer.albert.mascotas.adapter.MascotaAdaptadorPerfil;
import com.developer.albert.mascotas.model.Mascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_perfil,container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotasPerfil);

        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);

        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(glm);
        inicializarListaContactos();
        inicializarAdaptador();
        // Inflate the layout for this fragment
        return v;
    }


    public void inicializarAdaptador(){
        MascotaAdaptadorPerfil adaptador = new MascotaAdaptadorPerfil(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();
//
//        mascotas.add(new Mascota(R.drawable.mascota_1,"Juan",1));
//        mascotas.add(new Mascota(R.drawable.mascota_2,"Perez",1));
//        mascotas.add(new Mascota(R.drawable.mascota_3,"Pawan",4));
//        mascotas.add(new Mascota(R.drawable.mascota_4,"Pedro",5));
//        mascotas.add(new Mascota(R.drawable.mascota_5,"Luis",4));
//        mascotas.add(new Mascota(R.drawable.mascota_5,"Luis",2));
//        mascotas.add(new Mascota(R.drawable.mascota_2,"Ramiro",1));
//        mascotas.add(new Mascota(R.drawable.mascota_1,"Juan",2));
//        mascotas.add(new Mascota(R.drawable.mascota_5,"Joel",3));
//        mascotas.add(new Mascota(R.drawable.mascota_1,"Jose",1));
//        mascotas.add(new Mascota(R.drawable.mascota_3,"Daniel",5));
    }
}
