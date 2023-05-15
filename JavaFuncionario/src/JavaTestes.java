
public class JavaTestes {

	public static void main(String[] args) {

		public abstract class Funcionario {
		    private int codigo;
		    private String nome;
		    private double salarioBase;

		    public Funcionario(int codigo, String nome, double salarioBase) {
		        this.codigo = codigo;
		        this.nome = nome;
		        this.salarioBase = salarioBase;
		    }

		    public abstract double calcularSalario();

		}

		public class Engenheiro extends Funcionario {
		    private String departamento;
		    private String crea;

		    public Engenheiro(int codigo, String nome, double salarioBase, String departamento, String crea) {
		        super(codigo, nome, salarioBase);
		        this.departamento = departamento;
		        this.crea = crea;
		    }

		    public double calcularSalario() {
		        return getSalarioBase() * 1.5; 
		    }

		}

		public class Gerente extends Funcionario {
		    private String area;
		    private double bonus;

		    public Gerente(int codigo, String nome, double salarioBase, String area, double bonus) {
		        super(codigo, nome, salarioBase);
		        this.area = area;
		        this.bonus = bonus;
		    }

		    public double calcularSalario() {
		        return getSalarioBase() + bonus;
		    }

		}

		public class Presidente extends Funcionario {
		    private double cotaAcoes;

		    public Presidente(int codigo, String nome, double salarioBase, double cotaAcoes) {
		        super(codigo, nome, salarioBase);
		        this.cotaAcoes = cotaAcoes;
		    }

		    public double calcularSalario() {
		        return getSalarioBase() + (cotaAcoes * 0.01); 
		    }
		    
		}


		public class FolhaDePagamento {
		    private List<Funcionario> funcionarios;

		    public FolhaDePagamento() {
		        funcionarios = new ArrayList<>();
		    }

		    public void adicionarFuncionario(Funcionario funcionario) {
		        funcionarios.add(funcionario);
		    }

		    public double calcularTotalSalarios() {
		        double totalSalarios = 0;
		        for (Funcionario funcionario : funcionarios) {
		            totalSalarios += funcionario.calcularSalario();
		        }
		        return totalSalarios;
		    }


		}

		public class Login {
		    public boolean autenticar(Funcionario funcionario) 
		    
		        return true;
		    }
		}

		public class Main {
		    public static void main(String[] args) {
		        FolhaDePagamento folha


	}

}
