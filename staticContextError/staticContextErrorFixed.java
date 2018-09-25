class staticContextError {

    /* Fix: make Char definition static like methods:
     * static char myChar = 'c';
     */

    static char myChar = 'c';

    public static void main(String[] args) {
        getMyChar();
    }

    public static void getMyChar() {
        System.out.println(myChar);
    }

}
