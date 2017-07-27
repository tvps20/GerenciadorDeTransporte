package GerenciarTransporte;

import GerenciarTransporte.Cadastros.Motorista;
import GerenciarTransporte.Cadastros.Veiculo;
import GerenciarTransporte.Interfaces.ITransporte;
import java.util.LinkedList;
import java.util.Scanner;

public class GlobalTransporte implements ITransporte
{
    private static final Scanner pegaEntrada = new Scanner(System.in);
    private static final LinkedList<Motorista> listaDeMotoristas = new LinkedList();
    private static final LinkedList<Veiculo> listaDeVeiculos = new LinkedList();
    
    @Override
    public void AdicionarMotorista()
    {
        Motorista novoMotorista = new Motorista();
        System.out.println("Nome: ");
        String entrada = pegaEntrada.nextLine();
        novoMotorista.setNome(entrada);
        System.out.println("Setor de Trabalho: ");
        entrada = pegaEntrada.nextLine();
        novoMotorista.setSetor(entrada);
        listaDeMotoristas.add(novoMotorista);
        System.out.println("Motorista Adicionado");
        System.out.println();
    }
    
    @Override
    public void MostarMotoristas()
    {
        Motorista[] array = new Motorista[listaDeMotoristas.size()];
        Motorista[] motoristas = listaDeMotoristas.toArray(array);
        System.out.println("======= Motoristas Cadastrados =======");
        
        if(motoristas.length > 0)
        {
            for(Motorista atual: motoristas)
                System.out.println(atual.getNome() + " => " + atual.getSetor());
        }
        else
            System.out.println("Nenhum Motorista Cadastrado.");
        
        System.out.println();      
    }
    
    @Override
    public void AdicionarVeiculo()
    {
        Veiculo novoVeiculo = new Veiculo();
        System.out.println("Modelo: ");
        String entrada = pegaEntrada.nextLine();
        novoVeiculo.setModelo(entrada);
        System.out.println("Placa: ");
        entrada = pegaEntrada.nextLine();
        novoVeiculo.setPlaca(entrada);
        listaDeVeiculos.add(novoVeiculo);
        System.out.println("Veiculo Adicionado");
        System.out.println();
    }
    
    @Override
    public void MostrarVeiculos()
    {
        Veiculo[] array = new Veiculo[listaDeVeiculos.size()];
        Veiculo[] veiculos = listaDeVeiculos.toArray(array);
        System.out.println("======= Veículos Cadastrados =======");
        
        if(veiculos.length > 0)
        {
            for(Veiculo atual: veiculos)
                System.out.println(atual.getModelo() + " => " + "Placa: " + atual.getPlaca());
        }
        else
            System.out.println("Nenhum Veículo Cadastrado.");
        
        System.out.println(); 
    }
    
    private boolean ApagarMotorista(String nome)
    {
        for(int i=0; i<listaDeMotoristas.size(); i++)
        {
            if(listaDeMotoristas.get(i).getNome().equals(nome))
            {
                listaDeMotoristas.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void RemoverMotorista()
    {
        System.out.println("Digite o nome do Motorista: ");
        String entrada = pegaEntrada.nextLine();
        if(ApagarMotorista(entrada))
            System.out.println("Motorista Removido");
        else
            System.out.println("Motorista não Cadastrado!");
    }
    
    private boolean ApagarVeiculo(String placa)
    {
        for(int i=0; i<listaDeVeiculos.size(); i++)
        {
            if(listaDeVeiculos.get(i).getPlaca().equals(placa))
            {
                listaDeVeiculos.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void RemoverVeiculo()
    {
        System.out.println("Placa: ");
        String entrada = pegaEntrada.nextLine();
        if(ApagarVeiculo(entrada))
            System.out.println("Veículo Removido");
        else
            System.out.println("Veículo não cadastrado!");
    }
}
