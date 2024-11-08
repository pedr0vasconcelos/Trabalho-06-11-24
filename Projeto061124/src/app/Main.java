package app;

import model.Campeao;
import service.CombateService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CombateService combateService = new CombateService();

        // Entrada de dados do primeiro campeão
        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida1 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque1 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        Campeao campeao1 = new Campeao(nome1, vida1, ataque1, armadura1);

        // Entrada de dados do segundo campeão
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        int vida2 = scanner.nextInt();
        System.out.print("Ataque: ");
        int ataque2 = scanner.nextInt();
        System.out.print("Armadura: ");
        int armadura2 = scanner.nextInt();

        Campeao campeao2 = new Campeao(nome2, vida2, ataque2, armadura2);

        // Definir a quantidade de turnos
        System.out.print("Quantos turnos você deseja executar? ");
        int turnos = scanner.nextInt();

        // Loop de combate
        for (int i = 1; i <= turnos; i++) {
            combateService.executarTurno(campeao1, campeao2, i);

            // Verificar se algum campeão morreu e interromper o combate
            if (combateService.isCombateFinalizado(campeao1, campeao2)) {
                break;
            }
        }

        // Mostrar fim do combate após o último turno ou se algum campeão morreu
        combateService.mostrarFimDoCombate();
        
        scanner.close();
    }
}
