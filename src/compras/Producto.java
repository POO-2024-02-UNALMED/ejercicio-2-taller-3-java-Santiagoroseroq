package compras;

public class Producto {
    
    private final int codigo;
    private String nombre;
    private String tipo;
    static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public void imprimirNombre() {
        System.out.print(nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}
