class Ugly {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(isUgly(n) == true ? "Num is Ugly" : "Num is not Ugly");
    }

    public static boolean isUgly(int n) {

        int factors[] = { 2, 3, 5 };
        if (n <= 0) return false;

        for (int factor : factors) {
            while (n % factor == 0) {
                n = n / factor;
            }
        }

        return n == 1;
    }

}