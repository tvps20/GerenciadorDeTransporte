package gerenciadordetransporte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RodarPrograma 
{
    static Menu menu = new Menu();
    
    public static void chamarMenuCadastro()
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println();
        menu.menuDeCadastro();
        int escolha = entrada.nextInt();      
        
        switch(escolha)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        
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
                        chamarMenuCadastro();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
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
