class arrayMulti {
/* you can define multiple arrays.
   example: several android lists with the same items
   type[][] varName = {{i,i,i},{i,i,i}}; // i for item
   multidimensional array only requires int [][] (two square
   bracket sets) to get one item, even if more than two sets of items.
*/
    public static void main(String[] args) {
        int[][] arrMulti = {{1,2,3},{4,5,6}};
// get second array, first item. or //[row][column]
        int var = arrMulti[1][0];
        System.out.println(var);
   }
}
