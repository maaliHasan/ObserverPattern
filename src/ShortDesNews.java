/**
 * Created by mhasan on 4/4/2017.
 */
public class ShortDesNews implements DisplayNews, Observer {
    private Subject newsData;
    private String heading;

    public ShortDesNews(Subject newsData) {
        this.newsData = newsData;
        newsData.addObserver(this);
    }

    @Override
    public void update() {
        if (this.newsData instanceof NewsStation) {
            this.heading = ((NewsStation) this.newsData).getNewsHeading();
            display();
            newsData.removeObserver(this);
        }
    }

    @Override
    public void display() {
        System.out.println(" the short description news is " + heading);

    }
}
