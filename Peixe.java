package polimorfismo;

public class Peixe extends Animal {

	// atributos
	
	private String corEscama;

	// Construtor
	public Peixe(float peso, int idade, int membros,String corEscama) {
		super(peso, idade, membros);

		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		this.setCorEscama(corEscama);

	}

	// metodos estão sendo implementados
	@Override
	public void locomover() {

		System.out.println("Peixe esta nadando");

	}

	@Override
	public void alimentar() {

		System.out.println("Peixes comendo de substãncias");
	}

	@Override
	public void emitirSom() {

		System.out.println("Peixe não faz Som");

	}

	public void soltarbolha() {
		System.out.println("Peixe soltou uma bolha");

	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
