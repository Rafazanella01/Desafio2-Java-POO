package com.mycompany.sistemamatriculas;

/**
 *
 * @author rafaz
 */
public class DisciplinaEad extends Disciplina{
    
    private int numeroUnidades;
    
    public DisciplinaEad(int codigo, String nome, String ementa, int numeroUnidades)
    {
        super(codigo, nome, ementa);
        this.numeroUnidades = numeroUnidades;
    }
    
    public int getNumeroUnidades()
    {
        return numeroUnidades;
    }
    
    public void setNumeroUnidades(int numeroUnidades)
    {
        this.numeroUnidades = numeroUnidades;
    }
}
