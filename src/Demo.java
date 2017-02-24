import java.math.BigInteger;

public class Demo {

	public static void main(String[] args) {
		
//		int n = 5, c = 2;
//		int n = 100, c = 10;
		int n = 1000000, c = 200;
		BigInteger tmpSum;
		BigInteger totalSum = new BigInteger("0");
		BigInteger[] array = new BigInteger[n];
		
		for(int i=0;i<n;i++){
			if(i<=c) {
				array[i] = new BigInteger(String.valueOf(i));
			}else{
				tmpSum = new BigInteger("1");
				for(int j=i-c+1;j<=i;j++){
					tmpSum = tmpSum.multiply(new BigInteger(String.valueOf(j)));
				}
				array[i] = tmpSum;
			}
		}
		
		for(int i=0;i<n;i++){
			totalSum = totalSum.add(array[i]);
		}
		System.out.print(totalSum);
	}
	
}
