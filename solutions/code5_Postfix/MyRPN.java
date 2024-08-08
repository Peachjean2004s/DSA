package solutions.code5_Postfix;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class MyRPN {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static boolean isNumeric(String strNum) {
        if (strNum == null)
            return false;
        return pattern.matcher(strNum).matches();

    }

    public static double computeRPN(String rpn) {
        /* your code */
        MyStackA stack = new MyStackA();
        StringTokenizer st = new StringTokenizer(rpn);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (token.equals("+")) {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a + b);
                } else if (token.equals("-")) {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a - b);
                } else if (token.equals("*")) {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a * b);
                } else if (token.equals("/")) {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a / b);
                }

            }

        }
        return stack.pop();
    }
}
