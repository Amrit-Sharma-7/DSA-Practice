
public class NegativeToEnd {
	public void SegregateElements(int arr[], int n) {
		/*the problem is to segregate negative and 
		 * positive elements to opposite sides with same order*/
		//create a temporary array to get extra space
		int temp[]=new int[n];
		int j=0;
		//add positive elements to temp
		for(int i=0; i<n; i++)
			if(arr[i]>0)
				temp[j++]=arr[i];
		//Now check if the array has only negatives or only positives
		if(j==n||j==0)
			return;
		//add negative elements to temp
		for(int i=0; i<n; i++)
			if(arr[i]<0)
				temp[j++]=arr[i];
		//Finally copy and paste work!!
		for(int i=0; i<n; i++)
			arr[i]=temp[i];
	}
}
