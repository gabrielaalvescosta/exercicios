package exercicio43;

public class Livro {
	
	private int id;
	private String nome;
	private String autor;
	private boolean disponivel;
	
	// getters e setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean getStatus() {
		return disponivel;
	}
	
	public void setStatus(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	Livro() {
		
	}
	
	Livro(int id, String nome, String autor, boolean disponivel) {
		
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.disponivel = disponivel;
		
	}

}
