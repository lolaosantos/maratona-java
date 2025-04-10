package academy.devdojo.maratonajava.intro;

public class Aula08EstruturasDeRepetição {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);

        }
        do {
            System.out.println("dentro do do while" + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for " +i);
        }

    }
}
