import java.util.Scanner;

public class funcoes9 {
        public static void main( String [] args) {
    
            Scanner teclado = new Scanner(System.in);
    
            System.out.println("Digite um numero");
            String a = teclado.nextLine();
            String reverso = "";
            for(int b=a.length()-1; b>=0;b--){
                reverso += String.valueOf(a.charAt(b));
                
            }
            System.out.println(reverso);


            teclado.close();
        }
            
 }
        
    
