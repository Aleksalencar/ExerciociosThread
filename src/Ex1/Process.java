package Ex1;

import java.util.Random;

public class Process extends Thread{

	private int id;
	private Random r = new Random();
	private static int cta=1;
	
	public Process(int id) {
		this.id = id;
	}
	
	public void run() {
		TExec();
		
	}

	private void TExec() {
		int tempo = (r.nextInt(116)+4)*1000;
		System.out.println(id+" -> "+tempo/1000+" s");
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

