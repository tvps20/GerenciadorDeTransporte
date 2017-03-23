package Menus;

public class MenuTransporte extends Menu
{

    @Override
    protected void print() {
        System.out.println("======= Gerenciar Transporte =======");
        System.out.println("1 - Cadastrar Motorista");
        System.out.println("2 - Cadastrar Veículo");
        System.out.println("3 - Ver Motoristas");
        System.out.println("2 - Ver Viculos");
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
