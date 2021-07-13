/**
 * <h1>Java - Documentation Comments</h1>
 * <p>This is a documentation comment and in general its called doc comment.
 * The JDK javadoc tool uses doc comments when preparing automatically generated documentation.</p>
 *
 * <b>Note:</b> Giving proper comments in your program makes it more
 *  user friendly and it is assumed as a high quality code.
 *  <hr>
 *  <br>
 *  @author : Adds the author of a class.	@author name-text
 *
 * {@code}	: Displays text in code font without interpreting the text as
 *             HTML markup or nested javadoc tags.{@code text}
 *
 * {@docRoot} : Represents the relative path to the generated document's root directory from
 *              any generated page.{@docRoot}
 *
 * @deprecated : Adds a comment indicating that this API should no longer be used.	@deprecated deprecatedtext
 *
 * @exception : Adds a Throws subheading to the generated documentation, with the classname and description text.
 *               @exception class-name description
 *
 * {@inheritDoc} : Inherits a comment from the nearest inheritable class or implementable interface.
 *                 Inherits a comment from the immediate surperclass.
 *
 * {@link} : Inserts an in-line link with the visible text label that points to the documentation for
 *           the specified package, class, or member name of a referenced class. {@link package.class#member label}
 *
 * {@linkplain} : Identical to {@link}, except the link's label is displayed in plain text than code font.
 *               {@linkplain package.class#member label}
 *
 * @param : Adds a parameter with the specified parameter-name followed by the specified description to
 *          the "Parameters" section.	@param parameter-name description
 * @return :  Adds a "Returns" section with the description text.	@return description
 *
 * @see : Adds a "See Also" heading with a link or text entry that points to reference.	@see reference
 *
 * @serial : Used in the doc comment for a default serializable field.	@serial field-description | include | exclude
 * @serialData : Documents the data written by the writeObject( ) or writeExternal( ) methods.
 *               @serialData data-description
 * @serialField : Documents an ObjectStreamField component.	@serialField field-name field-type field-description
 *
 * @since : Adds a "Since" heading with the specified since-text to the generated documentation.
 *           @since release
 *
 * @throws : The @throws and @exception tags are synonyms.	@throws class-name description
 *
 * {@value}	When {@value} : is used in the doc comment of a static field, it displays the value of that constant.
 *                          {@value package.class#field}
 * @version : Adds a "Version" subheading with the specified version-text to the generated docs
 *            when the -version option is used.
 *            @version version-text
 *
 * For more ---> https://www.tutorialspoint.com/java/java_documentation.htm
 */
public class JavaDocumentation {
    public static void main(String[] args) {
        // Prints Hello, World! on standard output.
        System.out.println("Hello World!");
    }
}
