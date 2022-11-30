public class Exercicio3 {
    public static void main(String[] args) {
        final int saldo = Integer.parseInt(args[0]); //obs: final faz com q a variavael seja constante
        final int reajuste = Integer.parseInt(args[1]);

        int saldoFinal = saldo + (saldo * reajuste /100);

        System.out.printf("- O salário é de R$%d,00\n" +
                "- Teve um reajuste de %d por cento.\n" +
                "- Totalizando: R$ %d,00", saldo, reajuste, saldoFinal);
    }
}
