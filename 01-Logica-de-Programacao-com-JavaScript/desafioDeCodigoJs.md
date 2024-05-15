# Colocando sua Lógica para Jogo com JavaScript

1 - Verificando a Disponibilidade de Item no Inventário

**Descrição:** 
Você é um aventureiro e está prestes a embarcar em uma jornada de proporções épicas! 
A cada desafio enfrentado, é crucial que você avalie com cuidado se possui tudo o que precisa para avançar, 
pois até mesmo a falta de um simples artefato pode fazer toda a diferença entre a vitória e a derrota iminente. 
No momento, em seu inventário, você possui uma espada, um escudo, seis poções de cura, quatro poções de mana e três pergaminhos. 
Diante disso, é hora de você verificar se cada item essencial para o próximo desafio está disponível em seu inventário. 
Assim, sua missão é criar um algoritmo que retorne a mensagem “Disponível”, caso possua o item na quantidade especificada 
no seu inventário, e “Indisponível” caso não.

**Entrada:**
 A entrada vai receber duas informações: 
 o nome do item a ser verificado e a quantidade desejada desse item.

**Saída:**
Imprima "Disponível" se a quantidade desejada do item estiver disponível no inventário e "Indisponível" caso contrário.

**Exemplos**
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


| Entrada      | Saída        |
| ------------ | ------------ |
| espada 1     | Disponível   |
| escudo 2     | Indisponível |
| pergaminho 2 | Disponível   |


## Código:

```
// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print" : imprime um texto de saída (output), pulando linha.

const nome = gets();
// Para converter os valores inseridos na entrada, utilizamos a função JavaScript parseInt() que converte a parte inicial da string em um número inteiro.
const quantidade = parseInt(gets());

let inventario = [
    { nome: 'espada', quantidade: 1 },
    { nome: 'escudo', quantidade: 1 },
    { nome: 'poção de cura', quantidade: 6 },
    { nome: 'poção de mana', quantidade: 4 },
		{ nome: 'pergaminho', quantidade: 3 }
];

// Utilizamos o metodo JavaScript find() para buscar o primeiro elemento no array que satisfaça a condição especificada por uma função de callback.
let item = inventario.find(item => item.nome === nome);

if (item && item.quantidade >= quantidade) {
	print("Disponível");
} else {
	print("Indisponível");
}
```

2 - O Julgamento do Guerreiro

**Descrição:** 
Na terra de Diópolis, uma série de guerreiros destemidos serão submetidos ao rigoroso "Julgamento do Guerreiro". 
Este teste de habilidades determinará se estão preparados para enfrentar o desafio supremo: um confronto com um poderoso boss. 
Antes que a batalha comece, cada guerreiro será minuciosamente avaliado para garantir que seu nível seja adequado ao desafio 
que os aguarda. Conscientes de que o boss atinge o formidável nível 50, a missão é retornar uma mensagem para cada guerreiro 
informando a sua aptidão.

**Entrada**
A entrada consiste no nome e no nível do guerreiro que se submeterá ao teste.

**Saída**
A saída esperada é uma mensagem com o nome do guerreiro informando a sua aptidão.

Para guerreiros com nível 40 ou superior, a mensagem deverá ser: “Parabéns, valente <guerreiro>! Sua coragem e habilidade são notáveis!”.  
Nos casos em que o nível seja igual a 30 e menor que 40, a mensagem deverá ser: "Quase lá, <guerreiro>! Continue treinando!".
 Caso seja inferior a 30, a mensagem deverá ser: “Ainda é cedo, jovem <guerreiro>. Treine mais!".
Obs.: Em todos os casos, a palavra “guerreiro” deve ser substituída pelo nome do mesmo.

**Exemplos**
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada    | Saída                                                             |
| ---------- | ----------------------------------------------------------------- |
| Felipon 41 | Parabéns, valente Felipon! Sua coragem e habilidade são notáveis! |
| Agmenus 39 | Quase lá, Agmenus! Continue treinando!                            |
| Ellidan 25 | Ainda é cedo, jovem Ellidan. Treine mais!                         |

