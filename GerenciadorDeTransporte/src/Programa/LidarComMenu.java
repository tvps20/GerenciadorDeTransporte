package Programa;

import Global.Navegacao;
import Interfaces.INavegacao;

public abstract class LidarComMenu 
{
    INavegacao navegar = new Navegacao();
    int escolha;
    
    public LidarComMenu(int _escolha)
    {
        escolha = this.escolha;
    }
}
