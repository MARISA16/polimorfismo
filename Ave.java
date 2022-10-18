package polimorfismo;

public class Ave extends Animal {

	//atributo
	private String corPena;

	// construtor
	public Ave(float peso, int idade, int membros,String corPena) {
		super(peso, idade, membros);

		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		this.setCorPena(corPena);
	}

//	public void adicionarCorEscama(String corPenaAve) {
//		setCorPena(getCorPena() + corPenaAve);
//	}
//	

	@Override
	public void locomover() {
		
		System.out.println("Ave esta Voando");
		
	}

	@Override
	public void alimentar() {

		System.out.println("Esta comendo frutas");
	}

	@Override
	public void emitirSom() {

		System.out.println("Som de ave");

	}

	public void fazerNinho() {
		System.out.println("Ave construindo Ninho");

	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

}
