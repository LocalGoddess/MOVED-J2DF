package me.hammer86gn.j2df.variable.impl.simple;

import com.google.gson.JsonObject;
import me.hammer86gn.j2df.variable.AbstractDFVariable;

public class Location extends AbstractDFVariable {

    private final double x;
    private final double y;
    private final double z;
    private final float pitch;
    private final float yaw;

    public Location(double x, double y, double z, float pitch, float yaw) {
        super("loc");
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
    }

    public Location(double x, double y, double z) {
        this(x,y,z,0,0);
    }

    public Location(double x, double y) {
        this(x,y,0,0,0);
    }

    public Location(double x) {
        this(x,0,0,0,0);
    }

    @Override
    public JsonObject build() {
        JsonObject location = new JsonObject();
        location.addProperty("x",x);
        location.addProperty("y",y);
        location.addProperty("z",z);
        location.addProperty("pitch",pitch);
        location.addProperty("yaw",yaw);

        JsonObject data = new JsonObject();
        data.add("loc",location);
        data.addProperty("isBlock",false);

        JsonObject loc = new JsonObject();
        loc.addProperty("id",super.id);
        loc.add("data",data);

        return loc;
    }
}
