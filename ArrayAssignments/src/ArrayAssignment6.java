
public class ArrayAssignment6 {
	
	public static void main(String[] args) {
		//6)Perform CRUD operations on Array
		int arr[]=new int[6];
		int n=4;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int ele=100;
		int pos=5;
		for(int i=n;i>pos-1;i--) {
			arr[i]=arr[i-1];   //updating
		}
		arr[pos-1]=ele; //inserting 
		n++;
		
		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int delpos=2;
		for (int i = delpos-1; i < n; i++) {
			arr[i]=arr[i+1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon "+delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
