package semana01.Mentoria02;

public class MostraCasos {
    public static void main(String[] args) {
        int opcao = 1;
        String[] carros = {"Sandero", "Fusion", "Prisma"};

        System.out.println("Escolha abaixo:");
        System.out.println("1 - Mostrar carro da marca Honda.");
        System.out.println("2 - Mostrar todos os carros.");

        switch (opcao) {
            case 1:
                System.out.println("Não temos carros para alocar.");
                break;
            case 2:
                for(int i = 0; i < carros.length; i++) {
                    System.out.printf("%d - %s\n", (i+1), carros[i]);
                }

                break;
            default:
                System.out.println("Opção esoclhida não existe");
        }
    }
}
