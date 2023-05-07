# Simulador de conta bancária

Esse é um programa em Java que simula as funcionalidades de uma conta bancária. Ele permite que o usuário interaja com a conta através de um menu que oferece as opções de depositar, sacar, transferir, verificar o saldo e sair.

Funcionalidades da conta
A conta é representada pela classe "Account", que define os seguintes atributos e métodos:

Atributos:
cardholderName: String que armazena o nome do titular da conta
accountId: int que armazena o número da conta
balance: float que armazena o saldo da conta
Métodos:
deposit(float value): Método que recebe um valor float e deposita na conta, atualizando o saldo. Retorna o saldo atualizado.

withdraw(float value): Método que recebe um valor float e saca da conta, atualizando o saldo. Retorna o saldo atualizado.

transfer(float value): Método que recebe um valor float e transfere para outra conta, atualizando o saldo. Retorna o saldo atualizado.

balance(): Método que retorna o saldo atual da conta.

Funcionalidades do programa
O programa principal é representado pela classe "Acc", que apresenta o menu de opções e chama os métodos da classe Account de acordo com a escolha do usuário. O menu apresenta as seguintes opções:

DEPOSIT: Permite ao usuário depositar um valor na conta, atualizando o saldo.

WITHDRAW: Permite ao usuário sacar um valor da conta, atualizando o saldo. Se o valor sacado for maior do que o saldo disponível na conta, o programa informa que não há saldo suficiente.

TRANSFER: Permite ao usuário transferir um valor para outra conta, atualizando o saldo. Se o valor transferido for maior do que o saldo disponível na conta, o programa informa que não há saldo suficiente.

CHECK BALANCE: Permite ao usuário verificar o saldo atual da conta.

GET OUT: Encerra o programa.

Utilização
Para utilizar o programa, basta compilar o código fonte e executar o arquivo .class gerado. O programa irá apresentar o menu de opções e aguardar a escolha do usuário. O programa irá continuar executando até que o usuário escolha a opção "GET OUT".
