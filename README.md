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

  ### Para leitura da aplicação:
   
```bash
 cd leilao
```

```bash
 cd leilao-main
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


### Sequencia de tarefas da aplicação com a inserção dos testes : 

1) Inserindo Informações no Banco de Dados: 

- Insira as informações necessárias que você deseja visualizar no banco de dados, conforme especificado na aplicação.
- Certifique-se de preencher todos os campos corretamente.

2) Iniciando a Aplicação:

- Após conferir as informações inseridas, inicie a aplicação. O banco de dados irá armazenar todas as informações do sistema automaticamente.

 Veja o exemplo da estrutura do banco de dados:

 <img src="https://github.com/orlando12577/Leilao/blob/Corre%C3%A7%C3%B5es/Arquivos/Banco_Dados.jpeg" alt="BD" />

3) Visualizando Usuários no Sistema

Após a inicialização, você poderá visualizar os usuários registrados no sistema.

Exemplo de visualização de usuários:

 <img src="https://github.com/orlando12577/Leilao/blob/Corre%C3%A7%C3%B5es/Arquivos/usuario.jpeg" alt="BD" />

4)Gerenciamento de Leilões

- É possível visualizar os leilões em aberto, criar novos leilões, atualizá-los e excluí-los conforme necessário.

- Exemplo de gerenciamento de leilões:

 <img src="https://github.com/orlando12577/Leilao/blob/Corre%C3%A7%C3%B5es/Arquivos/Leilao.jpeg" alt="BD" />

5) Gerenciamento de Itens

- Visualize os itens relacionados aos leilões, incluindo detalhes sobre os lances dados, descrições detalhadas e opções para criar, atualizar e excluir itens.

- Exemplo de gerenciamento de itens:

 <img src="https://github.com/orlando12577/Leilao/blob/Corre%C3%A7%C3%B5es/Arquivos/Item.jpeg" alt="BD" />


6) Visualizando Entidades Financeiras:

- É possível visualizar as entidades financeiras disponíveis no sistema.

- Exemplo de visualização das entidades financeiras:

 <img src="https://github.com/orlando12577/Leilao/blob/Corre%C3%A7%C3%B5es/Arquivos/Financeira.jpeg" alt="BD" />

7) Consulta de Endereço por ID:

- Caso tenha dúvidas sobre endereços, utilize a opção de buscar por ID no sistema.

- Exemplo de consulta de endereço:

 <img src="https://github.com/orlando12577/Leilao/blob/Corre%C3%A7%C3%B5es/Arquivos/Endereço.jpeg" alt="BD" />
