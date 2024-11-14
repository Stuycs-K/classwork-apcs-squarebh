import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> res = new ArrayList<String>(size);
    for(int i=0;i <= size;i++)
    {
      double tem = 11*Math.random();
      int temp = (int)(tem);
      System.out.println(tem);
      res.add("" + temp);
      if (res.get(i).equals("0"))
      {
        res.set(i, "");
      }
    }
    return res;
  }
  public static void main(String[] args)
  {
    System.out.println(createRandomArray(5));

  }
}
