package gerenciadordetransporte;

public class Menu 
{
    public void menuPrincipal()
    {
        System.out.println("======= Menu Principal =======");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Ver Casdatros");
        System.out.println("3 - Tabela de Horarios da semana");
        System.out.println("4 - Sair");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }
    
    public void menuDeCadastro()
    {
        System.out.println("======= Cadastrar =======");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Paciente");
        System.out.println("3 - Cadastrar Motorista");
        System.out.println("5 - Cadastrar Veículo");
        System.out.println("6 - Voltar");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }
    
    public void menuDeExibicao()
    {
        System.out.println("======= Ver Cadastros =======");
        System.out.println("1 - Alunos");
        System.out.println("2 - Pacientes");
        System.out.println("3 - Motoristas");
        System.out.println("5 - Veículos");
        System.out.println("6 - Voltar");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }
    
}
