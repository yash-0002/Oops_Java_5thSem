import java.lang.ref.WeakReference;

class Demo {
    String name;

    Demo(String name) {
        this.name = name;
        System.out.println("Object created: " + name);
    }

    void show() {
        System.out.println("Using object: " + name);
    }
}

public class Practical7 {
    public static void main(String[] args) throws InterruptedException {
        Demo d = new Demo("D1");
        d.show();

        WeakReference<Demo> ref = new WeakReference<>(d);

        d = null;
        System.out.println("Reference removed, object is now eligible for garbage collection");

        System.gc();
        Thread.sleep(500);

        if (ref.get() == null) {
            System.out.println("Result: object was garbage collected");
        } else {
            System.out.println("Result: object is still in memory, JVM has not collected it yet");
        }

        System.out.println();
        System.out.println("An object becomes eligible when no live reference can reach it.");
        System.out.println("The JVM frees memory automatically, System.gc() is only a request.");
        System.out.println("C++ destructors run at a fixed point when the object is deleted or goes");
        System.out.println("out of scope, but Java cleanup time is decided by the JVM, so program");
        System.out.println("logic must never depend on it.");
    }
}
