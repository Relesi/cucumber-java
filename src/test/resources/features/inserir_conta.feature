#language: pt
@funcionais
Funcionalidade: Cadastro de contas

Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Contexto:
Dado que estou acessando a aplicação
Quando informo o usuário "rock@rock"
E a senha "rock"
E seleciono entrar
Então visualizo a página inicial
Quando seleciono Contas
E seleciono Adicionar

Cenário: Deve inserir uma conta com sucesso
E informo a conta "Contas de Teste1"
E seleciono Salvar
Então a conta é inserida com sucesso

Cenário: Não deve inserir uma conta sem nome
E seleciono Salvar
Então sou notificado que o nome da conta é obrigatório

Cenário: Não deve inserir uma conta com nome já existente
E informo a conta "Conta mesmo nome"
E seleciono Salvar
Então sou notificado que já existe uma conta com esse nome 