import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchSe {
    public static void main(String args[]){
        String sea = "She sells seashells by the seashore";
        Pattern pattern = Pattern.compile("se");
        Matcher matcher = pattern.matcher(sea);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.print("Found at: ");
            System.out.print(matcher.start()+" - ");
            System.out.println(matcher.end());
        }

    }

}
