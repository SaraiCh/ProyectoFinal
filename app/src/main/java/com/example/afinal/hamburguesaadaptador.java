package com.example.afinal;

import android.content.Context;
import android.content.Intent;
import android.telephony.mbms.GroupCall;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class hamburguesaadaptador extends RecyclerView.Adapter<hamburguesaadaptador.ViewHolder> {
    private List<ListElementHamburguesa>mData;
    private LayoutInflater mInflater;
    private Context context;
    List<ListElementHamburguesa> listaCarrito;
    Button btncarrito;

    public hamburguesaadaptador(List<ListElementHamburguesa> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }
    @Override
    public int getItemCount(){
        return mData.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_item_hamburguesa, null);
        return new hamburguesaadaptador.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(hamburguesaadaptador.ViewHolder holder, final int position) {
        //holder.bindData(mData.get(position));
        /*btncarrito.setOnClickListener(view -> {
            Intent intent = new Intent(context, interfaz_carrito.class);
            intent.putExtra("Carro de compra", (Serializable) listaCarrito);
            context.startActivity(intent);
        });*/
    }

    public void setItems(List<ListElementHamburguesa> items) {mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView IconImage;
        TextView nombre, precio;
        CheckBox checkcarrito;
        ViewHolder(View itemView){
            super(itemView);
            IconImage = itemView.findViewById(R.id.imgKangre);
            nombre = itemView.findViewById(R.id.txtNombrehamburguesa);
            precio = itemView.findViewById(R.id.txtPrecioHamburguesa);
            checkcarrito = itemView.findViewById(R.id.checkcarrito);
        }
        void bindData(final ListElementHamburguesa item){
            IconImage.setImageResource(item.getImage_hamburguesa());
            nombre.setText(item.getNombreHamburguesa());
            precio.setText(Double.toString(item.getPrecio()));

            checkcarrito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(checkcarrito.isChecked()==true){
                        listaCarrito.add(listaCarrito.get(getAdapterPosition()));
                    }else if(checkcarrito.isChecked()==false){
                        listaCarrito.remove(listaCarrito.get(getAdapterPosition()));
                    }
                }
            });

        }
    }
}
