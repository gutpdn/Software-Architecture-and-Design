package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    private BookMetadataFormatter formatter;
    @Override
    public BookMetadataFormatter getFormatter() throws IOException {
        formatter = new JSONBookMetadataFormatter();
        return formatter;
    }
}
