import me.hammer86gn.d2df.event.EventHelper;
import me.hammer86gn.d2df.event.impl.PlayerJoinEvent;
import me.hammer86gn.d2df.template.AbstractDFTemplate;

public class TestTemplate extends AbstractDFTemplate {

    public TestTemplate() {
        super("Made With J2DF");
    }

    @EventHelper
    public void onPlayerJoin(PlayerJoinEvent event) {
        
    }

    @Override
    public String getAuthor() {
        return "1pe";
    }
}
