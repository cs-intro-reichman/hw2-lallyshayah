// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mood = args[1];
		String hailStone = "";
		boolean isFirstTime = true;

		if (mood.equals("v")) {
			for (int i = 1; i <= n; i++) {
				int current = i;
				int sum = 1;
				
				while (current != 1  || isFirstTime) {
					sum++;
					isFirstTime = false;

					if (current % 2 == 0) {
						System.out.print(current + " ");
						current = current / 2;
					}

					else {
						System.out.print(current + " ");
						current = (current * 3 + 1);
					}
				}

				System.out.print(1 + " (" + sum + ")");
				System.out.println();
			}
		}
		
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
