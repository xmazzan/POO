package reinoanimalia;

/**
 * Classe base para qualquer animal.
 * Demonstra encapsulamento usando campo private + getters/setters.
 */
public class Animal {
    // Atributo privado: só acessível dentro da classe.
    private String nome;

    /** Construtor padrão que recebe o nome do animal. */
    public Animal(String nome) {
        this.nome = nome;
    }

    /** Construtor sem parâmetros (nome não informado). */
    public Animal() { }

    /* Getter e setter: controlam acesso ao campo 'nome'. */
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    /** Método que imprime informações do animal. */
    public void informarCoisas() {
        System.out.println("Nome do animal: " + this.nome);
    }
}
