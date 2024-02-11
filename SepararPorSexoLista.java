import java.util.ArrayList;
import java.util.Scanner;

public class SepararPorSexoLista {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Declarar variáveis
            ArrayList<String> nomesMasculinos = new ArrayList<>();
            ArrayList<String> nomesFemininos = new ArrayList<>();

            // Ler nomes e sexos
            while (true) {
                System.out.print("Digite seu nome (ou digite 'sair' para finalizar): ");
                String nome = scanner.nextLine();

                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("Digite seu sexo (M/F): ");
                char sexo = scanner.next().charAt(0);

                if (sexo == 'M' || sexo == 'm') {
                    nomesMasculinos.add(nome);
                } else if (sexo == 'F' || sexo == 'f') {
                    nomesFemininos.add(nome);
                } else {
                    System.out.println("Sexo inválido!");
                }

                scanner.nextLine(); // Consumir o caractere de nova linha
            }

            // Imprimir resultados
            System.out.println("**Grupo Masculino:**");
            for (String nome : nomesMasculinos) {
                System.out.println(nome);
            }

            System.out.println("**Grupo Feminino:**");
            for (String nome : nomesFemininos) {
                System.out.println(nome);
            }
        }
    }
}