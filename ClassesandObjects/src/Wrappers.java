
public class Wrappers {

	public static void main(String[] args) {
		// Float, Long, Double class wrappers

		// Float wrapping
		Float f1 = 1.1f;
		Float f2 = 1.1f;
		Float f3 = new Float(1.1f);

		System.out.println("f1==i2 : " + (f1 == f2));
		System.out.println("f1==i3 : " + (f1 == f3));

		System.out.println("(f1.equals(f2)) : " + (f1.equals(f2)));
		System.out.println("(f1.equals(f3)) : " + (f1.equals(f3)));

		System.out.println(System.identityHashCode(f1));
		System.out.println(System.identityHashCode(f2));
		System.out.println(System.identityHashCode(f3));
		System.out.println("\n");

		float x = f2; // auto-boxing obj to primitive
		System.out.println("x = " + x);
		x = 10;
		f2 = x;
		System.out.println("f2 = " + f2);
		
		Integer f = f2.intValue(); //in-built casting method
		System.out.println("f = " + f);
		float m = f.floatValue();
		System.out.println("f = " + m);
		System.out.println("\n");
		
		// Double wrapping
		Double d1 = 1.1d;
		Double d2 = 1.1d;
		Double d3 = new Double(1.1d);

		System.out.println("d1==i2 : " + (d1 == d2));
		System.out.println("d1==i3 : " + (d1 == d3));

		System.out.println("(d1.equals(d2)) : " + (d1.equals(d2)));
		System.out.println("(d1.equals(d3)) : " + (d1.equals(d3)));

		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));
		System.out.println("\n");

		double x1 = d2; // auto-boxing obj to primitive
		System.out.println("x1 = " + x1);
		x1 = 10;
		d2 = x1;
		System.out.println("d2 = " + d2);

		Integer y1 = d2.intValue(); //in-built casting method
		System.out.println("y1 = " + y1);
		double m1 = y1.doubleValue();
		System.out.println("y1 = " + m1);
		System.out.println("\n");
		
		// Long wrapping
		Long l1 = 11l;
		Long l2 = 11l;
		Long l3 = new Long(11l);

		System.out.println("l1==l2 : " + (l1 == l2));
		System.out.println("l1==l3 : " + (l1 == l3));

		System.out.println("(l1.equals(l2)) : " + (l1.equals(l2)));
		System.out.println("(l1.equals(l3)) : " + (l1.equals(l3)));

		System.out.println(System.identityHashCode(l1));
		System.out.println(System.identityHashCode(l2));
		System.out.println(System.identityHashCode(l3));
		System.out.println("\n");

		long x2 = l2; // auto-boxing obj to primitive
		System.out.println("x2 = " + x2);
		x2 = 10;
		l2 = x2;
		System.out.println("l2  = " + l2);

		Double y2 = l2.doubleValue(); //in-built casting method 
		System.out.println("y2 = " + y2);
		long m2 = y2.longValue();
		System.out.println("y2 = " + m2);
	}
}