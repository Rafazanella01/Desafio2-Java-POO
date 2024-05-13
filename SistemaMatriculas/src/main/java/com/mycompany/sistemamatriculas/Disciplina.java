package com.mycompany.sistemamatriculas;

/**
 *
 * @author rafaz
 */
public class Disciplina {
    
    private int codigo;
    private String nome;
    private String ementa;
    
    public Disciplina(int codigo, String nome, String ementa)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.ementa = ementa;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getEmenta()
    {
        return ementa;
    }
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setEmenta(String ementa)
    {
        this.ementa = ementa;
    }
    
    public String toString()
    {
    return "Disciplina{" +
            "codigo=" + codigo +
            ", nome='" + nome + '\'' +
            ", ementa='" + ementa + '\'' +
            '}';
    }
}