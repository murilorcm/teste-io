import java.io.*;
import java.util.Scanner;

public class TesteEntrada {
    public static void main(String[] args) throws IOException {

        //BufferedReader br= new BufferedReader(
        //                       new InputStreamReader(
        //                           new FileInputStream("src/entrada.txt")));

        //System.out.println("Digite sua mensagem: ");

        //String linha = br.readLine();
        //
        //while (linha != null) {
        //    System.out.println(linha);
        //    linha = br.readLine();
        //}
        //
        //br.close();

        //Scanner entrada = new Scanner(
        //        new FileInputStream("src/entrada.txt"));

        Scanner entrada = new Scanner(System.in);
        PrintStream saida = new PrintStream(
                new FileOutputStream("src/saida.txt"));


        while(entrada.hasNextLine()) {
            saida.println(entrada.nextLine());
        }
        saida.close();
        entrada.close();

    }
}



// ¯\_(ツ)_/¯