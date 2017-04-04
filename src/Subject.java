/**
 * Created by mhasan on 4/4/2017.
 */
public interface Subject {
    void addObserver(Observer O);
    void removeObserver(Observer O);
    void notifyObservers();
}
