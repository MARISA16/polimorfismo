package polimorfismo;

public class Cachorro extends Mamifero {

	public Cachorro(float peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros, corPelo);
		
		this.setCorPelo(corPelo);
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
	}
	
	public void enterrarOsso() {
		System.out.println(" Cachorro enterrando Osso");
		
	}
	
public void abanarBabo() {
	System.out.println("abanando o Rabo para cachorra");
		
	}
	
	

}
