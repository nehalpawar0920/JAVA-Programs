// java program to reverse a word

class StringReverse {
    public static void main(String[] args) {

        String str = "Nehal", nstr = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Nehal"); // Example word

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
}
