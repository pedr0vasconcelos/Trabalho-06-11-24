package service;

import model.Campeao;

public class CombateService {

    public void executarTurno(Campeao campeao1, Campeao campeao2, int turno) {
        // Cada campeão ataca o outro
        campeao1.takeDamage(campeao2.getAtaque());
        campeao2.takeDamage(campeao1.getAtaque());

        // Exibir o resultado do turno
        System.out.println("Resultado do turno " + turno + ":");
        System.out.println(campeao1.status());
        System.out.println(campeao2.status());
    }

    public boolean isCombateFinalizado(Campeao campeao1, Campeao campeao2) {
        return campeao1.getVida() == 0 || campeao2.getVida() == 0;
    }

    public void mostrarFimDoCombate() {
        System.out.println("### FIM DO COMBATE ###");
    }
}
