import librerias.Array;

public class Ejercicio20_28 {

  public static void main(String[] args) {
    
    int[] a = librerias.Array.generaArrayInt(20, 0, 100);
    
    librerias.Array.muestraArrayInt(a);
    System.out.println("Mínimo: " + librerias.Array.minimoArrayInt(a));
    System.out.println("Máximo: " + librerias.Array.maximoArrayInt(a));
    System.out.println("Media: " + librerias.Array.mediaArrayInt(a));
    
    if (librerias.Array.estaEnArrayInt(a, 24)) {
      System.out.println("El 24 está en el array.");
    } else {
      System.out.println("El 24 no está en el array.");
    }
      
    System.out.println("El 24 está en la posición " + librerias.Array.posicionEnArrayInt(a, 24));
    
    System.out.print("Array al revés: ");
    librerias.Array.muestraArrayInt(librerias.Array.volteaArrayInt(a));
    
    System.out.print("Array rotado 3 pasos a la derecha: ");
    librerias.Array.muestraArrayInt(librerias.Array.rotaDerechaArrayInt(a, 3));
    
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    librerias.Array.muestraArrayInt(librerias.Array.rotaIzquierdaArrayInt(a, 4));
  }
}