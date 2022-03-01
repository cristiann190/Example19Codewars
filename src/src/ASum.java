package src;

public class ASum {

	public static int findNb(long volume) {
		int n = 0;
		long calculatedVolume = 0l;
		while (calculatedVolume < volume) {
			n++;
            calculatedVolume += (long) Math.pow(n, 3);;
		}
		if (volume == calculatedVolume) {
			return n;
		}
		return -1;
	}
}