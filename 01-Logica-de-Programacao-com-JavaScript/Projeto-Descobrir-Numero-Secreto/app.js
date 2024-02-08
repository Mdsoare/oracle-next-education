/* 
Aluno: Marcelo Soares
Data inicio: 17/01/2024
Objetivo: Criar um jogo web que gere um número aleatório e permita que o jogador tente acertá-lo
Documentação:
https://developer.mozilla.org/pt-BR/docs/Learn/JavaScript/First_steps/What_is_JavaScript

https://www.alura.com.br/artigos/javascript?_gl=1*j8wfpg*_ga*OTgyNjY4ODg3LjE3MDUyNjg1NDY.*_ga_1EPWSW3PCS*MTcwNTUxMDEwNy4xNS4xLjE3MDU1MTEwMTYuMC4wLjA.*_fplc*UFFJYWFpUTdRcnh1JTJCbXBHT3V0b1I2ekxzViUyQjhlNW5uY2p0NEpTcHcxZnlmUkdkeTByWjNlTkZHQjY2Ykg0cWZJcEdIQWplN0glMkJCdSUyRkRBQXp5OEFzT3pqU0JMMFAlMkJYM0NUY0ZXOHhrMkpyUVR4a040N3lFNW1hWWdnaTlLZyUzRCUzRA..
*/

// Função principal
function main() {
    const nome = boasVindas();
    const numeroSecreto = geraNumeroSecreto();
    const tentativas = escolhaDoNivel();
    jogo(numeroSecreto, nome, tentativas);
    window.alert(`O número secreto era ${numeroSecreto}`);
}

// Função de boas vindas
function boasVindas() {
    const nome = window.prompt('Por Favor, insira seu nome: ');
    window.alert(`Olá ${nome}! Seja muito bem-Vindo...`);
    return nome;
}

// Função para definir o nível do Jogo
function escolhaDoNivel() {
    const escolha = parseInt(window.prompt('Por Favor, escolha o nível do Jogo:\n1-Fácil\n2-Médio\n3-Difícil'));
    const niveis = {1: 10, 2: 7, 3: 5};
    return niveis[escolha];
}

// Função que gera número aleatório
function geraNumeroSecreto() {
    return Math.floor(Math.random() * 100);
}

// Função que executa o jogo
function jogo(numeroSecreto, nome, tentativas) {
    for(let i = 0; i < tentativas; i++) {
        let chute = parseInt(window.prompt('Digite um número entre 0 e 100'));
        if(chute === numeroSecreto) {
            window.alert(`Parabéns ${nome}! Você acertou o número secreto!`);
            break;
        } else if(chute < numeroSecreto) {
            window.alert(`O número secreto é MAIOR do que o informado.`);
        } else {
            window.alert(`O número secreto é MENOR do que o informado.`);
        }
    }
}

// Iniciando o Jogo
main();