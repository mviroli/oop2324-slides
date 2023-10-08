package it.unibo.apice.oop.p07inheritance.composition;

public class UseCounter {
	public static void main(String[] s) {
		final MultiCounterImpl mc = new MultiCounterImpl(0);
final Counter c = new CounterImpl(0);
		
		System.out.println(c.getValue()); // 0
		c.increment();
		c.increment();
		System.out.println(c.getValue()); // 2
		mc.multiIncrement(2);
		System.out.println(c.getValue()); // 4
	}
}
