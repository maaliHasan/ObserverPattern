/**
 * Created by mhasan on 4/4/2017.
 */
public class LongDesNews implements DisplayNews, Observer {
    private Subject newsData;
    private String newsDescription;

    public LongDesNews(Subject newsData) {
        this.newsData = newsData;
        newsData.addObserver(this);
    }

    @Override
    public void update() {
        if (this.newsData instanceof NewsStation) {
            this.newsDescription = ((NewsStation) this.newsData).getNewsFullDescription();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(" the short description news is " + newsDescription);
    }
}
