public class notBool2 {
    public static void main(String[] args) {
        boolean somethingTrue = true;
/* somethingTrue can be evaluated for trueness (is) as:
if (somethingTrue == true) {//..}
or
if (somethingTrue) {//..} as it was already true when it was
defined as a true variable.
*/
/* evaluating for falseness (is not somethingTrue):
if (somethingTrue != true) {//..}
or
if (!somesthingTrue) {//..}
*/
	if (somethingTrue) {
	    System.out.println("true is true");
	} else if (!somethingTrue) {
	      System.out.println("true is false");
	};
   }
}
