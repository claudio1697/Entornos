import java.util.Scanner;

public class Depuracion3 {

	public static final int kMAX=10;
	
	public static int esta( cosa []l,int e){
	
			int i;
			
			for(i=0; l[i]!=null  && l[i].getA()!=e ;i++);
		
			return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int c=0,i=0,enc=0;
		Scanner sc = new Scanner(System.in);
		
		cosa [] lista = new cosa[kMAX];
		
		
		while(i<kMAX) {
			
			System.out.println("Dime un numero: ");
			num=sc.nextInt();

			enc=esta(lista,num);
			if(enc<c) {
				lista[enc].setB(lista[enc].getB()+1);
			}
			else {
				lista[c] = new cosa(num);
				c++;
				
			}
		
			i++;
		}
		
		
		sc.close();

	}

}
