
package zohoquestion;

import java.util.Arrays;

public class ZohoQuestion1 
{
    public static void rearry(int[] arr) 
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) 
        {
            if (arr[left] < 0) 
            {
                left++; 
            } 
            else if (arr[right] >= 0) 
            {
                right--; 
            }
            else 
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {-1, 2, -3, 4, -5, 6,-7,8,-9,0};
        rearry(arr);
        
        System.out.println("Rearranged array: " + Arrays.toString(arr));
    }
}

   

