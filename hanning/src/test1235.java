import java.util.*;

public class test1235 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		long a = n.nextInt();
		System.out.println(f(a));
	}

	public static long f(long s) {
		if (s == 1)
			return 1;
		if (s == 0)
			return 0;
		else
			return p(s) + f(s - 1);
	}

	public static long p(long w) {
		if (w == 1)
			return 1;
		if (w == 0)
			return 0;
		else
			return w * p(w - 1);
	}
}
