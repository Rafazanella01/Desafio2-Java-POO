package com.mycompany.sistemamatriculas;

/**
 *
 * @author rafaz
 */
public class DisciplinaPresencial extends Disciplina{
    
    private int numeroAulas;
    
    public DisciplinaPresencial(int codigo, String nome, String ementa, int numeroAulas)
    {
        super(codigo, nome, ementa);
        this.numeroAulas = numeroAulas;
    }
    
    public int getNumeroAulas()
    {
        return numeroAulas;
    }
    
    public void setNumeroAulas(int numeroAulas)
    {
        this.numeroAulas = numeroAulas;
    }
}
