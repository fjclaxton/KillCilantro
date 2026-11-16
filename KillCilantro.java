public class KillCilantro {
   
   public static String killCilantro(String s, String remove, String add) {
      //static String used to find cilantro
      String c = remove;
      
      int count = 0; //used to check is for loop looped through all chars of cilantro
      String newS = ""; //string used to store new string
      
      //loop through s
      for (int i = 0; i<s.length(); i++) {
         if (s.charAt(i) == c.charAt(0)) {
            for (int v = i; v<s.length(); v++) {
               if (count < 8 && s.charAt(v) == c.charAt(v-i)) {
                  count++;
               } else {
                  break;
               }
            }
            if (count == 8 && s.length() >= (i + 8)) {
               i+=7; //increments the i by 7 to ignore the cilantro
               newS += add; //adds parsley in the place where cilantro was
            }
         } else {
            newS += s.substring(i, i+1);
         }
      }
      return newS;
   }
   public static void main(String[] args) {
      //test the values
      System.out.println(killCilantro("testcilantrotest", "cilantro", "parsley"));
      System.out.println(killCilantro("cilantrotest", "cilantro", "parsley"));
      System.out.println(killCilantro("nothinghere", "cilantro", "parsley"));
      System.out.println(killCilantro("testcilantro", "cilantro", "parsley"));
      System.out.println(killCilantro("cilantrocilantrocilantro", "cilantro", "parsley"));
      
   }
}