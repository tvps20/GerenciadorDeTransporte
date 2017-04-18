package gerenciadordetransporte.Cadastros;

public class Viagem 
{
    private String Destino;
    private String Turno;
    private double horario;


    public String getDestino() {
        return Destino;
    }


    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    
    public String getTurno() {
        return Turno;
    }


    public void setTurno(String Turno) {
        this.Turno = Turno;
    }


    public double getHorario() {
        return horario;
    }


    public void setHorario(double horario) {
        this.horario = horario;
    }
}
