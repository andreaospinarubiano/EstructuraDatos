public class Arreglo2 {
    public static void main(String []args) {
        final int tam = 10;
        int v[];
        int i, k = 1;
        v = new int [tam];
        for(i = 0; i< v.length; i++) {
            v[i] = k;
            k += 2;
        }
        System.out.println("Serie de los Numeros Naturales");
        for(i= 0 ; i< v.length; i++)
            System.out.println(v[i]);
    }
    
}
