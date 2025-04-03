package academy.devdojo.maratonajava.intro;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // Lógica para comparação e condição [OU]
        int idade = 10;

        if(idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // idade < 15 categoria infantil
        // idade >= 15 &&  idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idadeCategoria = 18;

        if(idadeCategoria < 15){
            System.out.println("Categoria infantil");
        } else if(idadeCategoria > 15 && idadeCategoria < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
        /*Outra forma de exexutar o mesmo código seria utilizando duas variaveis

         int idade = 15;
         String categoria;

         if (idade < 15){
           categoria = "categoria infantil";
           } else if (idade > 15 && idade < 18){
                categoria = "categoria juvenil";
           } else {
                categoria = "categoria adulto";
           }

          */
    }
}
