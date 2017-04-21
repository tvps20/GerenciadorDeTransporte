package GerenciarTransporte;

import GerenciarTransporte.Cadastros.Viagem;
import GerenciarTransporte.Enumeracao.Dias;
import static GerenciarTransporte.GlobalEducacao.*;
import static GerenciarTransporte.GlobalSaude.*;

public class GlobalTabelaDeHorarios 
{    
    public static void MostarTabelaDeHorarios()
    {
        Viagem[] educacao = ViagensEducacao();
        Viagem[] saude = ViagensSaude();
        
        if((educacao.length > 0) && (saude.length > 0))
        {
            System.out.println("#### Educacao ####");
            for(Viagem atual: educacao)
                System.out.println(atual.getDestino() + " => " + atual.getDias() +" => " + atual.getHorario() 
                        + " => " + atual.getTurno());
            System.out.println();
            System.out.println("#### Saude ####");
            for(Viagem atual: saude)
            {
                System.out.println("Destino: " + atual.getDestino());
                System.out.println("Dia: " + atual.getDias()+ " => " + atual.getHorario() + " => " + atual.getTurno()); 
                System.out.println("Paciente: " + atual.getPaciente().getNome()); 
                System.out.println("Acompanhante: " + atual.getAcompanhante());
                System.out.println();
            }
            System.out.println();
        }
        else
            System.out.println("Nenhuma viagem cadastrada.");
        
        System.out.println();     
    }    
}
