package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    private BookMetadataFormatter formatter;
    @Override
    public BookMetadataFormatter getFormatter() throws ParserConfigurationException {
        formatter = new XMLBookMetadataFormatter();
        return formatter;
    }
}
