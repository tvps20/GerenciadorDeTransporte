package GerenciarTransporte.Interfaces;

import GerenciarTransporte.Cadastros.Viagem;

public interface ISaude 
{ 
    public void AdicionarPaciente();
    
    public void MostarPacientes();
    
    public void AdicionarViagemSaude();
    
    public void MostrarViagensSaude();  
    
    public void ApagarDadosSaude();
    
    public void RemoverPaciente();
    
    public void RemoverViagem();
}
