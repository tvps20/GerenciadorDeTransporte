package Programa;

import Interfaces.INavegacao;

public abstract class LidarComMenu 
{
    protected final INavegacao navegar;
    protected int escolha;
    
    public LidarComMenu(int _escolha, INavegacao navegacao)
    {
        escolha = _escolha;
        navegar = navegacao;
    }
}
