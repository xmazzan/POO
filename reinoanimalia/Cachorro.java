package reinoanimalia;

/**
 * Subclasse de Animal que representa um cachorro.
 * Adiciona o atributo 'raca' e sobrescreve informarCoisas().
 */
public class Cachorro extends Animal {
    private String raca;  // novo atributo específico do cachorro

    /** Construtor que recebe nome e raça. */
    public Cachorro(String nome, String raca) {
        super(nome);      // chama o construtor da superclasse
        this.raca = raca;
    }

    /** Construtor sem argumentos: nome padrão "Sem nome". */
    public Cachorro() {
        super("Sem nome");
    }

    /* Getter e setter para 'raca'. */
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    /**
     * Polimorfismo: adiciona informações da raça ao relatar dados
     * e mantém o comportamento da superclasse via super.informarCoisas().
     */
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\nRaça: " + raca + "\n------------------------------------";
    }
}