public class Main {

    public static void main(String[] args) {
	// write your code here
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }
}
