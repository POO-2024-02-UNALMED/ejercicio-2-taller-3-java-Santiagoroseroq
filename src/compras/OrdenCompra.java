package compras;

import java.util.ArrayList;

public class OrdenCompra {


    private int codigo;
    private String tipo;
    private Empleado comprador;
    private ArrayList<Producto> productos;

 
    public OrdenCompra(int codigo, String tipo, Empleado comprador,
            ArrayList<Producto> productos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.comprador = comprador;
        this.productos = productos;
        Producto.totalProductosPedidos += productos.size();
    }


    public void agregarProducto(Producto producto) {
        if (producto.getTipo().equals(tipo)) {
            productos.add(producto);
            Producto.totalProductosPedidos++;
        }
    }


    public void retirarProducto(Empleado empleado, Producto producto) {
        if (!empleado.tengoPermiso()) {
            System.out.println("Empleado no tiene permiso para retirar el producto");
            return;
        }
        retirarProducto(producto);
    }

  
    private void retirarProducto(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (producto.getCodigo() == productos.get(i).getCodigo()) {
                productos.remove(i);
                Producto.totalProductosPedidos--;
                producto.imprimirNombre();
                System.out.println(" retirado");
                break;
            }
        }
    }

    public void descontar() {
        Producto.totalProductosPedidos -= productos.size();
    }

  
    public int getCodigo() {
        return codigo;
    }
}
