public class Cadena7 {
    public static void main (String [] args){
        String cad1 = "Sistemas";
        String cad2 = "SISTEMAS";
        String cad3 = "sistemas";
        String cad4 = "S1stemas";
        boolean opc1, opc2, opc3, opc4;

        opc1 = cad1.equalsIgnoreCase(cad1);
        opc2 = cad1.equalsIgnoreCase(cad2);
        opc3 = cad1.equalsIgnoreCase(cad3);
        opc4 = cad1.equalsIgnoreCase(cad4);

        System.out.println("Respuesta: " + opc1);
        System.out.println("Respuesta: " + opc2);
        System.out.println("Respuesta: " + opc3);
        System.out.println("Respuesta: " + opc4);
    }
}
