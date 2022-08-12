package org.vishal.dsa.problems.stacks;

import java.util.Stack;

public class EvaluationOfPostfixNotation {

    public static void main(String[] args) {
        String S = "123+*8-";
        System.out.println(evaluatePostFix(S));
    }

    public static int evaluatePostFix(String S) {
        Stack<Integer> operands = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch >= '0' && ch <= '9') {
                operands.push(ch - '0');
            } else {
                int result = 0;
                int firstNum = operands.pop();
                int secondNum = operands.pop();
                if (ch == '+') {
                    result = secondNum + firstNum;
                } else if (ch == '-') {
                    result = secondNum - firstNum;
                } else if (ch == '*') {
                    result = firstNum * secondNum;
                } else if (ch == '/') {
                    result = secondNum / firstNum;
                }
                operands.push(result);
            }
        }
        return operands.peek();
    }

}
