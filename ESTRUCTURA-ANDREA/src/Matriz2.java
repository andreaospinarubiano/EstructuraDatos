public class Matriz2 {
    public int [][] mat;
    public Matriz2(){
        mat = new int [][] {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
    }
    public static void main(String [] args){
        Matriz2 obj = new Matriz2();
        obj.MostrarMatriz();
    }
    public void MostrarMatriz(){
        for (int i = 0; i < mat.length; i++){
            for (int k = 0; k < mat[i].length; k++){
                System.out.print(mat[i][k] + " ");
            }
            System.out.println();
        }
    }
}
