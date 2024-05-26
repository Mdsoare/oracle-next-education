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

### Aula 03: 

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

### Aula 04: 

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

### Aula 05: 

Nesta aula, os instrutores discutiram sobre a criação de uma nova classe chamada `PrincipalComListas` e a utilização de listas para armazenar filmes e séries.

Eles mostraram como adicionar elementos à lista e como percorrer a lista utilizando o loop `for-each`. Também abordaram a importância de especificar o tipo de dados que a lista irá armazenar e como lidar com a necessidade de acessar métodos específicos de determinados tipos de objetos presentes na lista.

Os instrutores mencionaram o erro de tentar tratar uma série como se fosse um filme. 

### Aula 06: 

Nesta aula, os instrutores discutiram sobre como resolver um problema encontrado na aula anterior, onde a lista pode conter tanto filmes quanto séries. A solução apresentada envolve o uso do operador `instanceof` para verificar se o item é uma instância da classe `Filme`. Se for, eles mostram a classificação do filme.

Foi ressaltado que essa não é a forma mais elegante de resolver o problema, mas que é importante entender por que ainda existe muito código legado que utiliza essa abordagem. Também mencionou que nas versões mais recentes do Java, como a versão 14, é possível declarar a variável do filme diretamente na linha do `if`, sem a necessidade de fazer o casting. Além disso, eles mostraram como é possível fazer verificações adicionais utilizando operadores, como verificar se a classificação do filme é maior que 2 antes de mostrá-la. 

Por fim, Eles aproveitaram para explicar sobre a declaração de variáveis utilizando o `var` e como isso pode gerar confusão em relação à cópia de objetos. Esclareceram que, quando se trata de objetos em Java, ***as variáveis são referências e não cópias do objeto***. Portanto, ao fazer o casting no código, não estamos transformando o objeto, mas sim a forma como nos referenciamos a ele.

### Aula 07: 



### Aula 08: 



### Aula 09: 



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