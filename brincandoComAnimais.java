import reinoanimalia.Animal;   // Importa a classe base Animal
import reinoanimalia.Cachorro; // Importa a subclasse Cachorro
import reinoanimalia.Gato;
import reinoanimalia.Leao;

// Classe que demonstra a criação e uso de objetos Animal e Cachorro
public class brincandoComAnimais {

    // Método que executa o fluxo principal da aplicação
    private void iniciar() {
        try {
            System.out.println("Iniciando o aplicativo de brincando com animais...");

            // ----------- Demonstração com a classe Animal -----------
            Animal animal1 = new Animal("Leao"); // Cria um Animal chamado “Leao”
            animal1.getDescricao();            // Exibe informações do Animal

            // ----------- Demonstração com a classe Cachorro ---------
            Cachorro cachorro1 = new Cachorro("Rex", "Labrador"); // Instancia com nome e raça
            cachorro1.getDescricao();                           // Exibe nome + raça
            cachorro1.setRaca("Golden Retriever");                // Altera a raça
            cachorro1.getDescricao();                           // Exibe novamente

            // ----------- Construtor padrão + setters ---------------
            Cachorro cachorro2 = new Cachorro(); // Nome padrão “Sem nome”
        // Define nome
            cachorro2.setRaca("Beagle");         // Define raça
            System.out.println(cachorro2.getDescricao());      // Exibe

            cachorro2.setRaca("Poodle");   // Muda somente a raça
            cachorro2.getDescricao();          // Exibe

            cachorro2.setNome("arroz");            // Testando o setNome nulo 
            System.out.println(cachorro2.getDescricao());          // Exibe

            Gato gato1 = new Gato("Mia", "Branco");
            System.out.println(gato1.getDescricao()); 

            Gato gato2 = new Gato(null , "preto"); // Cria um Gato - nome nulo dessa forma da certo
            System.out.println(gato2.getDescricao());  // testando se deu certo rs                // Exibe informações do Gato

            Leao leaozinho = new Leao(); //
            leaozinho.seturro("Roar!"); // Define o som do Leão
            leaozinho.setCor("Amarelo"); // Define a cor do Leão
            leaozinho.setIdade(5); // Define a idade do Leão
            leaozinho.setNome("Simba"); // Define o nome do Leão
            System.out.println(leaozinho.getDescricao()); // Exibe informações do Leão
            System.out.println(leaozinho.fazOUrro()); // Exibe urro do Leão

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
