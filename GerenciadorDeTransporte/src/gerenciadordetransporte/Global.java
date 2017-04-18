package gerenciadordetransporte;

import gerenciadordetransporte.Cadastros.Viagem;
import gerenciadordetransporte.Cadastros.Aluno;
import java.util.LinkedList;
import java.util.Scanner;


public class Global 
{
    private static Scanner pegaEntrada = new Scanner(System.in);
    private static LinkedList<Aluno> listaDeAlunos = new LinkedList(); 
    private static LinkedList<Viagem> ListaDeViagens = new LinkedList();
    
 
    public static void AdicionarAluno()
    {
        Aluno novoAluno = new Aluno();
        System.out.println("Digite o nome do Aluno: ");
        String entrada = pegaEntrada.nextLine();
        novoAluno.setNome(entrada);
        System.out.println("Digite a Instituição: ");
        entrada = pegaEntrada.nextLine();
        novoAluno.setInstituicao(entrada);
        System.out.println("Aluno Adicionado");
    }
    
}
