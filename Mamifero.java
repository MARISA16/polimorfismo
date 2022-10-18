package polimorfismo;

public class Mamifero extends Animal {

	// atributo
	private String corPelo;

	//construtor
	public Mamifero(float peso, int idade, int membros,String corPelo) {
		super(peso, idade, membros);

		this.setCorPelo(corPelo);
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
	}


// metodos a srem implementodos
	@Override
	public void locomover() {
		System.out.println("Maniferos estão Correndo");

	}

	@Override
	public void alimentar() {
		System.out.println("Bébe mamifero mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Os maniferos emitindo Som");

	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

}
