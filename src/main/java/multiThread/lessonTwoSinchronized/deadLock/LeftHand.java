package main.java.multiThread.lessonTwoSinchronized.deadLock;

public class LeftHand {
    RightHand rightHand;

    public RightHand getRightHand() {
        return rightHand;
    }

    public void setRightHand(RightHand rightHand) {
        this.rightHand = rightHand;
    }

    public synchronized String showHand() {
        return "Hi Left hand";
    }

    public synchronized String callRightHand() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return rightHand.showHand();
    }
}
