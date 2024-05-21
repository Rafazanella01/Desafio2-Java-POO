package com.mycompany.sistemamatriculas;

public class Matricula {
    private Estudante estudante;
    private Horario horario;

    public Matricula(Estudante estudante, Horario horario)
    {
        this.estudante = estudante;
        this.horario = horario;
    }

    public Estudante getEstudante()
    {
        return estudante;
    }

    public Horario getHorario()
    {
        return horario;
    }

    @Override
    public String toString()
    {
        return "Matricula{" +
                "estudante=" + estudante +
                ", horario=" + horario +
                '}';
    }
}
