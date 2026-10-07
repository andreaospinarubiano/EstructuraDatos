public class Cadena3 {
    public static void main (String [] args){
        String cad = "Sistemas";
        char letra1, letra2, letra3;
        letra1 = cad.charAt(0);
        letra2 = cad.charAt(5);
        letra3 = cad.charAt(cad.length() -1);
        System.out.println("Caracter: " + letra1);
        System.out.println("Caracter: " + letra2);
        System.out.println("Caracter: " + letra3);
    }
}
