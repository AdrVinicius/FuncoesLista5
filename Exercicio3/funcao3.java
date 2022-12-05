import java.util.Scanner;
public class funcao3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro argumento: ");
        int a = teclado.nextInt();
        System.out.print("Digite o segundo argumento: ");
        int b = teclado.nextInt();
        System.out.print("Digite o terceiro argumento: ");
        int c = teclado.nextInt();
        
       sum(a,b,c);
       teclado.close(); 
    }
    static void sum(int a,int b,int c){
        System.out.println("A soma dos três argumentos é "+(a+b+c));
    }
}
