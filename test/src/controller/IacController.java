/*
 * AlunoController.java
 *
 * Created on September 21, 2006, 3:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package controller;

import classes.Iac;

public class IacController {

    static Iac objIac;

    public IacController() {
    }

    public boolean Instancia(String sexo, float altura, float quadril) {
        try {
            this.objIac = new Iac();
            objIac.setSexo(sexo);
            objIac.setAltura(altura);
            objIac.setQuadril(quadril);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public String Resultado() {
        return objIac.resultadoFinal(objIac);
    }
}
