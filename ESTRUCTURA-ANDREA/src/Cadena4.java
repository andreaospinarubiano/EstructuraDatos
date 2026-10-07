public class Cadena4 {
    public static void main (String [] args){
        String nombre = "Ana";
        String apellido = "Torres";
        int edad = 25;
        System.out.println(nombre + " " + apellido + " tiene " + edad + " años.");

        String completo;
        completo = nombre.concat(" ").concat(apellido);
        System.out.println(completo);
    }
}
