package GerenciarTransporte.Cadastros;

public class Motorista extends Pessoa
{
    private String setor; //setor de viagens que esta responsavel

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
