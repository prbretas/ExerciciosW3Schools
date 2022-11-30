public class Exercicio4 {
    public static void main(String[] args) {

    double porcentagemIPI = 10;


    double codigoProduto1 = 1;
    double valorUnitario1 = 16.99;
    double quantidadePeca1 = 10;


        double codigoProduto2 = 2;
        double valorUnitario2 = 29.99;
        double quantidadePeca2 = 23;


        double carrinhoProdutos = (valorUnitario1*quantidadePeca1) + (valorUnitario2*quantidadePeca2) * (porcentagemIPI/100 +1);
        System.out.println(carrinhoProdutos);


    }
}
