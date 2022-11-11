
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants

    public static String findTYPattern(String s)
    {
        // replace this line with your code
        String f = "";
        for(int i = 0; i < s.length(); i++){ // loops through each character of the string

            if(s.charAt(i) == 't' || s.charAt(i) == 'T'){
                // see if character is t or T
                for(int x = i; x < s.length(); x++){
                    //add all the letters after finding t or T
                    f += s.charAt(x);
                    if(s.charAt(x) == 'y' || s.charAt(x) == 'Y'){
                        //Once y is found, stop and return the substring (which is f)
                        return f;
                    }
                }
            }
        }
        return "";
    }
}
