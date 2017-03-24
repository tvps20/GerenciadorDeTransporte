package Menus;

import Cadastros.Aluno;
import java.util.Scanner;

public class CriarAluno 
{
    private Aluno aluno;
    Scanner entrada = new Scanner(System.in);
    
    public CriarAluno(Aluno aluno)
    {
        this.aluno = aluno;
    }
    
    public void pegarInformacao()
    {        
        System.out.println("======= Informações =======");
        System.out.println("Nome: ");
        String texto = entrada.nextLine();
        aluno.setNome(texto);
        System.out.println("Instituicao de Ensino: ");
        texto = entrada.nextLine();
        aluno.setInstituicao(texto);    
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
