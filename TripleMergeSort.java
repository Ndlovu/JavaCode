//program by Gachuru Patrick Njogu
//P15/1448/2012
//26th November 2014
/*This is a merge sort program, it divides the array into three, sorts the arrays then merges the final arrays*/

public class TripleMergeSort {

    private int[] array;
	private int[] temporaryArray;
	private int length;
// the main method
	public static void main(String a[]){
		
		int[] inputArr = {4,3,1,80,7,98,42,58,61,40};// array initialization
		TripleMergeSort object = new TripleMergeSort();//object instantiation
		object.getArray(inputArr);
		for(int n:inputArr){
	    	System.out.println(n);
	    	System.out.print(" ");
	    }
	}
	//this array gets the specific elemenst
             public void getArray(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.temporaryArray = new int[length];
		splitArray(0, length - 1);
            }
    //this method splits the array into two
           private void splitArray(int lowerIndex, int higherIndex) {
		
		if (lowerIndex < higherIndex) {
                    int one_third = (higherIndex - lowerIndex)/3;
                    int two_third = 2*(higherIndex - lowerIndex)/3;          // lowerindex < lowerIndex+one_third < lowerindex+two_third < higherIndex
                    
                    splitArray(lowerIndex,lowerIndex + one_third);
                    splitArray(lowerIndex + one_third + 1 ,lowerIndex + two_third);
                    splitArray(lowerIndex + two_third +1, higherIndex);

                    sortArray(lowerIndex,lowerIndex +one_third,lowerIndex+two_third);
                    sortArray(lowerIndex,lowerIndex + two_third,higherIndex);
		}
	}
	//this method sorts the array in ascending order. It arranges the elements 
           private void sortArray(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			temporaryArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (temporaryArray[i] <= temporaryArray[j]) {
				array[k] = temporaryArray[i];
				i++;
			} else {
				array[k] = temporaryArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = temporaryArray[i];
			k++;
			i++;
		}

	}

    
}
