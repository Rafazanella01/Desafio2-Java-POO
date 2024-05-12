package com.mycompany.sistemamatriculas;

/**
 *
 * @author rafaz
 */
public class Estudante extends Pessoa {
    private int anoIngresso;
    private String curso;
    
    public Estudante(String nome, int matricula, String endereco, String curso, int anoIngresso)
    {
        super(nome, matricula, endereco);
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }

    // Getters
    public int getAnoIngresso()
    {
        return anoIngresso;
    }
    
    public String getCurso()
    {
        return curso;
    }

    // Setters
    public void setAnoIngresso(int anoIngresso)
    {
        this.anoIngresso = anoIngresso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    // Construtor com sobrecarga
    public Estudante(String nome, int matricula, String endereco, String curso) {
        super(nome, matricula, endereco);
        this.curso = curso;
    }
}
