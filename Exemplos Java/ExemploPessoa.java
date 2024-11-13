
public class ExemploPessoa { 
	String nome; public ExemploPessoa(String nome) {
		this.nome = nome; 
	}
	public void saudacao() {
		System.out.println("Olá, meu nome é " + nome); 
	} 
	public static void main(String[] args) {
		ExemploPessoa exemploPessoa = new ExemploPessoa("Carlos");
		exemploPessoa.saudacao(); 
	}
}
