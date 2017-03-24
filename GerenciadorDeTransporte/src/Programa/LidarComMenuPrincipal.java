package Programa;

import Interfaces.*;

public class LidarComMenuPrincipal extends LidarComMenu 
{

    public LidarComMenuPrincipal(int _escolha, INavegacao navegacao) {
        super(_escolha, navegacao);
    }
    
    public void gerenciar()
    {      
        switch(this.escolha)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    protected INavegacaoEducacao getNavegacaoEducacao()
    {
        return (INavegacaoEducacao)this.navegar;
    }
}
