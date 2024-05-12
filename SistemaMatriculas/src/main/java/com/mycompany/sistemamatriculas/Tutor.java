package com.mycompany.sistemamatriculas;

/**
 *
 * @author rafaz
 */
public class Tutor extends Pessoa {
    private float salarioMensal;
    private String areaFormacao;
    
    public Tutor(int matricula, String nome, String endereco, String areaFormacao, float salarioMensal)
    {
        super(nome, matricula, endereco);
        this.areaFormacao = areaFormacao;
        this.salarioMensal = salarioMensal;
    }
     
    public float getSalarioMensal()
    {
        return salarioMensal;
    }
    
    public String getAreaFormacao()
    {
        return areaFormacao;
    }
    
    public void setSalarioMensal(float salarioMensal)
    {
        this.salarioMensal = salarioMensal;
    }

    public void setAreaFormacao(String areaFormacao)
    {
        this.areaFormacao = areaFormacao;
    }
}
