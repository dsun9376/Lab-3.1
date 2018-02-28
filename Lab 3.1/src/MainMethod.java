import java.util.Arrays;

//Dustin Sun
//lab 3.1
// 2/4/18 last edited
public class MainMethod {
	
	public static void main(String [] args)
	{   System.out.println("a".compareTo("b"));
		//Testing arrays
		int [] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double [] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String [] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		long start = System.nanoTime();
		//insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		start = System.nanoTime();
		//selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		start = System.nanoTime();
		bubbleSort(test3);
		System.out.println(test3[0].compareTo(test3[1]));
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test3));
	}

	public static void insertionSort(int[] list1) {  
        for (int i=1; i < list1.length; i++) {
        	int temp = list1[i];
        	int j;
        	for (j=i-1; j>=0 && temp <list1[j]; j--)
        		list1[j+1] = list1[j];
        		list1[j+1] = temp;
        }
	}
        
	public static void selectionSort(double[] list1){
		for (int i=0; i<list1.length-1; i++)
		{
			int index=i;
			for (int j=i+1; j<list1.length; j++) {
				if (list1[j] < list1[index]) {
					index = j;
				}
			}
			int smallerNumber = list1[index];
			list1[index] = list1[i];
			list1[i] = smallerNumber;
		}
	}

	
	public static void bubbleSort(String[] list1)
    { 
		while(sorted(list1)) {
			String x = "";
			for (int i=0; i<list1.length-1; i++) {
				int y= i+1;
				if (list1[i].compareTo(list1[y]) > 0)
				{
					Swap(list1, i, i + 1);
				}
		}
	}
	
			
		
      
		System.out.println(Arrays.toString(list1));
    }
	public static void bubbleSort1(String[] list1)
	{
		/*int length = list1.length;
		while (length > 0)
		{
			int i = 0;
			for (int j = i + 1; j < length; j++)
			{
				if (list1[i].compareTo(list1[j]) > 0)
				{
					swap(list1, j , i);
				}
				i = j;
			}
			length--;
		}*/
		
		int changeindex = 1;
		int listlength = list1.length - 1;
		while (changeindex != 0)
		{
			changeindex = 0;
			for (int i = 0; i < listlength; i++)
			{
				if (list1[i].compareTo(list1[i + 1]) > 0)
				{
					Swap(list1, i, i + 1);
					changeindex++;
				}
			}
			listlength--;
		}
	}
	public static boolean sorted(String[] list1) {
		for(int i=0; i<list1.length-1; i++) {
			int y= i+1;
			if(list1[i].compareTo(list1[y])>0) {
				return false;
			}
		}
		return true;
	}
	
	public static void Swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void Swap(double[] test2, int index1, int index2) {
		double temp = test2[index1];
		test2[index1] = test2[index2];
		test2[index2] = temp;
	}

	public static void Swap(String[] arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
   
   