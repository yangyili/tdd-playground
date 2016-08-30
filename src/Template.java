import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by afaren on 8/29/16.
 */
public class Template {
    private String templateText;
    private Map<String, String> variables;

    public Template(String templateText) {
        this.templateText = templateText;
        this.variables = new HashMap<>();
    }

    public void set(String variable, String value) {
        this.variables.put(variable, value);
    }

    public String evaluate() {
        String result = replaceVariables();
        checkForMissingValues(result);
        return result;
        // todo  改成 java8 的形式
    }

    private String replaceVariables() {
        String result = this.templateText;
        for (Map.Entry<String, String> entry : variables.entrySet()) {
            String regex = "\\$\\{" + entry.getKey() + "\\}";
            result = result.replaceAll(regex, entry.getValue());
        }
        return result;
    }

    private void checkForMissingValues(String result) {
        Matcher m = Pattern.compile(".*\\$\\{.+\\}.*").matcher(result);
        if (m.find()) {
            throw new MissingValueException("No value for " + m.group());
        }
    }
}
