import java.util.Scanner;

public class App {
   public static void main (String[] agrs) throws Exception {
    System.out.println(x: "Exemplo I/O");
        // 1. Escrever a mensagem "Digite um número."
        System.out.println("Digite um número.");
        // 2. Ler o número
        int n1 = ler.nextInt();
        // 3. Escrever a mensagem "Digite outro número."
        System.out.println("Digite outro número");
        // 4. Ler o número
        int n2 = ler.nextInt();
        // 5. Fazer a operação de Soma
        int r = n1 + n2;
        // 6. Escrever o resultado.
        System.out.println("O resultado da soma = "+r);
        ler.close();
   }
}