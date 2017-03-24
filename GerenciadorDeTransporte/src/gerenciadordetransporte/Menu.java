package gerenciadordetransporte;

public class Menu 
{      
    public void menuPrincipal()
    {
        System.out.println("======= Menu Principal =======");
        System.out.println("1 - Gerenciar Educacao");
        System.out.println("2 - Gerenciar Saude");
        System.out.println("3 - Gerenciar Transporte");
        System.out.println("4 - Tabela De Horarios");
        System.out.println("5 - Sair");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }
    
    public void menuDeEducacao()
    {
        System.out.println("======= Gerenciar Educacao =======");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Viagem");
        System.out.println("3 - Ver Alunos");
        System.out.println("4 - Ver Viagens");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }
    
    public void menuDeSaude()
    {
        System.out.println("======= Gerenciar Saude =======");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Cadastrar Viagem");
        System.out.println("3 - Ver Pacientes");
        System.out.println("4 - Ver Alunos");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }
    
    public void menuDeTransporte()
    {
        System.out.println("======= Gerenciar Transporte =======");
        System.out.println("1 - Cadastrar Motorista");
        System.out.println("2 - Cadastrar Veiculos");
        System.out.println("3 - Ver Motoristas");
        System.out.println("4 - Ver Veículos");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }
    
    public void TabelaDeHorarios()
    {
        System.out.println("======= Tabela de Horarios =======");
        System.out.println();
    }
    
}
