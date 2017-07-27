package GerenciarTransporte;

import GerenciarTransporte.Cadastros.Motorista;
import GerenciarTransporte.Cadastros.Veiculo;
import Interfaces.ITransporte;
import java.util.LinkedList;
import java.util.Scanner;

public class GlobalTransporte implements ITransporte
{
    private static Scanner pegaEntrada = new Scanner(System.in);
    private static LinkedList<Motorista> listaDeMotoristas = new LinkedList();
    private static LinkedList<Veiculo> listaDeVeiculos = new LinkedList();
    
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
}
