package reinoanimalia;

public class Gato extends Animal {
    private String cor; // novo atributo específico do gato

    /** Construtor que recebe nome e cor. */
    public Gato(String nome, String cor) {
        super(nome); // chama o construtor da superclasse
        this.cor = cor;
    }

    public Gato() {
        super("Sem nome"); // Construtor sem argumentos: nome padrão "Sem nome"
    }



    /* Getter e setter para 'cor'. */
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    /**
     * Polimorfismo: adiciona informações da cor ao relatar dados
     * e mantém o comportamento da superclasse via super.informarCoisas().
     */
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\nCor: " + cor + "\n------------------------------------";
    }
    
}
