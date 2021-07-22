public class Main {
    final static long OPENING_REQUESTS = 4;
    final static long TIME_TO_WAIT = 1000;

    public static void main(String[] args) {
        Box box = new Box();
        Open open = new Open(box, OPENING_REQUESTS, TIME_TO_WAIT);
        Close close = new Close(box);

        close.setDaemon(true);

        open.start();

        close.start();
    }
}