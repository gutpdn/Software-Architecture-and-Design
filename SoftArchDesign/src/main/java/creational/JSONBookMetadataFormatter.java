package creational;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONObject obj;
    private JSONArray list = new JSONArray();

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        obj = new JSONObject();
        list = new JSONArray();
        obj.put("Books", list);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONArray list1 = new JSONArray();
        JSONObject obj1 = new JSONObject();
        obj = new JSONObject();
        for (String i:b.getAuthors())
        {
            list1.add(i);
        }
        obj1.put("ISBN",b.getISBN());
        obj1.put("Authors",list1);
        obj1.put("Title",b.getTitle());
        obj1.put("Publisher",b.getPublisher());
        list.add(obj1);
        obj.put("Books", list);
        // Please implement this method. You may create additional methods as you see fit.
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return obj.toString();
    }
}
