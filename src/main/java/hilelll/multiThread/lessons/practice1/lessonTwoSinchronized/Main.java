package hilelll.multiThread.lessons.practice1.lessonTwoSinchronized;

public class Main {
    public static void main(String[] args) {
        SynchService synchService = new SynchService();
        Object object = new Object();
        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(synchService::synchroMethod);
//            Thread thread = new Thread(synchService::synchronizedThisLogicPartMethod);
            Thread thread = new Thread(() -> synchService.synchronizedOnObjectLogicPartMethod(object));
            thread.start();
        }
        System.out.println("counter result: " + synchService.getCounter());
    }

}
