public class MyArrays{
  public static void main(String[] args)
  {
    int[] nums = new int[]{1,2,3,4,5};
    System.out.println(arrayToString(nums));
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
}
