package Menus;

public class MenuEducacao extends Menu
{

    @Override
    protected void print() {
        System.out.println("======= Gerenciar Educação =======");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Viagem");
        System.out.println("3 - Ver Alunos");
        System.out.println("4 - Ver Viagens");
        System.out.println("5 - Voltar");
        System.out.println();
        System.out.println("Digite sua Escolha: "); 
    }

    @Override
    public int mostrar() 
    {
        print();
        return super.mostrar(); //pega a entrada
    }
    
}