## Código

```
const nome = gets();
const nivel = parseInt(gets());

if ( nivel < 30 ) {
  print("Ainda é cedo, jovem " + nome + ". Treine mais!");
} else if ( nivel > 30 && nivel < 40 ) {
  print("Quase lá, " + nome + "! Continue treinando!");
} else {
  print("Parabéns, valente " + nome + "! Sua coragem e habilidade são notáveis!")
}
```

**Refatorado**

```
const nome = gets();
const nivel = parseInt(gets());

if (nivel < 30) {
  print(`Ainda é cedo, jovem ${nome}. Treine mais!`);
} else if (nivel >= 30 && nivel < 40) {
  print(`Quase lá, ${nome}! Continue treinando!`);
} else {
  print(`Parabéns, valente ${nome}! Sua coragem e habilidade são notáveis!`);
}
```

3 - A Escolha da Classe Épica

**Descrição**
Você foi convocado pelo reino de Diolaris para uma missão de suma importância: 
auxiliar os aventureiros recém-chegados na escolha de sua classe. As opções são: 
Guerreiro, Mago e Arqueiro. Para isso, você deve criar um programa que solicite aos aventureiros a escolha de sua classe. 
Com base nessa escolha, o programa deve exibir uma mensagem indicando a classe selecionada. 
Se o aventureiro inserir uma classe inválida, uma mensagem de orientação deve ser exibida, 
instruindo-o a escolher entre as opções válidas.

**Entrada**
A entrada será o nome da classe escolhida.

**Saída**
A saída esperada é uma mensagem informando a classe escolhida dentre as três opções: 
Guerreiro, Mago e Arqueiro. Por exemplo, caso tenha escolhido Guerreiro, deverá imprimir “Você escolheu a classe Guerreiro!”. 
Caso a entrada seja diferente de uma dessas três classes, deverá retornar a mensagem: “Classe inválida! Escolha entre Guerreiro, 
Mago ou Arqueiro.”

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada   | Saída                             |
| --------- | --------------------------------- |
| Guerreiro | Você escolheu a classe Guerreiro! |
| Mago      | Você escolheu a classe Mago!      |
| Arqueiro  | Você escolheu a classe Arqueiro!  |

## Código

```
const classe = gets();

switch(classe) {
  case "Guerreiro":
      print(`Você escolheu a classe ${classe}!`);
      break;
  case "Mago":
      print(`Você escolheu a classe ${classe}!`);
      break;
  case "Arqueiro":
      print(`Você escolheu a classe ${classe}!`);
      break;
  default:
      print("Classe inválida! Escolha entre Guerreiro, Mago ou Arqueiro.");
      break;
}
```

**Refatorado**

```
const classe = gets();

switch(classe) {
  case "Guerreiro":
  case "Mago":
  case "Arqueiro":
      print(`Você escolheu a classe ${classe}!`);
      break;
  default:
      print("Classe inválida! Escolha entre Guerreiro, Mago ou Arqueiro.");
      break;
}
```

4 - Criando um Sistema de Votação de Mapa

**Descrição**
Você está desenvolvendo um sistema de votação para um jogo multiplayer online. 
O objetivo é permitir que os jogadores votem em qual mapa eles gostariam de jogar na próxima partida.

**Entrada**
A entrada consistirá em uma lista de votos dos jogadores. Cada voto será representado por uma letra, 
indicando o mapa escolhido pelo jogador. Os votos serão apresentados em uma única linha, separados por espaços.

**Saída**
A saída esperada é o mapa que recebeu mais votos.

**Exemplos**
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada         | Saída |
| --------------- | ----- |
| A B C B A B A A | A     |
| B A A B C C B B | B     |
| C B B C C A A C | C     |

```
const entrada = gets();
const votos = entrada.split(' ');
const contagemVotos = {};

// Usamos o metodo JavaScript forEach que executa uma função de retorno de chamada para cada elemento da lista para iterar sobre a lista de votos e conta quantos votos cada mapa recebeu.

votos.forEach(voto => {
    contagemVotos[voto] = (contagemVotos[voto] || 0) + 1;
});

let mapaVencedor;
let maxVotos = 0;

for (let mapa in contagemVotos) {
    if (contagemVotos[mapa] > maxVotos) {
        maxVotos = contagemVotos[mapa];
        mapaVencedor = mapa;
    }
}

print(mapaVencedor);
```

