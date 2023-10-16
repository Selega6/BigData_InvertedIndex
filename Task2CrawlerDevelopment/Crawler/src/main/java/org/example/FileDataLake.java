package org.example;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.List;

public class FileDataLake implements DataLakeFeeder{

    @Override
    public void save() {

    }

    @Override
    public List<Document> get() {
        //TODO: implement this method, maybe use a file to store last ID of book downloaded
        return null;
    }

    public List<String> setDownloadBooks() {
        int startId = 1;
        List<String> urlToDownload = new ArrayList<>();
        int booksMaxCount = 10;
        for (int i = startId; i < booksMaxCount; i++) {
            String s = "/pg" + i + ".txt";
            String url = "https://www.gutenberg.org/cache/epub/" + i + s;
            urlToDownload.add(url);
        }
        return urlToDownload;
    }
}
