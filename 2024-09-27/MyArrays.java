public class MyArrays{
  public static void main(String[] args)
  {
    int[] nums = new int[]{1,2,3,4,5};
    System.out.println(arrayToString(nums));
	int[] anArray = new int[] {1,2,3,4,5};
	System.out.println("Address for original array: " + anArray);
	System.out.println("address for copy array: " + returnCopy(anArray));
	System.out.println("Check for equal addresses: " + (anArray == returnCopy(anArray)));
  }
  public static String arrayToString(int[] nums)
  {
    String result = "[";
    for ( int i = 0; i < nums.length ; i++ ){
    {
      result += nums[i];
    }
    if ( i < nums.length - 1)
    {
      result += ", ";
    }}
    return result + "]";
    }
	public static int[] returnCopy(int[] ary)
	{
		int[] copy = new int[ary.length];
		for (int i = 0; i<ary.length;i++)
		{
			copy[i] = ary[i];
		}
		return copy;
	}
}


