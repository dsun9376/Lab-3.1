//Dustin Sun
//lab 3.1
// 2/4/18 last edited
public class MainMethod {
	
	public static void main(String [] args)
	{
		/*int [] test1 = {1,5,3,8,2,5,4,10};
		double [] test2 = {8,4,6,2,10,52.35, 52.564,87,46.234};
		String [] test3 = {"wow", "omg", "you think this will work?", "nah man no way", "way to be positive", "well let's try it", "did this actually work? amazing.."};
		*/
		
		int [] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double [] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String [] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		long start = System.nanoTime();
		ArrayMethods1.insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		printArray(test1);
		
		start = System.nanoTime();
		ArrayMethods1.selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		printArray(test2);
		
		start = System.nanoTime();
		ArrayMethods1.bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
		printArray(test3);
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

	
	public static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) 
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // IF no two elements were 
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
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
   
   