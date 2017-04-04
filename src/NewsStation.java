import java.util.ArrayList;

/**
 * Created by mhasan on 4/4/2017.
 */
public class NewsStation implements Subject {
    private ArrayList observers ;
    private String newsHeading;
    private String newsFullDescription;

    public NewsStation(){
        observers= new ArrayList();
    }
    @Override
    public void addObserver(Observer O) {
        observers.add(O);
    }

    @Override
    public void removeObserver(Observer O) {
        int index = observers.indexOf(O);
        if (index> 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer)observers.get(i);
            observer.update();
        }

    }
    public void newsUpdated(){
        notifyObservers();
    }

    public void SetNews(String Heading,String fullDesc){
        this.newsHeading= Heading;
        this.newsFullDescription= fullDesc;
        newsUpdated();
    }

    public String getNewsHeading(){
        return  newsHeading;
    }
    public String getNewsFullDescription(){
        return  newsFullDescription;
    }
}
