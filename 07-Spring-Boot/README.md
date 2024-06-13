# Java: consumindo API, gravando arquivos e lidando com erros

## Objetivo

1. Utilize o Spring Framework em um projeto com linha de comando;
2. Saiba como trabalhar colaborativamente com Git e GitHub;
3. Realize a desserialização de dados com a biblioteca Jackson;
4. Aplique boas práticas de desenvolvimento com funções lambdas;
5. Manipule fluxo de dados com Streams;
6. Implemente estatísticas personalizadas;

<br>

**Links do projeto:**

- Aplicação java: [Clique aqui]();
- Conteúdo teórico do curso: [Clique aqui]();
- Desafio: [Clique aqui]();
- Curso Alura: [Clique aqui](https://cursos.alura.com.br/course/java-trabalhando-lambdas-streams-spring-framework).

### Aula 01: Utilizando o Spring Framework

As instrutoras discutem sobre a continuação do desenvolvimento do projeto de Java com Orientação a Objetos, agora utilizando o `framework Spring` e o `Maven` para criar o projeto. Elas explicam que o Spring é um framework muito utilizado por desenvolvedores Java no mercado, pois ele facilita o trabalho de desenvolvimento ao abstrair funcionalidades como acesso a banco de dados, tratamento de requisições HTTP e validação de dados.

Para iniciar o projeto, elas acessam o site [Spring Initializr](https://start.spring.io), onde criam um projeto `Spring Boot` utilizando Maven como gerenciador de dependências e a linguagem Java. Elas optam por criar **um projeto sem web**, ou seja, sem a camada de apresentação.

Após gerar e extrair o projeto, foi mostrada a estrutura básica, com a classe principal contendo o método `main()`, que é o ponto de entrada da aplicação. Ela explica que é possível executar a aplicação clicando no botão de play no IntelliJ ou através da linha de comando.

```
package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication {

 public static void main(String[] args) {

  SpringApplication.run(ScreenmatchApplication.class, args);
 }
}
```

Em seguida, implementam a `interface CommandLineRunner` na classe principal, para que o método `run()` seja invocado quando o método `main()` chamar o `SpringApplication.run`. Nesse método, elas irão exibir uma mensagem de **"Hello, World!"** no terminal.

```
package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

 public static void main(String[] args) {

  SpringApplication.run(ScreenmatchApplication.class, args);
 }

 @Override
 public void run(String... args) throws Exception {
  System.out.println("Primeiro projeto Spring sem Web");
 }
}
```

Também destacaram que no Spring Initializr elas apenas clicaram em alguns botões e já tiveram um projeto configurado e pronto para rodar, demonstrando a simplicidade e facilidade de uso desses frameworks.

### Aula 02: Consumindo dados de API

Nesta aula, as instrutoras ensinam como consumir dados de uma API usando o Spring Framework. Elas começam criando um pacote chamado `service` e dentro dele uma classe chamada `ConsumoApi` que é responsável por fazer a requisição HTTP e obter os dados da API em formato JSON.

A classe `ConsumoApi` utiliza as classes `HttpClient`, `HttpRequest` e `HttpResponse` do Java para realizar a requisição e tratar possíveis exceções. Elas mostram como instanciar essa classe, obter os dados da API da série "Gilmore Girls" e imprimir o JSON resultante.

```
package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//import static java.net.http.HttpClient.newHttpClient;

public class ConsumoApi {

    public String obterDados(String endereco) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }
}
```

```
package br.com.alura.screenmatch;

import br.com.alura.screenmatch.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

 public static void main(String[] args) {

  SpringApplication.run(ScreenmatchApplication.class, args);
 }

 @Override
 public void run(String... args) throws Exception {
  var consumoApi = new ConsumoApi();
  var json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls&Season=1&apikey=************");
  System.out.println(json);
 }
}
```

Além disso, as instrutoras também demonstram como usar a mesma classe `ConsumoApi` para consumir dados de outras APIs, como uma que retorna uma imagem aleatória de café. Elas destacam a importância de ter uma classe específica para consumir APIs, pois isso torna o código mais modularizado, de fácil manutenção e legível.

```
 @Override
 public void run(String... args) throws Exception {
  var consumoApi = new ConsumoApi();
  var json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls&Season=1&apikey=************");
  System.out.println(json);

  json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
  System.out.println(json);
 }
```

### Aula 03: Desserializando dados

Nesta aula, as instrutoras discutiram sobre como desserializar dados usando a biblioteca `Jackson`. Elas explicaram como adicionar a dependência do Jackson ao projeto Maven. No site [MVN Repository](https://mvnrepository.com/search?q=jackson+databind), foi escolhida a última versão da biblioteca **Jackson Databind**.

No arquivo `pom.xml` na tag  `<dependencies>` foi anexado o conteúdo abaixo. Em seguida, foi solicitada a atualização das dependencias.

```
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.17.1</version>
</dependency>
```

Mostraram como modelar uma classe Java, chamada `DadosSerie` dentro do `package model`, para representar os dados de uma série de TV. Utilizaram a anotação `@JsonAlias` para mapear os atributos da classe aos campos do JSON de forma flexível, permitindo o uso de apelidos.Mencionaram que o Jackson possui outras anotações, como `@JsonProperty`, que podem ser usadas tanto na `serialização` quanto na `desserialização`.

```
package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
```

Concluíram que o processo de conversão dos dados ainda não foi implementado e será abordado na próxima aula. O foco principal desta aula foi apresentar os conceitos básicos de desserialização de dados usando o Spring Framework e a biblioteca Jackson.

### Aula 04: Modelando dados da série

A aula abordou a modelagem de dados da série, com foco na criação de uma classe chamada `ConverteDados` no pacote `service`. A classe `ConverteDados` tem o objetivo de realizar a conversão de dados de um formato JSON para objetos Java, utilizando a biblioteca Jackson.

```
package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
```

Para tornar o código mais genérico, foi criada uma interface `IConverteDados` com um método `obterDados` que recebe a classe de destino como parâmetro. A implementação da interface `IConverteDados` na classe ConverteDados permitiu que a conversão de JSON para objetos fosse feita de forma mais genérica.

```
package br.com.alura.screenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
```

Após a implementação, as instrutoras identificaram um problema relacionado à propriedade `Year` que não estava sendo mapeada corretamente. Elas corrigiram isso adicionando a anotação `@JsonIgnoreProperties(ignoreUnknown = true)` na classe `DadosSerie`.

```
package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
```

Por fim, elas discutiram sobre a criação de um repositório no GitHub para compartilhar o projeto e realizar o versionamento do código utilizando o Git.

### Aula 05: Modelando episódios

A aula começa com a explicação de como clonar o projeto usando o comando git clone. Em seguida, é mostrado como consumir a API da OMDb para obter informações sobre a série "Gilmore Girls", tanto informações gerais quanto detalhes de cada episódio.

Para modelar os dados dos episódios, foi criada a classe `DadosEpisodio` e utiliza anotações como `@JsonAlias` e `@JsonIgnoreProperties` para fazer a correspondência entre a API e a aplicação.

```
package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode") Integer numero,
                            @JsonAlias("imdbRating") String avaliacao,
                            @JsonAlias("Released") String dataLancamento) {
}
```


Depois de implemetar a `record DadosEpisodio`, é demonstrado como executar o projeto e obter as informações dos episódios.

```
@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var api = "&apikey=********";
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls"+ api);
        System.out.println(json);
        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        // Obtendo informações detalhadas da Série
        json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls&season=1&episode=2" + api);
        DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
        System.out.println(dadosEpisodio);
```

Por fim, as instrutoras mencionam que o próximo passo será modelar as temporadas da série. O foco principal da aula foi a modelagem dos dados dos episódios, utilizando a API da OMDb e a biblioteca `Jackson` para fazer a conversão dos dados JSON.

### Aula 06: Modelando temporadas

A aula abordou a criação da classe `DadosTemporada` dentro do pacote `Model`, responsável por armazenar informações sobre as temporadas de uma série, como o número da temporada e uma lista de episódios. Foi mostrado como mapear os dados da API para a aplicação, utilizando anotações como `@JsonAlias` e `@JsonIgnoreProperties`.

```
package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") Integer numero,
                             @JsonAlias("Episodes") List<DadosEpisodio> episodios) {
}
```

Foi explicado como obter os dados de todas as temporadas de uma série, usando um loop "for" para iterar sobre o número total de temporadas e fazer requisições à API para obter os dados de cada temporada.

```
List<DadosTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            json = consumoApi.obterDados("https://omdbapi.com/?t=gilmore+girls&season=" + i + api);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
```

Os dados das temporadas obtidos são adicionados a uma lista de temporadas, que é então impressa.

A modelagem genérica da classe "DadosTemporada" permite obter os dados de qualquer série de forma ágil e automatizada, facilitando a adição de novas funcionalidades ao programa.

O objetivo principal da aula foi mostrar como modelar os dados da aplicação de forma eficiente, utilizando recursos como classes de dados e mapeamento de JSON, para facilitar a manipulação e exibição das informações das temporadas de uma série.

### Aula 07: Criando o menu de interação com o usuário

Aula sobre a modelagem dos dados da aplicação e a criação do menu de interação com o usuário:

A aula abordou a criação de uma classe `Principal` responsável por lidar com a interação do usuário. Nessa classe, foi criado um método `exibMenu()` que exibe uma mensagem solicitando que o usuário digite o nome da série que deseja buscar. Foram adicionadas duas constantes na classe `Principal` - `ENDERECO` e `API_KEY` - que representam partes fixas do endereço da API que será utilizada para a busca. O nome da série digitado pelo usuário é concatenado com as partes constantes do endereço para formar a URL completa da requisição à API. Uma instância da classe `ConsumoApi` é criada para realizar a busca dos dados da série na API, e o resultado é armazenado em uma variável chamada "json". As instrutoras mencionaram que a classe `ConsumoApi` poderia ser um atributo da classe `Principal` para evitar a criação de múltiplas instâncias.

```
package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoApi;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=*******";
    private ConsumoApi consumo = new ConsumoApi();

    public void exibeManu() {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
    }
}
```

O foco dessa aula foi a criação de um menu de interação com o usuário e a busca de informações sobre séries em uma API, demonstrando boas práticas de programação, como a divisão de responsabilidades em classes separadas e a utilização de constantes.

### Aula 08: Buscando dados completos da série

Os instrutores transferiram algumas linhas de código do `método run` para a classe `Principal`, como a parte do conversor. Eles criaram uma instância da classe `Principal` na classe `ScreenMatchApplication` e chamaram o método `exibeMenu()`. Foi discutida a importância de remover importações não utilizadas e de reduzir o acoplamento entre as classes.

```
package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibeManu();
    }
}
```

Os instrutores mostraram como buscar os dados das temporadas da série e fizeram modificações no código para concatenar o número da temporada no endereço da API. Eles testaram o código e verificaram se as informações estavam sendo obtidas corretamente.

```
package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=********";
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    public void exibeManu() {
        System.out.println("Digite o nome da série para busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);

        List<DadosTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);
    }
}

```

Em resumo, a aula abordou a implementação de um código em Java para buscar dados completos de uma série utilizando uma API, incluindo a busca pelas temporadas da série.

### Aula 09: Trabalhando na coleção de dados

Nesta aula, as instrutoras trabalharam com a manipulação de uma coleção de dados, especificamente uma lista de temporadas e episódios de uma série de TV a partir de um `input`. Inicialmente, elas utilizaram loops for aninhados para imprimir os títulos de todos os episódios. 

```
        for (int i = 0; i < dadosSerie.totalTemporadas(); i++) {
            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
            for (int j = 0; j < episodiosTemporada.size(); j++) {
                System.out.println(episodiosTemporada.get(j).titulo());
            }
        }
```

Em seguida, introduziram o conceito de lambdas, que são funções anônimas que podem ser usadas para percorrer e manipular coleções de forma mais concisa. Elas substituíram os loops for por lambdas, utilizando o método forEach, e imprimiram novamente os títulos dos episódios.

```
temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
```

**Onde "t" = temporada e "e" = episodio**

 Além disso, explicaram o uso do método de referência (::) para chamar o método println do objeto System.out.

```
temporadas.forEach(System.out::println);
```

**Equivale:**

```
temporadas.forEach(t -> System.out:println(t));
```

Por fim, as instrutoras mencionaram a importância de se manter atualizado com as inovações da linguagem Java e informaram que vão explorar recursos como `streams` em futuros vídeos.

### Aula 10: Encadeando operações com streams

Nesta aula, as instrutoras abordaram o uso de `funções lambda` e `streams` no Java 8. As `funções lambda` permitem escrever expressões de forma mais concisa, enquanto os streams são fluxos de dados que possibilitam realizar operações encadeadas em coleções.

Foi demonstrado como utilizar `streams` e `funções lambda` para manipular uma lista de nomes, realizando operações como ordenação, limitação do número de elementos, filtragem por critérios específicos e transformação dos elementos.

```
List<String> nomes = Arrays.asList("Jacque", "Iasmin", "Paulo", "Rodrigo", "Nico");
    nomes.stream()
          .sorted() // ordena a lista
          .limit(3) // limita aos 3 primeiros
          .filter(n -> n.startsWith("N")) // busca por strings que iniciam por 'N"
          .map(n -> n.toUpperCase()) // Converte a string para tudo maiúscula
          .forEach(System.out::println); // Imprime o que encontrar
```

No trecho de código acima tudo o que gera um stream novo é conhecido como `Operação intermediária` [`sorted()`, `limit()`, `filter()`, `map()`] e tudo o que é feito com o stream é chamado de `Operação final` [`forEach()`].

Os instrutores destacaram que a combinação de `funções lambda` e `streams` confere grande poder ao desenvolvimento em Java, permitindo realizar diversas operações de forma eficiente quando se trabalha com coleções e listas.

### Aula 11: Aprofundando no método `.stream()`

A aula abordou o uso de streams para manipular uma lista de episódios de uma série de TV. Inicialmente, foi demonstrado como utilizar o método `flatMap()` para aglutinar os episódios de todas as temporadas em uma única lista. Foi discutida a diferença entre os métodos `collect()` e `toList()` para armazenar os dados em uma nova lista. O `collect()` permite adicionar novos elementos, enquanto o `toList()` retorna uma lista imutável. Também foi explicada a diferença entre operações do tipo `void`, que executam uma ação, e operações que são funções, com algum retorno. Foi realizado um exemplo prático, mostrando que ao tentar adicionar um novo episódio à lista usando `toList()`, ocorre uma exceção devido à imutabilidade da lista. O `collect()` foi então utilizado para adicionar o novo episódio com sucesso.

```
        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList()); // Cria uma lista mutável
                //.toList(); //Cria uma lista imutável
```

As instrutoras demonstraram a ordenação dos episódios por avaliação, usando o método `sorted()` em conjunto com o `Comparator.comparing()`. O método `reversed()` foi usado para obter a ordenação decrescente. Por fim, foi adicionado um filtro utilizando o método `filter()` para remover os episódios que não possuem avaliação, representados como "N/A". Também foi mencionada a possibilidade de criar uma classe de episódio para incluir informações adicionais.

```
        System.out.println("\nTop five episódios");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .limit(5)
                .forEach(System.out::println);
```

Em resumo, a aula abordou técnicas de manipulação de listas de dados usando streams, como aglutinar, ordenar e filtrar os elementos, visando selecionar os top 5 melhores episódios de uma série de TV.

### Aula 12: Uma nova classe para lidar com os dados do episódio

Nesta aula, as instrutoras criaram uma nova classe chamada `Episodio` para lidar com os dados dos episódios de uma série. Eles começam definindo os atributos da classe, como temporada, título, número do episódio, avaliação e data de lançamento. Em seguida, eles implementam os getters e setters para esses atributos. Eles criam um construtor personalizado que recebe os dados de um objeto `DadosEpisodio` e preenche os atributos da classe `Episodio` correspondentemente. Eles tratam alguns casos especiais, como quando o valor da avaliação ou data de lançamento não estão no formato correto, definindo valores padrão nesses casos. Eles também implementam o método `toString()` para exibir os dados dos episódios de forma organizada.

```
package br.com.alura.screenmatch.model;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Episodio {

    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();
        this.numeroEpisodio = dadosEpisodio.numero();
        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException ex) {
            this.avaliacao = 0.0;
        }
        try {
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
        } catch (DateTimeException ex) {
            this.dataLancamento = null;
        }
    }

    //Getters and Setters

    // @Override
    // public String toString() {
        // código...
    }
}
```

Por fim, eles demonstram como criar uma lista de objetos `Episodio` a partir de uma lista de `Temporada`, usando streams e mapeamento.

```
List<Episodio> episodios = temporadas.stream()
               .flatMap(t -> t.episodios().stream()
                    .map(d -> new Episodio(t.numero(), d))
                ).collect(Collectors.toList());

episodios.forEach(System.out::println);
```

O objetivo principal da aula é ensinar como manipular coleções de dados, como listas e streams, para criar uma estrutura de dados mais organizada e fácil de trabalhar.

### Aula 13: Buscando episódios a partir de uma data

O objetivo da aula é ensinar como filtrar episódios de uma série a partir de uma data específica informada pelo usuário. Primeiro, o código imprime todos os episódios disponíveis e solicita que o usuário informe o ano a partir do qual deseja ver os episódios. É necessário usar o método `nextInt()` para ler o ano digitado pelo usuário e, em seguida, o `nextLine()` para evitar conflitos na leitura. 

```
System.out.println("A partir de que ano você deseja ver os episódios?");
        var ano = leitura.nextInt();
        leitura.nextLine();
```

Com o ano informado, é criado um objeto `LocalDate` chamado `dataBusca` que representa a data a partir da qual os episódios serão filtrados.

```
LocalDate dataBusca = LocalDate.of(ano, 1, 1);
```

O código então utiliza o método `filter()` da classe Stream para selecionar apenas os episódios cuja data de lançamento é posterior à data de busca informada. Para formatar a data de lançamento dos episódios, é usado um `DateTimeFormatter` com o padrão "dd/MM/yyyy". Finalmente, o código imprime os episódios filtrados, exibindo a temporada, o título do episódio e a data de lançamento formatada.

```
DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    episodios.stream()
        .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
        .forEach(e -> System.out.println(
                "Temporada: " + e.getTemporada() +
                        "Eoisódio: " + e.getTitulo() +
                        "Data lançamento: " + e.getDataLancamento().format(formatador)
        ));
```

### Aula 14: Exibindo as etapas de uma stream

Nesta aula, as instrutores exploraram o uso de streams em Java, com foco na depuração do código para entender o que está acontecendo em cada etapa do processamento. Eles mostraram um exemplo de código que utiliza várias operações encadeadas em uma stream para selecionar os top 10 episódios de uma série e adicionaram a função `map()` para transformar os títulos dos episódios em letras maiúsculas.

Para entender melhor o que está acontecendo em cada etapa da stream, eles utilizaram a função `peek()`, que permite visualizar o resultado de cada operação no terminal. Eles adicionaram chamadas de `peek()` em cada etapa da stream, passando uma string descritiva como parâmetro. Após explicar o uso da função `peek()`, eles testaram o código no terminal, buscando pelos top 10 episódios da série "The Boys". Eles analisaram o resultado no terminal e explicaram como cada etapa da stream foi processada.

```
System.out.println("\nTop Ten episódios");
    dadosEpisodios.stream()
        .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
        .peek( e -> System.out.println("Primeiro filtro(N/A) " + e))
        .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
        .peek( e -> System.out.println("Ordenação " + e))
        .limit(10)
        .peek( e -> System.out.println("Limita a 10 " + e))
        .map(e -> e.titulo().toUpperCase())
        .peek( e -> System.out.println("Mapeamento em caixa alta " + e))
        .forEach(System.out::println);
```

As instrutoras concluíram que o uso de streams permite realizar várias operações em uma única linha de código, economizando tempo. No entanto, a depuração do código pode ser um desafio, pois nem sempre é fácil entender como as operações estão sendo executadas. A função `peek()` é uma ferramenta útil para visualizar cada etapa do processamento da stream.

### Aula 15: Encontrando a primeira ocorrência de uma busca a uma coleção

Nesta aula, as instrutoras exploraram o uso de fluxos (streams) e a geração de estatísticas em um sistema de streaming de séries. Eles mostraram como utilizar a função `findFirst()` em conjunto com o método `filter()` para encontrar a primeira ocorrência de um episódio que corresponda a um trecho do título digitado pelo usuário.

Foram abordados os seguintes tópicos:

- Criação de um filtro de busca usando o método `contains()` para verificar se o título do episódio contém o trecho digitado pelo usuário.
- Uso do objeto Optional para tratar a presença ou ausência de um valor retornado pelo `findFirst()`.
- Tratamento do retorno do Optional usando os métodos `isPresent()` e `get()`.
- Importância de considerar as diferenças entre maiúsculas e minúsculas na busca, utilizando o método `toUpperCase()`.
- Aplicação desse código para criar diferentes mecanismos de busca no sistema.

```
 List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d))
                ).collect(Collectors.toList());
        episodios.forEach(System.out::println);

        System.out.println("Digite um trecho do título do episódio");
        var trechoTitulo = leitura.nextLine();
        Optional<Episodio> episodioBuscado = episodios.stream()
                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
                .findFirst();

        if (episodioBuscado.isPresent()) {
            System.out.println("Episódio encontrado!");
            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
            System.out.println("Episódio: " + episodioBuscado.get().getNumeroEpisodio());
        } else {
            System.out.println("Eposódio não encontrado!");
        }
```

### Aula 16: Criando um mapa com dados por temporada

Nesta aula, as instrutoras discutiram a importância de exibir a avaliação por temporada em um aplicativo de séries. Eles explicaram que, ao analisar as avaliações por temporada, os usuários podem decidir se vale a pena assistir a série do início ao fim, levando em consideração se todas as temporadas são bem-avaliadas ou se o final é odiado pela maioria das pessoas. Para implementar essa funcionalidade, eles mostraram como criar um mapa com dados por temporada, onde cada temporada é associada a uma média de avaliação. Eles utilizaram streams e collectors em Java para agrupar os dados e obter as avaliações por temporada.

```
Map<Integer, Double> avaliacoesPorTemporadas = episodios.stream()
        .filter(e -> e.getAvaliacao() > 0.0)
        .collect(Collectors.groupingBy(Episodio::getTemporada,
                Collectors.averagingDouble(Episodio::getAvaliacao)));

System.out.println(avaliacoesPorTemporadas);
```

Além disso, eles destacaram a importância de filtrar as séries avaliadas, para evitar que episódios não avaliados influenciem negativamente na média. Eles mostraram como adicionar um filtro no código para considerar apenas os episódios com avaliação maior que zero.

```
.filter(e -> e.getAvaliacao() > 0.0)
```

Por fim, eles concluíram que a funcionalidade de exibir a avaliação por temporada é muito relevante e que ainda é possível analisar outras estatísticas, como a média geral dos episódios, em futuras etapas do desenvolvimento do aplicativo.

### Aula 17: Coletando estatísticas

A aula abordou a classe `DoubleSummaryStatistics` em Java, que facilita o cálculo de estatísticas como média, maior avaliação, menor avaliação e total de avaliações. As estatísticas são coletadas usando streams e o método `collect()` da classe `Collectors`. A classe `DoubleSummaryStatistics` fornece métodos para obter informações como a média, o mínimo, o máximo e a contagem dos elementos avaliados. As palestrantes mostraram como imprimir as estatísticas desejadas, como média, melhor episódio, pior episódio e quantidade de episódios avaliados.

```
DoubleSummaryStatistics est = episodios.stream()
        .filter(e -> e.getAvaliacao() > 0.0)
        .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
System.out.println("Media: " + est.getAverage());
System.out.println("Melhor episódio: " + est.getMax());
System.out.println("Pior episódio: " + est.getMin());
System.out.println("Quantidade: " + est.getCount());
```

Elas ressaltaram a importância dessas técnicas no desenvolvimento Java e como elas podem ser aplicadas em diferentes contextos, como análise de vendas de produtos ou avaliação de atendentes de telemarketing.
