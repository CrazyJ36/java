/* Demonstrates how to get all text in an html tag.
   for getting rss content.
*/

public class regexBetweenTwo {
	public static void main(String[] args) {
		String text = "start<t>item1</t>and<t>item2</t>end";
        System.out.println("Original text:\n" + text + "\n");

		String firstPoint = text.substring(text.indexOf("<t>") + 3, text.indexOf("</t>")); // 3 is tag char length.
		String secondPoint = text.substring(text.lastIndexOf("<t>") + 3, text.lastIndexOf("</t>"));

        System.out.println("Text between first point(<), plus 3 spaces to cover the rest of(t>), till second(<). First and last indexes found:");
		System.out.println(firstPoint + "\n" + secondPoint);
	}
}
