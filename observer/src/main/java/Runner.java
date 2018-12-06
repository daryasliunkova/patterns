public class Runner {
    public static void main(String[] args) {
        LogSubject subject = new LogSubject();
        IObserver ob = new Observer();
        IObserver ob1 = new Observer1();
        subject.attach(ob);
        subject.attach(ob1);
        subject.setState("state1");
        subject.setState("state2");
        subject.detach(ob1);
        subject.setState("state3");
    }
}
