package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character delimeter;
    private String str;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(delimeter);
        return null;
    }

    public String assemble() {
        return null;
    }
}
