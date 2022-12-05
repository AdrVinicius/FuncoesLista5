import java.util.Scanner;
public class funcao7{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       

        System.out.println("Digite o valor da prestação " );
        int valordaprestacao = teclado.nextInt();

        System.out.println("Digite a quantidade de dias em atraso " );
        int diasEmAtraso = teclado.nextInt();

        valorPagamento(valordaprestacao, diasEmAtraso);


        while (valordaprestacao >= 1){
            System.out.println("Digite outro valor da prestação " );
            valordaprestacao = teclado.nextInt();

            System.out.println("Digite a quantidade de dias em atraso " );
            diasEmAtraso = teclado.nextInt();

            valorPagamento(valordaprestacao, diasEmAtraso);

        }
      
        teclado.close();

        
    }
        static void valorPagamento(int valordaprestacao, int diasEmAtraso){

        if (diasEmAtraso >= 1){
            System.out.print(" O valor a ser pago é " + ((((valordaprestacao * 3)/ 100) + (((diasEmAtraso * 0.1)/100) * valordaprestacao )) + valordaprestacao));        

        }

        if (diasEmAtraso <= 0){
            System.out.print(" O valor a ser pago é " + valordaprestacao );
        }
        
    }         
        
 }
        
    
