package GerenciarTransporte.Cadastros;

public class Paciente 
{
    private String Nome;
    private String Hospital;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDestino() {
        return Hospital;
    }

    public void setDestino(String Hospital) {
        this.Hospital = Hospital;
    }
}
