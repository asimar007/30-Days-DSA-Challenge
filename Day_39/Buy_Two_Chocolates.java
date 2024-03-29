public class Buy_Two_Chocolates {
	public static int Chocolates(int[] prices, int money) {
		int mini = Integer.MAX_VALUE;
		int sec_mini = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < mini) {
				sec_mini = mini;
				mini = prices[i];
			} else {
				sec_mini = Math.min(prices[i], sec_mini);
			}
		}
		int total = (mini + sec_mini);
		if (total > money) {
			return money;
		} else {
			return (total - money);
		}
	}

	public static void main(String[] args) {
		int[] price = { 3, 2, 3 };
		int money = 3;
		int ans = Chocolates(price, money);
		System.out.print(ans);
	}
}