package objtaller3;

import compras.Producto;
import compras.OrdenCompra;
import gestionHumana.Empleado;
import java.util.ArrayList;

public class ObjTaller3 {

    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto(1, "Escoba", "Aseo");
        Producto p2 = new Producto(2, "Camisa", "Ropa");
        Producto p3 = new Producto(3, "Trapera", "Aseo");
        Producto p4 = new Producto(4, "Pantalon", "Ropa");
        Producto p5 = new Producto(5, "Jabon", "Aseo");

        // Crear empleado
        Empleado emp1 = new Empleado(405, "Juan", "Ingeniero");

        // Crear lista de productos y orden de compra
        ArrayList<Producto> productos1 = new ArrayList<>();
        productos1.add(p1);
        productos1.add(p3);
        OrdenCompra orden1 = new OrdenCompra(101, "Aseo", emp1, productos1);

        // Imprimir total de productos pedidos
        System.out.println(Producto.getTotalProductosPedidos());

        // Intentar agregar un producto no válido
        orden1.agregarProducto(p4); // No se agregará porque es de tipo "Ropa"
        System.out.println(Producto.getTotalProductosPedidos());

        // Agregar un producto válido
        orden1.agregarProducto(p5); // Se agrega porque es de tipo "Aseo"
        System.out.println(Producto.getTotalProductosPedidos());

        // Mostrar información de la orden creada
        System.out.println("Orden " + orden1.getCodigo() + " creada");

        // Crear otra orden de compra con diferentes productos
        Empleado emp2 = new Empleado(128, "Susana", "Administradora de sucursal");
        ArrayList<Producto> productos2 = new ArrayList<>();
        productos2.add(p2);
        productos2.add(p4);
        OrdenCompra orden2 = new OrdenCompra(202, "Ropa", emp2, productos2);
        System.out.println(Producto.getTotalProductosPedidos());

        // Empleado retira un producto
        System.out.println(emp2.getCedula() + " va a retirar producto.");
        orden2.retirarProducto(emp2, p4); // Susana tiene permiso

        // Imprimir producto retirado
        System.out.println(Producto.getTotalProductosPedidos());

        // Intentar retirar un producto con un empleado sin permiso
        orden2.retirarProducto(emp1, p2); // Juan no tiene permiso
        System.out.println(Producto.getTotalProductosPedidos());
    }
}
