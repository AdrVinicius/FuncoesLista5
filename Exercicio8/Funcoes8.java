import java.util.Scanner;

public class funcao8{

    public static void main (String []agrs) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numeroDigitado = teclado.nextInt();
        String s= Integer.toString(numeroDigitado);

        System.out.println(" A quantidade de numeros existente no que foi informado é de " + (s.length()));
    

        teclado.close();
        
    }

}
