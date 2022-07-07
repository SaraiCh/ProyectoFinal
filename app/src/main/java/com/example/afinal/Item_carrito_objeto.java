package com.example.afinal;

import java.util.List;

public class Item_carrito_objeto {
    List<ListElementHamburguesa> lista;
    int cantidad;

    public Item_carrito_objeto(List<ListElementHamburguesa> lista, int cantidad) {
        this.lista = lista;
        this.cantidad = cantidad;
    }
}
