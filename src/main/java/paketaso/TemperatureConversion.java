
package paketaso;


public class TemperatureConversion {
    public static  float FromCelciusToFarengeit(float temp){
        return temp*((float)9/5)+32;
    }
    public static float  FromfarenheintTOcelcisu (float temp){
        return  temp*((float)5/9)*(temp-32);
    }
}
