
import Global.Navegacao;
import Programa.LidarComMenuPrincipal;

public class RodarPrograma 
{
    public static void main(String[] args)
    {
       Navegacao navegar = new Navegacao();
       int escolha = 0;
       
       escolha = navegar.irParaMenuPrincipal();
       //LidarComMenuPrincipal menu = new LidarComMenuPrincipal(escolha);      
       //Que o programa foi finalizado
    }
}
