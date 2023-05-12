import java.util.Scanner;
public class Validaciones {
    public void entero(Scanner scanner){
        while (!scanner.hasNextInt()){
            System.out.println("Ingresa un valor numerico");
            scanner.next();
        }
    }

    public void doble(Scanner scanner){
        while (!scanner.hasNextDouble()){
            System.out.println("Ingresa un valor numerico");
            scanner.next();
        }
    }

    public int buscaComida(String comida, Productos[] alimentos){
        for (int i = 0; i <= alimentos.length; i++) {
            if(comida.equals(alimentos[i].getNombre())){
                System.out.println("Agregada");
                return 1;
            }
        }
        System.out.println("Comida no encontrada, ingresa una valida");
        return 0;
    }
}
