import java.io.CharArrayWriter;

class charArrayStringWriter {

    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.append('f');
        charArrayWriter.append('z');
        int charArrayWriterSize = charArrayWriter.size();
        System.out.println("CharArrayBuffer current size: " + charArrayWriterSize);
        System.out.println("Current CharArray: " + charArrayWriter);
    }

}
