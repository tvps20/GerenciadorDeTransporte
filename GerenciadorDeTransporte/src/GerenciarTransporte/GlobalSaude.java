package GerenciarTransporte;

import GerenciarTransporte.Cadastros.Paciente;
import GerenciarTransporte.Cadastros.Viagem;
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
        System.out.println("Destino: ");
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
            System.out.println("Nenhum Paciente Encontrado.");
        
        System.out.println();
    }
}
