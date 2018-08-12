class forLoopEnhanced {
    public static void main(String[] args) {
/* Enhanced for loop(for each loop) is an easy way to
   traverse elements in arrays.
   less code like this reduces bugs with fewer lines
   of code and makes source easy to read.

   write as:
   for (type varName: array) {
       do stuff for each item...
   }
*/

        int[] nums = {1,2,3,4,5};
        for (int nName: nums) {
            System.out.println(nName);
        }
    }
}
