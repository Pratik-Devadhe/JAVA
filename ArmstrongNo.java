class ArmstrongNo {
    public static void main(String s[]) {
        int num = 153;
        int len = Integer.toString(num).length();
        int check = num;
        int sum = 0;
        int rem = 0;

        while (num > 0) {
            rem = num % 10;
            int power = 1;
            for (int i = 0; i < len; i++) {
                power = power * rem;
            }
            sum = sum + power;
            num = num / 10;
        }

        if (check == sum) {
            System.out.println(check + " is an Armstrongs number");
        } else {
            System.out.println(check + " is not an Armstrongs number");
        }
    }
}
