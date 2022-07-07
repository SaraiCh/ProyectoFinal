package com.example.afinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class carritoadapter extends RecyclerView.Adapter<carritoadapter.ViewHolder>{
    TextView txttotal;
    private LayoutInflater mInflater;
    private Context context;
    List<String> listanombres;
    List<Double> listaprecio;
    List<Integer> listacantidad;
    double total=0;
    Button btncarrito;

    public carritoadapter(Context context,TextView txttotal, List<String> listanombres, List<Double> listaprecio, List<Integer> listacantidad) {
        this.context = context;
        this.txttotal = txttotal;
        this.listanombres = listanombres;
        this.listaprecio = listaprecio;
        this.listacantidad = listacantidad;
        /*for(int i=0;i<listacantidad.size();i++){
            double rpta = listaprecio.get(i)*listacantidad.get(i);
            total = total + rpta;
        }
        txttotal.setText(""+total);*/
    }

    @Override
    public int getItemCount(){
        return listanombres.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_carrito_item, null);
        return new carritoadapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final carritoadapter.ViewHolder holder, final int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtNombre,precio;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtnombrec);
            precio = itemView.findViewById(R.id.txtprecioc);

            txtNombre.setText(listanombres.get(getAdapterPosition()));
            precio.setText(Double.toString(listaprecio.get(getAdapterPosition())));

        }
    }
}
