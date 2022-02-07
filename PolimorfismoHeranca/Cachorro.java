package PolimorfismoHeranca;

public class Cachorro extends Animal{
	private boolean corre;

	public Cachorro(String n, int i) {
		super(n,i);
		this.corre = corre;
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	public void cachorroInfo() {
        System.out.println("\nO cachorro ser chama: "+getNomeAnimal()+". \nE a idade dele � de: "+getIdadeAnimal()+". \nO som emitido por ele �: ");
    }
	
    public void imprimirMovimento() {
        if(corre==true) {
            System.out.println("\nO cachorro adora correr.");
        }
    }
}

