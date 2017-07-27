package GerenciarTransporte;

import static GerenciarTransporte.GlobalTabelaDeHorarios.*;
import Interfaces.IEducacao;
import Interfaces.ISaude;
import Interfaces.ITransporte;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RodarPrograma 
{
    static Menu menu = new Menu();
    static IEducacao educacao = new GlobalEducacao();
    static ISaude saude = new GlobalSaude();
    static ITransporte transporte = new GlobalTransporte();
    
    public static void chamarMenuEducacao()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println();
        menu.menuDeEducacao();        
        int escolha = entrada.nextInt();      
        
        switch(escolha)
        {
            case 1:
                educacao.AdicionarAluno();
                break;
            case 2:
                educacao.AdicionarViagemEducacao();
                break;
            case 3:
                educacao.MostrarAlunos();
                break;
            case 4:
                educacao.MostrarViagensEducacao();
                break;
            case 5:
                educacao.RemoverAluno();
                break;
            default:
                break;
        }      
    }
    
    public static void chamarMenuSaude()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println();
        menu.menuDeSaude();        
        int escolha = entrada.nextInt();      
        
        switch(escolha)
        {
            case 1:
                saude.AdicionarPaciente();
                break;
            case 2:
                saude.AdicionarViagemSaude();
                break;
            case 3:
                saude.MostarPacientes();
                break;
            case 4:
                saude.MostrarViagensSaude();
                break;
            default:
                break;
        }      
    }
    
    public static void chamarMenuTransporte()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println();
        menu.menuDeTransporte();        
        int escolha = entrada.nextInt();      
        
        switch(escolha)
        {
            case 1:
                transporte.AdicionarMotorista();
                break;
            case 2:
                transporte.AdicionarVeiculo();
                break;
            case 3:
                transporte.MostarMotoristas();
                break;
            case 4:
                transporte.MostrarVeiculos();
                break;   
            default:
                break;
        }      
    }
    
    public static void TabelaDeHorario()
    {
        menu.TabelaDeHorarios();
        MostarTabelaDeHorarios();       
    }
    
    public static void main(String[] args) throws Exception 
    {  
        boolean loop = true;
        //Garantindo que o loop acontece pelo menos uma vez, por isso o uso do doWhile.
        do
        {
            //Tratar os erros de digitação que sejam diferentes de inteiros.
            try
            {
                //Instanciando a classe Scanner para capturar a entrada informada pelo usuario.
                Scanner entrada = new Scanner(System.in);
                //Chamando o menu principal e salvando a entrada do usuario.
                menu.menuPrincipal();
                int escolha = entrada.nextInt();
                //Usando o switch para chamar os metodos referentes a escolha solicitada.
                switch(escolha)
                {
                    case 1:
                        chamarMenuEducacao();
                        break;
                    case 2:
                        chamarMenuSaude();
                        break;
                    case 3:
                        chamarMenuTransporte();
                        break;
                    case 4:
                        TabelaDeHorario();
                        break;
                    case 5:
                        educacao.ApagardadosEducacao();
                        saude.ApagarDadosSaude();
                        System.out.println("Semana fechada. Viagens Finalizadas");
                        System.out.println();
                        break;
                    case 6:
                        loop = false;
                        break;
                    default:
                        //Informando ao usuário que sua escolha é inválida.
                        System.out.println("Opção Inválida!");
                        System.out.println();
                }
            }
            catch(InputMismatchException e)
            {
               //Informando ao usuário que sua escolha é inválida.
               System.out.println("Digite uma opção válida"); 
               System.out.println();
               //throw new Exception("Digite uma opção válida");
            }
            
        }while(loop);
    }   
}
