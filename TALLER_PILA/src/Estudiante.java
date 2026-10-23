public class Estudiante {
    private String codigo;
    private String nombres;
    private int edad;
    private double promedio;

    public Estudiante(String codigo, String nombres, int edad, double promedio){
        this.codigo = codigo;
        this.nombres = nombres;
        this.edad = edad;
        this.promedio = promedio;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombres(){
        return nombres;
    }
    public int getEdad(){
        return edad;
    }
    public double getPromedio(){
        return promedio;
    }
    public void setNombres(){
        this.nombres = nombres;
    }
    public void setEdad(){
        this.edad = edad;
    }
    public void setPromedio(){
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombres y apellidos:" + nombres);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}
