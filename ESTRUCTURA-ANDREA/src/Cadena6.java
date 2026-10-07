public class Cadena6 {
    public static void main (String [] args){
        String cad1 = "SISTEMAS";
        String cad2 = "sistemas";
        String cad3 = "sistemas";

        System.out.println(cad1.equals(cad2));
        System.out.println(cad2.equals(cad3));

        System.out.println(cad1 == cad2);
        System.out.println(cad2 == cad3);
    }
}
