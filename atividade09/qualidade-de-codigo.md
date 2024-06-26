# Fatores de qualidade na programação - DEVMEDIA

## Principais ideias

### Introdução
Atualmente, com a ampla utilização de sistemas de software em praticamente todos os tipos
de serviços, é importante que eles mantenham um alto padrão de qualidade, principalmente
em sistemas considerados críticos.
Entretanto, o conceito de qualidade é muito abstrato e não aceita unanimidade, pois o que
é bom para alguns, certamente não será para outros. 

No caso dos softwares, a qualidade geralmente é definida por uma série de regras e 
práticas que, segundo especialistas, geram o bom software. Muitas vezes essas condições
são ignoradas, e é assim que grandes problemas acontecem.

### Importância da linguagem
É extremamente importante analisar a linguagem de programação que será usada em um projeto
específico. Isso porque, embora existam linguagens mais modernas com diversos tipos de
tecnologias que facilitam o trabalho do desenvolvedor, como API's e frameworks, a tendência
é que elas compliquem o trabalho da máquina, prejudicando o desempenho. Quando há recursos
computacionais de sobra, isso não é problema, mas a depender do projeto, esse ponto precisa
ser verificado e analisado.

É claro que é necessário um equilíbrio, pois programar em linguagem C para o mercado dos
dias atuais é extremamente em viável hoje em dia, porque apesar do desempenho ser superior,
a produtividade é infinitamente menor.

Outro ponto importante é o paradigma de programação. Orientação a objetos, embora seja
péssimo do ponto de vista do desempenho, é bastante usado por ser interessante no ponto 
de vista de manutenibilidade e reusabilidade. Então, conclui-se que é necessário verificar
o que é melhor levar em consideração em cada projeto.

### Criando uma boa documentação
O principal fator que diz respeito à qualidade de um software é o quão boa é sua
documentação. Isto porque ela facilita imensamente o entendimento do código ao qual ela
pertence. Poucos desenvolvedores gostam de explicar detalhadamente o que estão fazendo,
mas a importância dessa atitude irá se revelar no futuro.

Entretanto, ainda há a questão de como criar uma documentação apropriada e de qualidade.
O principal método é a utilização de diagramas, por meio da linguagem UML. Essa linguagem
possui diagramas estáticos e dinâmicos, como o de classes e o de casos de uso. Esses
diagramas oferecem múltiplas visões do sistema e modelam-no de acordo com algum enfoque.

Além dos diagramas, uma boa documentação inclui outros elementos, como descrição de
métodos. A documentação pode ser tanto a descrição de um projeto ainda inexistente quanto
o registro interno das estruturas do programa.

A documentação do código fonte é um dos passos que ajuda a entender o sistema como um todo.
Uma linha de comentário pode economizar a leitura de dezenas de linha de código. Esse tipo
de documentação vai sendo criada junto com o código e também auxilia o desenvolvedor a se
organizar e dividir suas tarefas em partes.

### Escrevendo código legível
É importante ressaltar que não adianta criar uma linda documentação para um código péssimo.
Um código bem escrito garante o controle sobre sua complexidade, entendimento e depuração.

Para escrever um código legível, é necessário encontrar um ponto de equilíbrio entre
código para pessoas lerem e código para máquinas executarem. Algumas técnicas podem 
facilitar esse processo, como o uso de identificadores facilmente identifícaveis, 
boa indentação e definição de regras gerais para projetos em equipe.

### Reaproveitamento de código
Esse é um conceito importante que parte do princípio de que, se um problema foi resolvido
no passado, não é necessário que seja resolvido novamente.

Existem diversas maneiras de reaproveitar código, e uma delas é reuso de trechos de código.
Essa técnica geralmente é utilizada por desenvolvedores iniciantes, o famoso "ctrl+c",
"ctrl+v". Trata-se de uma técnica simples, onde não seria vantajoso utilizar-se de uma mais
elaborada, como herança ou polimorfismo, por exemplo.

### Testes
Esse é um ponto essencial no desenvolvimento de qualquer projeto de software. Existem 
vários tipos de teste, que devem ser utilizados de acordo com suas vantagens e limitações
a depender do projeto específico.

Além dos diversos tipos de testes, como de estresse, integração, orientado a objetos ou de 
aceitação, existem outras técnicas que são mais utilizadas, que são aquelas que utilizam
bibliotecas de funções, as chamadas API's.

Existem vários exemplos dessas bibliotecas e de testes, que, como foi descrito antes, são
utilizados a depender do tipo de projeto e da empresa/time de desenvolvimento.

### Segurança na programação
Existem diversas técnicas de "programação defensiva", isto é, técnicas para seguir e 
garantir que o software que está sendo criado é seguro.

Entre elas, está a não aceitação de dados incorretos, tratamento de erros/exceções, 
construção de um texto bem documentado e organizado em funções e classes e utilização de
API's prontas que já foram testadas e verificadas quanto à segurança.

## Novidades para mim em relação ao conteúdo do artigo
 - Linguagens de programação
  
    Em relação ao tópico que diz respeito à importância na escolha da linguagem de programação
    para cada projeto, não sabia que API's, frameworks e o paradigma orientado a objetos
    influenciavam tanto no desempenho e consumiam tanto recurso computacional.

 - Documentação

    Quanto à documentação do código, não conhecia o uso de comentários com tags XML e
    ferramentas que geram uma documentação a partir desse tipo de comentário.

  ## O que eu já conhecia
 - Linguagens de programação

   Deste tópico eu já tinha conhecimento sobre a importância de analisar e escolher
   a linguagem de programação adequada para cada tipo de projeto, sobre a peculiaridade
   das linguagens C# e Java na hora de compilar o código e sobre algumas diferenças de
   desempenho.

- Documentação
 
   Conhecia a importância de ter um código/projeto bem documentado, os benefícios
   dessa prática, bem como os principais métodos, como a utilização de diagramas,
   a linguagem UML, comentários no próprio código fonte, conceitos como documentação
   externa e interna, etc.

- Código legível
  
  As práticas para um bom código legível, como indentação, definição de regras para
  projetos feitos em equipe e uso de identificadores facilmente identificáveis.

- Reaproveitamento de código
  
  Sabia que essa é uma prática bastante utilizada nos dias de hoje, com a quantidade
  de códigos, funções e problemas que já foram resolvidos e estão disponíveis na
  internet, em comunidades e afins.

- Testes

  Tinha noção em relação à importância dos testes, aos tipos de testes que geralmente
  são feitos e pra que cada um deles serve.

- Segurança

  Técnicas utilizadas para garantir maior segurança no código, como as mais atuais
  (blocos try/catch) e as antigas também (uso de if/else), além das API's, bem como
  a boa organização e documentação do código.

## Conclusão
Esse artigo foi muito bem escrito, e, mesmo que apresente um conteúdo mais básico,
é bem importante e pontua tópicos bastante relevantes no que tange à qualidade de
código e software. Apresenta bons exemplos e práticas, além de contextualizar
com o mercado e as linguagens de programação atuais. À partir da leitura desse artigo
é possível compreender melhor o que é e como desenvolver um código ou projeto de 
software com maior qualidade.









