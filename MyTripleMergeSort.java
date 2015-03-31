public class MyTripleMergeSort {

    private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]){
		
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};// array initialization
		MyTripleMergeSort object = new MyTripleMergeSort();//object instantiation
		object.sort(inputArr);
		for(int n:inputArr){
	    	System.out.println(n);
	    	System.out.println(" ");
	    }
	}
             public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
            }
           private void doMergeSort(int lowerIndex, int higherIndex) {
		
		if (lowerIndex < higherIndex) {
                    int one_third = (higherIndex - lowerIndex)/3;
                    int two_third = 2*(higherIndex - lowerIndex)/3;// lowerindex < lowerIndex+one_third < lowerindex+two_third < higherIndex
                    
                    doMergeSort(lowerIndex,lowerIndex + one_third);
                    doMergeSort(lowerIndex + one_third + 1 ,lowerIndex + two_third);
                    doMergeSort(lowerIndex + two_third +1, higherIndex);
   
                    mergeParts(lowerIndex,lowerIndex +one_third,lowerIndex+two_third);
                    mergeParts(lowerIndex,lowerIndex + two_third,higherIndex);
		}
	}
           private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}

    
}
