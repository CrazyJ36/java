class staticContextError {

    char myChar = 'c';

    public static void main(String[] args) {
        getMyChar();
    }

    public static void getMyChar() {
        System.out.println(myChar);
    }

}
