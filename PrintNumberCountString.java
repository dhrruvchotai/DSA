public class PrintNumberCountString {
    public static void main(String[] args) {
        String str = "d2a3bac5z".toLowerCase();
        StringBuilder ans = new StringBuilder();
        int index = 0;

        while(index < str.length()) {
            char ch = str.charAt(index);

            if(Character.isDigit(ch) && index + 1 < str.length() && Character.isLetter(str.charAt(index + 1))) {
                int count = ch - '0';
                char letter = str.charAt(index + 1);
                for(int i = 0; i < count; i++) {
                    ans.append(letter);
                }
                index += 2;
            } else {
                ans.append(ch);
                index++;
            }
        }

        System.out.println("Ans is " + ans.toString());
    }
}
