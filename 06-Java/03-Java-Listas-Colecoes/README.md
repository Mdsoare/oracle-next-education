# Java: trabalhando com listas e coleções de dados

## Objetivo

Aprimoramento os conhecimentos em Java, adquirindo habilidades mais avançadas, tais como a manipulação de listas de objetos e collections 

- Aplicação java: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/03-Java-Listas-Colecoes/screenmatch/src/br/com/alura/scrennmatch/principal);
- Conteúdo teórico do curso: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/03-Java-Listas-Colecoes/aulas_teoricas);
- Exercícios resolvidos: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/03-Java-Listas-Colecoes/screenmatch/src/br/com/alura/scrennmatch/exercicios);
- Curso Alura: [Clique aqui](https://cursos.alura.com.br/course/java-listas-colecoes-dados);
- Artigo: [Estrutura de Dados: computação na prática com Java](https://www.alura.com.br/artigos/estrutura-dados-computacao-na-pratica-com-java?_gl=1*18u67li*_ga*NjUzNTI4NjEzLjE3MTIwODAxNDE.*_ga_1EPWSW3PCS*MTcxNjQ2Mjg0OC45Ni4xLjE3MTY0NjQzMjIuMC4wLjA.*_fplc*b1VnUXNvUzdnMk8lMkZJakJrS0lGd1NDZFJrTzR0Q044cWg4WiUyQjJXRXpKd3NzRmVGUFNoJTJGVU1TR3pydXU3RU5Gem5iQlJ2Zkg2eTJaUndNQnVZT0pBZ1YzOUdQaHRLRzZ6bmtGeW0xVE1QUFRKQndMWmN5Qm5jV3Q5S3R0JTJCdmclM0QlM0Q.).

### Aula 01: Lista com ArrayList

A aula aborda o uso de **listas** e **coleções de dados** no desenvolvimento do sistema de streaming de filmes, o **Screnmatch**. 

É apresentada a estrutura de dados `ArrayList`, que permite armazenar uma sequência de objetos.
Os instrutores mostram como criar uma lista de filmes utilizando o `ArrayList` e como adicionar filmes a essa lista.

```
var meuFilmeFavorito = new Filme(); 
// 'var' é usado para encurtar o código
// Representa:
// Filme meuFilmeFavorito = new Filme();

ArrayList<Filme> listaDeFilmes = new ArrayList<>();
// É possível criar lista de qualquer 'Objeto'
```

É demonstrado como acessar elementos da lista e imprimir informações sobre eles.

```
// Criando uma lista
ArrayList<Filme> listaDeFilmes = new ArrayList<>();

// Adicionando elementos
listaDeFilmes.add(meuFilmeFavorito);
listaDeFilmes.add(filmeFavoridoDaMaria);
listaDeFilmes.add(filmeFavoridoDoJoao);
System.out.println("Tamanho da lista: " + listaDeFilmes.size());
System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
```

Os instrutores destacam a importância dos conceitos de **herança**, **interfaces** e **encapsulamento** na programação orientada a objetos, e como esses conceitos são aplicados no desenvolvimento de bibliotecas e frameworks. Em resumo, destaca a relevância dos conceitos de POO no desenvolvimento de aplicações.

### Aula 02: Entendendo a hierarquia de classes e métodos

A aula abordou a classe `ArrayList` em Java, que é uma implementação da interface List muito utilizada para armazenar e manipular coleções de objetos. Foram mencionados alguns métodos comuns da classe `ArrayList`, como `size()`, `get()`, `add()`, `addAll()` e `toString()`.

Destacou-se a importância de estar atento ao usar o método `get()` para obter um elemento da lista, pois pode ocorrer a exceção **IndexOutOfBoundsException** se o índice for inválido. O método `toString()` é usado para obter uma representação em formato de String dos objetos da lista. Foi enfatizada a importância de sobrescrever esse método em classes personalizadas, como a classe `Filme`, para fornecer uma representação mais adequada dos objetos. Ao imprimir a lista usando `System.out.println()`, o método `toString()` é automaticamente chamado, exibindo a representação personalizada dos objetos. Um conceito importante é que `toString()`pertence a classe `Object` ***que é a "mãe" de todas as outras classes***.  Então o método `toString()` foi sobrescrito na classe `Filme` para exibir o nome e o ano de lançamento!

```
    @Override
    public String toString() {
        return this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
```
**Nota:** Poderíamos explorar o conceito de **herança**  e aplicar o código acima na classe `Titulo`.

Por fim, os instrutores ressaltaram a importância de consultar a documentação do Java, como o **Javadoc**, para obter informações detalhadas sobre as classes e métodos utilizados, o que pode ajudar a entender melhor o comportamento dos métodos e a utilizar corretamente as classes do Java.

### Aula 03:  Construindo objetos com valores

Os instrutores discorrem sobre o risco de se generalizar demais o código com a classe `Object`. Também é a presentado o conceito de `Construtor`. ***Construtores são responsáveis por criar novos objetos, alocando espaço na memória e definindo seus atributos iniciais.Um `construtor` não é um método, possui uma sintaxe específica e não retorna nada.***

Construtores são importantes pois alguns atributos precisam ser definidos no momento da criação do objeto, assim como acontece ao criar uma conexão com um banco de dados. Os construtores podem receber parâmetros para inicializar os atributos do objeto. 

No exemplo, o construtor da classe Filme recebe o nome do filme como parâmetro. Ao criar um construtor personalizado, é necessário manter o construtor padrão caso queira continuar utilizando-o. A decisão de ter um ou mais construtores depende da regra de negócio. Recomenda-se não adicionar construtores desnecessários.

```
public Filme(String nome) {
    this.setNome(nome);
}
```
**Nota:** Um construtor deve ter obrigatoriamente o nome da classe e não tem retorno algum! Se desejarmos manter o construtor padrão, basta incluir:

```
public Filme() {
}

public Filme(String nome) {
    this.setNome(nome);
}
```
O conceito de construtores é muito utilizado em Java, aparecendo em diversos contextos como a criação de objetos `Scanner` e a recuperação de filmes de um arquivo JSON. 

### Aula 04: Definindo outros construtores

Ampliando o conceito de **herança** criamos o construtor na classe `Titulo` e assim as classes filhas herdam o construtor através da palavra reservada `super`:

`Titulo`:
```
    // Constructor
    public Titulo(String nome, int anoDeLancamento) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
    }
```

`Filme`:
```
    // Constructor
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
```

`Serie`:
```
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
```

### Aula 05: Tipos diferentes de objetos na lista

Nesta aula, os instrutores discutiram sobre a criação de uma nova classe chamada `PrincipalComListas` e a utilização de listas para armazenar filmes e séries.

Eles mostraram como adicionar elementos à lista e como percorrer a lista utilizando o loop `for-each`. Também abordaram a importância de especificar o tipo de dados que a lista irá armazenar e como lidar com a necessidade de acessar métodos específicos de determinados tipos de objetos presentes na lista.

Os instrutores mencionaram o erro de tentar tratar uma série como se fosse um filme. 

### Aula 06: Identificando o objeto

Nesta aula, os instrutores discutiram sobre como resolver um problema encontrado na aula anterior, onde a lista pode conter tanto filmes quanto séries. A solução apresentada envolve o uso do operador `instanceof` para verificar se o item é uma instância da classe `Filme`. Se for, eles mostram a classificação do filme.

Foi ressaltado que essa não é a forma mais elegante de resolver o problema, mas que é importante entender por que ainda existe muito código legado que utiliza essa abordagem. Também mencionou que nas versões mais recentes do Java, como a versão 14, é possível declarar a variável do filme diretamente na linha do `if`, sem a necessidade de fazer o casting. Além disso, eles mostraram como é possível fazer verificações adicionais utilizando operadores, como verificar se a classificação do filme é maior que 2 antes de mostrá-la. 

Por fim, Eles aproveitaram para explicar sobre a declaração de variáveis utilizando o `var` e como isso pode gerar confusão em relação à cópia de objetos. Esclareceram que, quando se trata de objetos em Java, ***as variáveis são referências e não cópias do objeto***. Portanto, ao fazer o casting no código, não estamos transformando o objeto, mas sim a forma como nos referenciamos a ele.

### Aula 07: Ordenando a lista

A aula aborda a necessidade de organizar listas de objetos de acordo com algum critério, como ordenar uma lista de títulos em ordem alfabética. Para realizar a ordenação, é utilizado o método `Collections.sort()`, que ordena a lista. No entanto, o método `Collections.sort()` só funciona para listas de objetos que implementam a interface `Comparable`. Essa interface define um contrato de comparação entre objetos do mesmo tipo.

Para tornar a classe `Titulo` comparável, os palestrantes implementam a interface `Comparable<Titulo>` e sobrescrevem o método `compareTo()`. Nesse método, eles delegam a comparação do nome do título com outro título, utilizando o método `compareTo()` da classe `String`.

**Titulo:**
```
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
```

Após implementar a comparação na classe `Titulo`, eles testam a ordenação da lista de títulos e verificam que os títulos são ordenados corretamente em ordem alfabética.

**PrincipalComLista:**
```
ArrayList<String> buscaPorArtista = new ArrayList<>();
    buscaPorArtista.add("Adan Sandler");
    buscaPorArtista.add("Demi Moore");
    buscaPorArtista.add("Will Smith");
    buscaPorArtista.add("Angelina Jolie");
    buscaPorArtista.add("Denzel Washington");
    buscaPorArtista.add("Jennifer Lawrence");
    buscaPorArtista.add("Robert Downey Jr.");
    buscaPorArtista.add("Emma Stone");
    buscaPorArtista.add("Nicolas Cage");
    buscaPorArtista.add("Salma Hayek");
    buscaPorArtista.add("Tom Hanks");

    System.out.println("\nTamanho da lista: " + buscaPorArtista.size());
    Collections.sort(buscaPorArtista);
    buscaPorArtista.forEach(System.out::println);
```

Os palestrantes destacam que implementar a interface `Comparable` é comum em várias entidades e modelos, mas não é obrigatório, sendo utilizado apenas quando há necessidade de definir um critério de comparação específico.

Em resumo, a aula aborda a ordenação de uma lista de objetos em Java, utilizando a interface `Comparable` para definir um critério de comparação e o método `Collections.sort()` para realizar a ordenação.

### Aula 08: Definindo critérios de ordenação

Nesta aula, os instrutores discutiram sobre a implementação do método` toString()` na classe `Serie` para melhorar a exibição dos dados. Eles mostraram como concatenar o texto "Série:" com o nome e o ano de lançamento de cada série. Em seguida, eles abordaram a possibilidade de incluir o método `toString()` na classe mãe `Titulo`, o que tornaria a implementação um pouco mais complexa, mas permitiria uma solução mais genérica para a exibição dos dados.

Foi mencionado também a possibilidade de ordenar o catálogo pelo ano de lançamento em vez do nome. No entanto, eles perceberam que alterar o método `compareTo()` afetaria a ordenação por nome. Então, eles introduziram o conceito de `Comparator`, que é uma interface que permite definir um critério de comparação separado da classe principal.

Eles mostraram como usar o método `sort()` em conjunto com o `Comparator.comparing()` para ordenar a lista de títulos pelo ano de lançamento. Eles explicaram a sintaxe do `::` para referenciar métodos e como essa abordagem é mais moderna e simplificada em comparação com a criação de uma classe comparadora separada.

```
    lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    lista.forEach(System.out::println);
```

No final, eles executaram o código e mostraram o resultado da ordenação por ano de lançamento. Essa discussão destacou a importância de tomar decisões de design adequadas ao desenvolver um sistema, como onde colocar determinados métodos, como encapsular a lógica e como proteger as informações. Também mostrou a flexibilidade e a sintaxe moderna do Java para lidar com operações de ordenação e comparação de objetos.

### Aula 09: Utilizando a interface List

A aula abordou o uso de coleções de dados no Java, com foco especial no `ArrayList` e na interface `List`.
Foi explicado que o `ArrayList` é uma implementação específica da interface `List`, e que é uma boa prática programar utilizando a interface `List`, pois isso permite maior flexibilidade e reutilização de código.

```
    List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adan Sandler");
        buscaPorArtista.add("Demi Moore");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Angelina Jolie");
        buscaPorArtista.add("Denzel Washington");
        buscaPorArtista.add("Jennifer Lawrence");
        buscaPorArtista.add("Robert Downey Jr.");
        buscaPorArtista.add("Emma Stone");
        buscaPorArtista.add("Nicolas Cage");
        buscaPorArtista.add("Salma Hayek");
        buscaPorArtista.add("Tom Hanks");

        System.out.println("\nTamanho da lista: " + buscaPorArtista.size());
        Collections.sort(buscaPorArtista);
        buscaPorArtista.forEach(System.out::println);
```

Outras interfaces importantes, como `Collection`, `Set` e `Map`, e suas implementações, como `HashSet` e `HashMap`, também foram mencionadas. Os instrutores ressaltaram a importância de conhecer essas estruturas de dados, pois elas são amplamente utilizadas em bibliotecas e pacotes do Java.
Eles também destacaram a importância do uso de interfaces e encapsulamento na programação orientada a objetos.


### Aula 10: 



### Aula 11: 


### Aula 12: 



#### Exercícios: 

Ao logo das aulas foram propostos exercícios de fixação. O resultado pode ser visto em [Exercicios](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/03-Java-Listas-Colecoes/screenmatch/src/br/com/alura/scrennmatch/exercicios).

1. Crie uma classe `Pessoa` com atributos como nome, idade, e um método `toString` que represente esses atributos: `Pessoa.java` e `PessoaTeste.java`.
   
2. No método `main` da classe Principal `PessoaTeste.java`, crie um `ArrayList` de Pessoa chamado `listaDePessoas`: `PessoaTeste.java`.
   
3. Adicione pelo menos três pessoas à lista utilizando o método add: `PessoaTeste.java`.
   
4. Imprima o tamanho da lista utilizando o método size: `PessoaTeste.java`.
   
5. Imprima a primeira pessoa da lista utilizando o método get: `PessoaTeste.java`.

6. Imprima a lista completa: `PessoaTeste.java`.

7. Crie uma classe `Produto` com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe `ArrayList`. Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice: `Produto.java` e `ProdutoTeste.java`.
   
8. Implemente o método `toString()` na classe `Produto` para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método `System.out.println()`: `Produto.java` e `ProdutoTeste.java`.

9. Modifique a classe `Produto` para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor: `Produto.java` e `ProdutoTeste.java`.

10. Crie uma classe `ProdutoPerecivel` que herde de `Produto`. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto `ProdutoPerecivel` e imprima seus valores: `Produto.java` , `ProdutoPerecivel.java` e `ProdutoTeste.java`.
    
11. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista: `Loop.java`

12. Crie uma classe `Animal` e uma classe `Cachorro` que herda de `Animal`. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe `Animal`: `Animal.java`, `AnimalCachorro.java` e `AnimalTeste.java`.

13. Modifique o Exercício 2 para incluir uma verificação usando `instanceof` para garantir que o objeto seja do tipo correto antes de fazer o casting: `Animal.java`, `AnimalCachorro.java` e `AnimalTeste.java`.
    
14. Crie uma classe `Produto` com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos: `ProdutoTeste.java`.

15. Crie uma interface `Forma` com um método `calcularArea()`. Implemente a interface em duas classes, por exemplo, `Circulo` e `Quadrado`. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma: `Forma.java`, `FormaCirculo.java`, `FormaQuadrado.java` e `FormaTeste.java`. 
    
16. Crie uma lista de números inteiros e utilize o método `Collections.sort` para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada: `ListaOrdenada.java`.

17. Crie uma classe `Titulo` com um atributo nome do tipo String. Implemente a interface `Comparable` na classe para que seja possível ordenar uma lista de objetos Titulo: `Titulo.java`.

18. No Exercício 17, crie alguns objetos da classe `Titulo` e adicione-os a uma lista. Utilize o método `Collections.sort` para ordenar a lista e, em seguida, imprima os títulos ordenados: `Titulo.java`, `TituloTeste.java`.

19. Crie uma lista utilizando a interface `List` e instancie-a tanto como `ArrayList` quanto como `LinkedList`. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação: `Titulo.java`, `TituloTeste.java`.

20. Modifique o Exercício 19 para declarar a variável de lista como a interface `List`, demonstrando o uso de **polimorfismo**: `Titulo.java`, `TituloTeste.java`.