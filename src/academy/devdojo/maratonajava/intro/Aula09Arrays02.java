package academy.devdojo.maratonajava.intro;

public class Aula09Arrays02 {
    public static void main(String[] args) {
        // byte, short, long, int, float, double = 0
        // char = '\u0000' ' '
        // boolean = false
        // String = null
        String [] nomes = new String[3];
        nomes[0] = "Lorena";
        nomes[1] = "Ramona";
        nomes[2] = "Gabriella";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
