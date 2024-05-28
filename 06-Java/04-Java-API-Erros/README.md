# Java: consumindo API, gravando arquivos e lidando com erros

## Objetivo

Aprender a consumir uma API HTTP em Java. Entender como receber e converter informações de uma API para objetos Java. Manipular dados no formato JSON. Utilizar a biblioteca Gson para conversão de objetos Java em JSON e vice-versa. Fazer uso das classes do pacote `java.io` para manipulação de arquivos

- Aplicação java: [Clique aqui]();
- Conteúdo teórico do curso: [Clique aqui]();
- Exercícios resolvidos: [Clique aqui]();
- Desafio: [Clique aqui]();
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

### Aula 05: 

### Aula 06: 

### Aula 07: 

### Aula 08: 

### Aula 09: 


#### Exercícios: 

Ao logo das aulas foram propostos exercícios de fixação. O resultado pode ser visto em [Exercicios]().

#### Desafio:

Foi proposto um desafio ao final do curso que pode ser visto em [Desafio]().

Sobre o desafio: