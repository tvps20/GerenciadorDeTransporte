package Global;

import Interfaces.*;

public class Fabrica 
{
    public static INavegacao getNavegacao()
    {
        return new Navegacao();
    }
    
    public static INavegacaoEducacao getNavegacaoEducacao()
    {
        return new NavegacaoEducacao();
    }
    
    public static INavegacaoSaude getNavegacaoSaude()
    {
        return new NavegacaoSaude();
    }
    
    public static INavegacaoTransporte getNavegacaoTransporte()
    {
        return new NavegacaoTransporte();
    }
}
