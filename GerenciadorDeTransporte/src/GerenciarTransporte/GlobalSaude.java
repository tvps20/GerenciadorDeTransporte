package GerenciarTransporte;

import GerenciarTransporte.Cadastros.Paciente;
import GerenciarTransporte.Cadastros.Viagem;
import static GerenciarTransporte.GlobalViagens.*;
import GerenciarTransporte.Interfaces.ISaude;
import java.util.LinkedList;
import java.util.Scanner;


public class GlobalSaude implements ISaude
{
    private static final Scanner pegaEntrada = new Scanner(System.in);
    private static final LinkedList<Paciente> listaDePacientes = new LinkedList();
    private static final LinkedList<Viagem> listaDeViagens = new LinkedList();
    
    @Override
    public void AdicionarPaciente()
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
    
    @Override
    public void MostarPacientes()
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
    
    @Override
    public void AdicionarViagemSaude()
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
    
    private Paciente AcharPaciente(String nome)
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
    
    @Override
    public void MostrarViagensSaude()
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
    
    public static Viagem[] ViagensSaude()
    {
        Viagem[] array = new Viagem[listaDeViagens.size()];
        Viagem[] viagens = listaDeViagens.toArray(array);
        
        return viagens;
    }
    
    @Override
    public void ApagarDadosSaude()
    {
        listaDeViagens.clear();
    }
    
    private boolean ApagarPaciente(String nome)
    {
        for(int i=0; i<listaDePacientes.size(); i++)
        {
            if(listaDePacientes.get(i).getNome().equals(nome))
            {
                listaDePacientes.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void RemoverPaciente()
    {
        System.out.println("Digite o nome do Paciente: ");
        String entrada = pegaEntrada.nextLine();
        if(ApagarPaciente(entrada))
            System.out.println("Paciente Removido");
        else
            System.out.println("Paceinte não Cadastrado!");
    }
    
    
    private boolean ApagarViagem(String paciente)
    {
        for(int i=0; i<listaDeViagens.size(); i++)
        {
            if(listaDeViagens.get(i).getPaciente().getNome().equals(paciente))
            {
                listaDeViagens.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void RemoverViagem()
    {
        System.out.println("Paciente: ");
        String entrada = pegaEntrada.nextLine();
        if(ApagarViagem(entrada))
            System.out.println("Destino Removido");
        else
            System.out.println("Destino não cadastrado!");
    }
}
