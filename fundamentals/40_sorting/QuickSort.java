public class QuickSort {
	public static void main(String[] args){
    
        int[] numbers = {9, 6, 3, 7, 1, 10};
        quickSort(numbers, 0, 5);
        print(numbers);

	}

	public static void print(int[] array){
       
        for(int i =0; i < array.length; i++){
       	   System.out.print(array[i] + " ");
       }
	}

	public static int partitition(int[] array, int start, int end){

		int pivot = array[end];
		int i = (start-1);
		
		for(int j = start; j < end; j++){
			if(array[j] <= pivot){
				i++;

				   int temp = array[i];
			       array[i] = array[j];
			       array[j] = temp;
			}
		}

         		   int temp = array[i+1];
			       array[i+1] = array[end];
			       array[end] = temp;

		return i+1;
	}

	public static void quickSort(int[] array, int start, int end){
		if(start < end){
			int pIndex = partitition(array, start, end);
			quickSort(array, start, pIndex-1);
			quickSort(array, pIndex +1, end);
		}
	}
}