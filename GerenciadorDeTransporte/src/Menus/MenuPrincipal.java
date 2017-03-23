package Menus;

public class MenuPrincipal extends Menu 
{
    @Override
    protected void print() 
    {
        System.out.println("======= Menu Principal =======");
        System.out.println("1 - Gerenciar Educação");
        System.out.println("2 - Gerenciar Saude");
        System.out.println("3 - Gerenciar Transporte");
        System.out.println("3 - Tabela de Horarios");
        System.out.println("4 - Sair");
        System.out.println();
        System.out.println("Digite sua Escolha: ");
    }

    @Override
    public int mostrar() 
    {  
        print();
        return super.mostrar(); //Pega a entrada
    }
}
