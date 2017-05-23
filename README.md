# Requisitos de Software #

* Java 8 

* Docker (https://docs.docker.com/engine/installation/)

* Docker compose (https://docs.docker.com/compose/install/)

* IDE (Eclipse / Intellij)

# Iniciar a Infra #

* Criar uma nova branch com o nome do candidato e data do Dojo.
* Em um terminal como root (sudo su), dentro da pasta do repositório do projeto, rodar o comando:

```
docker-compose up
```

### Desafio

O desafio consiste em criar uma API Rest com dados da participação em eventos de prevenção do Câncer de Mama e Câncer de Próstata.

### Estrutura do Projeto

A estrutura do projeto foi construída sobre o framework [Spring Boot](https://projects.spring.io/spring-boot/), utilizando Spring MVC e [Spring Data JPA](http://projects.spring.io/spring-data-jpa/).

O projeto inicial contem uma entidade que representa o dados populacional de um determinado ano. Esse modelo é representado pela classe DadoPopulacional.

Na inicialização do projeto, é criada uma tabela no MySQL, com o nome dados_populacionais, e a aplicação popula essa tabela com dos dados contidos no dataset dados_populacionais.csv, localizado em 
dasa-handson/src/main/resources/

Os dados inseridos são os seguintes:

Ano    | População Total   | Total Homens  | Total Mulheres
------:| :--------------:  | :------------:| :----------------:
2000|173448346|86169657|87278689
2001|175885229|87336165|88549064
2002|178276128|88480530|89795598
2003|180619108|89601782|91017326
2004|182911487|90698483|92213004
2005|185150806|91769282|93381524
2006|187335137|92813167|94521970
2007|189462755|93829262|95633493
2008|191532439|94816963|96715476
2009|193543969|95776055|97767914
2010|195497797|96706703|98791094
2011|197397018|97610297|99786721
2012|199242462|98487258|100755204
2013|201032714|99336858|101695856
2014|202768562|100159507|102609055
2015|204450649|100955522|103495127
2016|206081432|101726102|104355330

### Objetivos Gerais
 - Fornecer uma API com a população geral e a proporção percentual entre homens e mulheres para um determinado ano.
    - Retorne o resultado para o ano de 2010.
    - Retorne o resultado para o ano de 2017 considerando a formula de projeção Geométrica de crescimento.
      populacional:
      
       ![crescimento_pop.png](https://github.com/pereira-cit/dojo-java-rest/blob/master/2897701646-crescimento_pop.png)
      
     As estimativas de crescimento da população são realizadas pelo método geométrico. Em termos
       técnicos, para se obter a taxa de crescimento (r), subtrai-se 1 da raiz enésima do quociente entre a
       população final (Pt) e a população no começo do período considerado (P0), sendo "n" igual ao número de anos no período.
      
      No caso, taxa de crescimento da população entre 2000 e 2010:
      
 - Fornecer uma API onde um usuário possa notificar que participou de uma das campanhas.
    - Importante que na resposta da participação contenha o Sexo, a Campanha e o Ano. 
    - Fornecer uma API com dos dados de participação por Campanha, realizando o filtro por Ano.
    - Fornecer uma API com a proporção de participação entre Homens X Mulheres X Campanha filtrando pelo ano.
