package polimorfismo;

public class ProgramaAnimal {
	public static void main(String[]args){
		// foram chamados os mesmo metodos e o mesmo nome mas obtive formas diferentes de resultados (chama se de polimorfismo)
		Reptil marinho = new Reptil(1.20f,2,4,"Azul");
		marinho.alimentar();
		
		Peixe vermelho = new Peixe(1f,3,2,"dourado");
		vermelho.soltarbolha();
		
		Ave casuares = new Ave(2f,5,2,"amarelo");
		casuares.emitirSom();
		
		Mamifero leao = new Mamifero(14f,6,4,"branco");
		leao.locomover();
		
		Canguru cinza = new Canguru(17f,10,4,"cinza");
		cinza.usarBolsa();
		
		Cachorro buldogue = new Cachorro(30f,15,4,"castanho e preto");
		buldogue.enterrarOsso();
		
		Tartaruga jabuti = new Tartaruga(50f,10,4,"verde");
		jabuti.locomever();


		
	}

}
