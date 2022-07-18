/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        Estudiante e2= new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        e2.establecerNombres("Jose Carrion");
        e2.establecerUserName("jcarrion");
        ArrayList<Correo> lista = new ArrayList<>();
        
        DominioGmail dominio = new DominioGmail();
        dominio.establecerDominio();
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        
        lista.add(c);
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
        
        
    }
    
}
