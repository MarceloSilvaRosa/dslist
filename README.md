# DSList

## Descrição
DSList é um sistema web para gerenciamento de listas de jogos. Este projeto foi desenvolvido utilizando Spring Boot e segue o padrão de camadas.

## Tecnologias Utilizadas
- Java 21
- Spring Boot
- Maven
- JPA / Hibernate
- PostgreSQL
- Docker Compose

## Conceitos Aprendidos e Aplicados

### Sistemas Web e Recursos
- **Cliente/Servidor**: Arquitetura onde o cliente faz requisições HTTP e o servidor responde com dados em JSON.
- **Padrão REST**: Implementação de APIs seguindo os princípios RESTful.
![image](https://github.com/user-attachments/assets/79e0c2fe-8af7-4731-abd9-8d94fec19e40)

### Estruturação de Projeto Spring REST
- **Entidades e ORM**: Mapeamento objeto-relacional utilizando JPA e Hibernate.
- **Database Seeding**: População inicial do banco de dados com dados de exemplo.
- **Padrão Camadas**: Separação do projeto em camadas (Controller, Service, Repository).
- **DTO (Data Transfer Object)**: Utilização de DTOs para transferência de dados entre as camadas.

### Relacionamentos N-N
- **Classe de Associação e Embedded ID**: Implementação de relacionamentos muitos-para-muitos com classes de associação e IDs embutidos.
- **Consultas SQL no Spring Data JPA**: Utilização de consultas SQL nativas e projeções.
- Relacionamentos
  ![image](https://github.com/user-attachments/assets/e832bbcd-7d67-4e39-9e24-3efb1a78f8cb)
- Modelos de objetos
  ![image](https://github.com/user-attachments/assets/3713c092-4eee-4569-aa85-ae20a1761820)
- Modelo relacional
- 
  ![image](https://github.com/user-attachments/assets/1f116010-e465-4a1c-a2d1-ec4b7d20f700) ![image](https://github.com/user-attachments/assets/c16bf528-ccb3-4876-9418-8c98623149d0)
  ![image](https://github.com/user-attachments/assets/cf0baca6-f04f-4944-afdb-67e349e5d8b8)

### Ambiente de Desenvolvimento e Deploy
- **Docker Compose**: Configuração do ambiente local utilizando Docker Compose.
- **Processo de Homologação Local**: Testes e validação do sistema em ambiente local.
- **Processo de Deploy com CI/CD**: Implementação de pipelines de CI/CD para deploy contínuo.
- **Configuração de CORS**: Configuração de CORS para permitir requisições de diferentes origens.

### Design e Implementação de Endpoints
- **Operação de Atualização no Spring**: Implementação de operações de atualização utilizando verbos HTTP.
- **Operações com List**: Manipulação de listas e ordenação de elementos.
- **Verbo HTTP e Idempotência**: Utilização correta dos verbos HTTP garantindo idempotência nas operações.

## Coleção Postman
Para facilitar o teste dos endpoints, você pode importar a coleção do Postman `DSList.postman_collection.json` que está incluída na raiz do repositório.

### Importando a Coleção no Postman
1. Abra o Postman.
2. Clique em `Import` no canto superior esquerdo.
3. Selecione a aba `Upload Files`.
4. Navegue até o diretório do projeto e selecione o arquivo `DSList.postman_collection.json`.
5. Clique em `Import`.

Agora você terá todos os endpoints configurados no Postman para facilitar o teste da API.
## Como Executar o Projeto

### Pré-requisitos
- Docker e Docker Compose instalados

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/MarceloSilvaRosa/dslist.git

## Licença
Este projeto está licenciado sob a licença MIT.

## -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
- Intensivão Spring Boot Java com DevSuperior Incrível. 
