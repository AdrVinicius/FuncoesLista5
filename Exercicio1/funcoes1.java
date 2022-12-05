import java.util.Scanner;
public class funcoes1 {




public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    System.out.print(" Digite quantas linhas você quer imprimir ");
    int n = teclado.nextInt();

    funcaon(n);
    teclado.close();

}



    static void funcaon(int n){

        for(int i =1; i <= n; i++){
            for(int k=0; k<i;k++){
            System.out.print(i);
    }
    System.out.print("\n");
}
}
}
