public class Mostrar {
    public void productosComida(Productos[] producto){
        System.out.println("\t\t\t- - M E N U - -");
        for (Productos cosas:producto) {
            System.out.println("\t\t- - A L I M E N T O S - -");
            System.out.println("Nombre: " + cosas.getNombre());
            System.out.println("Descripcion: " + cosas.getDescripcion());
            System.out.println("Precio: " + cosas.getPrecio());
            System.out.println("-----------------------------------------------------------");
        }
    }

    public void productosBebida(Productos[] producto){
        System.out.println("\t\t\t- - M E N U - -");
        System.out.println("\t\t- - B E B I D A S - -");
        for (Productos cosas:producto) {
            System.out.println("Nombre: " + cosas.getNombre());
            System.out.println("Descripcion: " + cosas.getDescripcion());
            System.out.println("Precio: " + cosas.getPrecio());
            System.out.println("-----------------------------------------------------------");

        }
    }

    public void orden(Pedir [] orden){
        int j = 1;
        for (Pedir cosas:orden) {
            System.out.println("\t\t- - O R D E N - -");
            System.out.println("Numero de pedido: " + j);
            System.out.println("Nombre del alimento: " + cosas.getNombreProducto());
            System.out.println("Observaciones: " + cosas.getObservaciones());
            j++;
            System.out.println("----------------------------------------------------------------");
        }
    }
}

