package GerenciarTransporte.Cadastros;

public class Paciente extends Pessoa
{
    private String Hospital;

    public String getDestino() {
        return Hospital;
    }

    public void setDestino(String Hospital) {
        this.Hospital = Hospital;
    }
}
