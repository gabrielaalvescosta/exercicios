package exercicio42;

public class Contato {
	
	private int id;
	private String nome;
	private String numero;
	private String email;
	private String emailSecundario;
	
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
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmailSecundario() {
		return emailSecundario;
	}
	
	public void setEmailSecundario(String emailSecundario) {
		this.emailSecundario = emailSecundario;
	}
	
	Contato() {
		
	}
	
	Contato(int id, String nome, String numero, String email, String emailSecundario) {
		
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.email = email;
		this.emailSecundario = emailSecundario;
		
	}
	
}
