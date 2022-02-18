Digital Innovation: Expert Class - Sistema de gerenciamento de pessoas em API REST com Spring Boot

Neste repositório está contido um pequeno sistema para o gerenciamento de pessoas de uma empresa através de uma API REST criada com o Spring Boot durante um projeto feito em uma das aulas do Spread Java Developer da Digital Innovation One.

Foram desenvolvidos e abordados os seguintes tópicos:

- Setup inicial de projeto com o Spring Boot Initialzr;
- Criação de modelos de dados para o mapeamento de entidades em bancos de dados;
- Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema);
- Desenvolvimento de testes unitários para validação das funcionalidades;
- Implantação do sistema na nuvem através do Heroku.



Para executar o projeto no terminal, digite o seguinte comando:

> mvn spring-boot:run

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

> http://localhost:8080/api/v1/people

São necessários os seguintes pré-requisitos para a execução do projeto:

- Java 11 ou superior;
- Maven 3.6.3;
- Spring Boot (última versão estável lançada);
- Git/GitHub para versionamento de código;
- Heroku para deploy na nuvem