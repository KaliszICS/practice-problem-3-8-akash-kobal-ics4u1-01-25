public class PracticeProblem {

	public static void main(String args[]) {
	}
//Question 1
static int fib(int num) {
	int f[] = new int[num + 2];
	int i;
	f[0] = 0;
	f[1] = 1;
	for (i = 2; i <= num; i++) {
		f[i] = f[i - 1] + f[i - 2];
	}
	return f[num];
}
//Question 2
static int minCostClimbingStairs(int[] cost) {
    if (cost == null || cost.length == 0) return 0;
        int n = cost.length;
        if (n == 1) return cost[0];
        int prev2 = cost[0];
        int prev1 = cost[1];
        for (int i = 2; i < n; i++) {
            int cur = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = cur;
        }
        return Math.min(prev1, prev2);
    }
}
	

