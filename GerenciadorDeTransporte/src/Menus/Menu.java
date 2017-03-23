package Menus;

import Interfaces.IMenu;
import java.util.Scanner;

public abstract class Menu implements IMenu
{
    @Override
    public int mostrar()
    {  
        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();       
        return escolha;
    }
    
    protected abstract void print();
    
    protected void tratar() 
    {
        //tratar entrada
    }
    
    
    
}
