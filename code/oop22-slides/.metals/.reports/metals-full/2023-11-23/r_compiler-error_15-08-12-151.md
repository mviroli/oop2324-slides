file://<WORKSPACE>/src/it/unibo/apice/oop/p19myconcur/Workers.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 312
uri: file://<WORKSPACE>/src/it/unibo/apice/oop/p19myconcur/Workers.java
text:
```scala
package it.unibo.apice.oop.p19myconcur;

import java.util.Arrays;

public class Workers {

    private static record Worker(int[] array, int start, int stop) implements Runnable {
        @Override
        public void run() {
            Arrays.sort(array, start, stop);
        }
    }

    private static Runna@@ble worker(int[] array, int start, int stop){
        return () -> Arrays.sort(array, start, stop);
    }

    public static void main(String[] args) {
        int[] a = new int[]{50,40,30,20,10};
        var w1 = new Thread(new Worker(a, 0, a.length/2));
        var w2 = new Thread(worker(a, a.length/2, a.length));
        w1.start();
        w2.start();
        try {
            w1.join();
            w2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(a));        
    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:329)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator