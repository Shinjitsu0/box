public class Box extends Thread{
    private volatile boolean switcher;

    public Box() {
        switcher = false;
    }

    public boolean isSwitcher() {
        return switcher;
    }

    public void setSwitcher(boolean switcher) {
        this.switcher = switcher;
    }

}
