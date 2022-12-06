import static librerias.Array.generaArrayInt;
import static librerias.Array.muestraArrayInt;
import static librerias.Varias.posicionDeDigito;

public class Ejercicio40 {

  public static void main(String[] args) {
    final int[] numeros = generaArrayInt(20, 1, 1000);

    System.out.println("Array original: ");
    muestraArrayInt(numeros);
    System.out.println("Números que contienen un 7: ");
    muestraArrayInt(filtraCon7(numeros));
  }

  public static int[] filtraCon7(int x[]) {
    int[] con7 = new int[x.length];

    int numerosCon7 = 0;
    for (int numero : x) {
      if (contieneEl7(numero)) {
        con7[numerosCon7++] = numero;
      }
    }

    int[] resultado = new int[numerosCon7];

    for (int i = 0; i < numerosCon7; i++) {
      resultado[i] = con7[i];
    }

    return resultado;
  }

  public static boolean contieneEl7(int n) {
    return posicionDeDigito(n, 7) != -1;
  }

  public static boolean contieneEl7(long n) {
    return posicionDeDigito(n, 7) != -1;
  }

}