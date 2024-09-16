# Projeto de Verificação de Sequência de Fibonacci e Contagem de Letras

Este projeto contém dois programas em Java:
1. Um programa que verifica se um número pertence à sequência de Fibonacci.
2. Um programa que conta quantas vezes a letra 'a' (maiúscula ou minúscula) aparece em uma string.

## Estrutura do Projeto

O projeto está organizado em dois pacotes:
- `contadorDeA.Main`: Contém o código para contar a letra 'a' em uma string.
- `sequenciaFibonacci.Main`: Contém o código para verificar se um número pertence à sequência de Fibonacci.

## Como Rodar o Código

### Pré-requisitos

- Java Development Kit (JDK) instalado.
- Um ambiente de desenvolvimento integrado (IDE) como IntelliJ IDEA, Eclipse, ou qualquer outro de sua preferência.

### Passos para Executar o Código

1. **Clonar o Repositório**:
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   ```

2. **Compilar o Código**:
   - Abra o terminal e navegue até o diretório do projeto.
   - Compile os arquivos Java:
     ```sh
     javac -d bin src/contadorDeA/Main/ContadorDeA.java
     javac -d bin src/sequenciaFibonacci/Main/Main.java
     ```

3. **Executar o Programa de Contagem de Letras**:
   - Navegue até o diretório `bin`:
     ```sh
     cd bin
     ```
   - Execute o programa:
     ```sh
     java contadorDeA.Main.ContadorDeA
     ```
   - Siga as instruções na tela para inserir uma string e verificar a contagem da letra 'a'.

4. **Executar o Programa de Verificação de Fibonacci**:
   - Navegue até o diretório `bin`:
     ```sh
     cd bin
     ```
   - Execute o programa:
     ```sh
     java sequenciaFibonacci.Main.Main
     ```
   - Siga as instruções na tela para inserir um número e verificar se ele pertence à sequência de Fibonacci.

## Descrição dos Programas

### Contador de Letras 'a'

Este programa solicita ao usuário que insira uma string e conta quantas vezes a letra 'a' (maiúscula ou minúscula) aparece na string. Utiliza a Stream API para realizar a contagem de forma eficiente.

### Verificador de Sequência de Fibonacci

Este programa solicita ao usuário que insira um número e verifica se ele pertence à sequência de Fibonacci. Utiliza um loop para gerar a sequência de Fibonacci até o número informado e verifica se o número está presente na sequência.

## Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Contato

Se você tiver alguma dúvida ou precisar de ajuda, sinta-se à vontade para entrar em contato:
- Email: dev.wadson@gmail.com
- GitHub: [Wadson-Ferreira](https://github.com/Wadson-Ferreira)



---
