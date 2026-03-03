public class Insert 
{
    public static void main(String[] args)
	{
       
        int n = 5; 
        int[] Arr = {18, 20, 40, 50, 80};
        int Insert = 105;
        int position = 5;

        int[] newArr = new int[n + 1];

        for (int i = 0; i < n + 1; i++)
		{
            if (i < position - 1) 
			{
                newArr[i] = Arr[i];
            } 
			else if (i == position - 1)
			{
                newArr[i] = Insert;
            } 
			else 
			{
                newArr[i] = Arr[i - 1];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + (i < newArr.length - 1 ? " " : ""));
        }
    }
}