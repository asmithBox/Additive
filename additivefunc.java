package additivefunction;

//import secret;
import java.util.ArrayList;

public class additivefunc {

	public static ArrayList<Integer> Plist = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		//Example execution
		int n = 200;
	
		prime(n);	
		cauchyProof(Plist, Plist.size());

	}
	
	public static boolean cauchyProof(ArrayList data, int n) {
		
		for(int i=0;i<n;i++) {
			if(!cauchyComp(data, (int) data.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean cauchyComp(ArrayList data, int x) {
		
		for(int current=0;current<data.size();current++){
			int y = (int) data.get(current);
			
			if(secret(x, y) == (secret(x) + secret(y))) {
				System.out.println(x + " - " + y);
			} 
			
		}
		
		return true;
	}
	
	public static void prime(int n) {
		
		for(int i=1; i<=n;i++) {
			if(isPrime(i) == false){
				continue;
			} else {
				Plist.add(i);
			}
		}
	}
	
	public static boolean isPrime(int k) {
		
		for(int i=2;i<k;i++){
			if(k%i==0)
				return false;
		}
		return true;			
	}

	public static int secret(int x) {
	//placeholder	
		return 5;
	}
	
	public static int secret(int x, int y){
	//placeholder
	int val = 10;
		
		return 10;
	}
	
}

