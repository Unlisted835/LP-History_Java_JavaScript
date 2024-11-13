
public class ExemploThread extends Thread {
	public void run() {
		System.out.println("Tarefa emsegundo plano em Java!"); 
	}
	public static void main(String[] args) {
		ExemploThread tarefa = new ExemploThread();
		tarefa.start(); // Inicia a thread 
	}
}
