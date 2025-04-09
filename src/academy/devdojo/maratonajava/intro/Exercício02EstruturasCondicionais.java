package academy.devdojo.maratonajava.intro;

public class Exercício02EstruturasCondicionais {
    public static void main(String[] args) {
        //Utilizando SWITCH e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo

        byte dia = 5;
        switch (dia) {
            case 1:
            case 7: System.out.println("final de semana"); break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("dia útil"); break;
            default: System.out.println("Erro"); break;
        }

    }
}
