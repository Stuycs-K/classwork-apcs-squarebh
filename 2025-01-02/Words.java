public class Words{
  public static void main(String[] args){
    makeWords(5,"","abcdefghijklmnopqrstuvwxyz");
  }
  public static void makeWords(int letters, String result, String alphabet){
    if(letters == 0){
      System.out.println(result);
    }
    else{
      for (int i = 0; i < alphabet.length();i++){
        makeWords(letters-1, result + alphabet.substring(i,i+1),alphabet);
      }
    }
  }
}
