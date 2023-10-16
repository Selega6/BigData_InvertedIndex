package org.example;

import javax.swing.text.Document;
import java.util.List;

public interface DataLakeFeeder {
    void save();
    List<Document> get();
}
