import static librerias.Varias.digitoN;
import static librerias.Varias.digitos;

public class Ejercicio37 {

  public static void main(String[] args) {
    int[] numeros = {213, 0, 11, 24, 86};
    
    for (int numero : numeros) {
      System.out.print("El " + numero + " es el " + convierteEnMorse(numero));
      System.out.println(" en morse.");
    }
  }
  
  public static String convierteEnMorse(int n) {
    final String[] morse = {
	  "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
      ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."
    };
    
    String resultado = "";
    
    for(int i = 0; i < digitos(n); i++) {
      resultado += morse[digitoN(n, i)];
    }
    
    return resultado;
  }
}