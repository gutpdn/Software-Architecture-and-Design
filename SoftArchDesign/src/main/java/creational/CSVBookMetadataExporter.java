package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    private BookMetadataFormatter formatter;
    @Override
    public BookMetadataFormatter getFormatter() throws IOException {
        formatter = new CSVBookMetadataFormatter();
        return formatter;
    }
}
