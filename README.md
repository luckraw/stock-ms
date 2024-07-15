# stock-ms

Projeto de um microserviço de gerenciamento de estoque, desenvolvido com Spring Boot, Spring Data JPA, MapStruct e MySQL. O sistema permite gerenciar produtos, categorias, fornecedores e transações de estoque.

## Funcionalidades

- CRUD de Produtos
- CRUD de Categorias
- CRUD de Fornecedores
- Registro de Transações de Estoque

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MapStruct
- MySQL

## Endpoints da API
- ### Categoria
- Criar Categoria

- POST `/api/categories`
Body:
```json
{
  "name": "Eletrônicos",
  "description": "Dispositivos eletrônicos e acessórios"
}
```
- Listar Categorias

- GET `/category`
- Obter Categoria por ID

- GET /category/{id}
- Excluir Categoria

- DELETE `/category/{id}`

- ### Fornecedor
- Criar Fornecedor

- POST `/suppliers`
Body:
```json
{
  "name": "TechSupplier Inc.",
  "contactInfo": "techsupplier@example.com"
}
```
- Listar Fornecedores

- GET `/suppliers`
- Obter Fornecedor por ID

- GET `/suppliers/{id}`
- Excluir Fornecedor

- DELETE `/suppliers/{id}`

- ### Produto
- Criar Produto

- POST `/products`
Body:
```json
{
  "name": "Smartphone",
  "description": "Smartphone de última geração",
  "price": 2999.99,
  "quantity": 50,
  "categoryId": 1
}
```
- Listar Produtos

- GET `/products`
- Obter Produto por ID

- GET `/products/{id}`
- Excluir Produto

- DELETE `/products/{id}`
- Listar Produtos por Categoria

- GET `/products/category/{categoryId}`

- ### Transação
- Criar Transação

- POST `/transactions`
Body:
```json
{
  "quantity": 10,
  "transactionDate": "2024-07-11T12:30:00",
  "productId": 1,
  "supplierId": 1
}
```
- Listar Transações

- GET `/transactions`
- Obter Transação por ID

- GET `/transactions/{id}`
- Excluir Transação

- DELETE `/transactions/{id}`
