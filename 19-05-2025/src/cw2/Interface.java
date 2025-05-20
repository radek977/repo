package cw2;

public class Interface {

    @FunctionalInterface
            public interface Runnable {
        void run();
    }

    Runnable task = new Runnable() {
        @Override
        public void run() {
            System.out.println("Old way");
        }
    };

    Runnable task2 = () -> System.out.println("Java 8");
}
