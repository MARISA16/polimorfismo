package polimorfismo;

public class Tartaruga extends Reptil{

	public Tartaruga(float peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros, corEscama);
		
		this.setCorEscama(corEscama);
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
	}
	
	public void locomever() {
		System.out.println("Tartaruga andando bem devegar");
		
	}

}
