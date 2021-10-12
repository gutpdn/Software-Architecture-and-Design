package creational;

import java.io.PrintStream;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws IOException, ParserConfigurationException{
        BookMetadataFormatter bookFormatter = getFormatter();
        for (Book book: books
             ) {
            bookFormatter.append(book);
        }
        stream.println(bookFormatter.getMetadataString());
    }
    public abstract BookMetadataFormatter getFormatter() throws IOException, ParserConfigurationException;
}
