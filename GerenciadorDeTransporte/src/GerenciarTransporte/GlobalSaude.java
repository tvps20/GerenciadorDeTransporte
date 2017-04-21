package GerenciarTransporte;

import GerenciarTransporte.Cadastros.Paciente;
import GerenciarTransporte.Cadastros.Viagem;
import static GerenciarTransporte.GlobalViagens.*;
import java.util.LinkedList;
import java.util.Scanner;


public class GlobalSaude 
{
    private static Scanner pegaEntrada = new Scanner(System.in);
    private static LinkedList<Paciente> listaDePacientes = new LinkedList();
    private static LinkedList<Viagem> listaDeViagens = new LinkedList();
    
    public static void AdicionarPaciente()
    {
        Paciente novoPaciente = new Paciente();
        System.out.println("Nome: ");
        String entrada = pegaEntrada.nextLine();
        novoPaciente.setNome(entrada);
        System.out.println("Hospital: ");
        entrada = pegaEntrada.nextLine();
        novoPaciente.setDestino(entrada);
        listaDePacientes.add(novoPaciente);
        System.out.println("Paciente Adicionado");
        System.out.println();
    }
    
    public static void MostarPacientes()
    {
        Paciente[] array = new Paciente[listaDePacientes.size()];
        Paciente[] pacientes = listaDePacientes.toArray(array);
        System.out.println("======= Pacientes Cadastrados =======");
        
        if(pacientes.length > 0)
        {
            for(Paciente atual: pacientes)
                System.out.println(atual.getNome() + " => " + atual.getDestino());
        }
        else
            System.out.println("Nenhum Paciente Cadastrado.");
        
        System.out.println();
    }
    
    public static void AdicionarViagemSaude()
    {
        Viagem novaViagem = new Viagem();
        System.out.println("Destino: ");
        String entrada = pegaEntrada.nextLine();
        novaViagem.setDestino(entrada);
        System.out.println("Horario: ");
        entrada = pegaEntrada.nextLine();
        novaViagem.setHorario(entrada);
        System.out.println("Turno: ");
        entrada = pegaEntrada.nextLine();
        novaViagem.setTurno(entrada);
        EscolherDia(novaViagem);
        System.out.println("Paciente: ");
        entrada = pegaEntrada.nextLine();
        Paciente existe = AcharPaciente(entrada);
        if(existe != null)
        {
            novaViagem.setPaciente(existe);
            System.out.println("Acompanhante: ");
            entrada = pegaEntrada.nextLine();
            novaViagem.setAcompanhante(entrada);
            listaDeViagens.add(novaViagem);
            System.out.println("Viagem Adicionada");
            System.out.println();
        }
        else
        {
            System.out.println();
            System.out.println("Paciente ainda não foi cadastrado!");
            System.out.println();
        }
        
    }
    
    private static Paciente AcharPaciente(String nome)
    {
        Paciente[] array = new Paciente[listaDePacientes.size()];
        Paciente[] pacientes = listaDePacientes.toArray(array);
        
        if(pacientes.length > 0)
        {
            for(Paciente atual: pacientes)
            {
                if(atual.getNome().equals(nome))
                    return atual;
            }
        }        
        return null;
    }
    
    public static void MostrarViagensSaude()
    {
        Viagem[] array = new Viagem[listaDeViagens.size()];
        Viagem[] viagens = listaDeViagens.toArray(array);
        System.out.println("======= Viagens Cadastradas =======");
        
        if(viagens.length > 0)
        {
            for(Viagem atual: viagens)
            {
                System.out.println("Destino: " + atual.getDestino());
                System.out.println("Dia: " + atual.getDias()+ " => " + atual.getHorario() + " => " + atual.getTurno()); 
                System.out.println("Paciente: " + atual.getPaciente().getNome()); 
                System.out.println("Acompanhante: " + atual.getAcompanhante());
                System.out.println();
            }
        }
        else
            System.out.println("Nenhuma Viagem Cadastrada");
        
        System.out.println();
    }
}
