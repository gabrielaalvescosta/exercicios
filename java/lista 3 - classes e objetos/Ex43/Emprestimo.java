package exercicio43;

public class Emprestimo {
	
	private int id;
	private Livro livro;
	private Pessoa pessoa;
	
	// getter e setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	Emprestimo() {
		
	}
	
	Emprestimo(int id, Livro livro, Pessoa pessoa) {
		
		this.id = id;
		this.livro = livro;
		this.pessoa = pessoa;
		
	}
	

}
