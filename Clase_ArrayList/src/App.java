import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void registrarEstudiantes(){
        for (int i = 0; i < 10; i++){
            System.out.println("\nEstudiante " + (i + 1));

            System.out.println("Ingrese el codigo: ");
            int codigo = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();

            System.out.println("Ingrese el promedio: ");
            double promedio = sc.nextDouble();

            Estudiante estudiante = new Estudiante(codigo, nombre, edad, promedio);

            estudiantes.add(estudiante);
        }
    }

    public static void mostrarEstudiantes(){
        System.out.println("LISTADO DE ESTUDIANTES");
        for (Estudiante estudiante : estudiantes){
            estudiante.mostrarDatos();
        }
    }

    public static void mostrarPrimeroYUltimo(){
        if (estudiantes.isEmpty()){
            System.out.println("La lista esta vacia");
            return;
        }
        
        System.out.println("Primer estudiante: ");
        estudiantes.get(0).mostrarDatos();

        System.out.println("Ultimo estudiante: ");
        estudiantes.get(estudiantes.size() - 1).mostrarDatos();
    }

    public static void eliminarEstudiante(int codigoBuscado){
        boolean encontrado = false;
        for (int i = 0; i < estudiantes.size(); i++){
            if (estudiantes.get(i).getCodigo() == codigoBuscado){
                System.out.println("ESTUDIANTE ELIMINADO");
                estudiantes.get(i).mostrarDatos();

                estudiantes.remove(i);
                encontrado = true;
                break;
            }
        }

        if (encontrado == false){
            System.out.println("No se encontro un estudiante con ese codigo.");
        }
    }

    public static void ordenarEstudiantes(){
        for (int i = 0; i < estudiantes.size() - 1; i++){
            for (int j = i + 1; j < estudiantes.size(); j++){
                if (estudiantes.get(i).getCodigo() > estudiantes.get(j).getCodigo()){
                    Estudiante auxiliar = estudiantes.get(i);
                    estudiantes.set(i, estudiantes.get(j));
                    estudiantes.set(j, auxiliar);
                }
            }
        }
        System.out.println("\nESTUDIANTES ORDENADOS POR CODIGO");
        mostrarEstudiantes();
    }

    public static void main (String [] args){
        registrarEstudiantes();
        mostrarEstudiantes();
        mostrarPrimeroYUltimo();
        System.out.println("Ingrese el codigo del estudiante que desea eliminar");
        int codigoEliminar = sc.nextInt();
        eliminarEstudiante(codigoEliminar);
        ordenarEstudiantes();
        sc.close();
    }
}
