package module3.homeTask_5_Threads;

import static java.lang.Thread.sleep;

class RunnableThread implements Runnable {

    private final int size;
    private int[] elements;

    public RunnableThread(int size, int[] elements) {
        this.size = size;
        this.elements = elements;
    }

    @Override
    public void run() {
        if (size == 2) {
            elements[0] = 0;
            elements[1] = 1;
        } else if (size > 2) {
            elements[0] = 0;
            elements[1] = 1;
            for (int i = 2; i < size; i++) {
                elements[i] = elements[i - 1] + elements[i - 2];
            }
        }
        System.out.println("Reverse order: ");

        for (int i = elements.length - 1; i >= 0; i--) {
            try {
                sleep(1000);
                System.out.println(elements[i]);
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }
}
