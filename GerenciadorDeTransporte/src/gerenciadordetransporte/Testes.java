package gerenciadordetransporte;

import java.util.Scanner;
import java.util.Stack;

public class Testes {
    
    public static void main(String[] args) {
        
        boolean loop = true;
        Stack pilha = new Stack();
        Menu menu = new Menu();
        pilha.add(menu);
        
        do
        {
            Scanner entrada = new Scanner(System.in);        
            int escolha = entrada.nextInt();   
            
            switch(escolha)
            {
                case 1:              
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

            
        }while(loop);
    }    
}
