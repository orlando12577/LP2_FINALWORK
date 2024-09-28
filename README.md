# LP2_FINALWORK

## Sistema de Leilão Eletrônico

Descrição
Este projeto é um sistema de Leilão Eletrônico desenvolvido em Java utilizando o Spring Boot, com JPA/Hibernate para persistência de dados e Lombok para simplificação do código. Ele permite o gerenciamento de leilões, produtos e lances, seguindo regras específicas para cada operação.

 # Tecnologias Utilizadas

 <p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original-wordmark.svg" alt="Java" width="100" height="100"/>
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original-wordmark.svg" alt="Spring Boot" width="100" height="100"/>
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/hibernate/hibernate-plain-wordmark.svg" alt="Hibernate" width="100" height="100"/>
 <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/lombok.png" alt="Lombok" width="100" height="100"/>
  <img src="https://raw.githubusercontent.com/swagger-api/swagger-ui/master/dist/favicon-32x32.png" alt="Swagger" width="100" height="100"/>
</p>

 # Passo a passo para rodar a aplicação: 




1. Pré-Requisitos
Certifique-se de ter os seguintes pré-requisitos instalados no seu sistema:

- Java Development Kit (JDK) 11 ou superior
Verifique a instalação do JDK com o comando


```bash
java -version
```


- Maven
Verifique a instalação do Maven com o comando:

```bash
mvn -version
```

2) Clone ou baixe o repositório do projeto e insira e importe o projeto pelo Maven na IDE de preferência (Eclipse, Visual Studio Code, etc...);



3) Após a abertura do Projeto,execute os seguintes comandos:

   
```bash
 cd lp2_finalwork
```

```bash
mvn install 
```

```bash
mvn spring-boot:run
```
# Sobre o projeto LP2 Final Work: 

Projeto Lp2FinalworkApplication faz parte de um sistema de leilões eletrônicos, desenvolvido como trabalho final de Programação Orientada a Objetos. Para executá-lo e testar suas funcionalidades, siga as etapas abaixo:

1) Iniciar o Projeto:

- Certifique-se de que todas as dependências estão instaladas e que o projeto está configurado corretamente.
  
- Navegue até o package com.example.lp2_finalwork e execute a classe principal Lp2FinalworkApplication. Isso iniciará o servidor Spring Boot e carregará as configurações necessárias.

2) Banco de Dados H2:

- O projeto utiliza o banco de dados H2 em memória. Isso significa que todas as informações inseridas, consultadas ou modificadas só estarão disponíveis durante o tempo em que a aplicação estiver ativa.

3) Documentação das APiS:

- A documentação das APIs, gerada automaticamente pelo Swagger, estará disponível assim que o projeto for iniciado. Você pode acessá-la em: Swagger UI 

- Esta documentação fornece detalhes sobre as rotas disponíveis, tipos de requisição, parâmetros esperados e exemplos de respostas para cada operação suportada pelo sistema.

4) Tipos de Dispositivos e Veículos:

- As categorias aceitas para dispositivos de informática incluem, por exemplo, laptops, desktops, tablets e servidores. Já para veículos, as opções podem englobar carros, caminhões e motocicletas, conforme definido nos requisitos do projeto.

6) Observações Importantes:

- O banco de dados H2 é temporário e seus dados serão perdidos após a reinicialização do projeto. Além disso, o projeto utiliza o Swagger para facilitar a documentação e a visualização das APIs, permitindo que desenvolvedores explorem e testem os endpoints disponíveis de forma interativa,em que pode ser acessado através do link : http://localhost:8080/swagger-ui/index.html#/ .

- Certifique-se de que as dependências e configurações do projeto, como as permissões e o contexto da aplicação, estão corretas antes de realizar testes extensivos.

Seguindo essas instruções, você poderá iniciar e explorar todas as funcionalidades do projeto Lp2FinalworkApplication. 


## Requisitos do Projeto: 


O novo sistema visa direcionar o escopo inicial para leilões específicos de:

- Dispositivos de informática: notebooks, monitores, hubs, switches e roteadores.

- Veículos: carros e motocicletas de passeio, caminhões e utilitários apreendidos.


### Funcionalidades Básicas

O sistema deve contemplar as seguintes funcionalidades:

1) Gestão de Dispositivos de Informática:

- Registro, consulta, atualização e remoção dos dispositivos de informática a serem leiloados.
  
- Os detalhes dos dados para representar esses dispositivos fazem parte da pesquisa sobre o domínio do sistema.

2) Gestão de Veículos:

- Registro, consulta, atualização e remoção dos veículos a serem leiloados.
  
- Os detalhes dos dados para representar esses veículos fazem parte da pesquisa sobre o domínio do sistema.

3) Gestão de Leilões:

- Registro, consulta, atualização e remoção de leilões, contendo:
- Data de ocorrência futura.
- Data de visitação dos itens.
- Local do leilão (endereço, cidade e estado).
- Demais detalhes pertinentes ao domínio de um leilão eletrônico, incluindo entrada física no local.



4) Associação de Produtos aos Leilões:

- O registro de produtos (dispositivos de informática e veículos) deve ser independente do leilão, porém no momento de seu cadastro, obrigatoriamente deverão estar vinculados a um leilão já registrado.
  
- Possibilidade de desassociar um item de leilão que não tenha sido vendido (sem lance) do leilão atual e associá-lo a outro leilão futuro, respeitando a obrigatoriedade de sempre estar associado a um leilão presente ou futuro.


5) Gestão de Clientes:

- Registro, consulta, atualização e remoção dos dados de cada cliente autorizado a interagir com o sistema.
  
- Clientes podem fornecer lances e consultar detalhes dos produtos anunciados nos leilões.


6) Gestão de Instituições Financeiras:

- Registro, consulta, atualização e remoção das instituições financeiras responsáveis pela quitação das transações fechadas durante os leilões.
- Cada leilão deve ter ao menos uma entidade financeira associada (CNPJ).

