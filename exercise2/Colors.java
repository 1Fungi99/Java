package exercise2;

import java.util.ArrayList;
import java.util.Arrays;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        String[] colors = { "red", "yellow", "green", "blue", "pink" };
        ArrayList<String> finalColors = new ArrayList<String>();
        for (int i = 0; i < colors.length; i++) {
            String cur = colors[i];
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].contains(cur)) {
                    finalColors.add(strings[j]);
                }
            }
        }
        String[] finalColorsArray = new String[finalColors.size()];
        finalColorsArray = finalColors.toArray(finalColorsArray);

        return finalColorsArray;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        System.out.println(Arrays.toString(code.colorful(
                new String[] { "bluebird", "red herring", "yellow bumblebee", "black spider", "green monkey", "pink",
                        "great gatsby", "feeding frenzy", "black bird", "widowmaker", "quran", "bible", "torah" })));
    }

}