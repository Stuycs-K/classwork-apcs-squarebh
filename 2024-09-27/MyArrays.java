public class MyArrays{
  public static void main(String[] args)
  {
    int[] nums = new int[]{1,2,3,4,5};
    System.out.println(arrayToString(nums));
	int[] anArray = new int[] {1,2,3,4,5};
	System.out.println("Address for original array: " + anArray);
	System.out.println("address for copy array: " + returnCopy(anArray));
	System.out.println("Check for equal addresses: " + (anArray == returnCopy(anArray)));
	int[] secondArray = new int[] {10,56,124,22,421};
	int[] secondTestArray = new int[] {56,78,129,20,1,1,1};
	System.out.println("Result for concatenation of two arrays: " + arrayToString(concatArray(secondArray,secondTestArray)));
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
	public static int[] concatArray(int[] ary1, int[] ary2)
	{
		int[] newArray = new int[ary1.length + ary2.length];
		for (int i = 0; i < newArray.length;i++)
		{
			if ( i < ary1.length)
			{
				newArray[i] = ary1[i];
			}
			if ( i >= ary1.length)
			{
				newArray[i] = ary2[i - ary1.length];
			}
		}
		return newArray;
	}
}