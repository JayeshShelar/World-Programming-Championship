package WPC;

import java.util.Scanner;

public class MinAddition {
	public static void main(String[] args) {
		int m,n,k;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		
		boolean pos[] = new boolean[n];
		
		for(int i=0;i<m;i++) {
			int getPos = sc.nextInt();
			pos[getPos-1]=true;
			
			for(int j=getPos; (j<(getPos+k)) && (j>0) && (j<n);j++) {
				System.out.println("inn");
				
				System.out.println("set "+j);
				pos[j]=true;
			}
			System.out.println(getPos-k);
			for(int l=getPos-1;l>=(getPos-k) && l>0 && l<n;l--) {
				System.out.println("inssn");
				pos[l]=true;
				System.out.println("set "+l);
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.println(pos[i]);
		
		
	}
}
