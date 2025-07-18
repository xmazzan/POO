import reinoanimalia.Animal;   // Importa a classe base Animal
import reinoanimalia.Cachorro; // Importa a subclasse Cachorro

// Classe que demonstra a criação e uso de objetos Animal e Cachorro
public class brincandoComAnimais {

    // Método que executa o fluxo principal da aplicação
    private void iniciar() {
        try {
            System.out.println("Iniciando o aplicativo de brincando com animais...");

            // ----------- Demonstração com a classe Animal -----------
            Animal animal1 = new Animal("Leao"); // Cria um Animal chamado “Leao”
            animal1.informarCoisas();            // Exibe informações do Animal

            // ----------- Demonstração com a classe Cachorro ---------
            Cachorro cachorro1 = new Cachorro("Rex", "Labrador"); // Instancia com nome e raça
            cachorro1.informarCoisas();                           // Exibe nome + raça
            cachorro1.setRaca("Golden Retriever");                // Altera a raça
            cachorro1.informarCoisas();                           // Exibe novamente

            // ----------- Construtor padrão + setters ---------------
            Cachorro cachorro2 = new Cachorro(); // Nome padrão “Sem nome”
            cachorro2.setNome("Buddy");          // Define nome
            cachorro2.setRaca("Beagle");         // Define raça
            cachorro2.informarCoisas();          // Exibe

            cachorro2.setRaca("Poodle");         // Muda somente a raça
            cachorro2.informarCoisas();          // Exibe

            cachorro2.setNome("Max");            // Muda somente o nome
            cachorro2.informarCoisas();          // Exibe
        } catch (Exception ex) {
            // Caso ocorra qualquer erro, lança exceção indicando problema na inicialização
            throw new UnsupportedOperationException("Erro ao iniciar a aplicação", ex);
        }
    }

    // Ponto de entrada da aplicação
    public static void main(String[] args) {
        brincandoComAnimais aplicacao = new brincandoComAnimais();
        aplicacao.iniciar(); // Dispara o fluxo principal
    }
}
