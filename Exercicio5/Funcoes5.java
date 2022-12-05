import java.util.Scanner;

public class funcoes5 {
public static void main(String []args) {
    //taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo
 

Scanner teclado = new Scanner(System.in);
System.out.print( "Digite a taxa do imposto ");
float taxaImposto = teclado.nextFloat();


System.out.print( "Digite o valor do produto " );
float custo = teclado.nextFloat();
    

somaImposto(taxaImposto, taxaImposto);

teclado.close();

}
static void somaImposto(float taxaImposto, float custo){
    System.out.println( "O valor do produto com o imposto é " + (1 + taxaImposto/100) * custo );
    
}

}
