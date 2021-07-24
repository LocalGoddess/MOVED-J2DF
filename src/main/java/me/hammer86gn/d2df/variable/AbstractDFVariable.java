package me.hammer86gn.d2df.variable;

import com.google.gson.JsonObject;

public abstract class AbstractDFVariable {

    protected final String id;

    public AbstractDFVariable(String id) {
        this.id = id;
    }

    public abstract JsonObject build();
}
