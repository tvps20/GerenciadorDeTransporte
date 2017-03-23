package Menus;

public class MenuSaude extends Menu
{

    @Override
    protected void print() {
        System.out.println("======= Gerenciar Saude =======");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Cadastrar Viagem");
        System.out.println("3 - Ver Pacientes");
        System.out.println("2 - Ver Viagens");
        System.out.println("4 - Voltar");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }

    @Override
    public int mostrar()
    {
        print();
        return super.mostrar();
    }
    
}