**Refatorado**

```
const entrada = gets();
const votos = entrada.split(' ');

const contagemVotos = {};

votos.forEach(voto => {
    contagemVotos[voto] = (contagemVotos[voto] || 0) + 1;
});

let mapaVencedor;
let maxVotos = 0;

// Itere sobre cada mapa na contagem de votos para encontrar o vencedor
Object.keys(contagemVotos).forEach(mapa => {
    if (contagemVotos[mapa] > maxVotos) {
        maxVotos = contagemVotos[mapa];
        mapaVencedor = mapa;
    }
});

print(mapaVencedor);
```

5 - Comprar ou Fazer Eco?

**Descrição**
Você está desenvolvendo um sistema para um jogo de combate onde os jogadores acumulam dinheiro ao 
longo dos rounds e no início de cada round devem comprar um item ou economizar para rounds futuros. No início da partida, 
o jogador possui um saldo inicial. Durante o jogo, o saldo do jogador é ajustado de acordo com o resultado de cada round: 
se o jogador ganhar, o saldo aumenta em 15%, se o jogador perder, o saldo aumenta em apenas 5%, e se for um round bônus, 
o saldo aumenta em 20%. Sua tarefa é criar um método que determine se um jogador deve comprar um item ou economizar com 
base no saldo atual.

**Entrada**
A entrada será composta por três valores: o primeiro valor será um número inteiro representando o saldo inicial do jogador; 
o segundo valor será "ganhou" se o jogador ganhou o último round, "perdeu" se o jogador perdeu o último round ou “bônus” 
se for um round bônus; o terceiro valor será um número inteiro representando o custo do item que o jogador deseja comprar 
neste round.

**Saída**
Imprima a mensagem "Comprar" se o jogador tiver saldo suficiente para comprar o item, caso contrário deve retornar "Economizar".

**Exemplos**
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada        | Saída      |
| -------------- | ---------- |
| 100 ganhou 115 | Comprar    |
| 88 bônus 100   | Comprar    |
| 98 perdeu 120  | Economizar |

## Código

```
const saldoInicial = parseInt(gets());
const resultadoUltimoRound = gets();
const custoItem = parseInt(gets());

function decidirCompraOuEconomizar(saldoInicial, resultadoUltimoRound, custoItem) {
    let novoSaldo;
    
   if ( resultadoUltimoRound === 'ganhou' ){
     novoSaldo = saldoInicial * 1.15;
   } else if ( resultadoUltimoRound === 'bônus' ){
     novoSaldo = saldoInicial * 1.20;
   } else {
     novoSaldo = saldoInicial * 1.05;
   }

		// Utilizamos a função JavaScript Math.round() para arredondar um número para o inteiro mais próximo.
		novoSaldo = Math.round(novoSaldo);

    if (novoSaldo >= custoItem) {
        print("Comprar");
    } else {
        print("Economizar");
    }
}

decidirCompraOuEconomizar(saldoInicial, resultadoUltimoRound, custoItem);
```

**Refatorado**

```
const saldoInicial = parseInt(gets());
const resultadoUltimoRound = gets();
const custoItem = parseInt(gets());

function decidirCompraOuEconomizar(saldoInicial, resultadoUltimoRound, custoItem) {
    const multiplicadores = {
        'ganhou': 1.15,
        'bônus': 1.20,
        'default': 1.05
    };

    let multiplicador = multiplicadores[resultadoUltimoRound] || multiplicadores['default'];
    let novoSaldo = Math.round(saldoInicial * multiplicador);

    if (novoSaldo >= custoItem) {
        print("Comprar");
    } else {
        print("Economizar");
    }
}

decidirCompraOuEconomizar(saldoInicial, resultadoUltimoRound, custoItem);
```