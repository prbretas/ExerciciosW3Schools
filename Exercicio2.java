import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);


        System.out.println("Insira um número");
        int numero1 = Input.nextInt();
        System.out.println("Insira um número");
        int numero2 = Input.nextInt();
        System.out.println("Insira um número");
        int numero3 = Input.nextInt();

        int resultado1 = (numero1 + numero2 + numero3)/3;

        System.out.printf("A primeira lista de números foi: %d, %d, %d", numero1, numero2, numero3);
        System.out.printf("\nA soma dos números é: %d", numero1+ numero2+numero3);
        System.out.printf("\nA média desses númenros é: %d", resultado1);


        System.out.printf("\n---------------------------------------------------");

        System.out.println("\nInsira um número");
        int numero4 = Input.nextInt();
        System.out.println("Insira um número");
        int numero5 = Input.nextInt();
        System.out.println("Insira um número");
        int numero6 = Input.nextInt();


        int resultado2 = (numero4 + numero5 + numero6)/3;

        System.out.printf("A segunda lista de números foi: %d, %d, %d", numero4, numero5, numero6);
        System.out.printf("\nA soma dos números é: %d", numero4+ numero5+numero6);
        System.out.printf("\nA média desses númenros é: %d", resultado2);




        System.out.println("\n---------------------------------------------------");
        System.out.println("Insira um número");
        int numero7 = Input.nextInt();
        System.out.println("Insira um número");
        int numero8 = Input.nextInt();
        System.out.println("Insira um número");
        int numero9 = Input.nextInt();




        int resultado3 = (numero7 + numero8 + numero9)/3;

        System.out.printf("A terceira lista de números foi: %d, %d, %d", numero7, numero8, numero9);
        System.out.printf("\nA soma dos números é: %d", numero7+ numero8+numero9);
        System.out.printf("\nA média desses númenros é: %d", resultado3);

        System.out.printf("\n---------------------------------------------------");

        int media = (resultado1+resultado2+resultado3)/3;
        System.out.printf("\nA média desses números foram: %d, %d, %d", resultado1, resultado2, resultado3);
        System.out.printf("\nA média da média dos números é: %d", media);


    }
}
