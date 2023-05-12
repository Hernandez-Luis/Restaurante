public class Calcular implements Calcula {
    @Override
    public double orden(Pedir[] orden, Productos[] menu) {
        double precio = 0;

        for (int i = 0; i < orden.length; i++) {
            for (int j = 0; j < menu.length; j++) {
                if(orden[i].getNombreProducto().equals(menu[j].getNombre())){
                    precio = precio + menu[i].getPrecio();
                }
            }
        }
        return precio;
    }
}
