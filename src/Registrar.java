import java.util.Scanner;
public class Registrar {
    private Validaciones validaciones = new Validaciones();
    Mostrar mostrar = new Mostrar();
    Productos [] alimentos;
    Productos [] bebidas;
    Pedir [] pedidoComida;
    Pedir [] pedidoBebida;
    public Productos[] registraMenuComida(Scanner scanner){
        System.out.println("Ingresa la cantidad de comidas que quieres registrar: ");
        validaciones.entero(scanner);
        int cant = scanner.nextInt();
        alimentos= new Productos[cant];


        for (int i = 0; i < cant; i++) {
            scanner.nextLine();
            System.out.println("Ingresa el nombre de la comida: ");
            String nombreComida = scanner.nextLine();
            System.out.println("Ingresa una descripcion de la comida: ");
            String descripcionComida = scanner.nextLine();
            System.out.println("Ingresa el precio de la comida: ");
            validaciones.doble(scanner);
            double precioComida = scanner.nextDouble();

            alimentos[i] = new Productos(nombreComida,descripcionComida,precioComida);
        }
        return alimentos;
    }

    public Productos[] registrarMenuBebidas(Scanner scanner){
        System.out.println("Ingresa la cantidad de bebidas que quieres registrar: ");
        validaciones.entero(scanner);
        int cant = scanner.nextInt();
        bebidas = new Productos[cant];
        scanner.nextLine();

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresa el nombre de la bebida: ");
            String nombreBebida = scanner.nextLine();
            System.out.println("Ingresa una descripcion de la bebida: ");
            String descripcionBebida = scanner.nextLine();
            System.out.println("Ingresa el precio de la bebida: ");
            validaciones.doble(scanner);
            double precioBebida = scanner.nextDouble();

            bebidas[i] = new Productos(nombreBebida,descripcionBebida,precioBebida);
        }
        return bebidas;
    }

    public Pedir[] ordenComida(Scanner scanner){
        System.out.println("- - L E V A N T A R  O R D E N - -");
        System.out.println("Ingresa el numero de comidas que vas a pedir: ");
        validaciones.entero(scanner);
        int cantPedidos = scanner.nextInt();
        pedidoComida = new Pedir[cantPedidos];
        scanner.nextLine();

        for (int i = 0; i < cantPedidos; i++) {
            String  nombreComida = "";
            int x = 0;
            int numPedido = (i+1);
            while (x == 0){
                System.out.println("Ingresa el nombre de la comida: ");
                nombreComida = scanner.nextLine();
                x = validaciones.buscaComida(nombreComida,alimentos);
            }
            System.out.println("Ingresa alguna observacion: ");
            String observacion = scanner.nextLine();

            pedidoComida[i] = new Pedir(numPedido,nombreComida,cantPedidos,observacion);
        }
        return pedidoComida;
    }

    public Pedir[] ordenBebida(Scanner scanner){
        System.out.println("- - L E V A N T A R  O R D E N - -");
        System.out.println("Ingresa el numero de bebidas que vas a pedir: ");
        validaciones.entero(scanner);
        int cantPedidos = scanner.nextInt();
        pedidoBebida = new Pedir[cantPedidos];
        scanner.nextLine();

        for (int i = 0; i < cantPedidos; i++) {
            String  nombreBebida = "";
            int x = 0;
            int numPedido = (i+1);
            while (x == 0){
                System.out.println("Ingresa el nombre de la bebida: ");
                nombreBebida = scanner.nextLine();
                x = validaciones.buscaComida(nombreBebida,bebidas);
            }
            System.out.println("Ingresa alguna observacion: ");
            String observacion = scanner.nextLine();

            pedidoBebida[i] = new Pedir(numPedido,nombreBebida,cantPedidos,observacion);
        }
        return pedidoBebida;
    }
}
