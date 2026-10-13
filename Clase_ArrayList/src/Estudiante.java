public class Estudiante {
    private int codigo;
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante (int codigo, String nombre, int edad, double promedio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getPromedio(){
        return promedio;
    }

    public void mostrarDatos(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}
