/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Operador {

    private ArrayList<Televisor> televisores;
    private double totalprecio;
    private double tvcaro;
    private String marcasmasvendidas;

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void establecerTelevisores(ArrayList<Televisor> televisores) {
        this.televisores = televisores;
    }

    public void totalPrecioTvs(ArrayList<Televisor> t) {

        for (int i = 0; i < t.size(); i++) {
            totalprecio = totalprecio + t.get(i).obtenerPrecio();

        }
       
       
    }

    public double televisorMasCaro(ArrayList<Televisor> t) {
        double mayor=0;
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).obtenerPrecio()>mayor){
                mayor=t.get(i).obtenerPrecio();
            }
            
        }
        tvcaro=mayor;
        return tvcaro;
        
    }

    public void listaMarcasVendidas(ArrayList<Televisor> t) {
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
            
            
        }
      marcasmasvendidas=s;
      
        
        
    }

    public String obtenerMarcasmasvendidas() {
        return marcasmasvendidas;
    }

    public double obtenerTotalprecio() {
        return totalprecio;
    }

    public double obtenerTvcaro() {
        return tvcaro;
    }

    @Override
    public String toString() {
        String cadena = String.format("Lista de Televisores\n");
        for (int i = 0; i < obtenerTelevisores().size(); i++) {
            cadena = String.format("%sNombre: %s\n"
                    + "Precio:%.2f\n",
                    cadena,
                    obtenerTelevisores().get(i).obtenerMarca(),
                    obtenerTelevisores().get(i).obtenerPrecio());

        }
        cadena = String.format("%sTotal Precios:%.2f\n",
                cadena,
                obtenerTotalprecio());
        cadena=String.format("%sTelevisor mas caro:%.2f\n", cadena,
                obtenerTvcaro());
        cadena=String.format("%sMarca vendidas:%s\n", cadena,
                obtenerMarcasmasvendidas()
                );
        return cadena;
    }

}
