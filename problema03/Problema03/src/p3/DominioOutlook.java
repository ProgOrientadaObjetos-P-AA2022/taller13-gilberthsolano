/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class DominioOutlook implements Dominio{
    private String dominio;

  @Override
    public void establecerDominio(String g) {
                dominio = g;

    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
    
}
