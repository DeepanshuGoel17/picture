package hackerrank;


	
	public class MergeSort {
	    private int[] numbers;
	    private int[] helper;

	    private int number;

	    public void sort(MergeSort a) {
	        this.numbers = a.numbers;
	        number = this.numbers.length;
	        this.helper = new int[number];
	        mergesort(0, number - 1);
	    }

	    private void mergesort(int low, int high) {

	        if (low < high) {
	
	            int middle = low + (high - low) / 2;
	
	            mergesort(low, middle);
	           mergesort(middle + 1, high);
	           merge(low, middle, high);
	        }
	    }

	    private void merge(int low, int middle, int high) {

	
	        for (int i = low; i <= high; i++) {
	            helper[i] = numbers[i];
	        }
	        int i = low;
	        int j = middle + 1;
	        int k = low;
	
	
	        while (i <= middle && j <= high) {
	            if (helper[i] <= helper[j]) {
	                numbers[k] = helper[i];
	                i++;
	            } else {
	                numbers[k] = helper[j];
	                j++;
	            }
	            k++;
	        }
	
	        while (i <= middle) {
	            numbers[k] = helper[i];
	            k++;
	            i++;
	        }
	
	

	    }
	
	public static void main(String args[]){
			int []a  ={1,9,2,6,3,5,2,9,1};
			MergeSort a1= new MergeSort();
			a1.numbers= a;
			a1.sort(a1);
			for(int i: a1.numbers){
				
				System.out.println(i);
			}
	}
	
	

}
