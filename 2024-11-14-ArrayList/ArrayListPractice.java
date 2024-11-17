import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> res = new ArrayList<String>(size);
    for(int i=0;i <= size;i++)
    {
      double tem = 11*Math.random();
      int temp = (int)(tem);
      //System.out.println(tem);
      res.add("" + temp);
      if (res.get(i).equals("0"))
      {
        res.set(i, "");
      }
    }
    return res;
  }
  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for (int i = 0; i < original.size();i++)
  {
    if(original.get(i).equals(""))
    {
      original.set(i, "Empty");
    }
  }
}
public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> reverse = new ArrayList<String>(original.size());
  for (int i = original.size()-1; i >= 0; i --)
  {
    reverse.add(original.get(i));
  }
  return reverse;
} 
public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  int smallest = b.size();
  int largest = a.size();
  if (a.size() < b.size())
  {
    smallest = a.size();
    largest = b.size();
  }
  ArrayList<String> mixed = new ArrayList<String>(smallest);
  for ( int i = 0; i < smallest; i ++)
  {
    mixed.add(a.get(i));
    mixed.add(b.get(i));
  }
  for( int x = smallest; x < largest; x ++)
  {
    if (a.size() > b.size())
    {
      mixed.add(a.get(x));
    }
    else if(b.size() > a.size())
    {
      mixed.add(b.get(x));
    }
  }
  return mixed;
} 
  public static void main(String[] args)
  {
    ArrayList<String> test1 = createRandomArray((int)(12*Math.random()));
    System.out.println(createRandomArray(5));
    replaceEmpty(test1);
    System.out.println(test1);
    ArrayList<String> test2 = createRandomArray((int)(12*Math.random()));
    System.out.println(test2);
    System.out.println(makeReversedList(test2));
    System.out.println(mixLists(test1, test2));
    ArrayList<String> test3 = createRandomArray(300);
    System.out.println(test3);
    replaceEmpty(test3);
    System.out.println(test3);
    ArrayList<String> test4 = createRandomArray((int)(20*Math.random()));
    ArrayList<String> test5 = createRandomArray((int)(30*Math.random()));
    System.out.println(test4);
    System.out.println(test5);
    System.out.println(mixLists(test4, test5));
    System.out.println(makeReversedList(test4));
    System.out.println(makeReversedList(test5));
    System.out.println(mixLists(makeReversedList(test4), makeReversedList(test5)));
    ArrayList<String> test6 = createRandomArray(20000);
    System.out.println(test6);
    replaceEmpty(test6);
    System.out.println(test6);
  }
}
