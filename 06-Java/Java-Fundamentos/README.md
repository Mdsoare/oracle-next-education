# Curso Java: Criando sua primeira aplicação

## Objetivo

Aprender os fundamentos da Linguagem Java e criar uma aplicação de exemplo. 

### Aula 01: O primeiro programa

Nesta aula, os instrutores ensinaram como criar o primeiro programa em Java usando o **IntelliJ**. Eles mostraram como abrir o IntelliJ, criar um novo projeto, selecionar o nome e a pasta do projeto, e a opção de criar um repositório no GitHub. 

Em seguida, eles explicaram como escolher a linguagem do projeto (Java) e a versão do JDK a ser utilizada. Também mostraram como adicionar um código de exemplo ao projeto e explicaram a estrutura do projeto, com a pasta "**src**" contendo o código-fonte.

Eles então exploraram a classe principal **Main** e o código de exemplo gerado pelo IntelliJ. Explicaram a função do método `System.out.println()` para exibir mensagens no console, executaram o código e mostraram a saída `Hello World!` no console.

### Aula 02: Desvendando o arquivo .class

O código Java é uma linguagem de alto nível que precisa ser transformada para que o computador possa entender as instruções. Essa transformação é feita pelo **compilador**.

No passado, quando um programa era compilado para o Windows, ele só funcionava nesse sistema operacional. Para executá-lo em outros sistemas, era necessário criar um executável específico.

O Java introduziu uma solução para esse problema, com a criação do **Bytecode**, uma linguagem intermediária que não é compreendida nem pelo Windows nem pelos desenvolvedores. 

A **Máquina Virtual Java (JVM)** é capaz de interpretar esse Bytecode, atuando como um "computador de mentira" que entende a linguagem de máquina do Java. A JVM permite que o código Java seja executado em qualquer sistema operacional, pois existem várias distribuições da JVM para diferentes plataformas. A JVM é fundamental não apenas como uma plataforma, mas também como uma inteligência que facilita a vida dos desenvolvedores, aumenta a performance e a facilidade de distribuição do código Java.

### Aula 03: Atribuindo valores

O projeto a ser desenvolvido durante o curso é o "Screen Match", um serviço de streaming. O objetivo é preparar o backend do serviço, trabalhando com dados como nome do filme, ano de lançamento, avaliações, etc. 

O projeto visa proporcionar um aprendizado prático, envolvendo conceitos como classes, objetos, conexão com banco de dados, APIs e microsserviços. Os instrutores destacam a importância de utilizar bibliotecas, frameworks e APIs da comunidade open-source, Microsoft, Google e Oracle.

O instrutires explicam a necessidade de trabalhar com variáveis para armazenar diferentes tipos de valores na lista de filmes. São apresentados os tipos primitivos no Java, como int para números inteiros, boolean para valores lógicos e double para números com ponto flutuante.

É mostrado como declarar e atribuir valores às variáveis, seguindo as convenções de código. Os instrutores abordam a concatenação de strings e variáveis para exibir informações no terminal.

**NOTA:** A classe usada para a execução do projeto foi chamada de **Principal**

### Aula 04: Trabalhando com textos

Nesta aula foram abordaram os seguintes tópicos:

- **Cálculo de média:** Os instrutores declararam uma variável `média` do tipo `double` e fizeram a soma de algumas notas. Foram introduzidos conceitos de **precedência** de operações no Java explicando que, assim como nas expressões matemáticas, o Java também segue uma ordem de **precedência**, onde a multiplicação e a divisão são calculadas antes da soma. ***Para aplicar isso, eles colocaram a soma entre parênteses.***

- **Trabalho com texto:** Introduziram o tipo `String` para trabalhar com textos criando uma variável `sinopse` e atribuindo a ela um texto entre aspas duplas. **Foi mencionada a importância de usar ponto e vírgula no final de cada instrução no Java.** Eles mostraram como imprimir a média e a sinopse usando o `System.out.println()`.

- **Text blocks:** Feita uma introdução do recurso de **text blocks** na versão 15 do Java, que permite formatar strings de forma mais flexível. 
   
- **Comentários:** É importante usar comentários para explicar o código e comentar trechos que não devem ser executados.

### Aula 05: Convertendo valores

A aula foi abordada a necessidade de fazer conversões de tipos em Java. Usando o projeto **"Screen Match"** como exemplo, foi demonstrado o uso quando se quer calcular a classificação de um filme de 0 a 10 estrelas, mas exibi-la de 0 a 5 estrelas. Para isso, é preciso dividir a média por 2 e fazer um **casting** (conversão) para o tipo inteiro. O casting pode ser implícito (automático) ou explícito (manual).

O Java possui palavras reservadas, como "class" e "if", que não podem ser usadas como nomes de variáveis. Os instrutores enfatizaram a importância de fazer os exercícios da plataforma para absorver o conteúdo e se familiarizar com as particularidades da linguagem Java.

### Aula 06: Tomada de decisão

Os instrutores criaram uma nova classe chamada `Condicional` para organizar melhor o código. Eles explicaram a estrutura condicional `if/else` e como utilizá-la para tomar decisões em um programa.Mostraram um exemplo de código que verifica se um filme é recente ou retrô, imprimindo mensagens diferentes para cada caso.

Discutiram a sintaxe correta do `if/else`, enfatizando a importância dos parênteses e chaves.Introduziram os operadores lógicos em Java, como o operador "**ou**" (`||`), para combinar condições. Explicaram que, ao comparar strings, é recomendado usar o método `equals()` em vez do operador `==`. Mencionaram que é possível encadear condicionais "if" dentro de outros "if".

