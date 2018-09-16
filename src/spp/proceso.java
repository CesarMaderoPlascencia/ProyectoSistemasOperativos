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
    float operadorUno;
    float operadorDos;
    int tiempoMaximo;
    String ID;
    float resultado;
    int lote;
    int numeroProceso;
    int esperaSeg;
    int esperaMin;
    int esperaMil;
    int esperaTotal = 0;

    public void operacion(int num)
    {
        if(num == 0){resultado = operadorUno + operadorDos;}
        if(num == 1){resultado = operadorUno - operadorDos;}
        if(num == 2){resultado = operadorUno * operadorDos;}
        if(num == 3){resultado = (float)operadorUno/operadorDos;}
        if(num == 4){resultado = operadorUno % operadorDos;}
        if(num == 5){resultado = (float)Math.sqrt(operadorUno);}
        if(num == 6){resultado = (float)(operadorDos/100)*operadorUno;}
        tipoOperacion(num);
    }
    
    public void tipoOperacion(int num)
    {
        if(num == 0){operacion = "Suma";}
        if(num == 1){operacion = "Resta";}
        if(num == 2){operacion = "Multiplicacion";}
        if(num == 3){operacion = "Division";}
        if(num == 4){operacion = "Residuo";}
        if(num == 5){operacion = "Raiz";}
        if(num == 6){operacion = "Porcentaje";}
    }
   
}
