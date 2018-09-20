package string3;

public class String3 {

    //******https://codingbat.com/java/String-3******first column

    //Given a string, count the number of words ending in 'y' or 'z'
    //-- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
    //We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
    //(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
      //countYZ("fez day") → 2
      //countYZ("day fez") → 2
      //countYZ("day fyyyz") → 2

    public int countYZ(String str) {
        int len = str.length();
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < len; i++) {
            //if the actual char is y or z we can go ahead
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                //if the index nr is smaller than str.length() - 1 AND index nr + 1 is not a letter we can go ahead
                if (i < len-1 && !Character.isLetter(str.charAt(i+1)))
                    count++;
                //if index nr = str.length() we can add one to the count variable
                else if (i == len-1)
                    count++;
            }
        }
        return count;

    }
}
