/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class MatriculaEscuela extends Matricula {

    @Override
    public void establecerPromedioTarifas() {
        promedioMatriculas=50.2 + 40.2 + 140.2 + 200.4;
    }
//    private double tarifa;
//    
//    public void establecerTarifa(){
//        // tarifa = costo libros + costo deportes + costo folletos + 
//        //          costo uniformes
//        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
//    }
//        
//    public double obtenerTarifa(){
//        return tarifa;
//    }
}
