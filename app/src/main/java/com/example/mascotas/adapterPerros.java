package com.example.mascotas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterPerros extends RecyclerView.Adapter<adapterPerros.ViewHolderPerros> {

    Context contexto;
    ArrayList<Perros> perros = new ArrayList<Perros>();
    Perros perrito;

    public adapterPerros(Context contexto, ArrayList<Perros> perros,Perros perrito){
        this.contexto = contexto;
        this.perros = perros;
        this.perrito = perrito;
    }

    @NonNull
    @Override
    public ViewHolderPerros onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_perros,null,false);
        return new adapterPerros.ViewHolderPerros(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPerros viewholderPerros, int i) {
        ViewHolderPerros.nombreperro.setText(perros.get(i).getNombre());
        if(i == 0){
            ViewHolderPerros.numerohueso.setText("5");
        }else if(i == 1){
            ViewHolderPerros.numerohueso.setText("3");
        }else if(i == 2){
            ViewHolderPerros.numerohueso.setText("4");
        }else if(i == 3){
            ViewHolderPerros.numerohueso.setText("5");
        }else if(i==4){
            ViewHolderPerros.numerohueso.setText("5");
        }
        if(i == 0){

            ViewHolderPerros.imagenes.setImageResource(R.drawable.marmaduke);
        }else if(i == 1){
            ViewHolderPerros.imagenes.setImageResource(R.drawable.scoobydoo);
        }else if(i == 2){
            ViewHolderPerros.imagenes.setImageResource(R.drawable.hachiko);
        }else if(i == 3){
            ViewHolderPerros.imagenes.setImageResource(R.drawable.supercan);
        }else if(i==4){
            ViewHolderPerros.imagenes.setImageResource(R.drawable.bock);
        }
    ViewHolderPerros.imagenes.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(),MainActivity2.class);
            contexto.startActivity(intent);
        }
    });

    }

    @Override
    public int getItemCount() {
        return perros.size();
    }

    public static class ViewHolderPerros extends RecyclerView.ViewHolder {
        static ImageView imagenes;
        static TextView nombreperro;
        static TextView numerohueso;

        public ViewHolderPerros(@NonNull View i) {
            super(i);

            imagenes = itemView.findViewById(R.id.imagenes);
            nombreperro = itemView.findViewById(R.id.nombreperro);
            numerohueso = itemView.findViewById(R.id.numerohueso);

        }
    }
}
