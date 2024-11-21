// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int x = Integer.parseInt(args[0]);
		
		double sum = 0.0;
		for (int i = 0; i < x; i++)
		{
			double term = 1.0 / (2 * i + 1);
			if (i % 2 == 0) {
				sum += term;
			}

			else {
				sum -= term;
			}
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:	 " + 4 * sum);

		}
	}

