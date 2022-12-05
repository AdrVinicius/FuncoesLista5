import java.util.Scanner;

public class funcoes6{
    public static void main(String []agrs) {
        int horas, minutos;
    
    
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite apenas as horas(Não digite os minutos)");
        horas = teclado.nextInt();
        System.out.println("Digite apenas os minutos)");
        minutos = teclado.nextInt();
        String opcao;
    
        do {
        if (horas > 12) {
             horas = horas - 12;
             imprimecaohorario(horas, minutos, 'P');
            } else if (horas == 12) {
                imprimecaohorario(horas, minutos, 'P');
            } else if (horas == 24) {
                horas = 0;
                imprimecaohorario(horas, minutos, 'A');
            } else {
                imprimecaohorario(horas, minutos, 'A');
            }
            System.out.println("Deseja converter mais um numero?");
            opcao = teclado.next();
        
            
    
            } while (opcao != "n");
        
        }   
    
    
            static void imprimecaohorario ( int h, int m, char t){
                System.out.print(h+":"+m+" "+t+".M.");
            }
           
            
    }
    
    
