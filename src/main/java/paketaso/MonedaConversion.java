/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paketaso;

/**
 *
 * @author JADPA18
 */
public class MonedaConversion {
    public static float DolaresToCordobas (float Valor){
        return (float) (Valor*35);
    }
    public static float CordobasToDolares (float Valor){
        return (float) (Valor/35);
    }
     public static float EurosToDolar (float Valor){
        return (float) (Valor*1.20);
    }
    public static float DolaresToEuros (float Valor){
        return  (float) (Valor/1.20);
    } 
    public static float EuroToCordobas ( float Valor){
        return (float) (Valor*42.18);
    }
    public static float CordobasToEuro (float Valor){
        return (float) (Valor /42.18);
    }
}
