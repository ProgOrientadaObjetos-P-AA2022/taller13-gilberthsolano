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
public class MatriculaColegio extends Matricula{

    @Override
    public void establecerPromedioTarifas() {
        promedioMatriculas=150.2 + 140.2 + 240.2 + 300.4;
    }
//    private double tarifa;
    
//    public void establecerTarifa(){
//        // tarifa = costo deportes + costo folletos + 
//        //          costo uniformes + costo laboratorios
//        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
//    }
//        
//    public double obtenerTarifa(){
//        return tarifa;
//    }
}
