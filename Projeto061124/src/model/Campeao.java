package model;

public class Campeao {
    private String nome;
    private int ataque;
    private int armadura;
    private int vida;

    // Construtor
    public Campeao(String nome, int vida, int ataque, int armadura) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    // Método para receber dano
    public void takeDamage(int dano) {
        int danoRecebido = dano - this.armadura;
        if (danoRecebido < 1) {
            danoRecebido = 1;  // Pelo menos 1 de vida deve ser perdido
        }
        this.vida = Math.max(0, this.vida - danoRecebido);  // Vida não pode ser menor que zero
    }

    // Método para mostrar o status do campeão
    public String status() {
        if (this.vida == 0) {
            return this.nome + ": 0 de vida (morreu)";
        } else {
            return this.nome + ": " + this.vida + " de vida";
        }
    }

    // Getters para ataque e vida
    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }
}
