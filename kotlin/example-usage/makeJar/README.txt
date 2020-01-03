To compile .kt file (which has main() method) to jar:

$ kotlinc file.kt -include-runtime -d file.jar
$ java -jar file.jar
