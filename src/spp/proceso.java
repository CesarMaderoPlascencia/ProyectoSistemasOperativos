/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp;

/**
 *
 * @author Cesar
 */
public class proceso {
    String nombre;
    String operacion;
    int operadorUno;
    int operadorDos;
    int tiempoMaximo;
    String ID;
    float resultado;

    public void operacion()
    {
        if("Suma".equals(operacion)){resultado = operadorUno + operadorDos;}
        if("Resta".equals(operacion)){resultado = operadorUno - operadorDos;}
        if("Multiplicacion".equals(operacion)){resultado = operadorUno * operadorDos;}
        if("Division".equals(operacion)){resultado = operadorUno/operadorDos;}
        if("Residuo".equals(operacion)){resultado = operadorUno % operadorDos;}
        if("Raiz".equals(operacion)){resultado = (float)Math.sqrt(operadorUno);}
        if("Porcentaje".equals(operacion)){resultado = (operadorDos/100)*operadorUno;}
    }
}
