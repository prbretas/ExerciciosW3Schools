import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário:");
        double salario = Input.nextDouble();
        double salarioMinimo  = 1212;

        double quantidadeSalarios = salario / salarioMinimo;

        System.out.printf("O salário digitado é: R$%.2f", salario);
        System.out.printf("\nO seu salário representa %.3f salários mínimos", quantidadeSalarios);





    }
}
