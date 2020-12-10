
public class SortingAscending {

	public static void main(String[] args) {
		int [] arr = { 5, 2, 8, 7, 1};
		int temp = 0 ;
		// To print array elements before sorting in ascending order
		 System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }  
	        
	        //Sorting in ascending order
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        } 
	        // To print numbers after sorting the elements
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	
	}
	

}
