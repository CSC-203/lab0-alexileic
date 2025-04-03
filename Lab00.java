public class Lab00
{
   public static void main(String[] args)
   {
      // declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8;
      // printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);

      // a list (make an array)
      int size = 4;
      int [] nums = new int[size];
      nums[0] = 3;
      nums[1] = 6;
      nums[2] = -1;
      nums[3] = 2;
      for (int num: nums) { // for num in nums
         System.out.println(num);
      }

      // call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found: " + numFound);

      // a counting for loop
      for (int i = 1; i <= 10; i++) { // for i in range(1,11)
         System.out.print(i + " ");
      }
      System.out.println();
   }

   public static int char_count(String s, char c) { //char_count returns an int so have public static int
      int count = 0;
      for (int ch = 0; ch < s.length(); ch++) {
         if (s.charAt(ch) == c) {
            // found documentation for charAt here: https://www.w3schools.com/java/ref_string_charat.asp
            count++;
         }
      }
      return count;
   }
}
