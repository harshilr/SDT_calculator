class Operations {

    static void add(int x, int y) {
        int answer = x + y;
        System.out.println(answer);
    }

    static void difference(int x, int y) {
        int answer = x-y;
        System.out.println(answer);
    }

    static void multiplication(int x, int y) {
        int answer = x;
        for (int i = 0; i < y; i++) {
            answer=x*y;
        }
        System.out.println(answer);
    }

    static void division(int x, int y) {
        double answer =(double) x / y;
        System.out.println(answer);
    }

    static void exponent(int x, int y) {
        int answer = 1;
        for (int i = 1; i <= x; i++) {
            answer = answer * y;
        }
        System.out.println(answer);
    }
}
