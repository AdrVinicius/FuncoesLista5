import java.util.Scanner;


public class funcoes11 {
    public static String mostraData(String dat, String[] ext) {
        StringBuilder teclado = new StringBuilder();

        ext = dat.split("/");

        for (int x = 0; x < 3; x++) {
            if (x == 0) {
                teclado.append(ext[x]);
                teclado.append(" de ");
            }

            if (x == 1) {
                if (ext[x].compareTo("01") == 0) {
                    teclado.append("Janeiro");
                } else if (ext[x].compareTo("02") == 0) {
                    teclado.append("Fevereiro");
                } else if (ext[x].compareTo("03") == 0) {
                    teclado.append("Março");
                } else if (ext[x].compareTo("04") == 0) {
                    teclado.append("Abril");
                } else if (ext[x].compareTo("05") == 0) {
                    teclado.append("Maio");
                } else if (ext[x].compareTo("06") == 0) {
                    teclado.append("Junho");
                } else if (ext[x].compareTo("07") == 0) {
                    teclado.append("Julho");
                } else if (ext[x].compareTo("08") == 0) {
                    teclado.append("Agosto");
                } else if (ext[x].compareTo("09") == 0) {
                    teclado.append("Setembro");
                } else if (ext[x].compareTo("10") == 0) {
                    teclado.append("Outubro");
                } else if (ext[x].compareTo("11") == 0) {
                    teclado.append("Novembro");
                } else if (ext[x].compareTo("12") == 0) {
                    teclado.append("Dezembro");
                } else {
                    teclado.append(ext[x]);
                }

                teclado.append(" de ");
            }

            if (x == 2) {
                teclado.append(ext[x]);
            }
        }

        return teclado.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Mesporextenso = new String[3];
        String data = "";

        do {
            System.out.print("Digite a data no padrão dd/mm/aaaa: ");
            data = sc.nextLine();

            if (data.length() != 10) {
                System.out.println("Data Inválida!");
            }
        } while (data.length() != 10);
        sc.close();
        System.out.println(mostraData(data, Mesporextenso));
    }

}
