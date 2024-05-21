package com.mycompany.sistemamatriculas;

import com.mycompany.sistemamatriculas.Horario;
import com.mycompany.sistemamatriculas.Matricula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaMatriculas {
    private List<Pessoa> pessoas;
    private List<Disciplina> disciplinas;
    private List<Horario> horarios;
    private List<Matricula> matriculas;

    public SistemaMatriculas() {
        pessoas = new ArrayList<>();
        disciplinas = new ArrayList<>();
        horarios = new ArrayList<>();
        matriculas = new ArrayList<>();
    }

    public void exibirMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Matriculas:");
            System.out.println("1. Manutencao de pessoas");
            System.out.println("2. Manutencao de disciplinas");
            System.out.println("3. Manutencao de horario");
            System.out.println("4. Manutencao de matriculas");
            System.out.println("5. Exibir horario");
            System.out.println("6. Exibir matricula do estudante");
            System.out.println("7. Exibir disciplinas por professor/tutor");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    manutencaoPessoas(scanner);
                    break;
                case 2:
                    manutencaoDisciplinas(scanner);
                    break;
                case 3:
                    manutencaoHorario(scanner);
                    break;
                case 4:
                    manutencaoMatriculas(scanner);
                    break;
                case 5:
                    exibirHorario();
                    break;
                case 6:
                    exibirMatriculaEstudante(scanner);
                    break;
                case 7:
                    exibirDisciplinasPorProfessorTutor(scanner);
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 8);
    }

    private void manutencaoPessoas(Scanner scanner)
    {
        System.out.println("\nManutencao de Pessoas:");
        System.out.println("1. Adicionar Pessoa");
        System.out.println("2. Listar Pessoas");
        System.out.println("3. Remover Pessoa");
        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                adicionarPessoa(scanner);
                break;
            case 2:
                listarPessoas();
                break;
            case 3:
                removerPessoa(scanner);
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }

    private void adicionarPessoa(Scanner scanner)
    {
        System.out.println("\nAdicionar Pessoa:");
        System.out.println("1. Estudante");
        System.out.println("2. Professor");
        System.out.println("3. Tutor");
        System.out.print("Escolha uma opcao: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matricula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.print("Endereco: ");
        String endereco = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Curso: ");
                String curso = scanner.nextLine();
                System.out.print("Ano de Ingresso: ");
                int anoIngresso = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha
                pessoas.add(new Estudante(nome, matricula, endereco, curso, anoIngresso));
                break;
            case 2:
                System.out.print("Titulacao: ");
                String titulacao = scanner.nextLine();
                System.out.print("Valor Hora: ");
                float valorHora = scanner.nextFloat();
                scanner.nextLine(); // Consome a nova linha
                pessoas.add(new Professor(matricula, nome, endereco, titulacao, valorHora));
                break;
            case 3:
                System.out.print("Area de Formacao: ");
                String areaFormacao = scanner.nextLine();
                System.out.print("Salario Mensal: ");
                float salarioMensal = scanner.nextFloat();
                scanner.nextLine(); // Consome a nova linha
                pessoas.add(new Tutor(matricula, nome, endereco, areaFormacao, salarioMensal));
                break;
            default:
                System.out.println("Tipo invalido. Tente novamente.");
        }
    }

    private void listarPessoas()
    {
        System.out.println("\nLista de Pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    private void removerPessoa(Scanner scanner)
    {
        System.out.print("Informe a matricula da pessoa a ser removida: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Pessoa pessoaRemover = null;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getMatricula() == matricula) {
                pessoaRemover = pessoa;
                break;
            }
        }
        if (pessoaRemover != null) {
            pessoas.remove(pessoaRemover);
            System.out.println("Pessoa removida com sucesso.");
        } else {
            System.out.println("Pessoa nao encontrada.");
        }
    }

    private void manutencaoDisciplinas(Scanner scanner)
    {
        System.out.println("\nManutencao de Disciplinas:");
        System.out.println("1. Adicionar Disciplina");
        System.out.println("2. Listar Disciplinas");
        System.out.println("3. Remover Disciplina");
        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                adicionarDisciplina(scanner);
                break;
            case 2:
                listarDisciplinas();
                break;
            case 3:
                removerDisciplina(scanner);
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }

    private void adicionarDisciplina(Scanner scanner)
    {
        System.out.println("\nAdicionar Disciplina:");
        System.out.println("1. Disciplina Presencial");
        System.out.println("2. Disciplina EAD");
        System.out.print("Escolha uma opcao: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Ementa: ");
        String ementa = scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.print("Numero de Aulas: ");
                int numeroAulas = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha
                disciplinas.add(new DisciplinaPresencial(codigo, nome, ementa, numeroAulas));
                break;
            case 2:
                System.out.print("Numero de Unidades: ");
                int numeroUnidades = scanner.nextInt();
                scanner.nextLine(); // Consome a nova linha
                disciplinas.add(new DisciplinaEad(codigo, nome, ementa, numeroUnidades));
                break;
            default:
                System.out.println("Tipo invalido. Tente novamente.");
        }
    }

    private void listarDisciplinas()
    {
        System.out.println("\nLista de Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }

    private void removerDisciplina(Scanner scanner)
    {
        System.out.print("Informe o codigo da disciplina a ser removida: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Disciplina disciplinaRemover = null;
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo() == codigo) {
                disciplinaRemover = disciplina;
                break;
            }
        }
        if (disciplinaRemover != null) {
            disciplinas.remove(disciplinaRemover);
            System.out.println("Disciplina removida com sucesso.");
        } else {
            System.out.println("Disciplina nao encontrada.");
        }
    }

    private void manutencaoHorario(Scanner scanner)
    {
        System.out.println("\nManutencao de Horario:");
        System.out.println("1. Adicionar Horario");
        System.out.println("2. Listar Horarios");
        System.out.println("3. Remover Horario");
        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                adicionarHorario(scanner);
                break;
            case 2:
                listarHorarios();
                break;
            case 3:
                removerHorario(scanner);
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }

    private void adicionarHorario(Scanner scanner)
    {
        System.out.println("\nAdicionar Horario:");
        System.out.print("Codigo da Disciplina: ");
        int codigoDisciplina = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Disciplina disciplina = null;
        for (Disciplina d : disciplinas) {
            if (d.getCodigo() == codigoDisciplina) {
                disciplina = d;
                break;
            }
        }
        if (disciplina == null) {
            System.out.println("Disciplina nao encontrada.");
            return;
        }

        System.out.print("Matricula do Professor: ");
        int matriculaProfessor = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Professor professor = null;
        for (Pessoa p : pessoas) {
            if (p instanceof Professor && p.getMatricula() == matriculaProfessor) {
                professor = (Professor) p;
                break;
            }
        }
        if (professor == null) {
            System.out.println("Professor nao encontrado.");
            return;
        }

        if (disciplina instanceof DisciplinaEad) {
            System.out.print("Matricula do Tutor: ");
            int matriculaTutor = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha
            Tutor tutor = null;
            for (Pessoa p : pessoas) {
                if (p instanceof Tutor && p.getMatricula() == matriculaTutor) {
                    tutor = (Tutor) p;
                    break;
                }
            }
            if (tutor == null) {
                System.out.println("Tutor não encontrado.");
                return;
            }
            System.out.print("Numero de Vagas: ");
            int numeroVagas = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha
            horarios.add(new Horario((DisciplinaEad) disciplina, professor, tutor, numeroVagas));
        } else {
            System.out.print("Dia da Semana: ");
            String diaSemana = scanner.nextLine();
            System.out.print("Turno: ");
            String turno = scanner.nextLine();
            System.out.print("Numero de Vagas: ");
            int numeroVagas = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha
            horarios.add(new Horario(disciplina, professor, diaSemana, turno, numeroVagas));
        }
    }

    private void listarHorarios()
    {
        System.out.println("\nLista de Horarios:");
        for (Horario horario : horarios) {
            System.out.println(horario);
        }
    }

    private void removerHorario(Scanner scanner)
    {
        System.out.print("Informe o codigo da disciplina do horario a ser removido: ");
        int codigoDisciplina = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Horario horarioRemover = null;
        for (Horario horario : horarios) {
            if (horario.getDisciplina().getCodigo() == codigoDisciplina) {
                horarioRemover = horario;
                break;
            }
        }
        if (horarioRemover != null) {
            horarios.remove(horarioRemover);
            System.out.println("Horario removido com sucesso.");
        } else {
            System.out.println("Horario nao encontrado.");
        }
    }

    private void manutencaoMatriculas(Scanner scanner)
    {
        System.out.println("\nManutencao de Matriculas:");
        System.out.println("1. Adicionar Matricula");
        System.out.println("2. Listar Matriculas");
        System.out.println("3. Remover Matricula");
        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                adicionarMatricula(scanner);
                break;
            case 2:
                listarMatriculas();
                break;
            case 3:
                removerMatricula(scanner);
                break;
            default:
                System.out.println("Opcao invalida. Tente novamente.");
        }
    }

    private void adicionarMatricula(Scanner scanner)
    {
        System.out.print("Matricula do Estudante: ");
        int matriculaEstudante = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Estudante estudante = null;
        for (Pessoa p : pessoas) {
            if (p instanceof Estudante && p.getMatricula() == matriculaEstudante) {
                estudante = (Estudante) p;
                break;
            }
        }
        if (estudante == null) {
            System.out.println("Estudante nao encontrado.");
            return;
        }

        System.out.print("Codigo da Disciplina: ");
        int codigoDisciplina = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        Horario horario = null;
        for (Horario h : horarios) {
            if (h.getDisciplina().getCodigo() == codigoDisciplina) {
                horario = h;
                break;
            }
        }
        if (horario == null) {
            System.out.println("Horario nao encontrado.");
            return;
        }

        if (horario.adicionarEstudante(estudante)) {
            matriculas.add(new Matricula(estudante, horario));
            System.out.println("Matricula realizada com sucesso.");
        } else {
            System.out.println("Nao ha vagas disponiveis.");
        }
    }

    private void listarMatriculas()
    {
        System.out.println("\nLista de Matriculas:");
        for (Matricula matricula : matriculas) {
            System.out.println(matricula);
        }
    }

    private void removerMatricula(Scanner scanner)
    {
        System.out.print("Matricula do Estudante: ");
        int matriculaEstudante = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.print("Codigo da Disciplina: ");
        int codigoDisciplina = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        Matricula matriculaRemover = null;
        for (Matricula matricula : matriculas) {
            if (matricula.getEstudante().getMatricula() == matriculaEstudante &&
                matricula.getHorario().getDisciplina().getCodigo() == codigoDisciplina) {
                matriculaRemover = matricula;
                break;
            }
        }
        if (matriculaRemover != null) {
            matriculas.remove(matriculaRemover);
            matriculaRemover.getHorario().getEstudantesMatriculados().remove(matriculaRemover.getEstudante());
            System.out.println("Matricula removida com sucesso.");
        } else {
            System.out.println("Matricula na2"
                    + "o encontrada.");
        }
    }

    private void exibirHorario()
    {
        listarHorarios();
    }

    private void exibirMatriculaEstudante(Scanner scanner)
    {
        System.out.print("Matricula do Estudante: ");
        int matriculaEstudante = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        System.out.println("\nMatriculas do Estudante:");
        for (Matricula matricula : matriculas) {
            if (matricula.getEstudante().getMatricula() == matriculaEstudante) {
                System.out.println(matricula);
            }
        }
    }

    private void exibirDisciplinasPorProfessorTutor(Scanner scanner)
    {
        System.out.print("Matricula do Professor/Tutor: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        System.out.println("\nDisciplinas do Professor/Tutor:");
        for (Horario horario : horarios) {
            if ((horario.getProfessor() != null && horario.getProfessor().getMatricula() == matricula) ||
                (horario.getTutor() != null && horario.getTutor().getMatricula() == matricula)) {
                System.out.println(horario.getDisciplina());
            }
        }
    }

    public static void main(String[] args)
    {
        SistemaMatriculas sistema = new SistemaMatriculas();
        sistema.exibirMenu();
    }
}
