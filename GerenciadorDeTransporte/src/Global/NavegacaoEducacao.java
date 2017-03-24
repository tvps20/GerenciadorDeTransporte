package Global;

import Cadastros.Aluno;
import Interfaces.INavegacaoEducacao;
import Menus.CriarAluno;

public class NavegacaoEducacao extends Navegacao implements INavegacaoEducacao
{
   @Override
    public Aluno irParaCadastrarAluno() 
    {
        CriarAluno novoAluno = new CriarAluno(new Aluno());
        novoAluno.pegarInformacao();
        
        return novoAluno.getAluno();
    }

    @Override
    public String irParaCadastrarViagem() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String irParaVerAlunos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String irParaVerViagens() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }        
}
