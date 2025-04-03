package academy.devdojo.maratonajava.intro;

public class Aula06OperadorTernario {
    public static void main(String[] args) {
        //Doar salário se > 5000
        double salario = 6000.00;
        String mensagemDoar = "Eu vou doar com carinho!";
        String mensagemNaoDoar = "Não conseguirei doar por hora";

       // (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
