package reinoanimalia;

/**
 * Classe base para qualquer animal.
 * Demonstra encapsulamento usando campo private + getters/setters.
 */
public class Animal {
    // estatica para contar animais
    private static int contadorAnimais = 0;
     
    // Atributo privado: só acessível dentro da classe.
    private String nome;

    /** Construtor padrão que recebe o nome do animal. */
    public Animal(String nome) {
        this.nome = nome;
        contadorAnimais++; // Incrementa o contador de animais
    }

    /** Construtor sem parâmetros (nome não informado). */
    public Animal() { }

    /* Getter e setter: controlam acesso ao campo 'nome'. */
    public String getNome() { return nome; }

    // if e else para checar se o nome é nulo ou vazio    
    public void setNome(String nome) { 
        if(nome==null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        } 
        this.nome = nome;

      }

    public static int getContadorAnimais() {
        return contadorAnimais; // Retorna o número total de animais criados
    }

    /** Método que imprime informações do animal. */
    public String getDescricao() {
        return "Nome do animal: " + nome;
    }
}