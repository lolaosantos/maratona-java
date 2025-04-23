package academy.devdojo.maratonajava.intro;

public class Aula09ArraysMultidimensaionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31, 28, 31, 30 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                System.out.println(dias[i][j]);
            }
        }



    }
}
