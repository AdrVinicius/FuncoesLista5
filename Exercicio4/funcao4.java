import java.util.Scanner;

public class funcao4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n = teclado.nextDouble();
     posicaoNegativa(n); 
     teclado.close();  
    }

    static void posicaoNegativa(double n){
        if(n<0){
            System.out.println("O número "+n+" é negativo");
        }else{
            System.out.println("O número "+n+" é positivo");
        }
    }
}
