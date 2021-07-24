package me.hammer86gn.d2df.template;

/**
 * The base class for <i>Templates</i>
 * <p></p>
 * All code <b>outside</b> of extensions of this class will <b>not</b> be compiled
 * <p></p>
 * If no name is provided the Template name will default to <i>J2DF Template</i>
 *
 */
public abstract class AbstractDFTemplate {

    private final String name;

    public AbstractDFTemplate(String name) {
        if (name == null) {
          this.name = this.getClass().getSimpleName();
        } else {
            this.name = name;
        }
    }

    public AbstractDFTemplate() {
        this(null);
    }

    public abstract String getAuthor();

}
