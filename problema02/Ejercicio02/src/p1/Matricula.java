/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author gilbertsolanosotomayor
 */
public abstract class Matricula {
  protected double promedioMatriculas;  
   public abstract void establecerPromedioTarifas();
    //        promedioMatriculas = (obtenerMatriculaCampamento().obtenerTarifa() + 
//                obtenerMatriculaColegio().obtenerTarifa())/2;
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
}
