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
public class MatriculaJardin extends Matricula{

    @Override
    public void establecerPromedioTarifas() {
        promedioMatriculas= 50.2 + 140.2 + 40;
    }
//    private double tarifa;
//    
//        
//    public void establecerTarifa(){
//        // tarifa = costo desayunos + costo libros + costo paseos
//        tarifa = 50.2 + 140.2 + 40;
//    }
//        
//    public double obtenerTarifa(){
//        return tarifa;
//    }
}
