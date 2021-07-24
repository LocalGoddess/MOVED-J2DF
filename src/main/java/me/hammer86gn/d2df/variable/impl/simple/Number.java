package me.hammer86gn.d2df.variable.impl.simple;

import com.google.gson.JsonObject;
import me.hammer86gn.d2df.variable.AbstractDFVariable;

public class Number extends AbstractDFVariable {

    private final String value;

    public Number(String value) {
        super("num");
        this.value = value;
    }

    public Number(double value) {
        this(Double.toString(value));
    }

    @Override
    public JsonObject build() {
        JsonObject data = new JsonObject();
        data.addProperty("name",this.value);

        JsonObject num = new JsonObject();
        num.addProperty("id",super.id);
        num.add("data",data);

        return num;
    }
}
