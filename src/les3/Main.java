package les3;

import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// int t = 101;
		// System.out.println(t>100?"Steam":(t>0?"Water":"Ice"));
		/*
		long startTime = new Date().getTime();
		
		byte[] byteMas = new byte[10];
		short[] shortMas = new short[10];
		int[] intMas = new int[10];

		int counter = 0;
		int countB = 0;
		int countS = 0;
		int countI = 0;
		do {
			int rnd = (int) (Math.random() * Integer.MAX_VALUE);
			if ((rnd <= Byte.MAX_VALUE) && (countB < 10)) {
				byteMas[countB++] = (byte) rnd;
			}
			else if ((rnd <= Short.MAX_VALUE) && (countS < 10)) {
				shortMas[countS++] = (short) rnd;
			}
			else if ((countI < 10)) {
				intMas[countI++] = rnd;
			}
			counter++;
		} while ((countB + countS + countI) < 30);
		System.out.println(Arrays.toString(byteMas));
		System.out.println(Arrays.toString(shortMas));
		System.out.println(Arrays.toString(intMas));
		System.out.println(counter);
		
		long endTime = new Date().getTime();
		System.out.println("Time: "+(endTime-startTime));
		*/
		/*
		int num = 12355;
		int counter = 0;
		int counterParn = 0;
		boolean end = false;
		do
		{
			int ostatok = num%10;
			if (ostatok%2 ==0)
			{}
			num=num/10;
			if(num==0)
			{
				counter++;
				end=true;
			}
			
		}while(num!=0);
		System.out.println(counter);
		*/
		
		int[] a = {0,0,0,0,0,0,0,0};
		int[] b = {1,1,1};
		
		System.arraycopy(b, 0, a, (a.length-b.length)/2, b.length);
		System.out.println(Arrays.toString(a));
		}
			
	}


