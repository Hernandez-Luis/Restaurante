import java.util.Scanner;

public class Menu {
    public int opMenu(Scanner scanner){
        System.out.println("1.- Ingresar datos al menu\n2. Ordenar Comida\n3. Ordenar Bebida\n4. Pagar\n5. Salir");
        return scanner.nextInt();
    }
}
