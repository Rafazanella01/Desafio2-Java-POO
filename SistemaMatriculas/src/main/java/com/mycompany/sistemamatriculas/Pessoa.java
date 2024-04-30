package com.mycompany.sistemamatriculas;

/**
 *
 * @author rafaz
 */
public class Pessoa {
    
    private String nome;
    private int matricula;  
    private String endereco;
    
    public Pessoa(String nome, int matricula, String endereco)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;   
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getMatricula()
    {
        return matricula;
    }
    
    public String getEndereco()
    {
        return endereco;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    
    public String toString()
    {
        return "Pessoa: [Nome: " + nome + " , Matricula: " + matricula + ", Endereco: " + endereco + "]";
    }
}
