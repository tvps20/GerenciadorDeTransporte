package gerenciadordetransporte;

import static java.awt.SystemColor.menu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RodarPrograma 
{
    static Menu menu = new Menu();
    
    public static void main(String[] args) 
    {  
        boolean loop = true;
        
        do
        {
            try
            {
                Scanner entrada = new Scanner(System.in);
                
                menu.menuPrincipal();
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
                        loop = false;
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        System.out.println();
                }
            }
            catch(InputMismatchException e)
            {
               System.out.println("Digite uma opção válida"); 
               System.out.println();
            }
            
        }while(loop);
    }   
}
