import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class funcoes12 {
    public static String embaralhaPalavra(List<String> embaralharpalavra, String palavradigitada) {
        Collections.shuffle(embaralharpalavra);
        StringBuilder teclado = new StringBuilder(palavradigitada.length());

        teclado.append("A palavra digitada embaralhada fica assim: ");

        for (String a : embaralharpalavra) {
            teclado.append(a);
        }

        return teclado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite alguma palavra: ");
        String palavra = sc.nextLine();
        List<String> embaralhar = Arrays.asList(palavra.split(""));
        System.out.println(embaralhaPalavra(embaralhar, palavra));
        sc.close();
    }
}
