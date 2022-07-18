/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;
import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
//        TipoMatricula tipos = new TipoMatricula();

//        MatriculaCampamento mcamp = new MatriculaCampamento();
//        mcamp.establecerTarifa();
//        
//        MatriculaColegio mcolegio = new MatriculaColegio();
//        mcolegio.establecerTarifa();
//        
//        MatriculaEscuela mescuela = new MatriculaEscuela();
//        MatriculaJardin mjardin = new MatriculaJardin();
//        MatriculaMaternal mmaternal = new MatriculaMaternal();
//        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
//        
//        tipos.establecerMatriculaCampamento(mcamp);
//        tipos.establecerMatriculaColegio(mcolegio);
//        tipos.establecerPromedioTarifas();
//        System.out.printf("%s\n", tipos);
        ArrayList<Matricula> lista = new ArrayList<>();
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerPromedioTarifas();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerPromedioTarifas();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerPromedioTarifas();
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerPromedioTarifas();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerPromedioTarifas();
        lista.add(mcamp);
        lista.add(mcolegio);
        lista.add(mescuela);
        lista.add(mjardin);
        lista.add(mmaternal);
        TipoMatricula tip1= new TipoMatricula();
        tip1.establecerTipomatriculas(lista);
        tip1.establecerTotalpromedio();
        System.out.println(tip1);

        

    }
}
