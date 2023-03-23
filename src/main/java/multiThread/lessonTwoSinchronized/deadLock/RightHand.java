package main.java.multiThread.lessonTwoSinchronized.deadLock;

public class RightHand {
    LeftHand leftHand;

    public LeftHand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(LeftHand leftHand) {
        this.leftHand = leftHand;
    }

    public synchronized String showHand() {
        return "Hello! Right hand";
    }

    public synchronized String callLeftHand() {
        return leftHand.showHand();
    }
}
