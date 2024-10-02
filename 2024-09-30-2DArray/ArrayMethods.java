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
    return sum;
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
      
        //3. Modify a given 2D array of integer as follows:
    //Replace all the negative values:
    //-When the row number is the same as the column number replace
    //that negative with the value 1
    //-All other negatives replace with 0
  public static int[][] replaceNegative(int[][] vals){
  for (int i = 0; i<vals.length;i++){
    for(int j = 0; j<vals[i].length;j++){
      if (0>vals[i][j]){
        vals[i][j]=0;
        if(i == j){
          vals[i][j]=1;
        }
      }
    }
  }
    return vals;
  }

    //4. Make a copy of the given 2d array.
    //When testing : make sure that changing the original does NOT change the copy.
    //DO NOT use any built in methods that "copy" an array.
    //You SHOULD write a helper method for this.
    //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
	  int rows = nums.length;
	  int columns = 0;
	  for (int i = 0; i < nums.length ; i++)
	  {
		  if (nums[i].length > columns)
		  {
			  columns = nums[i].length;
		  }
	  }
	  int[][] newArray = new int[rows][columns];
	  for ( int i = 0; i < rows; i ++)
	  {
		  int index = nums[i].length;
		  if ( columns > index)
			  {
				  newArray[i] = new int[index];
			  }
		  for (int x = 0; x < columns; x ++)
		  {
			  if ( x > index - 1)
			  {
				  break;
			  }
			  newArray[i][x] = nums[i][x];
		  }
	  }
    return newArray;//placeholder so it compiles
  }
  public static void main (String[]args){
    int[][] ary = new int[3][5];
    System.out.println(arrToString(ary));
	int[][] secondAry = new int[][] {{2,7,9},{5,1,2},{2,7,8}};
	System.out.println(arr2DSum(secondAry));
	int[][] testingArray = new int[][] {{1,2,3},{4,5,6}};
	System.out.println(arrToString(swapRC(testingArray)));
	int[][] testNegative = new int[][] {{-2,-3,-1},{-1,-1,-2}};
	System.out.println(arrToString(replaceNegative(testNegative)));
	int[][] testingCopy = new int[][]{{1,2,3,4},{1,2,3,4,5,6,7}};
	System.out.println(arrToString(copy(testingCopy)));
  }
}
