import java.util.*;
public class Matriz3 {
    public Scanner teclado;
    public int [][] mat;
    public Matriz3() {
        mat = new int [3][3];
    } 
    public static void main (String [] args){
        Matriz3 op = new Matriz3();
        op.cargar();
        op.mostrar();
    }
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.println("Elementos de la Matriz");
        for (int i = 0; i < mat.length; i++){
            for (int k = 0; k < mat[i].length; k++){
                System.out.print("Ingrese valor: ");
                mat [i][k] = teclado.nextInt();
            }
        }
    }
    public void mostrar (){
        System.out.println("Matriz Resultante");
        for (int i = 0; i < mat.length; i++){
            for (int k = 0; k < mat[i].length; k++){
                System.out.print(mat[i][k] + " ");
            }
            System.out.println();
        }
    }
}
