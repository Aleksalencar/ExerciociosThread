package Ex1;


public class Main {

	public static void main(String[] args) {
	
		for (int id = 0; id < 20; id++) {
			Process process = new Process(id);	
			process.run();
		}
	}

}
