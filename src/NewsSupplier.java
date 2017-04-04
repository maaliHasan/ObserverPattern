/**
 * Created by mhasan on 4/4/2017.
 */
public class NewsSupplier {
    public static void main(String args[]) {
        NewsStation newsStation = new NewsStation();
         ShortDesNews shortNews = new ShortDesNews(newsStation);
        LongDesNews longNews = new LongDesNews(newsStation);
        newsStation.SetNews("Warm Weather Today!", "*********");
    }
}
