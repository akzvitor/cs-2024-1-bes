# REST APIs
## O que é uma API?
**Application Programming Interfaces** (APIs), ou Interfaces de Programação de Aplicação, são conjuntos de protocolos e funções desenvolvidas para integrar softwares de aplicações e permitir que elas possam se comunicar programaticamente.

Para facilitar, pode-se pensar nas APIs como um portão entre clientes e recursos, onde os clientes são usuários em busca de algum tipo de recurso e os recursos são as informações fornecidas pelas aplicações.

## O que é REST?
**Representational State Transfer** (REST), ou Transferência de Estado Representacional, é uma arquitetura de software específica. Ou seja, é basicamente um modelo a ser seguido ao se construir um software. APIs podem ser desenvolvidas de várias formas diferentes, e as que seguem o modelo REST são chamadas de REST APIs.

Esse tipo de API se tornou muito popular em aplicações web por seguirem padrões de comunicação seguros, confiáveis e eficientes. Seus maiores benefícios são a escalabilidade, a flexibilidade e a independência.

A arquitetura REST segue alguns princípios importantes que são característicos, como:
- **Interface uniforme**
  
  Todas as solicitações para um mesmo recurso devem ter a mesma estrutura, não importando sua origem.
  
- **Ausência de estado**
  
  Cada solicitação precisa incluir toda a informação necessária para ser processada, pois cada uma delas é independente e não podem armazenar dados relacionados a solicitação de algum cliente.
  
- **Sistema em camadas**

  Existem várias camadas trabalhando em conjunto para atender as solicitações, cada uma com uma função.
  
- **Capacidade de armazenamento**

  Recursos podem armazenados em cache para melhorar o tempo de resposta do servidor.
  
- **Código sob demanda**

  As solicitações geralmente retornam recursos estáticos, mas em certos momentos podem devolver códigos.

## Como uma REST API funciona?
Atualmente existem inúmeras REST APIs diferentes pela internet, desenvolvidas por diferentes programadores para objetivos distintos, mas todas funcionam de maneira parecida e possuem algumas etapas gerais:
1. O cliente faz uma solicitação para o servidor. Geralmente é preciso seguir uma estrutura específica, que é fornecida pelo desenvolvedor da API.
2. O servidor verifica se o cliente é autorizado a fazer essa requisição.
3. O servidor recebe a solicitação e a processa.
4. O servidor retorna uma resposta para o cliente.

### Solicitação do cliente
Para que a solicitação seja atendida, ela deve conter alguns componentes específicos, como:
- Identificador de recursos

  As REST APIs geralmente identificam os recursos por meio de uma URL.

- Método

  Os desenvolvedores normalmente implementam as REST APIs usando HTTP, que contém alguns métodos. O método deve ser especificado para que o servidor saiba o que deve fazer com o recurso solicitado.
  
  Os 4 métodos mais comuns são GET (acessa recurso da URL), POST (envia dados ao servidor, criando uma nova representação), PUT (atualiza dados do servidor que já foram criados) e DELETE (remove o recurso).

### Resposta do servidor
A resposta do servidor inclui 3 elementos principais:
- Linha de status

  Normalmente informa o sucesso ou falha da requisição.

- Corpo da mensagem

  Mostra a representação do recurso solicitado pelo cliente.

- Cabeçalho

  Metadados com algumas informações a mais da solicitação e do servidor.
























