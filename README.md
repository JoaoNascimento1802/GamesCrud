# GamesCrud

![GitHub repo size](https://img.shields.io/github/repo-size/JoaoNascimento1802/GamesCrud?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/JoaoNascimento1802/GamesCrud?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/JoaoNascimento1802/GamesCrud?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/JoaoNascimento1802/GamesCrud?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/JoaoNascimento1802/GamesCrud?style=for-the-badge)

> Projeto em Java com Spring Boot para gerenciamento de uma lista de jogos com operações CRUD (Create, Read, Update, Delete). Ideal para treinar APIs REST com banco de dados e boas práticas no backend.

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- JDK 17 ou superior instalado.
- Maven configurado na máquina.
- MySQL ou outro banco de dados relacional.
- IDE como IntelliJ ou VSCode.

## 🚀 Instalando GamesCrud

Para instalar o **GamesCrud**, siga estas etapas:

### Linux, macOS e Windows:

1. Clone o repositório:
   git clone https://github.com/JoaoNascimento1802/GamesCrud.git
   cd GamesCrud

2. Configure o `application.properties` com as credenciais do seu banco de dados:
   spring.datasource.url=jdbc:mysql://localhost:3306/gamesdb
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update

3. Rode o projeto:
   ./mvnw spring-boot:run

## ☕ Usando GamesCrud

Após iniciar a aplicação:

- A API estará disponível em:  
  http://localhost:8080

- Exemplos de rotas:
  - GET /games - Lista todos os jogos.
  - POST /games - Adiciona um novo jogo.
  - PUT /games/{id} - Atualiza os dados de um jogo.
  - DELETE /games/{id} - Remove um jogo.

## 📫 Contribuindo para GamesCrud

Para contribuir com **GamesCrud**, siga estas etapas:

1. Fork este repositório.
2. Crie uma branch: git checkout -b minha-feature
3. Faça suas alterações e commits: git commit -m 'minha contribuição'
4. Envie para sua branch: git push origin minha-feature
5. Abra um Pull Request.

Mais detalhes em: https://docs.github.com/pt/github/collaborating-with-issues-and-pull-requests/about-pull-requests

## 🤝 Colaboradores

Agradecimentos especiais a quem contribuiu com este projeto:

João Nascimento  
https://github.com/JoaoNascimento1802

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo LICENSE.md para mais detalhes.
