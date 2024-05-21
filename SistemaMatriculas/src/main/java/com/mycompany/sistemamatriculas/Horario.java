package com.mycompany.sistemamatriculas;

import java.util.ArrayList;
import java.util.List;

public class Horario {
    private Disciplina disciplina;
    private Professor professor;
    private Tutor tutor;
    private String diaSemana;
    private String turno;
    private int numeroVagas;
    private List<Estudante> estudantesMatriculados;

    public Horario(Disciplina disciplina, Professor professor, String diaSemana, String turno, int numeroVagas)
    {
        this.disciplina = disciplina;
        this.professor = professor;
        this.diaSemana = diaSemana;
        this.turno = turno;
        this.numeroVagas = numeroVagas;
        this.estudantesMatriculados = new ArrayList<>();
    }

    public Horario(DisciplinaEad disciplina, Professor professor, Tutor tutor, int numeroVagas)
    {
        this.disciplina = disciplina;
        this.professor = professor;
        this.tutor = tutor;
        this.numeroVagas = numeroVagas;
        this.estudantesMatriculados = new ArrayList<>();
    }

    public Disciplina getDisciplina()
    {
        return disciplina;
    }

    public Professor getProfessor()
    {
        return professor;
    }

    public Tutor getTutor()
    {
        return tutor;
    }

    public String getDiaSemana()
    {
        return diaSemana;
    }

    public String getTurno()
    {
        return turno;
    }

    public int getNumeroVagas()
    {
        return numeroVagas;
    }

    public List<Estudante> getEstudantesMatriculados()
    {
        return estudantesMatriculados;
    }

    public boolean adicionarEstudante(Estudante estudante)
    {
        if (estudantesMatriculados.size() < numeroVagas) {
            return estudantesMatriculados.add(estudante);
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Horario{" +
                "disciplina=" + disciplina +
                ", professor=" + professor +
                (tutor != null ? ", tutor=" + tutor : "") +
                (diaSemana != null ? ", diaSemana='" + diaSemana + '\'' : "") +
                (turno != null ? ", turno='" + turno + '\'' : "") +
                ", numeroVagas=" + numeroVagas +
                ", estudantesMatriculados=" + estudantesMatriculados +
                '}';
    }
}