# Projeto de Lista de Pedido de Produtos

## Descrição
Este projeto é um sistema onde o cliente é cadastrado com informações (nome, email e data de nascimento). O cliente pode criar um pedido com uma 
quantidade de produtos que ele escolhe e após isso ele coloca as informações do produto em sequência (Nome, Preço, status(ATENÇÃO: olhe a classe enum 
para ver quais os status disponíveis para não dar erro!)e quantidade). 
Após preencher todos os dados de todos os produtos de acordo com a quantidade que foi escolhida, o cliente recebe um resumo de todos os pedidos que 
foram realizados.

## Funcionalidades
- Criação de Usuário dentro do sistema
- Criação de pedidos de diversos produtos
- Resumo final dos pedidos com preço final

## Tecnologias
- Java
- Classe enum
- Encapsulamento
- Métodos

## Como executar o projeto

### Pré-requisitos
- Java 17 ou superior instalado
- Execute os comandos dentro da pasta src
- Os nomes dos pacotes devem coincidir com a estrutura de pastas

### Opção 1: Pelo terminal (CMD / Git Bash)

```bash
1. Clone o repositório
git clone <https://github.com/JoaoLucas280/Java-Exercises.git>

2. Acesse a pasta do projeto
cd Java-Exercises/Exercicios Java

3. Entre na pasta src
cd src

4. Compile os arquivos
javac Object_Orientation\ProductsProject\Application\*.java Object_Orientation\ProductsProject\Entities\*.java Object_Orientation\ProductsProject\EnumEntities\*.java

5. Execute o programa
java Object_Orientation.ProductsProject.Application.application

```
### Opção 2: Pelo IntelliJ IDEA
```bash
1. Clone ou Baixe o projeto
Você pode usar o Git ou baixar o .zip pelo GitHub.

2. Abra o projeto no IntelliJ
Clique em Open
Selecione a pasta do projeto

3. Configure o projeto (se necessário)

Se o IntelliJ não reconhecer automaticamente:

Clique com o botão direito na pasta src
Selecione: Mark Directory as → Sources Root

4. Execute o programa

Abra o arquivo:

src/Object_Orientation/ProductsProject/Application/application.java

Clique no botão run ao lado da classe.
