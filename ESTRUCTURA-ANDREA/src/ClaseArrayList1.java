import java.util.ArrayList;
public class ClaseArrayList1 {
    public static void main (String [] args){
        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("Luisa");
        nombre.add("Juan");
        nombre.add("Camila");
        nombre.add("Pedro");
        nombre.add("Ana");
        nombre.add("Gerardo");
        nombre.add("Javier");
        nombre.add("Andrea");
        nombre.add("Manuela");

        System.out.println("Lista de personas");

        for(String nom : nombre){
            System.out.println(nom);
        }

        int tam = nombre.size();
        System.out.println("Tamaño de la lista: " + tam);

        boolean esVacia = nombre.isEmpty();
        System.out.println("La lista esta vacia: " + esVacia);

        String dato = nombre.get(0);
        System.out.println("Nombre: " + dato);
        dato = nombre.get(5);
        System.out.println("Nombre: " + dato);
        nombre.set(3,"Pepe");
        System.out.println("Lista modificada de personas");
        for (String nom : nombre){
            System.out.println(nom);
        }

        nombre.remove(4);
        System.out.println("Lista nueva de personas");
        for (String nom : nombre){
            System.out.println(nom);
        }
    }
}
