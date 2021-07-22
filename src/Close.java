public class Close extends Thread {
    Box box;

    public Close(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (box.isSwitcher()) {
                System.out.println("Закрываю коробку");
                box.setSwitcher(false);
            }
        }
    }
}
