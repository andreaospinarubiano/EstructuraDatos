public class Cadena10 {
    public static void main (String [] args){
        String cad1 = "Ingenieria de Sistemas";
        String sub1 = cad1.substring(12);
        System.out.println("Resultado = " + sub1);
        sub1 = cad1.substring(5);
        System.out.println("Resultado = " + sub1);
        String sub2 = cad1.substring(0,10);
        System.out.println("Resultado = " + sub2);
        sub2 = cad1.substring(3,7);
        System.out.println("Resultado = " + sub2);
    }
}
