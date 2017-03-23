package Global;

import Interfaces.IMenu;
import java.util.Stack;

public class Pilha 
{
    private static final Stack<IMenu> menus = new Stack<IMenu>();
    
    public static void empilhar(IMenu _menu)
    {
        menus.push(_menu);       
    }
    
    public static IMenu desempilha()
    {
        return menus.pop();
    }
}
