import java.util.Scanner;
public class OpMain {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Registrar registrar = new Registrar();
        Calcular calcular = new Calcular();
        Mostrar mostrar = new Mostrar();
        Menu menu = new Menu();

        Productos [] menuComida = new Productos[0];
        Productos [] menuBebida = new Productos[0];
        Pedir [] ordenComida = new Pedir[0];
        Pedir [] ordenBebida = new Pedir[0];

        int x = 0;
        double pC = 0,pB = 0,total = 0;

        while (x != 5){
            x = menu.opMenu(scanner);
            switch (x){
                case 1:
                    menuComida = registrar.registraMenuComida(scanner);
                    menuBebida = registrar.registrarMenuBebidas(scanner);
                    break;
                case 2:
                    mostrar.productosComida(menuComida);
                    ordenComida = registrar.ordenComida(scanner);
                    mostrar.orden(ordenComida);
                    break;
                case 3:
                    mostrar.productosBebida(menuBebida);
                    ordenBebida = registrar.ordenBebida(scanner);
                    mostrar.orden(ordenBebida);
                    break;
                case 4:
                    pC = calcular.orden(ordenComida,menuComida);
                    pB = calcular.orden(ordenBebida,menuBebida);
                    total = pC + pB;
                    System.out.printf("El precio total es de " + total + " pesos");
                    System.out.println("\nUsted pago por: ");
                    mostrar.orden(ordenComida);
                    mostrar.orden(ordenBebida);


                    break;
                case 5:
                    System.out.println("Saliste del programa");
                    break;
                default: System.out.println("Ingresa una opcion valida");
            }
        }
    }
}
