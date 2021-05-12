/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author Haide
 */
public class Ejercicio {
    public Ejercicio(){};
    public String accion( String esObligatorio, String esDocente, Boolean esExterno,String tipoPersonaDestino, String estadoRegistro ){
        if(esObligatorio.equals("si") && esDocente.equals(true) ){
            return "actualizar";
        }
        if (esObligatorio.equals("no") && esDocente.equals(true)){
            return "matricular";
        }
        if (esExterno==true && estadoRegistro.equals("porConfirmar")){
            return "actualizar";
        }
        if (esExterno == true && tipoPersonaDestino.equals("externo")){
            return "registrar";
        }
        if (esExterno==true && estadoRegistro.equals("Vigente")  ){
            return "matricular";
        }
        return "";
    }
}
