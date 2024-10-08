import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    int[][] testZero = new int[3][5];
    System.out.println (countZeros2D(testZero));
	int[][] testHTML = new int[][] {{1,2},{3,4}};
	System.out.println (htmlTable(testHTML));
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String str = "[";
    for (int i = 0;i<ary.length;i++){
      str+=ary[i];
      if (i<ary.length-1){
        str += ", ";
      }
    }
    return str+"]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++){
        str += arrToString(ary[i]);
        if(i<ary.length - 1){
          str+= ", ";
        }
    }
    return str + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for(int i = 0; i < nums.length; i ++)
    {
      for ( int b = 0; b< nums[i].length;b++)
      {
        if (nums[i][b] == 0);
        count += 1;
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
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
    return newArray;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
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

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
	  String newString = arrToString(nums);
	  String htmlString = "<table><tr>";
	  for (int i = 0; i < newString.length();i++)
	  {
		  if (Character.isDigit(newString.charAt(i)))
		  {
			  htmlString = htmlString + "<td>" + newString.substring(i,i+1) + "</td>";
		  }
	  }
    return htmlString + "</tr></table>";
  }
}
