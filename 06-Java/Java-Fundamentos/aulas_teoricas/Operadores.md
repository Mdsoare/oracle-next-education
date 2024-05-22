# Operadores em Java
Fonte: [Geeks for Geeks](https://www.geeksforgeeks.org/)

**Os operadores** constituem o bloco de construção básico de qualquer linguagem de programação. Java também fornece muitos tipos de operadores que podem ser usados de acordo com a necessidade de executar vários cálculos e funções, seja lógico, aritmético, relacional etc. Eles são classificados com base na funcionalidade que fornecem. Aqui estão alguns tipos:

- Operadores Aritméticos
- Operadores Unários
- Operador de Atribuição
- Operadores Relacionais
- Operadores lógicos
- Operador Ternário
- Operadores Bitwise
- Operadores de turno

## Operadores Aritméticos

Esses operadores envolvem os operadores matemáticos que podem ser usados para executar várias operações aritméticas simples ou avançadas nos tipos de dados primitivos referidos como operandos. Esses operadores consistem em vários operadores unários e binários que podem ser aplicados em um único ou dois operandos. Vejamos os vários operadores que o Java tem que fornecer sob os operadores aritméticos.


| Operador | Resultado                                           |
| -------- | --------------------------------------------------- |
| +        | Adição de dois números                              |
| -        | Subtração de dois números                           |
| *        | Multiplicação de dois números                       |
| /        | Divisão de dois números                             |
| %        | Módulo – Retorna o resto da divisão de dois números |


### Exemplos:
- Adição:

```
import java.io.*;

class adicao {
	public static void main(String[] args)
	{
		// inicializando as variaveis
		int num1 = 10, num2 = 20, sum = 0;

		// exibindo o num1 e o num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Somando o num1 e o num2
		sum = num1 + num2;
		System.out.println("A soma = " + sum);
	}
}
```
**NOTA:** Para testar os demais operadores é só trocar o operador! Com isso vamos a um exemplo que implementa todos os operadores.

```
import java.util.Scanner;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = sc.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = sc.nextDouble();

		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
        double resto = num1 % num2;

		System.out.println("A soma dos números é: " + soma);
		System.out.println("A diferença dos números é: " + subtracao);
		System.out.println("A multiplicação dos números é: " + multiplicacao);
		System.out.println("O quociente da divisão dos números é: " + divisao);
        System.out.println("O resto da divisão dos números é: " + resto);
	}
}
```
## Operadores Unários

Operadores unários Java são os tipos que precisam de apenas um operando para executar qualquer operação como incremento, decremento, negação, etc. Consiste em vários operadores aritméticos, lógicos e outros que operam em um único operando. Vamos olhar para os vários operadores unários em detalhe e ver como eles operam.

- Operador 1: minus(-)
Esse operador pode ser usado para converter um valor positivo em negativo.

```
import java.io.*;

class GFG {

	public static void main(String[] args)
	{
		int n1 = 20;
		System.out.println("Número = " + n1);

        // Aplicando o operador e exibindo o resultado 
		n1 = -n1;
		System.out.println("Resultado = " + n1);
	}
}
```
**Saída:**
> Número = 20
> 
> Resultado = -20


- Operador 2: 'NOT' (!)
Isso é usado para converter true em false ou vice-versa. Basicamente, ele inverte o estado lógico de um operando.

```
import java.io.*;

class GFG {

	public static void main(String[] args)
	{
		boolean cond = true;
		int a = 10, b = 1;

		System.out.println("Cond é: " + cond);
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);

		// Aplicando operador e exibindo resultados
		System.out.println("Cond nova é: " + !cond);
		System.out.println("!(a < b) = " + !(a < b));
		System.out.println("!(a > b) = " + !(a > b));
	}
}
```

**Saída:**
> Cond és: true
>
> Var1 = 10
> 
> Var2 = 1
> 
> Cond nova é: false
> 
> !(a < b) = true
> 
> !(a > b) = false

- Operador 3: Incremento(++)
Ele é usado para incrementar o valor de um inteiro. Ele pode ser usado de duas maneiras separadas:

    - 3.1: Operador pós-incremento
        Quando colocado após o nome da variável, o valor do operando é incrementado, mas o valor anterior é mantido temporariamente até a execução desta instrução e é atualizado antes da execução da próxima instrução.

        ```
        //trecho de código

        int num =5;
        num++;
        System.out.println("Resultado: " + num);        
        ```

        **Saída:**
        > Resultado: 6

    - 3.2: Operador pré-incremento
        Quando colocado antes do nome da variável, o valor do operando é incrementado instantaneamente
        
        ```
        //trecho de código

        int num =5;
        ++num;
        System.out.println("Resultado: " + num);        
        ```

        **Saída:**
        > Resultado: 6

- Operador 4: Decremento (--)
Ele é usado para diminuir o valor de um inteiro. Ele pode ser usado de duas maneiras separadas:

    - 4.1: Operador pós-decremento
        Quando colocado após o nome da variável, o valor do operando é diminuído, mas os valores anteriores são mantidos temporariamente até a execução desta instrução e são atualizados antes da execução da próxima instrução.
   
        ```
        //trecho de código

        int num =5;
        num--;
        System.out.println("Resultado: " + num);        
        ```

        **Saída:**
        > Resultado: 4 

    - 4.2: Operador de pré-decremento
        Quando colocado antes do nome da variável, o valor do operando é diminuído instantaneamente.

        ```
        //trecho de código

        int num =5;
        --num;
        System.out.println("Resultado: " + num);        
        ```

        **Saída:**
        > Resultado: 4

- Operador 5: Complemento Bitwise (~)
Este operador unário retorna a representação do complemento do valor de entrada ou operando, ou seja, com todos os bits invertidos, o que significa que ele faz cada 0 para 1, e cada 1 para 0.

```
import java.io.*;

class GFG {

	public static void main(String[] args)
	{
		int n1 = 6, n2 = -2;
    	System.out.println("Primeiro número = " + n1);
		System.out.println("Segundo número = " + n2);

	    // Aplicando operador e imprimindo resultado
		System.out.println("O complemento bitwise de " +  n1  + " = " + ~n1);
		System.out.println("O complemento bitwise de " +  n2  + " = " + ~n2);
	}
}
```

**Saída:**
> Primeiro número = 6
>
> Segundo número = -2
>
> O complemento bitwise de 6 = -7
> 
> O complemento bitwise de -2 = 1

## Operadores de Atribuição

Esses operadores são usados para atribuir valores a uma variável. O operando do lado esquerdo do operador de atribuição é uma variável e o operando do lado direito do operador de atribuição é um valor. O valor no lado direito deve ser do mesmo tipo de dados do operando no lado esquerdo. Caso contrário, o compilador gerará um erro. Isso significa que os operadores de atribuição têm associatividade da direita para a esquerda, ou seja, o valor dado no lado direito do operador é atribuído à variável à esquerda. Portanto, o valor do lado direito deve ser declarado antes de usá-lo ou deve ser uma constante. O formato geral do operador de atribuição é:

> variavel operador valor;

### Tipos de operadores de atribuição em Java
O Operador de Atribuição é geralmente de dois tipos. São eles:

- **Operador de Atribuição Simples:** O Operador de Atribuição Simples é usado com o sinal "=" onde o lado esquerdo consiste no operando e o lado direito consiste em um valor. O valor do lado direito deve ser do mesmo tipo de dados que foi definido no lado esquerdo.

- **Operador de Atribuição Composta:** O Operador Composto é usado onde +,-,*, e / é usado junto com o operador =.

Vejamos cada um dos operadores de atribuição e como eles operam:

1. (=) operador:
Este é o operador de atribuição mais simples, que é usado para atribuir o valor à direita à variável à esquerda. Esta é a definição básica de um operador de atribuição e como ele funciona.

**Sintaxe:** 

> num1 = 10;
> 
> num2 = num1;

2. (+=) operador:
Este operador é um composto de operadores '+' e '='. Ele opera adicionando o valor atual da variável à esquerda ao valor à direita e, em seguida, atribuindo o resultado ao operando à esquerda.

**Sintaxe:** 
> a += 10;
> 
> // É o mesmo que:
> 
> a = a + 10;

3. (-=) operador:
Este operador é um composto de operadores '-' e '='. Ele opera subtraindo o valor da variável à direita do valor atual da variável à esquerda e, em seguida, atribuindo o resultado ao operando à esquerda.

**Sintaxe:** 
> b -= 10;
> 
> // É o mesmo que:
> 
> b = b - 10;

4. (*=) operador:
Este operador é um composto de operadores '*' e '='. Ele opera multiplicando o valor atual da variável à esquerda para o valor à direita e, em seguida, atribuindo o resultado ao operando à esquerda.

**Sintaxe:** 
> c *= 10;
> 
> // É o mesmo que:
> 
> c = c * 10;

5. (/=) operador:
Este operador é um composto de operadores '/' e '='. Ele opera dividindo o valor atual da variável à esquerda pelo valor à direita e, em seguida, atribuindo o quociente ao operando à esquerda.

**Sintaxe:** 
> d /= 10;
> 
> // É o mesmo que:
> 
> d = d / 10;

6. (%=) operador:
Este operador é um composto de operadores '%' e '='. Ele opera dividindo o valor atual da variável à esquerda pelo valor à direita e, em seguida, atribuindo o restante ao operando à esquerda.

**Sintaxe:** 
> e %= 10;
> 
> // É o mesmo que:
> 
> e = e % 10;


## Operadores relacionais
Operadores relacionais são um grupo de operadores binários usados para verificar as relações entre dois operandos, incluindo igualdade, maior que, menor que, etc. Eles retornam um resultado booleano após a comparação e são extensivamente usados em instruções de looping, bem como instruções condicionais if-else e assim por diante. O formato geral de representação do operador relacional é:

**Sintaxe:**
> variavel1 operador_relacional variavel2;

- Operador 1: 'igual a' (==)

Este operador é usado para verificar se os dois operandos dados são iguais ou não. O operador retornará true se o operando no lado esquerdo for igual ao lado direito, caso contrário, false.

**Sintaxe:**
> var1 == var2

**Ilustração:**

```
var1 = "GeeksforGeeks"
var2 = 20
var1 == var2 //resultado é false
```

- Operador 2: 'Não igual a' Operador(!=)

Este operador é usado para verificar se os dois operandos dados são iguais ou não. Funciona de forma oposta à do igual-para-operador. Ele retorna true se o operando no lado esquerdo não for igual ao lado direito, caso contrário, false.

**Sintaxe:**
> var1 != var2

**Ilustração:**

```
var1 = "GeeksforGeeks"
var2 = 20

var1 != var2 //resultado é true
```

- Operador 3: Operador (>) «Maior que»

Isso verifica se o primeiro operando é maior que o segundo operando ou não. O operador retorna true quando o operando no lado esquerdo é maior que o lado direito.

**Sintaxe:** 
> var1 > var2

**Ilustração:**

```
var1 = 30
var2 = 20

var1 > var2 //resultado é true
```

- Operador 4: Operador (<) «Menor que»

Isso verifica se o primeiro operando é menor que o segundo operando ou não. O operador retorna true quando o operando no lado esquerdo é menor que o lado direito. Funciona de forma oposta à do operador maior.

**Sintaxe:** 
> var1 < var2

**Ilustração:**

```
var1 = 10
var2 = 20

var1 < var2 //resultado é true
```

- Operador 5: Operador (>=) «Maior ou igual a»

Isso verifica se o primeiro operando é maior ou igual ao segundo operando ou não. O operador retorna true quando o operando no lado esquerdo é maior ou igual ao lado direito.

**Sintaxe:** 
> var1 >= var2

**Ilustração:**

```
var1 = 20
var2 = 20
var3 = 10

var1 >= var2 //resultado é true
var2 >= var3 //resultado é true
```

- Operador 6: Operador (<=) «Menor ou igual a»

Isso verifica se o primeiro operando é menor ou igual ao segundo operando ou não. O operador retorna true quando o operando no lado esquerdo é menor ou igual ao lado direito.

**Sintaxe:**
> var1 <= var2

**Ilustração:**

```
var1 = 10
var2 = 10
var3 = 9

var1 <= var2 //resultado é true
var2 <= var3 //resultado é false
```

## Operadores Lógicos

Os operadores lógicos são usados para realizar operações lógicas "AND", "OR" e "NOT", ou seja, a função semelhante à porta AND e porta OR em eletrônica digital. São utilizados para combinar duas ou mais condições/restrições ou para complementar a avaliação da condição original em particular consideração. Uma coisa a ter em mente é que, ao usar o operador AND, a segunda condição não é avaliada se a primeira for falsa. Enquanto que ao usar o operador OR, a segunda condição não é avaliada se a primeira for verdadeira, ou seja, os operadores AND e OR têm um efeito de curto-circuito. Usado extensivamente para testar várias condições para a tomada de uma decisão.

1. Operador AND ( && ) – a && b [Esse operador retorna true quando ambas as condições em consideração são satisfeitas ou são verdadeiras]
2. Operador OR ( || ) –  a || b [Esse operador retorna true quando uma das duas condições em consideração é satisfeita ou é verdadeira]
3. Operador NOT  ( ! ) – !a < b [Ao contrário dos dois anteriores, este é um operador unário e retorna verdadeiro quando a condição em consideração não é satisfeita ou é uma condição falsa]

## Operador ternário
O operador ternário Java é o único operador condicional que usa três operandos. É um substituto one-liner para a instrução if-then-else e é muito usado na programação Java. Podemos usar o operador ternário no lugar de condições if-else ou até mesmo alternar condições usando operadores ternários aninhados. Embora siga o mesmo algoritmo da instrução if-else, o operador condicional ocupa menos espaço e ajuda a escrever as instruções if-else da maneira mais curta possível.

**Sintaxe:**
> variavel = condicao ? expressao1 : expressao2

Onde:

- variavel: recebe o resultado da operação;
- condicao: se for verdadeiro (?) executa a expressao1. Do contrário (false :), executa a expressao2 

Se opera de forma semelhante à da instrução `if-else`.

```
if(condicao) {
    variable = expressao1;
} else {
    variable = expressao2;
}
```

### Exemplo:

```
import java.io.*;

class Ternaria {
    public static void main(String[] args) {

        int n1 = 5, n2 = 10, maior;
        System.out.println("Primeiro num: " + n1);
        System.out.println("Segundo num: " + n2);

        // Operação ternária
        maior = (n1 > n2) ? n1 : n2;

        // Imprime o resultado
        System.out.println("O maior é = " + maior);
    }
}
```

## Operadores Bitwise
Os operadores bit a bit são usados para realizar a manipulação de bits individuais de um número. Eles podem ser usados com qualquer tipo integral (char, short, int, etc.). Eles são usados ao executar operações de atualização e consulta das árvores indexadas binárias. Vejamos:

1. Bitwise OU (|)

Este operador é um operador binário, denotado por '|'. Ele retorna bit a bit OU de valores de entrada, ou seja, se qualquer um dos bits é 1, ele dá 1, caso contrário, ele mostra 0.

**Exemplo:**

```
a = 5 = 0101 (em binario)
b = 7 = 0111 (em binario)

Operador Bitwise "OR" de 5 e 7:

  0101
| 0111
 ________
  0111  = 7 (em decimal) 
```

1. Bitwise E (&)

Este operador é um operador binário, denotado por '&'. Ele retorna pouco a pouco E dos valores de entrada, ou seja, se ambos os bits são 1, ele dá 1, caso contrário, ele mostra 0.

**Exemplo:**

```
a = 5 = 0101 (em binario)
b = 7 = 0111 (em binario)

Operador Bitwise "AND" de 5 e 7
  0101
& 0111
 ________
  0101  = 5 (em decimal)
```

3. XOR Bitwise (^)

Este operador é um operador binário, denotado por '^.' Ele retorna bit a bit XOR de valores de entrada, ou seja, se os bits correspondentes são diferentes, ele dá 1, caso contrário, ele mostra 0.

**Exemplo:**

```
a = 5 = 0101 (em binario)
b = 7 = 0111 (em binario)

Operador Bitwise "XOR" de 5 e 7
  0101
^ 0111
 ________
  0010  = 2 (em decimal)
```

4. Complemento Bitwise (~)

Este operador é um operador unário, denotado por '~.' Ele retorna a representação do complemento do valor de entrada, ou seja, com todos os bits invertidos, o que significa que ele faz a cada 0 a 1, e a cada 1 a 0.

**Exemplo:**

```
a = 5 = 0101 (em binario)

Operador Bitwise "~" de 5

~ 0101
 ________
  1010  = 10 (em decimal) 
```
**Nota:** O compilador dará o complemento de 2 desse número, ou seja, o complemento de 2 de 10 será -6.

5. Operadores Bit-Shift (Operadores de Turno)

Os operadores de deslocamento são usados para deslocar os bits de um número para a esquerda ou para a direita, multiplicando ou dividindo o número por dois, respectivamente. Eles podem ser usados quando temos que multiplicar ou dividir um número por dois.

**Sintaxe:**
> number shift_op number_of_places_to_shift;

Tipos de operadores de turno:

Os Operadores de Turno são divididos em 4 tipos. São eles:

- Operador de deslocamento à direita assinado (>>)
- Operador de deslocamento à direita não assinado (>>>)
- Operador(es) de deslocamento para a esquerda (<<)
- Operador de deslocamento à esquerda não assinado (<<<)

programa para implementar todos os operadores Bitwise em java para entrada do usuário

```
import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT: " + (~num1));
        System.out.println("Bitwise Left Shift: " + (num1 << 2));
        System.out.println("Bitwise Right Shift: " + (num1 >> 2));
        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

        input.close();
    }
}
```

**Entrada**
```
Enter first number: 4
Enter second number: 8
```

**Saída**
```
Bitwise AND: 0
Bitwise OR: 12
Bitwise XOR: 12
Bitwise NOT: -5
Bitwise Left Shift: 16
Bitwise Right Shift: 1
Bitwise Unsigned Right Shift: 1
```

### Exemplo de código

```
public class operators {
    public static void main(String[] args) {

        // Iniciando variáveis
        int a = 5;
        int b = 7;

        // bitwise AND
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise OR
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise XOR
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise NOT
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // dará 2 complemento (32 bits) de 5 = -6
        System.out.println("~a = " + ~a);

        // também pode ser combinado com
        // operador de atribuição para fornecer taquigrafia
        // designação
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}
```

**Saída:**

> a&b = 5
>
> a|b = 7
>
> a^b = 2
>
> ~a = -6
>
> a= 5
>


```
class GFG {
    public static void main (String[] args) {
      
        String binary[]={
          "0000","0001","0010","0011","0100","0101",
          "0110","0111","1000","1001","1010",
          "1011","1100","1101","1110","1111"
        };
      
      // initializing the values of a and b 
      int a=3; // 0+2+1 or 0011 in binary
      int b=6; // 4+2+0 or 0110 in binary
      
      // bitwise or
      int c= a | b;
      
      // bitwise and
      int d= a & b;
      
      // bitwise xor
      int e= a ^ b;
      
      // bitwise not
      int f= (~a & b)|(a &~b);
      int g= ~a & 0x0f;
      
      
      System.out.println(" a= "+binary[a]);
      System.out.println(" b= "+binary[b]);
      System.out.println(" a|b= "+binary[c]);
      System.out.println(" a&b= "+binary[d]);
      System.out.println(" a^b= "+binary[e]);
      System.out.println("~a & b|a&~b= "+binary[f]);
      System.out.println("~a= "+binary[g]);
    }
}
```

**Saída:**
> a= 0011
>
> b= 0110
>
> a|b= 0111
>
> a&b= 0010
>
> a^b= 0101
>
> ~a & b|a&~b= 0101
>
> ~a= 1100

## Operadores de turno

Ao deslocar os bits de seu primeiro operando para a direita ou para a esquerda, um operador shift executa a manipulação de bits nos dados. Os operadores de turno disponíveis na linguagem de programação Java estão listados abaixo. O operador shift é um operador java que é usado para deslocar padrões de bits para a direita ou para a esquerda.

**Tipos de operadores de turno:**

| Nome do operador                         | Sinal | Descrição                                                                                                                   |
| ---------------------------------------- | ----- | --------------------------------------------------------------------------------------------------------------------------- |
| Desvio para a esquerda assinado          | <<    | O operador de deslocamento para a esquerda move todos os bits por um determinado número de bits para a esquerda             |
| Deslocamento à direita assinado          | >>    | O operador de deslocamento para a direita move todos os bits por um determinado número de bits para a direita               |
| Deslocamento para a direita não assinado | >>>   | É o mesmo que o deslocamento direito assinado, mas a posição vaga mais à esquerda é preenchida com 0 em vez do bit de sinal |

1. Operador Shift Esquerdo Assinado
Esse operador é representado por um símbolo <<, lido como o dobro menor que.

**Sintaxe:**
> left_operand  <<  number

**Ilustração:**

```
class GFG {
    public static void main(String[] args)
    {
        byte a = 64, b;
        int i;
 
        i = a << 2;
        b = (byte)(a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
```
Calculando o valor de número << 2 se número = 2. Quando o valor de um número é deslocado para os dois lugares esquerdos, os dois bits mais à esquerda são perdidos. O número tem um valor de dois. 0010 é a representação binária do número 2. No exemplo a seguir, o método para fazer um deslocamento para a esquerda é explicado:

**Exemplo:**

No exemplo abaixo abaixo, o número binário 0010 (em decimal 2) torna-se 1000 depois de deslocar os bits para a esquerda (em decimal 8).

```
import java.io.*;
class GFG {
 
    public static void main(String[] args)
    {
        int number = 2;
 
        // 2 bit left shift operation
        int Ans = number << 2;
 
        System.out.println(Ans);
    }
}
```

**Saída:**
> 8

2. Operador de deslocamento à direita assinado
O Operador de Deslocamento à Direita move os bits de um número em um determinado número de lugares para a direita. O sinal de >> representa o operador de deslocamento à direita, que é entendido como duplamente maior que. Quando você digita x>>n, você diz ao computador para mover os bits x para os n lugares certos. Quando deslocamos um número para a direita, os bits menos significativos (mais à direita) são excluídos, e o bit de sinal é preenchido no lugar mais considerável (mais à esquerda).

**Sintaxe:**
> left_operand  >>  number

**Ilustração:**

Calcule o valor de número>>2 se número=8.

Quando o valor de um número é deslocado para os dois lugares à direita, os dois bits mais à direita são perdidos. O número tem valor de oito. 1000 é a representação binária do número 8. Veja a seguir um exemplo de como executar o deslocamento à direita:

```
import java.io.*;
 
class GFG 
    {
    public static void main (String[] args) {
        {         
        int number = 8;
       
        // 2 bit signed right shift
        int Ans = number >> 2;
       
        System.out.println(Ans);    
        }
    }
}
```

``` 
class GFG {
    public static void main (String[] args) {
       char hex[]={
       '0','1','2','3','4','5',
         '6','7','8','9','a','b','c',
         'd','e','f'
       };
       
      byte b=(byte) 0xf1;
       
      System.out.println("b = 0x" + hex [(b>>4) & 0x0f] + hex[b & 0x0f]);
    }
}
```
No exemplo acima, o número binário 1000 (em decimal 8) torna-se 0010 depois de deslocar os bits para a direita (em decimal 2).

3. Operador de deslocamento à direita não assinado
O operador de deslocamento à direita não assinado move os bits do inteiro um determinado número de lugares para a direita. O bit do sinal foi preenchido com 0s. O Operador de Deslocamento à Direita de Preenchimento Zero Bitwise é representado pelo símbolo >>>.

**Sintaxe:**
> left_operand  >>>  number

```
import java.io.*;
 
class GFG 
    {
    public static void main (String[] args) 
    {
        byte num1 = 8;
        byte num2 = -8;
      
        System.out.println(num1 >>> 2);    
        System.out.println(num2 >>> 2);    
    }
}
```

**Saída:**
> 2
>
> 1073741822

**Nota:** Para bits negativos, os operadores de deslocamento à direita assinados e não assinados fornecem resultados diferentes.

4. Operador de deslocamento esquerdo não assinado
Ao contrário do Deslocamento à Direita não assinado, não há nenhum operador "<<<" no Java porque as operações lógicas (<<) e aritméticas do desvio à esquerda (<<<) são idênticas.