import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {

    private String input = "";
    private String pattern = "([a-zA-Z0-9]{1,})@([a-zA-Z]{1,})(\\.com)";
    private String pattern2 = "[\\s]";

    public MailValidator(String input){
        setInput(input);

    }

    public boolean check(){
        Pattern r = Pattern.compile(getPattern());
        Matcher m = r.matcher(getInput());

        Pattern r2 = Pattern.compile(getPattern2());
        Matcher m2 = r2.matcher(getInput());

        if (m.find() && !m2.find()) {
            return true;

        } else {
            return false;
        }

    }



    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }


    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }


    public String getPattern2() {
        return pattern2;
    }

    public void setPattern2(String pattern2) {
        this.pattern2 = pattern2;
    }

}
