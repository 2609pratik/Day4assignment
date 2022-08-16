package Day4;

public class SnakeAndLadder {
	
	public static void main(String[] args) {
		//player 1 
		int token1 = 0;
		int counter1 = 0;
		int i1=1;
		do{
			counter1 += i1;
			System.out.print(token1+" ");
			int x1= (int) (Math.random()*10)%3;
			int dice1 = (int) (Math.random()*10)%3;
			switch (x1) {
			case 0: {
				break;
			}
			case 1: {
				token1 -= dice1;
				if (token1<0) {
					token1=0;
				}
				else if(token1==100){
					token1=100;
				}
				break;
			}
			default:
				token1 += dice1;
				if (token1>100) {
					token1 -= dice1 ;
				}
			}
		}while(!(token1==100));
		System.out.println("100");
		System.out.println(counter1);
		
		//player 2
		int token2 = 0;
		int counter2 = 0;
		int i2=1;
		do{
			counter2 += i2;
			System.out.print(token2+" ");
			int x2= (int) (Math.random()*10)%3;
			int dice2 = (int) (Math.random()*10)%3;
			switch (x2) {
			case 0: {
				break;
			}
			case 1: {
				token2 -= dice2;
				if (token2<0) {
					token2=0;
				}
				else if(token2==100){
					token2=100;
				}
				break;
			}
			default:
				token2 += dice2;
				if (token2>100) {
					token2 -= dice2 ;
				}
			}
		}while(!(token2==100));
		System.out.println("100");
		System.out.println(counter2);
		if (counter1<counter2) {
			System.out.println("player 1 is winner");
		}
		else {
			System.out.println("player 2 is winner");
		}
	}
	

}
