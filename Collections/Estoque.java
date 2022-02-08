package Collections;

	import java.util.ArrayList;
	import java.util.Collection;

	public class Estoque {
	    public static void main(String[] args) {
	        Collection<String> Livraria = new ArrayList();

	        Livraria.add("Romance");
	        Livraria.add("Biografia");
	        Livraria.add("Fantasia");
	        Livraria.add("Idiomas");
	        Livraria.add("Suspense");

	        for(String produto : Livraria) {
	            System.out.println("Possui os livros de g�nero: "+produto);
	        }

	        System.out.println("\nCont�m o livro de Romance? "+Livraria.contains("Romance"));
	        System.out.println("\nProdutos: "+Livraria);
	        System.out.println("\nEstoque de livros: "+Livraria);
	        Livraria.remove("Idiomas");
	        System.out.println("Atualiza��o do estoque de livros: "+Livraria);
	    }
	}
