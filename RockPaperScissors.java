import java.io.DataInputStream;
import java.io.IOException;

public class RockPaperScissors {
	
	static int winA=0,winB=0;
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		DataInputStream ds=new DataInputStream(System.in);
		int num=Integer.parseInt(ds.readLine());
		String outCome=ds.readLine();
		decision(outCome);
		if(winA==winB){
			System.out.println("DRAW");
		}
		else {
		char winner=winA>winB?'A':'B';
		System.out.println(winner+" WINS TOURNAMENT");
		}

	}
	
	public static void decision(String outCome){
		for(int i=0;i<outCome.length();i=i+2){
			char inA=outCome.charAt(i);
			char inB=outCome.charAt(i+1);
			
			int diff=inA-inB;
			if(diff==0){
				winPrinter(null);
			}
			else if(diff<0){
				switch(diff){
					case -1:
						winPrinter("A");
						winA++;
						break;
					case -2:
						winPrinter("A");
						winA++;
						break;
					case -3:
						winPrinter("B");
						winB++;
						break;
				}
						
			}
			else{
				switch(diff){
				case 1:
					winPrinter("B");
					winB++;
					break;
				case 2:
					winPrinter("B");
					winB++;
					break;
				case 3:
					winPrinter("A");
					winA++;
					break;
			}
			}
		}
		
	}
	
	public static void winPrinter(String winner){
		if (winner!=null){
		System.out.println(winner +" WINS");
		}
		else
			System.out.println("DRAW");
	}

}
