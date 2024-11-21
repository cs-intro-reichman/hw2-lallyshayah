// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String str = args[0];
            int Num = Integer.parseInt(args[1]);
            String strUpper = "";
            String anLetters = "AEFHILMNORSX";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z') c = (char) (c-32);

                strUpper += c;
            }

            for (int i = 0; i < strUpper.length(); i++) {
                char c = strUpper.charAt(i);
                if (anLetters.indexOf(c) == -1) {
                        System.out.println("Give me an " + c + ": " + c + "!");
                }

                else {
                        System.out.println("Give me a " + c + ": " + c + "!");
                }
            }

            System.out.println("What does that spell?");

            for (int i = 0; i < Num; i++) {
                System.out.println(strUpper + "!!!");
            }

        }
}
