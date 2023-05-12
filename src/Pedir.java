public class Pedir {
    private int numPedidos;
    private String nombreProducto;
    private int cantProducto;
    private String observaciones;

    public Pedir(int numPedidos, String nombreAlimento, int cantAlimento, String observaciones) {
        this.numPedidos = numPedidos;
        this.nombreProducto = nombreAlimento;
        this.cantProducto = cantAlimento;
        this.observaciones = observaciones;
    }

    public int getNumPedidos() {
        return numPedidos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantProducto() {
        return cantProducto;
    }
    public String getObservaciones() {
        return observaciones;
    }
}
