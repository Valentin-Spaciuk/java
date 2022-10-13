class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder strB = new StringBuilder();//Creates an empty string builder with a capacity of 16 (16 empty elements).
        for (int i = 0; i < identifier.length(); i++){
            char ch = identifier.charAt(i); //Returns the char value at the specified index.
            if (Character.isISOControl(ch)){
                strB.append("CTRL"); //replace control characters with "CTRL"
            }
            else if (Character.isWhitespace(ch)){
                strB.append("_"); //replace any spaces with underscores
            }
            else if (ch == "-".charAt(0)){
                i++;
                char nextChar = identifier.charAt(i);
                if (Character.isLetter(nextChar)){
                    strB.append(Character.toUpperCase(nextChar));
                }
            }
            else if (!Character.isLetter(ch) || (ch >= 'α' && ch <='ω')){
                continue;
            }
            else{
                strB.append(ch); //omit any Greek letters in the range 'α' to 'ω'.
            }
        }
        return strB.toString();
    }
    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("my    \0\r\u007F Id\\t"));
    }
}