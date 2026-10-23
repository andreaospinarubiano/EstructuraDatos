import java.util.Scanner;
public class PilaEstudiante {
    static final int TOPE = 10;
    Estudiante[] v;
    int cima;

    public PilaEstudiante(){
        v = new Estudiante[TOPE];
        cima = -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        PilaEstudiante ps = new PilaEstudiante();
        int op;

        do{
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Buscar estudiante por codigo");
            System.out.println("5. Modificar estudiante");
            System.out.println("6. Salir");
            System.out.println("Digite una opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    ps.apilar(sc);
                    break;
                case 2:
                    ps.desapilar(sc);
                    break;
                case 3:
                    ps.imprimir();
                    break;
                case 4:
                    ps.buscar(sc);
                    break;
                case 5:
                    ps.modificar(sc);
                    break;
                case 6:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (op != 6); 

        sc.close();
    }
    public boolean llena(){
        return cima == v.length -1;
    }
    public boolean vacia(){
        return cima == -1;
    }
    public void apilar(Scanner sc){
        if(llena()){
            System.out.println("La pila se encuentra llena");
            return;
        }
        System.out.println("Codigo: ");
        String codigo = sc.nextLine();

        if(buscarIndice(codigo) != -1){
            System.out.println("Ese codigo ya esta registrado");
            return;
        }
        System.out.println("Nombres y apellidos: ");
        String nombres = sc.nextLine();

        System.out.println("Edad: ");
        int edad = sc.nextInt();

        System.out.println("Promdio: ");
        double promedio = sc.nextDouble();
        sc.nextLine();

        Estudiante e = new Estudiante(codigo, nombres, edad, promedio);
        cima++;
        v[cima] = e;
        System.out.println("Estudiante registrado correctamente");
    }
    public void imprimir(){
        if(vacia()){
            System.out.println("La pila se encuentra vacia");
            return;
        }
        System.out.println("\nLISTADO DE ESTUDIANTES");
        for(int i = cima; i >= 0; i--){
            v[i].mostrarDatos();
        }
    }
    public int buscarIndice(String codigo){
        for(int i = cima; i >= 0; i--){
            if(v[i].getCodigo().equals(codigo)){
                return i;
            }
        }
    }
    public void desapilar(Scanner sc){
        if(vacia()){
            System.out.println("La pila se encuentra vacia");
            return;
        }
        System.out.println("Codigo del estudiante que se retira: ");
        String codigo = sc.nextLine();

        int pos = buscarIndice(codigo);
    }
}
