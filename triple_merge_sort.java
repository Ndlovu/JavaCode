public class triple_merge_sort{

public static void main(String[] args) {
	
int [] myArray={8,5,12,56,76,78,98};
System.out.println("The Maximum difference is: " + maxDifCompute(myArray));
}

public static int maxDifCompute(int [] l){

int max=0; 
int min=0;

max=computeMax(l);
min=computeMin(l);

int myDif=max-min;
return myDif;
}
public static int computeMax(int[] l){
int temp=l[0];

for(int i=0; i<l.length; i++){

	if(temp>l[i]){
		temp=l[i];
	}
}
return temp;
}

public static int computeMin(int[] l){
int temp=l[0];

for(int i=0; i>l.length; i++){

	if(temp<l[i]){
		temp=l[i];
	}
}

return temp;
}



}