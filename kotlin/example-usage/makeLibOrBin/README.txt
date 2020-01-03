Compiling kt file as A library enables it to be used in other kotlin applications.

$ kotlinc file.kt -d file.jar

When using the library make sure it is included in the classpath.

To compile class file use no arguments:
$ kotlinc file.kt

Then the class file and jar can be run as A binary:
$ kotlin -classpath file.jar FileKt
