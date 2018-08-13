class arraySumInt {
    public static void main(String[] args) {
        int[] intArr = {2,1,4};
        int sum = 0;
        for (int x = 0; x < intArr.length; x++) {
            sum += intArr[x];
        }
        System.out.println("Array items added = " + sum);
    }
}
