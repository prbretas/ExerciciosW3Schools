import java.util.Scanner;
import java.util.Date;



/*   Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
       mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
       (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/



public class Exercicio1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Olá seja bem vindo a aplicação");
        System.out.println("Este sistema irá calcular a sua idade.");
        System.out.println("---------------------------------------");
        System.out.println("Insira aqui o ano do seu nascimento.");
        int birthYear = Input.nextInt();


        Date dt=new Date();
        int year=dt.getYear();
        int currentYear=year+1900;


        int resultAge = currentYear - birthYear;
        System.out.println("---------------------------------------");
        System.out.println("O ano de nascimento informado é " + birthYear);
        System.out.printf("Você tem %d anos em %d.", resultAge, currentYear);



    }
}



