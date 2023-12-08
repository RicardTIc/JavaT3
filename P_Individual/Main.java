
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

enum TipoAtendimento {
    CLINICA, PEDIATRIA, PNEUMOLOGIA, OBSTETRICIA
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}

class Medicamento {
    private String nome;
    private int quantidade;

    public Medicamento(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}

class Insumo {
    private String nome;
    private int quantidade;

    public Insumo(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}

class Procedimento {
    private String nome;
    private List<Procedimento> subProcedimentos;
    private List<Medicamento> medicamentosUsados;
    private List<Insumo> insumosUsados;

    public Procedimento(String nome) {
        this.nome = nome;
        this.subProcedimentos = new ArrayList<>();
        this.medicamentosUsados = new ArrayList<>();
        this.insumosUsados = new ArrayList<>();
    }

    public void adicionarSubProcedimento(Procedimento subProcedimento) {
        subProcedimentos.add(subProcedimento);
    }
}

class Hospital {
    private List<Medicamento> medicamentos;
    private List<Insumo> insumos;
    private List<Procedimento> procedimentos;
    private List<Medico> medicos;
    private List<Enfermeiro> enfermeiros;
    private List<Paciente> pacientes;
    private List<Triagem> triagens;
    private List<Atendimento> atendimentos;

    public Hospital() {
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.triagens = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
    }

    public void cadastrarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void cadastrarInsumo(Insumo insumo) {
        insumos.add(insumo);
    }

    public void cadastrarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    public void cadastrarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void cadastrarEnfermeiro(Enfermeiro enfermeiro) {
        enfermeiros.add(enfermeiro);
    }

    public void cadastrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void cadastrarTriagem(Triagem triagem) {
        triagens.add(triagem);
    }

    public void cadastrarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public void realizarTriagem(Enfermeiro enfermeiro, Paciente paciente) {
        Triagem triagem = new Triagem(enfermeiro, paciente);
        cadastrarTriagem(triagem);
        System.out.println("Triagem realizada por " + enfermeiro.getNome() + " para o paciente " + paciente.getNome());
    }

    // Métodos adicionais conforme necessário

    // Getters para acesso às listas
    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Enfermeiro> getEnfermeiros() {
        return enfermeiros;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}

class Medico extends Pessoa {
    public Medico(String nome, int idade) {
        super(nome, idade);
    }
}

class Enfermeiro extends Pessoa {
    public Enfermeiro(String nome, int idade) {
        super(nome, idade);
    }
}

class Paciente extends Pessoa {
    public Paciente(String nome, int idade) {
        super(nome, idade);
    }
}

class Triagem {
    private Enfermeiro enfermeiro;
    private Paciente paciente;

    public Triagem(Enfermeiro enfermeiro, Paciente paciente) {
        this.enfermeiro = enfermeiro;
        this.paciente = paciente;
    }
}

class Atendimento {
    private Medico medico;
    private Paciente paciente;

    public Atendimento(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        exibirMenu(hospital, scanner);

        // For example, print a message
        System.out.println("Program executed successfully.");
    }

    private static void exibirMenu(Hospital hospital, Scanner scanner) {
        int opcao;

        do {
            try {
                System.out.println("\n=== Menu ===");
                System.out.println("1. Cadastrar Medico");
                System.out.println("2. Cadastrar Enfermeiro");
                System.out.println("3. Cadastrar Paciente");
                System.out.println("4. Realizar Triagem");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opcao: ");

                opcao = scanner.nextInt();
                scanner.nextLine(); // Consume newline left by nextInt()

                switch (opcao) {
                    case 1:
                        cadastrarMedico(hospital, scanner);
                        break;
                    case 2:
                        cadastrarEnfermeiro(hospital, scanner);
                        break;
                    case 3:
                        cadastrarPaciente(hospital, scanner);
                        break;
                    case 4:
                        realizarTriagem(hospital, scanner);
                        break;
                    case 5:
                        System.out.println("Saindo do programa. Obrigado!");
                        break;
                    default:
                        System.out.println("Opcao invalida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Certifique-se de inserir um numero.");
                scanner.nextLine(); // Limpar o buffer de entrada
                opcao = 0; // Definir opção como 0 para repetir o loop
            }

        } while (opcao != 5);
    }

    private static void cadastrarMedico(Hospital hospital, Scanner scanner) {
        System.out.print("Nome do Medico: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Medico: ");
        int idade = scanner.nextInt();
        Medico medico = new Medico(nome, idade);
        hospital.cadastrarMedico(medico);
        System.out.println("Medico cadastrado com sucesso!");
    }

    private static void cadastrarEnfermeiro(Hospital hospital, Scanner scanner) {
        System.out.print("Nome do Enfermeiro: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Enfermeiro: ");
        int idade = scanner.nextInt();
        Enfermeiro enfermeiro = new Enfermeiro(nome, idade);
        hospital.cadastrarEnfermeiro(enfermeiro);
        System.out.println("Enfermeiro cadastrado com sucesso!");
    }

    private static void cadastrarPaciente(Hospital hospital, Scanner scanner) {
        System.out.print("Nome do Paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Paciente: ");
        int idade = scanner.nextInt();
        Paciente paciente = new Paciente(nome, idade);
        hospital.cadastrarPaciente(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    private static void realizarTriagem(Hospital hospital, Scanner scanner) {
        System.out.print("Nome do Enfermeiro responsável pela triagem: ");
        String nomeEnfermeiro = scanner.nextLine();
        Enfermeiro enfermeiro = encontrarEnfermeiroPorNome(hospital, nomeEnfermeiro);

        if (enfermeiro != null) {
            System.out.print("Nome do Paciente: ");
            String nomePaciente = scanner.nextLine();
            Paciente paciente = encontrarPacientePorNome(hospital, nomePaciente);

            if (paciente != null) {
                hospital.realizarTriagem(enfermeiro, paciente);
            } else {
                System.out.println("Paciente não encontrado.");
            }
        } else {
            System.out.println("Enfermeiro não encontrado.");
        }
    }

    private static Enfermeiro encontrarEnfermeiroPorNome(Hospital hospital, String nome) {
        for (Enfermeiro enfermeiro : hospital.getEnfermeiros()) {
            if (enfermeiro.getNome().equals(nome)) {
                return enfermeiro;
            }
        }
        return null;
    }

    private static Paciente encontrarPacientePorNome(Hospital hospital, String nome) {
        for (Paciente paciente : hospital.getPacientes()) {
            if (paciente.getNome().equals(nome)) {
                return paciente;
            }
        }
        return null;
    }
}
