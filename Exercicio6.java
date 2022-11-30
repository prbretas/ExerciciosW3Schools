import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = Input.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero +1;

        System.out.printf("O número digitado foi:", numero);
        System.out.printf("\nO antecessor do número digitado é: %d", antecessor);
        System.out.printf("\nO sucessor do número digitado é: %d", sucessor);




    }
}
