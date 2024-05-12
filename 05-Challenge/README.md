# Challenge - Decodificador de Textos 

| Alura | Oracle |
| ----- | ------ |
| <img src=./assets/img/logo.svg alt="Logotipo da Alura" title="Logo da Alura"> | <img src=./assets/img/logo-one.webp alt="Logotipo da ONE" title="Logo da ONE"> |

<br>

Usando como base o [Trello](https://trello.com/b/EmUFmjCv/decodificador-de-texto-alura-challenges-oracle-one) e o [Figma](https://www.figma.com/file/tvFEYhVfZTjdJ5P24RGV21/Alura-Challenge---Desafio-1---L%C3%B3gica?type=design&node-id=0-1&mode=design&t=B6ZgXYblW4880u2K-0) disponibilizados pela Alura, deve ser criada uma aplicação que criptografa textos. 

**Requisitos:**

- Deve funcionar apenas com letras minúsculas;
- Não devem ser utilizados letras com acentos nem caracteres especiais;
- Deve ter campos para inserção do texto a ser criptografado ou descriptografado;
- Um usuário deve poder escolher entre as duas opções;
- O resultado deve ser exibido na tela;
- Deve ser possível converter uma palavra criptografada para a versão original;
- As **"chaves"** de criptografia que serão utilizadas são:
    - A letra **"e"** é convertida para **"enter"**
    - A letra **"i"** é convertida para **"imes"**
    - A letra **"o"** é convertida para **"ober"**
    - A letra **"a"** é convertida para **"ai"**
    - A letra **"u"** é convertida para **"ufat"**

**Extras:**

- Um botão que copie o texto criptografado/descriptografado para a área de transferência - ou seja, que tenha a mesma funcionalidade do **ctrl+C** ou da opção **"copiar"** do menu dos aplicativos.
- O projeto deve ser desenvolvido em um período de **quatro semanas**, seguindo a **metodologia ágil**, utilizando o **Trello** da seguinte forma:
    - A coluna **Pronto pra iniciar** apresenta os cartões com os elementos ainda não desenvolvidos;
    - Já na coluna **Desenvolvendo** ficarão os elementos que estiverem em desenvolvendo no momento. 
        - Ao iniciar uma tarefa, poderá mover o cartão que contém a tarefa para esta coluna;
    - No **Pausado** estarão os elementos cujo desenvolmento foi iniciado, mas que precisou parar por algum motivo.
    - Por fim, na coluna **Concluído** terão os elementos já concluídos.

**NOTA**: O Trello é uma ferramenta de uso individual para controlar o andamento das atividades, mas ela não será avaliada.

<br>

## O Front-End seguindo o [Figma](https://www.figma.com/file/tvFEYhVfZTjdJ5P24RGV21/Alura-Challenge---Desafio-1---L%C3%B3gica?type=design&node-id=0-1&mode=design&t=B6ZgXYblW4880u2K-0):

<br>

**Nota:** Apesar da disponibilização do modelo no Figma, **não era requisito seguí-lo à risca** (dito inclusive na [Live ONE T6](https://www.youtube.com/watch?v=XlfNkUeHYgE)), sendo considerado apenas um **"Norte"**. Com isso, acrescentei algumas coisas. Segue:   

### No **index.html**:

- Incluí um tempo de 5 minutos para a página ser atualizada automaticamente; 
- A logo da Alura no **header**;
- Incluí uma **âncora** na logo para o site da Alura;
- Uma área de texto para input;
- Uma mensagem de alerta sobre as **restrições** de uso;
- Dois botões: um para **criptografar** o texto e outro para **descriptografar**. Incluí um **hover** que muda a cor dos botões ao passar o mouse em cima deles;
- uma área de saída, inicialmente com uma imagem de fundo seguda de uma mensagem de texto;
- Após clicar em um dos botões, será exibida na área de saída a mensagem cifrada/decodificada, a depender do input feito pelo usuário, e o botão de **copiar** fica disponível;
- **restrições** : texto a ser inserido deve conter apenas **letras minúsculas** e **sem acentos** ou **caracteres especiais**, mas deixei ser inserido o **"ç"**.
-  Incluí um rodapé, com os links do GitHub e LinkedIn.

### No **style.css**:

- O botão de copiar fica oculto de início, até que seja exibibo (com JavaScript) na saída junto com texto de saída; 
- Incluí responsividade ao dimencionar a tela a partir de 1200px;
- Usei as fontes **Montserrat** e **Krona One** do **Google Fonts**.

### No **script.js**:

- Apliquei a chave de criptografia exigida no [Trello](https://trello.com/b/EmUFmjCv/decodificador-de-texto-alura-challenges-oracle-one);
- Criei uma função para **validar a entrada** de texto com base nas regras de **restrições**;
- Criei as funções necessárias para **criptografar**, **descriptografar** e **copiar** o texto;
- Criei uma função que **remove os elementos da área de saída** (imagem e texto) e **exibir o texto de saída junto com o botão de copiar**;

<br>

## Publicar solução:

#### Conforme informado no [Trello](https://trello.com/b/EmUFmjCv/decodificador-de-texto-alura-challenges-oracle-one), a solução deve ser disponibilizada no site do [Challenge](https://lp.alura.com.br/alura-latam-entrega-challenge-one-portugues). Lá deverá ser incluído o link gerado no **GitHub Pages**. 

##### Passo-a-passo para gerar a página do repositório:

- O repositório deve ser **Public**;
- No repositório do projeto clique em **Settings**;
- Em seguida, no menu lateral esquerdo, vá em **Pages**;
- No lado direito vá em **Branch** e ajuste a branch para a que deseja publicar, no meu caso **Main**, opcionalmente altere de **/root** para **/docs** e clique em **Save**;
- Aguarde a página ser gerada após a validação do próprio GitHub;
- Se tudo estiver correto, ao final, logo abaixo do **GitHub Pages** será disponibilizado o link;
- Agora é só clicar em [**Visit Site**](https://mdsoare.github.io/decodificador/) para ver a página publicada;

<br>

## Redes Socias

[![PerfilDIO](https://img.shields.io/badge/DIO-0077B5?style=for-the-badge&logo=dio&logoColor=white)](https://web.dio.me/users/marcelo_soares92)
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)](https://github.com/Mdsoare/)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marcelodsoares/) 

<table>
  <tr>
    <td>
      <img width="80px" align="center" src="https://avatars.githubusercontent.com/Mdsoare"/>
    </td>
    <td align="left">
      <a href="https://www.linkedin.com/in/marcelodsoares/">
        <span><b>Marcelo Soares</b></span>
      </a>
      <br>
      <span>Analista de Sistemas</span>
    </td>
  </tr>
</table>

<br>

## Referências 🔎

- [W3schools](https://www.w3schools.com/);
- [MDN](https://developer.mozilla.org/pt-BR/);
- [Alura - Artigos Front-End](https://www.alura.com.br/artigos/como-colocar-projeto-no-ar-com-github-pages).
