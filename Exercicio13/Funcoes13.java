import java.util.Scanner;

public class funcoes13 {
    public static String fazerUmaMoldura(int linha, int coluna) {
        String teclado = "";

        for (int a = 0; a < linha; a++) {
            if (a == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (a == (linha - 1)) {
                System.out.print("+");
            }

        }

        for (int b = 0; b < coluna; b++) {
            for (int i = 0; i < linha; i++) {
                if (i == 0) {
                    System.out.print("\n|");
                } else {
                    System.out.print(" ");
                }

                if (i == (linha - 1)) {
                    System.out.print(" |");
                }
            }
        }

        for (int i = 0; i < linha; i++) {
            if (i == 0) {
                System.out.print("\n+");
            }

            System.out.print("-");

            if (i == (linha - 1)) {
                System.out.print("+");
            }

        }
        return teclado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o tamanho da linha ? ");
        int linha = sc.nextInt();

        if (linha < 1) {
            linha = 1;
        } else if (linha > 20) {
            linha = 20;
        }

        System.out.print("Qual o tamanho da coluna ? ");
        int coluna = sc.nextInt();

        if (coluna < 1) {
            coluna = 1;
        } else if (coluna > 20) {
            coluna = 20;
        }

        System.out.println(fazerUmaMoldura(linha, coluna));
        sc.close();
    }
}
