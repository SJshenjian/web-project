package online.shenjian.spring.beans.propertyeditors;

import online.shenjian.spring.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * @author Jian Shen
 * @version V1.0
 * @date 2018/12/6
 */
public class CustomBooleanEditor extends PropertyEditorSupport {

    public static final String VALUE_TRUE = "true";
    public static final String VALUE_FALSE = "false";

    public static final String VALUE_ON = "on";
    public static final String VALUE_OFF = "off";

    public static final String VALUE_YES = "yes";
    public static final String VALUE_NO = "no";

    public static final String VALUE_1 = "1";
    public static final String VALUE_0 = "0";


    private final String trueString;

    private final String falseString;

    private final boolean allowEmpty;


    /**
     * Create a new CustomBooleanEditor instance, with "true"/"on"/"yes"
     * and "false"/"off"/"no" as recognized String values.
     * <p>The "allowEmpty" parameter states if an empty String should
     * be allowed for parsing, i.e. get interpreted as null value.
     * Else, an IllegalArgumentException gets thrown in that case.
     * @param allowEmpty if empty strings should be allowed
     */
    public CustomBooleanEditor(boolean allowEmpty) {
        this(null, null, allowEmpty);
    }

    /**
     * Create a new CustomBooleanEditor instance,
     * with configurable String values for true and false.
     * <p>The "allowEmpty" parameter states if an empty String should
     * be allowed for parsing, i.e. get interpreted as null value.
     * Else, an IllegalArgumentException gets thrown in that case.
     * @param trueString the String value that represents true:
     * for example, "true" (VALUE_TRUE), "on" (VALUE_ON),
     * "yes" (VALUE_YES) or some custom value
     * @param falseString the String value that represents false:
     * for example, "false" (VALUE_FALSE), "off" (VALUE_OFF),
     * "no" (VALUE_NO) or some custom value
     * @param allowEmpty if empty strings should be allowed
     * @see #VALUE_TRUE
     * @see #VALUE_FALSE
     * @see #VALUE_ON
     * @see #VALUE_OFF
     * @see #VALUE_YES
     * @see #VALUE_NO
     */
    public CustomBooleanEditor(String trueString, String falseString, boolean allowEmpty) {
        this.trueString = trueString;
        this.falseString = falseString;
        this.allowEmpty = allowEmpty;
    }


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String input = (text != null ? text.trim() : null);
        if (this.allowEmpty && !StringUtils.hasLength(input)) {
            // Treat empty String as null value.
            setValue(null);
        } else if (this.trueString != null && this.trueString.equalsIgnoreCase(input)) {
            setValue(Boolean.TRUE);
        } else if (this.falseString != null && this.falseString.equalsIgnoreCase(input)) {
            setValue(Boolean.FALSE);
        } else if (this.trueString == null &&
                (VALUE_TRUE.equalsIgnoreCase(input) || VALUE_ON.equalsIgnoreCase(input) ||
                        VALUE_YES.equalsIgnoreCase(input) || VALUE_1.equals(input))) {
            setValue(Boolean.TRUE);
        } else if (this.falseString == null &&
                (VALUE_FALSE.equalsIgnoreCase(input) || VALUE_OFF.equalsIgnoreCase(input) ||
                        VALUE_NO.equalsIgnoreCase(input) || VALUE_0.equals(input))) {
            setValue(Boolean.FALSE);
        } else {
            throw new IllegalArgumentException("Invalid boolean value [" + text + "]");
        }
    }

    @Override
    public String getAsText() {
        if (Boolean.TRUE.equals(getValue())) {
            return (this.trueString != null ? this.trueString : VALUE_TRUE);
        }
        if (Boolean.FALSE.equals(getValue())) {
            return (this.falseString != null ? this.falseString : VALUE_FALSE);
        }
        return "";
    }
}
