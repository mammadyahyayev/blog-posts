public class ConstantFolding {

	public static void main(String... args) {
		final int campaignPoints = 2000;
		final int rate = 2;
		int amount = getTransactionAmount() * (campaignPoints * rate);
		System.out.println("Amount: " + amount);
	}

	public static int getTransactionAmount() {
		return 3000;
	}
}
