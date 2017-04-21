package GerenciarTransporte;

import GerenciarTransporte.Cadastros.Viagem;
import GerenciarTransporte.Enumeracao.Dias;
import java.util.Scanner;

public class GlobalViagens 
{
    private static Scanner pegaEntrada = new Scanner(System.in);
    
    public static void EscolherDia(Viagem _novaViagem)
    {
        System.out.println("Escola o dia");
        System.out.println("1-SEG, 2-TER, 3-QUA, 4-QUI, 5-SEX, 6-SAB, 7-DOM");
        int entrada = pegaEntrada.nextInt();
        switch(entrada)
        {
            case 1:
                _novaViagem.setDias(Dias.SEG);
                break;
            case 2:
                _novaViagem.setDias(Dias.TER);
                break;
            case 3:
                _novaViagem.setDias(Dias.QUA);
                break;
            case 4:
                _novaViagem.setDias(Dias.QUI);
                break;
            case 5:
                _novaViagem.setDias(Dias.SEX);
                break;
            case 6:
                _novaViagem.setDias(Dias.SAB);
                break;
            case 7:
                _novaViagem.setDias(Dias.DOM);
                break;
            default:
                System.out.println("Escolha Invalida");
                EscolherDia(_novaViagem);
                break;
        }
        
    }
}
