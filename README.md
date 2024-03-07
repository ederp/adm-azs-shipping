# adm-azs-shipping
Projeto para criar uma API REST envolvendo um cadastro de fretes

As seguintes funcionalidades foram elaboradas:  
* Cadastro de Frete
* Busca paginada de Frete, recebendo apenas um parâmetro que deve ser utilizado para buscar em todas as propriedades do frete
* Atualização dos dados do Frete
* Remoção do Frete

A aplicação foi desenvolvida utilizando a linguagem Java, framework Spring Boot, banco de dados MySQL, Swagger para documentação da API REST e Docker para o ambiente de conteinerização. A arquitetura Port and Adapter foi utlizada como padrão de projeto.  
Para rodar a aplicação em ambiente Docker, é necessário seguir estes passos:  

* Uma vez que este projeto esteja baixado na máquina e o Docker esteja rodando, vá até a pasta inicial deste projeto (azship) e rode os seguintes comandos nesta ordem:
* `docker-compose up -d mysql-service` para subir o banco de dados;
* Uma vez que o banco de dados esteja rodando na porta 3306 (isso pode ser conferido através do comando `docker-compose ps`), rodar o comando `docker-compose up -d web-service` para rodar a aplicação Spring Boot
* Estando tudo ok e os conteiners rodando, ao acessar o link [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html), a documentação com os endpoints deve ser acessível e os endpoints poderão ser testados usando um software como o Postman ou o Insomnia.

Obs.: Nesta [pasta](https://github.com/ederp/adm-azs-shipping/tree/main/azship/src/main/java/com/projeto/azship) estão os arquivos Java contendo os models, controllers e demais arquivos Java referentes a elaboração do projeto.
