package reinoanimalia;

public abstract class Felino extends Animal {
    // Atributos comuns a todos os felinos
    private String cor;
    private int idade;


    // Getters
    public Felino(String cor, int idade) {
        setCor(cor);
        setIdade(idade);
    }

    public Felino() {
        this.cor = "Sem cor";
        this.idade = 0;
    }

    public String getCor() {
        return cor;
    }
    public int getIdade() {
        return idade;
    }

    // Setters
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade do felino não pode ser negativa.");
        }
        this.idade = idade;
    }
    
    // --- Método Abstrato ---
    // Qualquer subclasse concreta de Animal DEVE implementar este método.
    public abstract String fazOUrro(); 
}
