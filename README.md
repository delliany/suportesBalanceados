# Setença de colchetes

Determinar se a ordem dos colchetes é válida. Um colchete é considerado qualquer um dos seguintes caracteres: (, ), {, }, [ ou ].

Projeto em Spring Boot e Java 8

### Teste da Aplicação

Executa pelo Spring Boot e testa as requisições pelo PostMan ou aplicativo semelhante

No Eclipse - SuporteBalanceadoApplication.java - Run As - Java Application

No terminal na pasta da aplicação 
```sh  
mvn spring-boot:run 
```

### Teste no PostMan

#### GET verificar_sequencia

http://localhost:8080/suporte_balanceado/verificar_sequencia

```sh
json

RequestBody
{
  [{()}](){}
}
```
