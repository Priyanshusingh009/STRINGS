public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5; // number of steps
        System.out.println("Ways to climb " + n + " steps: " + climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1; 
        if (n == 2) return 2; 

        int first = 1; // ways for step 1
        int second = 2; // ways for step 2
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second; // sum of previous two
            first = second; // move forward
            second = result;
        }

        return result;
    }
}

