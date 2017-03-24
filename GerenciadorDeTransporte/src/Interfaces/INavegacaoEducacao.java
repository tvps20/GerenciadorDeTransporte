package Interfaces;

import Cadastros.Aluno;

public interface INavegacaoEducacao extends INavegacao
{
    public Aluno irParaCadastrarAluno();
    
    public String irParaCadastrarViagem();
    
    public String irParaVerAlunos();
    
    public String irParaVerViagens();
}
