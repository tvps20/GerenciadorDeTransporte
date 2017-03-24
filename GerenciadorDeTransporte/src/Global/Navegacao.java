package Global;

import Interfaces.IMenu;
import Interfaces.INavegacao;
import Menus.*;

public class Navegacao implements INavegacao
{
    @Override
    public int irParaMenuPrincipal() 
    {
        MenuPrincipal menu = new MenuPrincipal();
        Pilha.empilhar(menu);
        
        return menu.mostrar();     
    }
    
    @Override
    public int irParaEducacao() 
    {
        MenuEducacao menu = new MenuEducacao();
        Pilha.empilhar(menu);
        
        return menu.mostrar();
    }

    @Override
    public int irParaSaude() 
    {
        MenuSaude menu = new MenuSaude();
        Pilha.empilhar(menu);
        
        return menu.mostrar();
    }

    @Override
    public int irParaTransporte() {
        MenuTransporte menu = new MenuTransporte();
        Pilha.empilhar(menu);
        
        return menu.mostrar();
    }    

    @Override
    public int isParaTabelaDeHorario() {
        MenuTabelaDeHorario menu = new MenuTabelaDeHorario();
        Pilha.empilhar(menu);
        
        return menu.mostrar();       
    }
    
    @Override
    public IMenu voltar() {
        return Pilha.desempilha();
    } 
}
