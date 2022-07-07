package com.example.afinal;

public class ListElementHamburguesa {
    private String NombreHamburguesa;
    private Double Precio;
    private int Image_hamburguesa;

    public ListElementHamburguesa(String nombreHamburguesa, Double precio, int image_hamburguesa) {
        NombreHamburguesa = nombreHamburguesa;
        Precio = precio;
        Image_hamburguesa = image_hamburguesa;
    }

    public String getNombreHamburguesa() {
        return NombreHamburguesa;
    }

    public void setNombreHamburguesa(String nombreHamburguesa) {
        NombreHamburguesa = nombreHamburguesa;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getImage_hamburguesa() {
        return Image_hamburguesa;
    }

    public void setImage_hamburguesa(int image_hamburguesa) {
        Image_hamburguesa = image_hamburguesa;
    }
}
