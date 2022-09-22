# Setença de colchetes

Determinar se a ordem dos colchetes é válida. Um colchete é considerado qualquer um dos seguintes caracteres: (, ), {, }, [ ou ].
Projeto em Spring Boot e Java 8

### Teste da Aplicação

Executa pelo Spring Boot e testa a requisição no PostMan ou semelhante

### Teste no PostMan

#### GET verificar_sequencia
http://localhost:8080/suporte_balanceado/verificar_sequencia

```sh
json
{
  [{()}](){}
}
```
