package com.mycompany.sistemamatriculas;

/**
 *
 * @author rafaz
 */
public class Professor extends Pessoa {
    
    private String titulacao;
    private float valorHora;
    
    public Professor(int matricula, String nome, String endereco, String titulacao, float valorHora)
    {
        super(nome, matricula, endereco);
        this.titulacao = titulacao;
        this.valorHora = valorHora;
    }
    
    // Construtor sobrecarregado
    public Professor(int matricula, String nome, String endereco)
    {
        super(nome, matricula, endereco);
        this.titulacao = "Doutorado";
        this.valorHora = 100;
    }
    
    // Métodos getters e setters
    public String getTitulacao()
    {
        return titulacao;
    }

    public void setTitulacao(String titulacao)
    {
        this.titulacao = titulacao;
    }

    public float getValorHora()
    {
        return valorHora;
    }

    public void setValorHora(float valorHora)
    {
        this.valorHora = valorHora;
    }
    
    public float calcularSalario(int horasTrabalhadas)
    {
        return valorHora * horasTrabalhadas;
    }
    
    // Método para exibir informações do professor
    public void exibirInformacoes()
    {
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Titulação: " + titulacao);
        System.out.println("Valor da hora: " + valorHora);
    }
}