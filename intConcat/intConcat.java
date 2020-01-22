class intConcat {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        String list = "";
        for (int i = 0; i < nums.length; i++) {
            list = list.concat(String.valueOf(nums[i]));
            System.out.println(list);
        }
        System.exit(0);
    }
}