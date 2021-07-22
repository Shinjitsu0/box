public class Open extends Thread {
    Box box;
    long openingRequest;
    long timeToWait;

    public Open(Box box, long openingRequest, long timeToWait) {
        this.box = box;
        this.openingRequest = openingRequest;
        this.timeToWait = timeToWait;
    }

    @Override
    public void run() {
        for (int i = 0; i < openingRequest; i++) {
            System.out.println("Открываю коробку");
            box.setSwitcher(true);
            try {
                Thread.sleep(timeToWait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}