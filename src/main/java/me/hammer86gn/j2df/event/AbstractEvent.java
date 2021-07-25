package me.hammer86gn.j2df.event;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public abstract class AbstractEvent {

    private final String id;

    public AbstractEvent(String id) {
        this.id = id;
    }

    public JsonObject build() {
        JsonArray items = new JsonArray();

        JsonObject block = new JsonObject();

        block.addProperty("id","block");
        block.addProperty("block","event");
        block.add("args",items);
        block.addProperty("action",this.id);

        return block;
    }

}
