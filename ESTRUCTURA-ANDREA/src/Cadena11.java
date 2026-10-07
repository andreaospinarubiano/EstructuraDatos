public class Cadena11 {
    public static void main (String [] args){
        String frase = "Programar en Java es muy potente";
        String frase1 = frase.replace("Java", "Python");
        System.out.println(frase1);
        String textoConGuiones = frase.replace(" ", "_");
        System.out.println(textoConGuiones);
    }
}
