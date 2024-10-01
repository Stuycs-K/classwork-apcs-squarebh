public class ArrayMethods{
  //1. Alexandru Cimpoiesu acimpoiesu60@stuy.edu Matthew Cheng mcheng60@stuy.edu

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrayToString(int[] nums){
  String str = "[";
  for (int i = 0;i<nums.length;i++){
    str+=nums[i];
    if (i<nums.length-1){
      str += ", ";
    }
  }
  return str+"]";
}

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    //this should use arrToString(int[])
    String str = "[";
    for (int i = 0; i < ary.length; i++){
        str += arrayToString(ary[i]);
        if(i<ary.length - 1){
          str+= ", ";
        }
    }
    return str + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
	  int sum = 0;
	  for ( int i = 0; i < nums.length;i++)
	  {
		  for (int x = 0; x < nums[i].length;x++)
		  {
			  sum = sum + nums[i][x];
		  }
	  }
    //use a nested loop to solve this
    return sum;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
	int rows = nums[0].length;
	int columns = nums.length;
	int[][] secondArray = new int [rows][columns];
	for ( int i = 0; i < secondArray.length;i++)
	{
		for(int x = 0; x < secondArray[i].length;x++)
		{
			secondArray[i][x] = nums[x][i];
		}
	}
	return secondArray;
  }
  public static void main (String[]args){
    int[][] ary = new int[3][5];
    System.out.println(arrToString(ary));
	int[][] secondAry = new int[][] {{2,7,9},{5,1,2},{2,7,8}};
	System.out.println(arr2DSum(secondAry));
	int[][] testingArray = new int[][] {{1,2,3},{4,5,6}};
	System.out.println(arrToString(swapRC(testingArray)));
  }
}
