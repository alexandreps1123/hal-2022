package semana01.Mentoria02;

public class ControleRegistroCarros {
    public static void main(String[] args) {
        String[] carros = {"Uno", "HB20", "Gol", "Ka", "Onix", "BMW"};

        for(int i = 0; i < carros.length; i++) {
            System.out.printf("%d - %s\n", (i+1), carros[i]);
        }
    }
}
