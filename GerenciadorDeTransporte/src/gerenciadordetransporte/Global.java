package gerenciadordetransporte;

import gerenciadordetransporte.Cadastros.Viagem;
import gerenciadordetransporte.Cadastros.Aluno;
import java.util.LinkedList;
import java.util.Scanner;


public class Global 
{
    private static Scanner pegaEntrada = new Scanner(System.in);
    private static LinkedList<Aluno> listaDeAlunos = new LinkedList(); 
    private static LinkedList<Viagem> listaDeViagens = new LinkedList();
    
 
    public static void AdicionarAluno()
    {
        Aluno novoAluno = new Aluno();
        System.out.println("Nome: ");
        String entrada = pegaEntrada.nextLine();
        novoAluno.setNome(entrada);
        System.out.println("Instituição: ");
        entrada = pegaEntrada.nextLine();
        novoAluno.setInstituicao(entrada);
        listaDeAlunos.add(novoAluno);
        System.out.println("Aluno Adicionado");
        System.out.println();
    }
    
    public static void MostrarAlunos()
    {
        Aluno[] array = new Aluno[listaDeAlunos.size()];
        Aluno[] alunos = listaDeAlunos.toArray(array);
        System.out.println("======= Alunos Cadastrados =======");
        
        if(alunos.length > 0)
        {
            for(Aluno atual: alunos)
                System.out.println(atual.getNome() + " => " + atual.getInstituicao());
        }
        else
            System.out.println("Nenhum Aluno Cadastrado");
        
        System.out.println();
        
    }
    
    public static void AdicionarViagem()
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
        listaDeViagens.add(novaViagem);
        System.out.println("Viagem Adicionada");
        System.out.println();
        
    }
    
    public static void MostrarViagens()
    {
        Viagem[] array = new Viagem[listaDeViagens.size()];
        Viagem[] viagens = listaDeViagens.toArray(array);
        System.out.println("======= Viagens Cadastradas =======");
        
        if(viagens.length > 0)
        {
            for(Viagem atual: viagens)
                System.out.println(atual.getDestino() + " => " + atual.getHorario() + " => " + atual.getTurno());
        }
        else
            System.out.println("Nenhuma Viagem Cadastrada");
        
        System.out.println();
    }
}
