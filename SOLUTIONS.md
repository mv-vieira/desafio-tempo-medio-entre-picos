# Desafio: Tempo Médio entre Picos

## • Implementação da solução

## Método `main`:

Este é o método principal do programa, onde a execução começa. Ele realiza as seguintes tarefas:

1. Imprime uma mensagem indicando que os dados estão sendo informados.
2. Cria um objeto `File` representando o arquivo "dados.txt".
3. Utiliza o método `lerDados` para ler os dados do arquivo e armazená-los em um array de inteiros chamado `dados`.
4. Itera sobre o array `dados` e imprime cada elemento na saída padrão.
5. Imprime uma mensagem indicando que os picos verdadeiros estão sendo mostrados.
6. Utiliza o método `encontrarPicos` para encontrar os picos nos dados e armazena-os em um array chamado `picos`.
7. Itera sobre o array `picos` e imprime cada pico na saída padrão, junto com seu número de ocorrência.
8. Imprime uma mensagem indicando que o tempo médio entre os picos está sendo calculado.
9. Utiliza o método `calcularTempoMedioPicos` para calcular o tempo médio entre os picos e o armazena em um objeto `LocalTime`.
10. Imprime o tempo médio formatado na saída padrão.

## Método `lerDados`:

Este método é responsável por ler os dados de um arquivo `.txt` e retorná-los como um array de inteiros. Ele realiza as seguintes tarefas:

1. Cria uma lista de inteiros chamada `dados`.
2. Tenta abrir um `Scanner` para o arquivo fornecido.
3. Itera sobre o arquivo e adiciona cada número lido à lista `dados`.
4. Converte a lista `dados` em um array de inteiros e retorna-o.
5. Se ocorrer um erro de `FileNotFoundException`, lança uma exceção indicando que houve um erro ao ler o arquivo.

## Método `encontrarPicos`:

Este método é responsável por encontrar os picos nos dados fornecidos e retorná-los como um array de inteiros. Ele realiza as seguintes tarefas:

1. Cria uma lista de inteiros chamada `picos`.
2. Itera sobre os dados fornecidos.
3. Verifica se o valor atual é um pico válido de acordo com a condição estabelecida.
4. Se for um pico válido, adiciona-o à lista `picos`.
5. Converte a lista `picos` em um array de inteiros e retorna-o.

## Método `calcularTempoMedioPicos`:

Este método é responsável por calcular o tempo médio entre os picos nos dados fornecidos e retorná-lo como um objeto `LocalTime`. Ele realiza as seguintes tarefas:

1. Inicializa variáveis para armazenar a soma das diferenças entre picos e o total de picos encontrados.
2. Itera sobre os dados e verifica se cada elemento é um pico válido.
3. Calcula a soma das diferenças entre picos e o total de picos encontrados.
4. Calcula o tempo médio em segundos e o converte para um objeto `LocalTime`.
5. Retorna o tempo médio como um objeto `LocalTime`.

## Método `formatarTempo`:

Este método é responsável por formatar um objeto `LocalTime` no formato "mm:ss" e retorná-lo como uma string. Ele realiza as seguintes tarefas:

1. Cria um objeto `DateTimeFormatter` para o formato "mm:ss".
2. Formata o objeto `LocalTime` fornecido de acordo com o formato especificado.
3. Retorna o tempo formatado como uma string.


## • Gerenciamento de Dados

Foi criado um arquivo chamado "dados.txt" com cerca de 59 números para simular os dados de um gráfico e validar as implementações da aplicação.

![teste](https://github.com/mv-vieira/desafio-tempo-medio-entre-picos/assets/107760543/cfbc9c58-d788-4b0f-927c-73c0d5f4a208)

E a saída dos dados referente ao arquivo.

![teste2](https://github.com/mv-vieira/desafio-tempo-medio-entre-picos/assets/107760543/567c4c2e-3e28-4e82-9bb9-5a20170a3ad3)

## • Dificuldades de dúvidas

Compreender a dificuldade do desafio que foi proposto e encontrar uma forma mais simples e efetiva de realizar o problema.

## • Meios para executar a aplicação

Para executar este código, é necessário ter o ambiente de desenvolvimento Java (JDK) instalado em sua máquina.



