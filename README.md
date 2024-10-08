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

- Em seu vscode instale:

- Extension Pack for Java.
- Spring Boot Extension Pack.
- Lombok Annotations Support for VS Code.

3) Após a abertura do Projeto e instalação das extenções,execute os seguintes comandos:

  ### Para rodar a aplicação:
   
```bash
 cd lp2_finalwork
```
   ### Instale as Dependencias:

```bash
mvn install 
```
   ### Para rodar a Aplicação:

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




### Funcionalidades da aplicação com a inserção dos testes : 

1) Inicialmente, os tipos de dispositivos de informática e veículos serão automaticamente inseridos no sistema.

 <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/BD.jpeg" alt="BD" />


 2) Após isso,cadastre as entidades financeiras que serão utilizadas nos cadastros dos leilões

 <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/Entidade_financeira.jpeg" alt="BD" />

3) Ao cadastrar leilões, deve-se definir uma data futura para a realização do evento e vincular uma entidade financeira previamente registrada.

 <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/Leilao.jpeg" alt="BD" />

4) Em seguida, é necessario cadastrar os usuários que irão participar do sistema, fazendo lances em veículos e dispositivos de informática.

   <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/usuario.jpeg" alt="BD" />


5) No caso dos veículos a serem leiloados, eles devem ser cadastrados com a referência a um leilão existente, cuja data de realização ainda não tenha ocorrido, além de associar um tipo de veículo válido (1-Carros, 2-Motos, 3-Caminhões, 4-Utilitários).

 <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/Veiculos.jpeg" alt="BD" />

6) Da mesma forma, os dispositivos de informática disponibilizados para leilão devem ser vinculados a um leilão existente com data futura e a um tipo de dispositivo de informática válido (1-Notebooks, 2-Monitores, 3-Hubs, 4-Switches, 5-Roteadores).

 <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/dispositivo_informatia.jpeg" alt="BD" />

7) Para finalizar, o registro dos lances dos usuários em veículos, deve-se informar um veículo válido e o CPF de um cliente previamente cadastrado.

<img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/lei_vei.jpeg" alt="BD" />

8) No caso de lances em dispositivos de informática, é necessário fornecer o ID do dispositivo e o CPF de um cliente já registrado no sistema.

 <img src="https://github.com/orlando12577/LP2_FINALWORK/raw/main/Arquivos/lei_dis.jpeg" alt="BD" />  
