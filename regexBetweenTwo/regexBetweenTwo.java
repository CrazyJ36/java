/* Demonstrates how to get text between an html tag.
   for getting rss content.
*/

class regexBetweenTwo {
	public static void main(String[] args) {
		String text = "start<t>item1</t>then<t>item2</t>done";
		String first = text.substring(text.indexOf("<t>") + 3, text.indexOf("</t>"));

		String second = text.substring(text.lastIndexOf("<t>") + 3, text.lastIndexOf("</t>"));
		System.out.println(first + "\n" + second);
	}
}
