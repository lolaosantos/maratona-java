package academy.devdojo.maratonajava.intro;

public class Aula09Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] n2 = {1,2,3,4,5};

       /* for (int i = 0; i < n2.length; i++) {
            //System.out.println(n2[i]);
        } */
        for (int num : n2) {
            System.out.println(num);
        }
    }
}
