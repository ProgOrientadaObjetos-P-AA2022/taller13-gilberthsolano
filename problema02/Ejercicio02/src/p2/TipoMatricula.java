/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p2.TipoMatricula;
import java.util.ArrayList;
import p1.Matricula;


/**
 *
 * @author reroes
 */
public  class TipoMatricula {
//    protected double promedioMatriculas;
    protected double totalpromedio;
    ArrayList<Matricula>tipomatriculas= new ArrayList<>();
    
//    private MatriculaCampamento campamento;
//    private MatriculaColegio colegio;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    
    
//    public void establecerMatriculaCampamento(MatriculaCampamento c){
//        campamento = c;
//    }
//    
//    public void establecerMatriculaColegio(MatriculaColegio c){
//        colegio = c;
//    }
//    
//    public MatriculaCampamento obtenerMatriculaCampamento(){
//        return campamento;
//    }
//    
//    public MatriculaColegio obtenerMatriculaColegio(){
//        return colegio;
//    }
    
//    public abstract void establecerPromedioTarifas();
//    //        promedioMatriculas = (obtenerMatriculaCampamento().obtenerTarifa() + 
////                obtenerMatriculaColegio().obtenerTarifa())/2;
//    public double obtenerPromedioTarifas(){
//        return promedioMatriculas;
//    }

    public ArrayList<Matricula> obtenerTipomatriculas() {
        return tipomatriculas;
    }

    public void establecerTipomatriculas(ArrayList<Matricula> tipomatriculas) {
        this.tipomatriculas = tipomatriculas;
    }

   

    public double obtenerTotalpromedio() {
        return totalpromedio;
    }

    public void establecerTotalpromedio() {
        double suma=0;
        for (int i = 0; i < obtenerTipomatriculas().size(); i++) {
            suma=suma+obtenerTipomatriculas().get(i).obtenerPromedioTarifas();
            
        }
        totalpromedio=suma/obtenerTipomatriculas().size();
    }

    @Override
    public String toString() {
      String  cadena=String.format("Lista de Tarifas\n");
        for (int i = 0; i < obtenerTipomatriculas().size(); i++) {
            cadena=String.format("%sTarifas de matricilas%.2f\n"
                    ,
                    cadena,
                    obtenerTipomatriculas().get(i).obtenerPromedioTarifas());
            
        }
        cadena=String.format("%sTotal promedios:%.2f\n",
                cadena, obtenerTotalpromedio());
      return cadena;
    }
    
    
    

        
}
