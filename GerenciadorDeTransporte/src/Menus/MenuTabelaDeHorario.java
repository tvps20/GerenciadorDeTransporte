package Menus;

public class MenuTabelaDeHorario extends Menu
{

    @Override
    protected void print() {
        System.out.println("======= Tabela de Horario =======");       
    }
    
    @Override
    public int mostrar()
    {
        print();
        return super.mostrar();
    }
}
