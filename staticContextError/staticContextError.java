class staticContextError {

    char myChar = 'c'; // This will break

    public static void main(String[] args) {
        getMyChar();
    }

    public static void getMyChar() {
        System.out.println(myChar);
    }


}
