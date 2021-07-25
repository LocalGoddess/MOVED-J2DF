package me.hammer86gn.j2df.variable.impl.simple;

import com.google.gson.JsonObject;
import me.hammer86gn.j2df.variable.AbstractDFVariable;

public class Text extends AbstractDFVariable {


    private final String text;

    public Text(String text) {
        super("txt");
        this.text = text;
    }

    @Override
    public JsonObject build() {
        JsonObject data = new JsonObject();
        data.addProperty("name",text);

        JsonObject text = new JsonObject();
        text.addProperty("id",super.id);
        text.add("data",data);

        return text;
    }
}
