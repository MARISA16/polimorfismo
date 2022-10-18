package polimorfismo;

public class Canguru extends Mamifero {

	public Canguru(float peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros, corPelo);
		
		this.setCorPelo(corPelo);
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
	}
	
	
	public void usarBolsa() {
		System.out.println("Bolsa do Canguru esta cheia de filhos");
	}

	
	public void locomover() {
		System.out.println("Canguru saltando");
	}


}
