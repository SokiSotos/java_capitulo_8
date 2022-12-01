import librerias.Varias;
public class Ejercicio16 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9999; i++) {
            if (Varias.esCapicua(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}