### Aula 07: Leitura de dados

Nesta aula, os instrutores ensinaram como fazer a leitura de dados utilizando a classe `Scanner` em Java. Eles começaram criando uma nova classe chamada `Leitura` e importando a classe `Scanner`.

Em seguida, eles mostraram como fazer a leitura de uma `string`, utilizando o método `nextLine()`, e armazenar o valor em uma variável. Depois, eles ensinaram como fazer a leitura de um número inteiro, utilizando o método `nextInt()`, e armazenar o valor em uma variável. Por fim, eles mostraram como fazer a leitura de um número decimal, utilizando o método `nextDouble()`, e armazenar o valor em uma variável.

Os instrutores também explicaram como lidar com possíveis erros de entrada, como o uso de vírgula ao invés de ponto para representar o decimal. 

### Aula 08: Estrutura de repetição - FOR

Nesta aula, os instrutores ensinam sobre a utilização de laços de repetição com o comando `for` em Java. Eles criam uma nova classe chamada `Loop.java` para realizar a repetição de leitura das avaliações de filmes. É explicada a sintaxe do for, que consiste em declarar uma variável iteradora, definir a condição de repetição e especificar o incremento da variável.

Os instrutores mostram como criar a iteração utilizando o `for` e explicam como acumular as avaliações em uma variável para calcular a **média**. Eles ensinam a usar o operador `+=` para simplificar a soma das avaliações. Ao final, é mostrado como imprimir a média das avaliações fora do for.

Os instrutores destacam a importância de inicializar a variável de acumulação antes do for para evitar erros de compilação. Eles também mencionam que o Java é uma **linguagem defensiva**, que exige que todas as variáveis sejam inicializadas antes de serem utilizadas.

### Aula 09: Estrutura de repetição - WHILE

Os instrutores criaram uma nova classe chamada "`OutroLoop.java`" para separar o código do exemplo anterior (`Loop.java` ). Eles explicam que o laço de repetição `while` é usado para executar um bloco de código repetidamente até que uma condição de parada seja atingida.

Eles substituem o laço `for` pelo `while` no código e modificam a mensagem impressa para que o usuário possa digitar as notas até desejar encerrar, digitando **-1**. Eles criam uma variável `totalDeNotas` para contar quantas notas foram somadas e modificam o cálculo da média para que seja dividido por "`totalDeNotas`" em vez de um valor fixo.

Eles percebem que o valor **-1** está sendo somado na média, o que não deveria acontecer, e adicionam uma condição `if` para verificar se a nota é diferente de **-1** antes de somá-la e incrementar o `totalDeNotas`. Após a correção, o código foi executado novamente e verificou-se que a média é calculada corretamente. 

No entanto, eles percebem que se o usuário digitar **-1** logo no início, a média é exibida como `NaN` **(Not a Number)**. Eles discutem possíveis soluções, como não exibir a mensagem da média se `totalDeNotas` for igual a **0** ou obrigar o usuário a digitar pelo menos uma nota.

#### Exercícios:

Ao logo dos cursos foram propostos exercícios de fixação. As possíveis soluções que desenvolvi podem ser vistas em: [Exercicios](https://github.com/Mdsoare/oracle-next-education/tree/main/06-Java/Java-Fundamentos/src/Exercicios).

1. Crie um programa que exiba a mensagem "Hello world": `Hello.java`.
   
2. Criar um projeto Java que deve conter uma classe chamada **PrimeiraClasse**, com o método `main`, que ao executar deverá imprimir no console o texto “***Concluí a aula 01 e agora estou mergulhando em Java!***”: `PrimeiraClasse.java`.
   
3. Crie um projeto Java que deve conter uma classe chamada **Perfil**, com o método `main`, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, `Olá, [Seu Nome]!`: `Perfil.java`.
   
4.  Crie uma classe **Soma** em Java para que recebe dois números inteiros e imprimir no console o resultado da operação.
   
5. Escreva um programa que converta uma temperatura em graus **Celsius para Fahrenheit**. Será solicitada a entrada da temperatura em ºC e em seguida imprima no console o valor convertido de Celsius para Fahrenheit. Lembre-se que provavelmente você precisará fazer um casting de valores: `CelsiusToFahrenheit.java`.
     **Dica:** A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: `(temperatura * 1.8) + 32`.

6. Crie um programa que realize a média de duas notas decimais e exiba o resultado: `Media.java`. 
   
7. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado: `CastingDoubleToInt.java`.
   
8. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem: `CharAndString.java`.
   
9.  Em um programa declare uma variável do tipo double `precoProduto` e uma variável do tipo int `quantidade`. Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem: `ProdutoXPreco.java`. 
   
10. Declare uma variável do tipo double `valorEmDolares`. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado: `RealToDollar.java`.
    
11. Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado: `JogoDeAdivinhacao.java`.
    
12. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo": `NumeroPositivoOuNegativo.java`.
    
13. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior: `ComparaNumeros.java`.
    
14. Crie um programa para comparar strings: `ComparaStrings.java`.
    
15. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada: `CalculoDaArea.java`.
    
16. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10: `Tabuada.java`.
    
17. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número: `Fatorial.java`.
    
18. desafio: criar um projeto java para controlar uma conta bancária virtual. O projeto deve incluir métodos como `consultar`, `receber` e `transferir`.
