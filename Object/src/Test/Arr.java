package Test;


//빠른 for문
public class Arr {

		public static void main(String[] args) {
			
			
			
			int[][] a2= {
					{10,20,30}, //1
					{11,22,33}, //2
					{16,25,34}, //3
					{12,22,32}, //4
					{14,21,31}  //5
			};
			int total = 0;
			double avg= 0.0;
			int cnt =0;
			 for(int[] a : a2) {
		            total = 0;
		            cnt++;
		            for(int s : a) {
		                total += s;
		            }
		            System.out.println(cnt+"번 총점 : "+total+"점");
		            avg = Double.parseDouble(String.format("%.2f", (double)total/a.length));
		            System.out.println(cnt+"번 평균 : "+avg+"점");
		        }
			
//		String [] arData = {"안녕","반가워","이름이","뭐니 ?"};
//		
//		for(String i : arData) {
//			System.out.println(i);
//		}
//		
//		int [] arData1 = {1,2,3,4,5,6,7};
//		
//		for(int i : arData1) {
//			System.out.println(i);
//		}
//		
//	}
		}
}
