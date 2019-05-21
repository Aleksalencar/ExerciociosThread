package Ex4;

public class Fatorial extends Thread{
	
	protected long num;
	protected int op;
	protected long res=0;
	protected String tipo;
	
	public Fatorial(long num,int op) {
		
		this.num = num;
		if (op == 0) {
			this.tipo= "Recursiva ";
		} else {
			this.tipo = "Iterativa ";
		}
		
	}
	
	public void run(){
		long t1 = System.nanoTime();
		FExec();
		long t2 = System.nanoTime();
		System.out.println(tipo+"-> "+num+"! = "+res+" em "+(t2 - t1)+" nano segundos");
		
	}

	private void FExec() {
		switch(op) {
		case 0:
			res = FatRec(num);
			break;
		case 1:
			res = FatIte(num);
			break;
		}
	}

	private long FatIte(long num) {
		long fatorial = 1;
		for (int i = 1;i <= num; i++) {			
			fatorial *= i;
		}
			return fatorial;
		}
		

	private long FatRec(long num) {
		if(num == 1) {
			return num;
		}else {
			return num * FatRec(num-1);
		}
		
	}	
	
}
