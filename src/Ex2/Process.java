package Ex2;

import java.util.Random;

public class Process extends Thread{

	private int id;
	private int tempo;
	private static int cta=1;
	
	public Process(int id, int tempo) {
		this.id = id;
		this.tempo = tempo;
	}
	
	public void run() {
		TExec();
	}

	private void TExec() {
		
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("O processo nº "+id+" foi o "+cta+"º a chegar ");
			cta ++;
		}
	}
}

