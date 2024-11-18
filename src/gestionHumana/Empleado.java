package gestionHumana;

public class Empleado {

    // Atributos de la clase
    private final long cedula;
    private String nombre;
    private String cargo;
    
    // Constructor
    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Método para verificar si el empleado tiene permisos
    public boolean tengoPermiso() {
        return cargo.contains("Administrador");
    }

