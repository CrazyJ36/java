class forEachLoop {
    public static void main(String[] args) {
/* Enhanced for loop(or 'for each' loop), traverses elements in arrays.

   write as:
   for (type varName: array) {
       do stuff for each item...
   }

*/

        // for each in nums, assign variable name,
        // and print variable name when the loop gets to that index item.
        int[] nums = {1,2,3,4,5};
        for (int nName: nums) {
            System.out.println(nName);
        }
    }
}
