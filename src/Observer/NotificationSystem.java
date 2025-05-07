package Observer;

import java.util.LinkedList;
import java.util.List;


/**
 * The {@code Animal} class represents an individual animal in a zoo.
 * It contains information about the animal's species, age, and health status.
 * This class implements the Prototype pattern, allowing animals to reproduce
 * by creating new instances of themselves through cloning.
 */
interface NotificationSubject {

    void registerObserver(NotificationObserver observer);

    void removeObserver(NotificationObserver observer);

    void notifyObserver();

}

/**
 * Returns the species of the animal.
 *
 * @return The species of the animal.
 */
public class NotificationSystem implements NotificationSubject {

    private List<NotificationObserver> observers;
    private String msg;

    public NotificationSystem() {
        this.observers = new LinkedList<>();
        this.msg = "";
    }

    @Override
    public void registerObserver(NotificationObserver observer) {
        if (observers.contains(observer))
            return;
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (NotificationObserver o : observers)
            o.update(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
