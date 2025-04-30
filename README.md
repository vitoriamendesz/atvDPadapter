Vitoria Gabriele Mendonça Mendes RA:22137969-2

# Design Pattern Adapter - Leitura de CSV

## Objetivo

Implementar o padrão Adapter para transformar dados de um arquivo `.csv` em objetos da classe `Pessoa`.

## Arquivos

- `Pessoa.java`: Classe de domínio.
- `RepositorioDePessoas.java`: Interface alvo.
- `PessoaCsvAdapter.java`: Adapter que converte `.csv` em objetos `Pessoa`.
- `Main.java`: Teste e uso do adapter.
- `pessoas.csv`: Arquivo de dados.

## Como rodar

```bash
javac *.java
java Main
