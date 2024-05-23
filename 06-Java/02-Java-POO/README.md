# Java: Aplicando a Orientação a Objetos

## Objetivo

Aprender os conceitos do paradigma de orientação a objetos, como classes, herança e interfaces, além de boas práticas de programação.

- Aplicação java: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/Java-POO/screenmatch/src);
- Conteúdo teórico do curso: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/Java-POO/aulas_teorias);
- Exercícios resolvidos: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/Java-POO/screenmatch/src/br/com/alura/scrennmatch/exercicios);
- Desafio: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/Java-POO/screenmatch/src/br/com/alura/scrennmatch/desafio);
- Curso Alura: [Clique aqui](https://cursos.alura.com.br/course/java-aplicando-orientacao-objetos);
- Podcast: [TechGuide: Orientação a Objetos – Hipsters Ponto Tech #350](https://cursos.alura.com.br/extra/hipsterstech/techguide-orientacao-a-objetos-hipsters-ponto-tech-350-a2013).

### Aula 01: Introdução ao conceito de modelos

A aula discute a importância de centralizar as regras de negócio em um único lugar, utilizando a abordagem da **orientação a objetos**. É apresentada a criação da classe "`Filme`" para representar as características e comportamentos comuns a todos os filmes, como nome, ano de lançamento, se está incluído no plano de assinatura, avaliação e duração. Os instrutores enfatizam que a definição dos **atributos da classe** deve considerar as necessidades do projeto, evitando incluir informações desnecessárias.

É explicado que a classe "`Filme`" é apenas um modelo e que será necessário criar objetos a partir dessa classe para utilizar as informações dos filmes no código. Os instrutores ressaltam a diferença entre `classe` e `objeto`, deixando claro que a ***classe é a definição do modelo, enquanto o objeto é a instância desse modelo***.

### Aula 02: Atributos

Para facilitar o entendimento foi realizada a renomeação da classe "`Main`" para "`Principal`". 

É explicado como criar um objeto do tipo "`Filme`" e atribuir valores aos seus atributos, como `nome`, `anoDeLancamento` e `duracao`:

```
Filme filme1 = new Filme();

filme1.nome = "Avatar";
filme1.anoDeLancamento: 2009;
filme1.duracao = 103; //minutos
```

É destacada a diferença entre `tipos primitivos` e `tipos por referência`, sendo o objeto "`Filme`" um tipo por referência. É mostrado como acessar os atributos de um objeto usando a sintaxe do ponto e como imprimir esses atributos usando o método "`System.out.println()`".

É explicada a diferença entre a classe "Filme" e um objeto do tipo "Filme", sendo a classe um modelo e o objeto uma instância dessa classe. É enfatizado que não é possível atribuir um valor a um atributo da classe diretamente, é necessário criar um objeto e atribuir o valor ao atributo desse objeto.

### Aula 03: Métodos

A aula abordou a criação de **métodos** na classe `Filme`, explicando que um método é uma forma de fazer algo no Java. Foi apresentado o método "`exibeFichaTecnica()`", que imprime o nome e o ano de lançamento do filme.

Discutiu-se sobre a utilização de variáveis que não existem na classe `Filme`, como "`filme1`", e a forma correta de acessar os atributos. Criou-se o método "`avalia()`", que registra as notas e o total de avaliações de um filme. Explicou-se a criação de um método que retorna um valor, usando o exemplo do método "`pegaMedia()`" que calcula a média das avaliações.

Foram enfatizadas a importância da orientação a objetos, das boas práticas de programação e da nomenclatura adequada para facilitar a legibilidade e a manutenção do código.

### Aula 04: Encapsulamento

A aula aborda a importância de encapsular os atributos de uma classe, impedindo alterações diretas.
É mostrado um exemplo de uma classe "`Filme`" onde os atributos "`somaDasAvaliacoes`" e "`totalDeAvaliacoes`" são inicialmente públicos. 

Os instrutores discutem que é comum em equipes de desenvolvimento ter combinados sobre quais partes do código podem ser alteradas, mas que isso não é ideal. O código deveria ser autoexplicativo e permitir ou bloquear ações de forma clara. Para resolver o problema de alterações diretas nos atributos, é proposta a utilização do modificador de acesso "`private`" para os atributos "`somaDasAvaliacoes`" e "`totalDeAvaliacoes`".

A aula aborda conceitos importantes de orientação a objetos, como **encapsulamento** e **modificadores de acesso**, e mostra a importância de evitar alterações diretas nos atributos de uma classe.

### Aula 05: Getters

A aula discute a importância de utilizar métodos acessores (**getters**) para acessar atributos privados de uma classe, em vez de acessá-los diretamente. É apresentado um exemplo da classe `Filme` que possui um atributo privado `totalDeAvaliacoes`. Para acessar esse atributo, é implementado o método `getTotalDeAvaliacoes()`.

Os instrutores explicam que ter um método que simplesmente retorna o valor de um atributo pode parecer estranho, mas ***é uma boa prática para encapsular a lógica da aplicação e evitar a exposição desnecessária dos atributos***. Essa abordagem permite que o total de avaliações possa ser armazenado em um banco de dados ou ter comunicação com um site parceiro, além de facilitar a alteração da regra de negócios.

Na classe `Principal`, é demonstrado como utilizar o método `getTotalDeAvaliacoes()` para acessar o valor do atributo privado `totalDeAvaliacoes`. Os instrutores ressaltam que a utilização de modificadores de acesso, como o `private`, é importante para controlar o acesso aos atributos e garantir a integridade dos dados.

### Aula 06: Organizando o código

A aula discute o uso do modificador de acesso "`private`" em atributos e a importância de trabalhar com classes no Java.

É mencionado que a classe "`String`" é uma classe do Java, não um tipo primitivo, e que é importante consultar a documentação para entender como as classes funcionam e aproveitar os métodos já existentes.

Os instrutores falam sobre a organização do código em pacotes e a convenção de nomenclatura de pacotes no Java. É mostrado como utilizar o recurso de importação de classes no IntelliJ e como arrastar uma classe para um pacote específico.

Os modificadores de acesso são discutidos, destacando que atributos públicos não são comuns no dia a dia, mas é importante aprender sobre eles. No código exemplo, os atributos "`somaDasAvaliacoes`" e "`totalDeAvaliacoes`" da classe "`Filme`" são marcados como "`private`", e métodos públicos são criados para acessá-los e manipulá-los.

### Aula 07: Setters

Nesta aula, os instrutores discutiram sobre a importância de definir os atributos de uma classe como privados e a necessidade de utilizar métodos getters e setters para acessá-los e modificá-los.

Eles mostraram como criar os setters utilizando a IDE IntelliJ, explicando a importância de usar a palavra-chave "`this`" para referenciar os atributos da classe. Também mencionaram a importância de manter os atributos privados e a possibilidade de adicionar lógica nos setters para validar os valores atribuídos aos atributos.

Os instrutores destacaram que esses conceitos são fundamentais para o encapsulamento e proteção dos atributos.

### Aula 08: Reaproveitamento de código

A aula abordou a implementação de herança nas classes `Filme` e `Serie` em um sistema de streaming de filmes e séries.

Inicialmente, foi identificado que filmes e séries possuem atributos e métodos em comum, como nome, ano de lançamento, inclusão no plano, duração, etc. Para evitar repetição de código, foi criada uma classe `Titulo` que contém esses atributos e métodos comuns.

As classes `Filme` e `Serie` então passaram a **herdar** da classe `Titulo`, utilizando a palavra-chave `extends`. Dessa forma, elas herdaram todos os atributos e métodos da classe `Titulo`.

A classe `Filme` adicionou apenas o atributo `diretor`, enquanto a classe `Serie` adicionou atributos específicos, como `numeroDeTemporadas`, `episodiosPorTemporada` e `duracao` dos episódios.

Foi demonstrado como instanciar objetos das classes `Filme` e `Serie` e utilizar os métodos e atributos herdados da classe `Titulo`, bem como os atributos específicos de cada classe. A implementação da herança permitiu que as classes `Filme` e `Serie` compartilhassem características comuns, evitando a repetição de código e facilitando a organização e manutenção do sistema.

Em resumo, a aula abordou o conceito de **herança em Java**, mostrando como ele pode ser aplicado para reaproveitar características e comportamentos entre classes relacionadas.

### Aula 09: Sobrescrita de métodos

A aula discute como obter a duração em minutos de um filme e de uma série de TV. Para filmes, a duração em minutos é simples de calcular, mas para séries envolve considerar o número de temporadas, episódios por temporada e minutos por episódio.

Para evitar duplicação de código, os instrutores decidem sobrescrever o método `getDuracaoEmMinutos()` na classe `Serie`. A sobrescrita de métodos é um recurso importante em Java, permitindo que subclasses forneçam suas próprias implementações de métodos da superclasse.

A anotação `@Override` é uma boa prática para indicar que um método está sendo sobrescrito. Os instrutores também discutem os conceitos de herança, como classe mãe/superclasse e classe filha/subclasse. A sobrescrita de métodos facilita o desenvolvimento de software, permitindo que classes especializadas tenham comportamentos diferentes, mesmo com métodos de mesmo nome.

Como usuários de uma classe, não precisamos nos preocupar com a implementação interna dos métodos, apenas invocá-los para obter os resultados desejados.

### Aula 10: Evitando a duplicidade no código

A aula abordou a implementação de uma classe `CalculadoraDeTempo.java` para calcular o tempo total de filmes e séries a serem assistidos. Inicialmente, a classe tinha um método `inclui()` que recebia um objeto do tipo `Filme` e adicionava sua duração ao tempo total.

Para evitar código duplicado, os instrutores propuseram a criação de um método `inclui()` genérico que recebesse um objeto do tipo `Titulo`, que é a superclasse de `Filme` e `Serie`. Dessa forma, é possível passar tanto um objeto `Filme` quanto `Serie` para o método `inclui()`, aproveitando o **polimorfismo** para tratar cada objeto conforme seu tipo específico. Os instrutores também enfatizaram a importância do bom design de classes e como o polimorfismo pode ser aplicado nesse contexto, evitando a necessidade de métodos sobrecarregados.

Por fim, eles destacaram que o polimorfismo é um dos pilares da orientação a objetos e será aplicado em outros contextos ao longo da formação em Java.

### Aula 11: Incluindo métodos adicionais - Implementando classes

Os instrutores abordaram os seguintes tópicos:

- Criação da classe "`Episodio`":

- Adicionaram as variáveis "`numero`" e "`nome`" para representar o número e o nome do episódio.
Implementaram os métodos "`getters`" e "`setters`" para acessar e modificar os valores dessas variáveis.

- Introdução da **interface** "`Classificavel`". Explicaram a necessidade de classificar filmes, séries e episódios por meio de estrelas, em vez de uma pontuação de 0 a 10.
  
- Criaram a interface "`Classificavel`" na pasta "**calculos**" para definir o método "`getClassificacao()`" que deve ser implementado pelas classes que a utilizam. Destacaram que as interfaces são utilizadas para unir objetos que podem ser muito diferentes entre si, mas que possuem um comportamento em comum.
 
- Implementação da interface "`Classificavel`" na classe "`Filme`":

- Mostraram como a classe "`Filme`" pode implementar a interface "`Classificavel`" usando a palavra-chave "`implements`". Explicaram que, ***ao implementar uma interface, é necessário cumprir o contrato definido por ela***, ou seja, implementar todos os métodos especificados na interface. Demonstraram como implementar o método "`getClassificacao()`" na classe "`Filme`".
Ressaltaram a importância do polimorfismo proporcionado pelas interfaces.

### Aula 12: Polimorfismo

Nesta aula, os instrutores discutiram sobre a implementação da classificação de filmes e episódios. Eles explicaram como a classificação é calculada e como é feito o uso da interface "`Classificavel`".

Foi apresentada a classe "`FiltroRecomendacao`" que utiliza o **polimorfismo** para filtrar os conteúdos com base em sua classificação. Os instrutores destacaram a importância de especificar as propriedades do contrato em interfaces e a possibilidade de refatorar e aprimorar o design das classes ao longo do desenvolvimento.


#### Exercícios: 

Ao logo das aulas foram propostos exercícios de fixação. O resultado pode ser visto em [Exercicios](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/Java-POO/screenmatch/src/br/com/alura/scrennmatch/exercicios).

1. Crie uma classe `MensagemOlaMundo` com um método que exibe "Olá, mundo!" no console:
`MensagemOlaMundo.java` e `MensagemOlaMundoTeste.java`.

2. Crie uma classe `CalcularDobro` com um método que recebe um número como parâmetro e retorna o dobro desse número:
`CalcularDobro.java` e `CalcularDobroTeste.java`.

3. Crie uma classe `MusicaFichaTecnica` com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações: 
`MusicaFichaTecnica.java` e `MusicaFichaTecnicaTeste.java`.

4. Crie uma classe `CarroFichaTecnica` com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro: 
`CarroFichaTecnica.java` e `CarroFichaTecnicaTeste.java`.

5. Crie uma classe `Aluno` com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações:
`Aluno.java` e `AlunoTeste.java`.

6. Crie uma classe `CarroModeloSuper` com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse `CarroModeloSuperTeste` para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações: 
`CarroModeloSuper.java` e `CarroModeloSuperTeste.java`.
   
7. Crie uma classe `Animal` com um método `emitirSom()`. Em seguida, crie duas subclasses: `AnimalCachorro` e `AnimalGato`, que herdam da classe `Animal`. Adicione o método `emitirSom()` nas subclasses, utilizando a anotação `@Override` para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como `abanarRabo()` para o `AnimalCachorro` e `arranharMoveis()` para o `AnimalGato`: 
`Animal.java` , `AnimalCachorro.java` e `AnimalGato.java`.

8. Crie uma classe `ContaBancaria` com métodos para realizar operações bancárias como `depositar()`, `sacar()` e `consultarSaldo()`. Em seguida, crie uma subclasse `ContaCorrente` que herda da classe `ContaBancaria`. Adicione um método específico para a subclasse, como `cobrarTarifaMensal()`, que desconta uma tarifa mensal da conta corrente: 
`ContaBancaria.java` , `ContaCorrente.java` e `ContaBancariaTeste.java`. 

9.  Crie uma classe `NumerosPrimos` com métodos como `verificarPrimalidade()` e `listarPrimos()`. Em seguida, crie duas subclasses, `NumerosPrimosVerificador` e `NumerosPrimosGerador`, que herdam da classe `NumerosPrimos`. Adicione um método específico para cada uma das subclasses, como `verificarSeEhPrimo()` para o `NumerosPrimosVerificador` e `gerarProximoPrimo()` para o `NumerosPrimosGerador`: 
`NumerosPrimos.java` , `NumerosPrimosVerificador.java` , `NumerosPrimosGerador.java` e `NumerosPrimosTeste.java`.  

10. Crie uma classe `ConversaoMoeda` que implementa uma interface `ConversaoMoedaFinanceira` com o método `converterDolarParaReal()` para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro:
`ConversaoMoedaFinanceira.java`, `ConversaoMoeda.java` e `ConversaoMoedaTeste.java`

11. Crie uma classe `CalculoGeometricoSalaRetangular` que implementa uma interface `CalculoGeometrico` com os métodos `calcularArea()` e `calcularPerimetro()` para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros:
`CalculoGeometricoSalaRetangular.java` , `CalculoGeometrico.java` e `CalculoGeometricoTeste.java`. 

12. Crie uma classe `TabuadaMultiplicacao` que implementa uma interface `TabuadaInterface` com o método `mostrarTabuada()` para exibir a tabuada de um número. A classe deve receber o número como parâmetro: 
`TabuadaMultiplicacao.java`, `TabuadaInterface.java` e `TabuadaTeste.java`. 

13. Crie uma interface `ConversorTemperatura` com os métodos `celsiusParaFahrenheit()` e `fahrenheitParaCelsius()`. Implemente uma classe `ConversorTemperaturaPadrao` que implementa essa interface com as fórmulas de conversão e exibe os resultados: 
`ConversorTemperatura.java`, `ConversorTemperaturaPadrao.java`  e `ConversorTemperaturaTeste.java`.


#### Desafio:
Foi proposto um desafio ao final do curso que pode ser visto em [Desafio](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/Java-POO/screenmatch/src/br/com/alura/scrennmatch/desafio).

Sobre o desafio:

Criar uma aplicação relacionada a músicas, na qual fosse possível escutar áudios. Para isso, foi sugerida a criação de uma superclasse "Audio" e a implementação de heranças, como "Podcasts" e "Musicas", explorando o conceito de encapsulamento.