package com.example.afinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Hanburguesa_Adapter extends RecyclerView.Adapter<Hanburguesa_Adapter.ViewHolder> {
    private List<ListElementHamburguesa>mData;
    private LayoutInflater mInflater;
    private Context context;

    public Hanburguesa_Adapter(List<ListElementHamburguesa> itemList, Context context){
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
        return new Hanburguesa_Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final Hanburguesa_Adapter.ViewHolder holder, final int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElementHamburguesa> items) {mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView IconImage;
        TextView nombre, precio;
        ViewHolder(View itemView){
            super(itemView);
            IconImage = itemView.findViewById(R.id.imgKangre);
            nombre = itemView.findViewById(R.id.txtNombrehamburguesa);
            precio = itemView.findViewById(R.id.txtPrecioHamburguesa);
        }
        void bindData(final ListElementHamburguesa item){
            IconImage.setImageResource(item.getImage_hamburguesa());
            nombre.setText(item.getNombreHamburguesa());
            precio.setText(Double.toString(item.getPrecio()));
        }
    }
}
