package Polimorfismo;

public class TesteAnimais {
	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro("Bart","5 anos","Au au");
		Cavalo cavalo = new Cavalo("Luna","3 anos","Relincho");
        Preguica preguica = new Preguica("Orfeu","9 anos","Sem som");

        System.out.println("\nO animal �: "+cachorro.getNomeClasse()+"\nO nome �: "+cachorro.getNomeAnimal()+"\nA idade do cachorro �: "+cachorro.getIdadeAnimal()+". \nO som do animal �: "+cachorro.getSomAnimal());
        System.out.println("\nO animal �: "+cavalo.getNomeClasse()+"\nO nome �: "+cavalo.getNomeAnimal()+"\nA idade do cavalo �: "+cavalo.getIdadeAnimal()+". \nO som do animal �: "+cavalo.getSomAnimal());
        System.out.println("\nO animal �: "+preguica.getNomeClasse()+"\nO nome �: "+preguica.getNomeAnimal()+"\nA idade da pregui�a �: "+preguica.getIdadeAnimal()+". \nO som do animal �: "+preguica.getSomAnimal());	
	}

}
