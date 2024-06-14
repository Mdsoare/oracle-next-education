# Java: consumindo API, gravando arquivos e lidando com erros

## Objetivo

Aprender a consumir uma API HTTP em Java. Entender como receber e converter informações de uma API para objetos Java. Manipular dados no formato JSON. Utilizar a biblioteca Gson para conversão de objetos Java em JSON e vice-versa. Fazer uso das classes do pacote `java.io` para manipulação de arquivos

- Aplicação java: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/04-Java-API-Erros/screenmatch/src/br/com/alura/principal);
- Conteúdo teórico do curso: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/04-Java-API-Erros/aulas_teoricas);
- Exercícios resolvidos: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/04-Java-API-Erros/screenmatch/src/exercicios);
- Desafio: [Clique aqui](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/04-Java-API-Erros/screenmatch/src/desafio);
- Curso Alura: [Clique aqui](https://cursos.alura.com.br/course/java-consumindo-api-gravando-arquivos-lidando-erros);


### Aula 01: Conhecendo uma API para buscar dados

Nesta aula, os instrutores discutiram sobre o conceito de API (Application Programming Interface) e como ela é utilizada para acessar serviços remotos na web. Eles usaram o exemplo da [OMDb API](https://www.omdbapi.com/), que fornece informações sobre filmes e séries, para demonstrar como é possível consumir uma API usando conhecimentos de Java. Outro site interessante é o [IMDb](https://developer.imdb.com/documentation/api-documentation/getting-access/). Os principais tópicos abordados foram:

- O que é uma **API** e sua importância para acessar serviços remotos
- A necessidade de entender a documentação da API e lidar com desafios como autenticação
- A importância de conhecer o formato **JSON** para interpretar os dados retornados pelas APIs
- O uso de uma **API Key** para acessar determinadas APIs e o uso de **query string**
- O desenvolvimento do aplicativo chamado **ScreenMatch** que utilizará a **OMDb API** para busca de filmes

Os instrutores destacaram que o desafio será aprender a utilizar as bibliotecas corretas para fazer a conexão com a API e converter os dados retornados em objetos Java.

### Aula 02: Fazendo requisições com o Postman

Nesta aula, os instrutores discutiram sobre o uso de ferramentas para realizar requisições **HTTP** e testar APIs, com foco no [Postman](https://www.postman.com/), também mencionaram o [Insomnia](https://insomnia.rest/). Eles mostraram como usar o Postman para fazer requisições **GET** à API do OMDb (Open Movie Database) e obter informações sobre filmes, passando parâmetros na URL.

Durante a demonstração, os instrutores fizeram várias requisições para diferentes filmes e analisaram os resultados em formato JSON. Eles destacaram a importância de testar as requisições e utilizar ferramentas como o Postman para verificar e complementar o trabalho de desenvolvimento.

Além disso, os instrutores discutiram sobre os conceitos de encapsulamento e acoplamento presentes nas APIs, enfatizando a importância de compreender esses princípios da orientação a objetos.

Por fim, eles ressaltaram a relevância dos testes e do uso de ferramentas como o Postman para identificar possíveis erros ou problemas nas requisições e no desenvolvimento em geral.

### Aula 03: Implementando a comunicação com o Web Service

Os instrutores ensinam como fazer uma requisição HTTP em Java usando a biblioteca `java.net.http.HttpClient`. Eles mostram como criar um objeto `HttpClient` e um objeto `HttpRequest` para realizar a requisição, passando uma URL como parâmetro. É explicado o conceito de padrão de projeto `builder`, usado para construir objetos complexos de forma mais flexível. Também mencionaram a necessidade de usar o [Java Doc](https://docs.oracle.com/en/java/javase/21/docs/api/index.html).

```
HttpClient client = HttpClient.newHttpClient();

HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("http://foo.com/"))
    .build();

HttpResponse<String> response = client
    .send(request, BodyHandlers.ofString());
```

Os instrutores enfatizam a importância de entender o código que está sendo utilizado, mesmo que seja necessário copiar e colar trechos. É mostrado como tratar as exceções lançadas pelo método `send` da classe `HttpClient`, usando a palavra-chave `throws`.

Eles explicam como obter a resposta da requisição utilizando a classe `HttpResponse` e mostram um exemplo de como imprimir o corpo da resposta no console. Ao longo da aula, os princípios de orientação a objetos, interfaces e encapsulamento são destacados, pois são frequentemente utilizados em bibliotecas e frameworks.

### Aula 04: Refinando a busca por filmes

Nesta aula, os instrutores estão refinando a busca por filmes no terminal, tornando-a mais interativa para o usuário.Eles adicionam a classe `Scanner` para permitir que o usuário digite o filme que deseja buscar, armazenando essa informação em uma variável chamada "busca".

Para criar a URL de busca, eles concatenam o endereço inicial da API do OMDb com a "busca" digitada pelo usuário e a API key.Dessa forma, a URL de busca se torna dinâmica, ao invés de utilizar um filme fixo.

Os instrutores mencionam que poderiam ter usado a declaração `var` em alguns trechos, mas optaram por ser mais explícitos. Eles também comentam sobre a possibilidade de transformar os dados do filme em uma classe, como "Titulo", "Serie" ou "Filme", para poder utilizar essas informações em outras funcionalidades do projeto. Para isso, eles sugerem o uso de uma biblioteca Java que faça essa transformação de atributo-valor para classe de forma automática.

### Aula 05: Transformando dados

A aula aborda a inclusão de bibliotecas externas em um projeto Java, usando a biblioteca **GSON** como exemplo para realizar a **desserialização** de objetos Java a partir de JSON. Os instrutores explicam que existem várias bibliotecas disponíveis para **desserialização**, como a Jackson e a GSON, e que a escolha deve considerar fatores como o conhecimento da equipe, suporte na internet e cultura da empresa.

É mostrado como baixar a biblioteca GSON do site [MVN Repository](https://mvnrepository.com/) e incluí-la como dependência do projeto no IntelliJ. Também é mencionada a importância de usar sistemas de gerenciamento de pacotes, como Maven e Gradle, para facilitar a inclusão de bibliotecas. Os instrutores demonstram como utilizar a biblioteca GSON para transformar JSON em objetos Java, usando os métodos `toJson()` e `fromJson()`. Eles também apresentam a anotação `@SerializedName`, que permite especificar o nome dos campos no JSON.

- [Download do artefato .jar](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)
- [Gson User Guide](https://github.com/google/gson/blob/master/UserGuide.md)
- Inserindo a biblioteca no projeto:
InteliJ >>> File >>> Project Structure... >>> Modules >>> Dependencies >>> + (add...) >>> 1 JARs or Directories >>> Navegue até o artefato >>> ok

Na classe main
```
String json = response.body();
System.out.println(json);

Gson gson = new Gson();
Titulo meuTitulo = gson.fromJson(json, Titulo class);
System.out.println("Titulo" + meuTitulo.getNome());
```

Na Classe Titulo:
```
@SerializedName("Title")
private String nome;
@SerializedName("Year")
private int AnoDeLancamento;
```

Por fim, os instrutores discutem sobre a melhor forma de lidar com a **desserialização** de JSON em objetos, considerando a possibilidade de diferentes APIs retornarem JSONs com nomes de campos diferentes. Eles sugerem a necessidade de pensar em alternativas para melhorar o código e lidar com essa situação.

### Aula 06: Outra estrutura para representar os dados

Nesta aula, os instrutores discutiram sobre a criação de uma classe `Record` e como utilizá-la para realizar a conversão personalizada de dados. O `Record` é uma estrutura nova e mais simples do Java, que permite declarar apenas o cabeçalho dos atributos, tornando a classe imutável.

Eles criaram a classe `TituloOmdb` com os atributos `title`, `year` e `runtime` para representar os dados de um JSON. Utilizaram o `GsonBuilder()` para configurar a nomenclatura dos campos do JSON, usando o `FieldNamingPolicy.UPPER_CAMEL_CASE` para fazer a correspondência correta entre os campos do JSON e os atributos do `TituloOmdb`. Após a conversão do JSON para o objeto `TituloOmdb`, eles mostraram como criar um objeto Titulo que possui mais atributos e métodos, usando um construtor que recebe um objeto `TituloOmdb` e faz o "de-para" dos dados. Eles sobrescreveram o método `toString()` na classe Titulo para imprimir o objeto corretamente. Identificaram um problema quando o ano de lançamento do filme possui um traço no final, causando uma exceção no método `Integer.valueOf()`, que será abordado em aulas futuras.

Em resumo, a aula mostrou como utilizar a classe `Record` para representar os dados de um JSON de forma mais simples e imutável, e como converter esses dados para um objeto mais completo, lidando com possíveis problemas na conversão.

### Aula 07: Identificando erros (Stack Trace)

1. **Importância da stack trace**: A stack trace é a mensagem de erro exibida no console quando ocorre uma exceção. Ela contém informações sobre a pilha de execução do programa, mostrando a sequência de chamadas de métodos que levaram ao erro.

2. **Identificação de erros**: Ao analisar a stack trace, é possível identificar a linha de código que gerou o problema. A linha indicada no final da stack trace é a que começa a gerar o erro.

3. **Exceção NumberFormatException**: Neste caso, a exceção encontrada foi a NumberFormatException, que ocorre quando uma string não pode ser convertida para um número inteiro.

4. **Uso do try/catch**: Os instrutores explicaram como utilizar o mecanismo try/catch para capturar essa exceção e definir o que deve ser feito em caso de erro.

5. **Continuidade da execução**: Mesmo após a ocorrência de uma exceção, o programa pode continuar a execução normalmente, exibindo uma mensagem de erro e finalizando corretamente, graças ao uso do try/catch.

6. **Escopo de variáveis**: As variáveis declaradas dentro de um bloco try/catch só valem dentro daquele escopo, então é necessário mover as linhas de código que estão após o catch para dentro do try.

Esse conteúdo é fundamental para os desenvolvedores, pois ensina a entender e lidar com erros de forma mais eficiente, permitindo que o programa continue a funcionar mesmo após a ocorrência de uma exceção.

### Aula 08: Tratando diversas exceções

Nesta aula, os instrutores discutiram sobre o tratamento de exceções em Java. Eles explicaram que o bloco `catch` é utilizado para lidar com exceções e que é possível ter várias estruturas `catch` em um único bloco `try`.

Eles analisaram um erro específico que ocorreu no programa ao tentar converter o título de um filme. Identificaram que o erro foi causado por um caractere inválido na URL e explicaram que em endereços da web não podem existir espaços, sendo substituídos por `%20`. Também mencionaram a importância de analisar o stack trace para identificar a linha exata onde ocorreu o erro.

Os instrutores mostraram como adicionar múltiplos blocos `catch` para tratar diferentes tipos de exceções, exemplificando a captura de uma `NumberFormatException` e uma `IllegalArgumentException`. Eles também mencionaram que é possível utilizar uma estrutura genérica `catch (Exception e)` para capturar qualquer tipo de exceção, mas ressaltaram que essa abordagem não é recomendada, pois não permite tratar o erro de forma adequada.

Eles discutiram a diferença entre erros e exceções, explicando que as exceções são previstas, tratáveis e antecipadas, enquanto os erros são problemas mais graves e não podem ser facilmente tratados. Eles enfatizaram a importância de tratar as exceções sempre que possível.

### Aula 09: Criando nossa própria exceção

Nesta aula, os instrutores discutem sobre como lidar com exceções em um programa de busca de filmes. Eles identificam um problema na busca de filmes que possuem espaços no nome e discutem diferentes maneiras de solucioná-lo, optando por substituir os espaços por sinais de mais na URL.

Ao executar o programa, eles identificam um erro na duração do filme e, posteriormente, um problema na conversão do ano de lançamento. Para tratar esse último problema, eles decidem criar uma exceção personalizada chamada `ErroDeConversaoDeAnoException`.

Eles implementam a classe `ErroDeConversaoDeAnoException`, que estende a classe `RuntimeException` e possui um atributo `mensagem` e um método `getMessage()`. No código, eles substituem o bloco `catch` genérico pelo `catch` da exceção `ErroDeConversaoDeAnoException` e imprimem a mensagem de erro.

Eles discutem a importância de utilizar o `catch` para tratar exceções de forma mais elaborada, resolvendo o problema de fato, e de pensar antecipadamente sobre a modelagem do programa para prevenir situações de conversão e busca.

### Aula 10: Gravando dados em um arquivo

O foco da aula é ensinar como ler e escrever arquivos em Java, além de compreender a hierarquia de classes, encapsulamento, construtores e exceções envolvidas nesse processo. Os instrutores destacam a importância de seguir padrões e boas práticas ao criar arquivos para leitura, para que tudo funcione corretamente.

O objetivo principal do curso não é apenas aprender JSON, mas desenvolver a habilidade de pesquisar no JavaDoc e entender como utilizar bibliotecas e estruturar o código. Para gravar dados em um arquivo, os instrutores utilizam a classe FileWriter do pacote java.io. Eles demonstram como criar um arquivo, escrever o conteúdo desejado e fechar o arquivo.

Um exemplo prático é mostrado, onde um filme é buscado e o texto é escrito no arquivo filmes.txt. Os instrutores sugerem aprimorar o exercício, escrevendo os dados em formato JSON e criando um arquivo filmes.json com vários filmes, utilizando a classe ArrayList.

### Aula 11: Escrevendo a lista de filmes em json

Nesta aula, os instrutores continuaram o desafio de fazer buscas de filmes, armazenar os resultados em uma lista e salvar essa lista em um arquivo JSON. Eles explicaram como usar o loop `while` para repetir a busca até o usuário digitar "sair". Também discutiram o uso dos métodos `equals()` e `equalsIgnoreCase()` para comparar strings.

Antes do loop `while`, eles criaram uma lista para armazenar os títulos dos filmes encontrados. Dentro do loop, eles adicionavam os novos títulos à lista. Para escrever o arquivo JSON, eles usaram a classe FileWriter e a biblioteca GSON. O GSON foi configurado para converter a lista de títulos em formato JSON e imprimir de forma mais legível.

Ao longo da aula, os instrutores enfatizaram a importância de organizar o código em classes separadas e de entender os conceitos de orientação a objetos.


#### Exercícios: 

Ao logo das aulas foram propostos exercícios de fixação. O resultado pode ser visto em [Exercicios](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/04-Java-API-Erros/screenmatch/src/exercicios).

1. Crie um programa em Java que utilize as classes `HttpClient`, `HttpRequest` e `HttpResponse` para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API: `ConsultaLivros.java`.

2. Crie um programa Java que utiliza as classes `HttpClient`, HttpRequest e HttpResponse para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário: `ConsultaCotacaoCripto.java`

3. Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes `HttpClient`, HttpRequest e HttpResponse. Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita: `ConsultaReceita.java`.

4. Crie uma classe `Pessoa` usando o conceito de Record em Java, com atributos como nome, idade e cidade. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa: `ConversaoJsonParaObjeto.java`.

5.  Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão: `ConversaoJsonParaObjetoFlex.java`.

6. Crie uma classe `Livro` que contenha atributos como título, autor e um objeto representando a editora. Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro: `ConversaoJsonAninhadoParaObjeto.java`.

7. Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo. Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.

8. Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).

9. Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável. 

10. Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io: `EscreveMensagem.java`.

11. Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado: `Titulo.java`.

12. Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o método setPrettyPrinting para alcançar esse resultado: `Titulo.java`.


#### Desafio:

Foi proposto um desafio ao final do curso que pode ser visto em [Desafio](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/04-Java-API-Erros/screenmatch/src/desafio).

Sobre o desafio:
Criar uma aplicação para consultar a API ViaCEP com um Menu para o usuário informar o CEP para busca e gerar um arquivo .JSON com os dados do endereço.