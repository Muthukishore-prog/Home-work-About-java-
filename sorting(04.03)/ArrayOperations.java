import java.util.Scanner;
import java.util.Arrays;

class ArrayOperations 
{
     static int[] array;
     static boolean isSorted = false;
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
	{
        int choice;
        do 
		{
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Accept array elements");
            System.out.println("2. Display array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1: acceptElements();
				break;
				
                case 2: displayArray(); 
				break;
				
                case 3: sortMenu(); 
				break;
				
                case 4: searchMenu();
				break;
				
                case 5: System.out.println("Exiting...");
				break;
				
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }


     static void acceptElements() 
	{
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
		{
            array[i] = sc.nextInt();
        }
        isSorted = false; 
        System.out.println("Elements accepted.");
    }

     static void displayArray() 
	{
        if (array == null) 
		{
            System.out.println("Array is empty! Use Option 1 first.");
            return;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }


     static void sortMenu() 
	{
        if (array == null) return;
        System.out.println("\nChoose Sorting Method:");
        System.out.println("1. Bubble Sort\n2. Selection Sort\n3. Merge Sort");
        int sChoice = sc.nextInt();

        switch (sChoice) 
		{
            case 1: bubbleSort(array); 
			break;
			
            case 2: selectionSort(array);
			break;
			
            case 3: mergeSort(array, 0, array.length - 1);
			break;
			
            default: System.out.println("Invalid Sorting Choice.");
			
			return;
        }
        isSorted = true;
        System.out.println("Array sorted successfully.");
    }

     static void bubbleSort(int[] arr) 
	{
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
		{
            for (int j = 0; j < n - i - 1; j++) 
			{
                if (arr[j] > arr[j + 1]) 
				{
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

     static void selectionSort(int[] arr) 
	{
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
		{
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

     static void mergeSort(int[] arr, int l, int r) 
	{
        if (l < r) 
		{
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

     static void merge(int[] arr, int l, int m, int r) 
	{
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
		
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
		
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

     static void searchMenu() 
	{
        if (array == null) 
			return;
        System.out.print("Enter element to search: ");
		
        int key = sc.nextInt();
		
        System.out.println("1. Linear Search\n2. Binary Search");
		
        int choice = sc.nextInt();

        int result = -1;
		
        if (choice == 1) 
		{
            result = linearSearch(key);
        } 
		else if (choice == 2) 
		{
            if (!isSorted) 
			{
                System.out.println("Error: Array must be sorted for Binary Search!");
                return;
            }
            result = binarySearch(key);
        }

        if (result != -1) System.out.println("Element found at index: " + result);
		
        else System.out.println("Element not found.");
		
		
    }

     static int linearSearch(int key) 
	{
        for (int i = 0; i < array.length; i++) 
		{
            if (array[i] == key) return i;
        }
        return -1;
    }

     static int binarySearch(int key) 
	{
        int low = 0, high = array.length - 1;
		
        while (low <= high) 
		{
            int mid = low + (high - low) / 2;
			
            if (array[mid] == key) 
				return mid;
			
            if (array[mid] < key) low = mid + 1;
			
            else high = mid - 1;
        }
        return -1;
    }
}