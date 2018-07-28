package project3;


public class UserMainCode {

	public static boolean checkTriplets(int[] arr) {
		int iter=0;
		
		for(iter=0;iter<arr.length-2;iter++) {
			if(arr[iter]==arr[iter+1] && arr[iter]==arr[iter+2])
			return true;
			else 
				continue;
		}
		return false;
	}


}
