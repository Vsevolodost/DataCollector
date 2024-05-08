import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ParseWebPage {

    String url = "https://skillbox-java.github.io/";
    Document document;

    //Method get html code web page
    public String getHtmlCodeWebPage() throws IOException{
        document = Jsoup.connect(url).get();
        return String.valueOf(document);
    }

    //Method get number lines and names stations
    public void getLineAndNameStation() {
        Elements elements = document.select(".name");
        elements.forEach(element -> System.out.println(element.text()));
    }

}
