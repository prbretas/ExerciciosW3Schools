public class ExemplosW3Schools {
    public static void main(String[] args) {

        System.out.println("Retornar o índice (posição) da primeira ocorrência de 'v' na String");
        //Retornar o índice (posição) da primeira ocorrência de "e" na String
        System.out.println("---------------------------------------------------");
        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("v")); //Retorna o índice (posição) da primeira ocorrência de "e" na String

        System.out.println("---------------------------------------------------");

        System.out.println("método para encontrar o valor mais alto de x e y.");
        //método para encontrar o valor mais alto de x e y.
        int x = 5;
        int y = 10;
        Math.max(x, y);

        System.out.println(Math.max(x, y));
        System.out.println("---------------------------------------------------");


        System.out.println("Encontrar a raiz quadrada de x.");
        //Encontrar a raiz quadrada de x.
        int raizquadrada = 16;
        Math.sqrt(raizquadrada);
        System.out.println(Math.sqrt(raizquadrada));

        System.out.println("---------------------------------------------------");
        System.out.println("retornar um número aleatório entre 0 (inclusivo) e 1 (exclusivo).");
        //retornar um número aleatório entre 0 (inclusivo) e 1 (exclusivo).
        //utiliza-se ---->    Math.random();




        System.out.println("---------------------------------------------------");
        System.out.println("IF -- ELSE IF -- ELSE ");
        //Imprima "1" se xfor igual a y, imprima "2" se xfor maior que y, caso contrário imprima "3".

        int a = 50;
        int b = 50;

        if(a==b) {
            System.out.println("1");
        } else if(a > b) {
            System.out.println("2");
        } else{
            System.out.println("3");
        }



        System.out.println("---------------------------------------------------");
        System.out.println("IF -- ELSE -----> SHORT HAND ");

        int time = 20;
        System.out.println("----------------IF --- FAÇA ISSO(?) ----ELSE(:) -- faça isso ");
        System.out.println("String result = (time < 18) ? 'Good day' : 'Good evening'");
        String result = (time < 18) ?"Good day." : "Good evening.";
        System.out.println(result);



        System.out.println("---------------------------------------------------");
        System.out.println("-----------------------SWITCH----------------------");
        //switch declaração.
        //EXEMPLO:

        int day = 10;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Weekend");
        }




        System.out.println("---------------------------------------------------");
        System.out.println("-----------------------WHILE- LOOP---------------------");
        //WHILE declaração.
        //EXEMPLO:



        int i = 1; // i recebe 1
        while (i < 10) { //enquanto i for menor que 6 imprima i e adicione + 1 no i
            System.out.println(i);
            i++;
        }






        System.out.println("---------------------------------------------------");
        System.out.println("-----------------------DO - WHILE- LOOP---------------------");

        int j = 1; //j recebe 1
        do{ //faça isso
            System.out.println(j);
            j++;
        }while //enquanto
        (j < 6);



        System.out.println("---------------------------------------------------");
        System.out.println("----------------------- FOR - LOOP ---------------------");

        //laço FOR


        for (int v = 0; v < 5;v++) { //PARA V =0 e V menor que 5, adicione +1 na variavel
            System.out.println("Yes"); //imprima SIM cada vez que for  menor
        }





        System.out.println("---------------------------------------------------");
        System.out.println("-------- FOR - LOOP - percorrendo os itens do array ----------");
        // PERCORRER OS ITENS DO ARRAY UTILIZANDO FOR

        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String k : cars) {
            System.out.println(k);
        }



        System.out.println("---------------------------------------------------");
        System.out.println("---- FOR - LOOP - pausando o loop se alcançar determinado valor - BREAK ------");


        for (int g = 0; g < 10; g++) {
            if (g == 5) {
                break;
            }
            System.out.println(g);
        }



        System.out.println("---------------------------------------------------");
        System.out.println("---- FOR - LOOP - CONTINUE - FAZ PULAR O LOOP------");

        //No loop, quando o valor for "4", pule diretamente para o próximo valor.

        for (int w = 0; w < 10; w++) {
            if (w == 4) {
                continue ;
            }
            System.out.println(w);
        }

        System.out.println("-------------ARRAYS-------------------------------------");
        System.out.println("---------CRIANDO UM ARRAY----------");


        String[] guitars  = {"FENDER", "GIBSON", "PRS" };
        System.out.println(guitars[2]);



        System.out.println("--------------------------------------------------");
        System.out.println("---------Alterando valor de um Array----------");

        String[] carros = {"Volvo", "BMW", "Ford"};
        carros[0] = "Opel";
        System.out.println(carros[0]);


        System.out.println(carros.length); //descobrir a quantidade de um array


        System.out.println("--------------------------------------------------");
        System.out.println("---------ARRAY BIDIMENSIONAL----------");


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[0][1]); //[] primeiro indica o array, []segundo indica o indice dentro do array

















    }
}
