🐾 README — Aula “Brincando com Animais”
Nível: Júnior Aprendiz (acabou de sair do casulo)

1. Objetivos da aula
Entender os pilares da Programação Orientada a Objetos (POO):

Classe, objeto, encapsulamento, herança e polimorfismo.

Ler, compilar e executar um projeto Java simples.

Reconhecer e alterar propriedades de objetos em tempo de execução.

2. Estrutura do projeto
bash
Copiar
Editar
reinoanimalia/           # Pacote com as classes de domínio
│
├── Animal.java          # Classe base
├── Cachorro.java        # Classe que estende Animal
│
brincandoComAnimais.java # Classe “driver” que possui o método main()
Por que pacotes?
Pacotes organizam o código e evitam conflito de nomes. Aqui usamos reinoanimalia para representar o “módulo” onde vivem nossos bichinhos.

3. Visão rápida das classes
Classe / Arquivo	Responsabilidade chave	Conceitos de POO aplicados
Animal	Representa um animal genérico (atributo nome).	Encapsulamento, construtores, método que pode ser sobrescrito (informarCoisas).
Cachorro extends Animal	Especializa Animal com o atributo raca.	Herança, construtor sobrecarregado, override de método.
brincandoComAnimais	Contém main() e demonstra a criação/manipulação dos objetos.	Tratamento de exceções, execução do fluxo principal.

4. Conceitos essenciais (sem enrolação)
Conceito	Explicação “de mãe para filho”
Classe	Receita de bolo. Define ingredientes (atributos) e passos (métodos).
Objeto	O bolo saindo do forno: uma instância real da receita.
Encapsulamento	Guardar os ingredientes dentro da massa: atributos private + getters/setters para controlar o acesso.
Herança	Cachorro herda tudo de Animal e adiciona o que é específico dele.
Polimorfismo	O mesmo método (informarCoisas) se comporta diferente em Animal e Cachorro.
Override	Reescrever um método da superclasse para mudar ou ampliar o comportamento.
Construtor	Método especial chamado na criação do objeto; inicializa atributos.

5. Como compilar e executar
Pré‑requisitos

JDK 17 (ou superior) instalado

Variável de ambiente JAVA_HOME configurada

Terminal / Prompt de comando

Compilar

bash
Copiar
Editar
# Navegue até a pasta onde estão os arquivos .java
javac brincandoComAnimais.java reinoanimalia/Animal.java reinoanimalia/Cachorro.java
O javac cria arquivos .class (bytecode) na mesma estrutura de pastas.

Executar

bash
Copiar
Editar
java brincandoComAnimais
Saída esperada (resumida):

arduino
Copiar
Editar
Iniciando o aplicativo de brincando com animais...
Nome do animal: Leao
Nome do animal: Rex
Raça do cachorro: Labrador
...
6. Passo a passo do fluxo (o que o código faz)
Linha‑chave	O que acontece	Por que é importante
Animal animal1 = new Animal("Leao");	Cria um Animal genérico.	Demonstra instânciação com construtor que recebe parâmetro.
animal1.informarCoisas();	Imprime nome.	Primeiro contato com método de instância.
Cachorro cachorro1 = new Cachorro("Rex", "Labrador");	Cria Cachorro com nome + raça.	Mostra herança e construtor da subclasse.
cachorro1.setRaca("Golden Retriever");	Altera a raça.	Usa setter para modificar estado encapsulado.
new Cachorro();	Usa construtor padrão (nome “Sem nome”).	Enfatiza sobrecarga de construtores.
try { ... } catch (Exception ex)	Captura erros e lança exceção específica.	Boa prática de tratamento de exceções.

7. Exercícios para fixar
Crie a classe Gato estendendo Animal. Adicione atributo corDosOlhos e sobrescreva informarCoisas().

Restrinja a mudança de nome: modifique setNome em Animal para impedir nomes vazios ou null.

Adicione um contador estático na classe Animal para rastrear quantos animais foram criados. Imprima ao final.

Refatore: substitua os System.out.println por um método String getDescricao() que retorne a descrição. Depois, apenas imprima o retorno.
