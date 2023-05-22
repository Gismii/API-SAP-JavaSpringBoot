# API-SAP-JavaSpringBoot
Esta é uma API REST desenvolvida usando o framework Spring Boot

Esta é uma API REST desenvolvida usando o framework Spring Boot. Ela fornece um endpoint /Produto que retorna uma lista de produtos juntamente com seus departamentos correspondentes.

## Configuração
Certifique-se de ter o Java JDK (17 ou superior) e o Maven instalados em sua máquina.

Clone este repositório em sua máquina local.
Navegue até o diretório raiz do projeto.
Execute o comando mvn spring-boot:run para iniciar o aplicativo.
A API será executada localmente em http://localhost:8080.

## Endpoints
Listar produtos e departamentos
Retorna uma lista de produtos e seus departamentos correspondentes.

URL: /Produto

Método: GET

Parâmetros de consulta (opcionais):

departamento: Filtra os produtos por departamento.
Resposta de exemplo:

json
Copy code
[
  {
    "id": 1,
    "nome": "Produto 1",
    "departamento": "Departamento 1"
  },
  {
    "id": 2,
    "nome": "Produto 2",
    "departamento": "Departamento 2"
  },
  {
    "id": 3,
    "nome": "Produto 3",
    "departamento": "Departamento 1"
  }
]
## Contribuição
Se você quiser contribuir para este projeto, sinta-se à vontade para criar pull requests. Certifique-se de incluir uma descrição clara do problema que está resolvendo e quaisquer alterações relevantes.

## Licença
Este projeto é licenciado sob a Licença MIT. Leia o arquivo LICENSE para obter mais detalhes.

