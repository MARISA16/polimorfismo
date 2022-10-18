package polimorfismo;

public class Reptil extends Animal {

	//atributo
	private String corEscama;

	// construtor
	public Reptil(float peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros);

		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		this.setCorEscama(corEscama);
	}

//	public void adicionarCorEscama(String corPeloReptil) {
//		corEscama += corPeloReptil;
//	}
	

//metodos a serem implementos que são abstratos na classe animal
	@Override
	public void locomover() {
		System.out.println("Réptil esta rastejando!Que bicho feio");
	}

	@Override
	public void alimentar() {
		System.out.println("Réptil comendo  de insetos");

	}

	@Override
	public void emitirSom() {
		System.out.println("Réptis emitindo sons");

	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
