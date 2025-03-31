package academy.devdojo.maratonajava.intro;

public class Aula04Operadores {
    public static void main(String[] args) {

        //operadores logicos &&(AND) || (OR) ! (NOT)

        int idade = 35;
        float salario = 3500.00f;
        boolean isDentroDaLeiMaior = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenor = idade < 30 && salario >= 3381;
        System.out.println("Dentro da lei maior que trinta " +isDentroDaLeiMaior);
        System.out.println("Dentro da lei menor que trinta " +isDentroDaLeiMenor);

        double valorTotalContaCorrente = 200;
        float valorPlay = 5000f;
        double valorTotalContaPoupanca = 10000;
        boolean isPlayCincoCompravel =  valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;

        System.out.println("isPlayCincoCompravel ="+isPlayCincoCompravel);

    }
}
