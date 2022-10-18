package polimorfismo;

public abstract class Animal {

	// atributos

	private float peso;
	private int idade;
	private int membros;

	// Construtor
	public Animal(float peso, int idade, int membros) {

		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
	}

	// metodos abstratos não serão implementados
	public abstract void locomover();

	public abstract void alimentar();

	public abstract void emitirSom();

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

}
