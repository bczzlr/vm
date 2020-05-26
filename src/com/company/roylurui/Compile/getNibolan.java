package com.company.roylurui.Compile;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class getNibolan {
    /**
     * 根据正确的表达式, 获取逆波兰式
     *
     * @param input
     * @return java.lang.String
     */

    public static StringBuilder getRpn(String input) {
        //结果
        StringBuilder sb = new StringBuilder();
//        sb.append("The RPN is: ");
        //运算符栈
        Stack<Character> opStack = new Stack();

        //运算符优先级
        Map<Character, Integer> opMap = new HashMap(5);
        opMap.put('(', 0);
        opMap.put('+', 1);
        opMap.put('-', 1);
        opMap.put('*', 2);
        opMap.put('/', 2);

        //处理字符串
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==' ')continue;

            if (input.charAt(i) == '(') {
                opStack.push('(');
            } else if (getNibolan.isOperator(input.charAt(i))) {
                //如果是运算符
                char curOp = input.charAt(i);

                if (opStack.isEmpty()) {
                    opStack.push(curOp);
                } else if (opMap.get(curOp) > opMap.get(opStack.peek())) {

                    opStack.push(curOp);
                } else {

                    for (int j = 0; j <= opStack.size(); j++) {
                        //弹出栈内第一个元素
                        char ch = opStack.pop();
                        sb.append(ch);
                        /*
                        			/*
case ' ':
        case '\n':
            return -1;
        case '#': return 0;
        case '=':printf(">> =\t(27,-)\n"); return 3;
        case '<':
            i++;
            if (test[i] == '=')
            {
                printf(">> <= \t(28,-)\n");
                return 3;
            }
            else if (test[i] == '>')
            {
                printf(">> <>\t(29,-)\n");
                return 3;
            }
            else
            {
                i--;
                printf(">> <\t(30,-)\n");
                return 3;
            }
case '>':
            i++;
            if (test[i] == '=')
            {
                printf(">> >=\t(31,-)\n");
                return 3;
            }
            else
            {
                i--;
                printf(">> >\t(32,-)\n");
                return 3;
                         */
                        if (opStack.isEmpty()) {
                            opStack.push(curOp);
                            break;
                        } else if (opMap.get(curOp) > opMap.get(opStack.peek())) {
                            opStack.push(curOp);
                            break;
                        }
                    }
                }
            } else if (input.charAt(i) == ')') {
                for (int j = 0; j < opStack.size(); j++) {
                    char c = opStack.pop();
                    /*
                    		switch (m)
                                {
                                case -1:i++; break;
                                case 0: i++; break;
                                case 3: i++; break;
                                }
                     */
                    if (c == '(') {
                        break;
                    } else {
                        sb.append(c);
                    }
                }
            } else if ('A'<=input.charAt(i)&&input.charAt(i)<='Z'){

                sb.append(input.charAt(i));
            }else if ('a'<=input.charAt(i)&&input.charAt(i)<='z'){

                sb.append(input.charAt(i));
            }else if (Character.isDigit(input.charAt(i))){


                /*
                	else if (test[i] >= '0' && test[i] <= '9')
	{
		char x[100];
		int n = 0;
		x[n++] = test[i++];
		while (test[i] >= '0' && test[i] <= '9')
		{
			x[n++] = test[i++];
		}
		x[n] = '\0';
		i--;
		int num = atoi(x); //将字符串转换成int型
		printf("INTCON %d\n", num);
		return 3;
	}
                 */
                sb.append(input.charAt(i));
            }else {
                return new StringBuilder("But the expression contains unrecognizable characters");
            }
        }

        //把栈内剩余的运算符都弹出站
        for (int i = 0; i <= opStack.size(); i++) {
            sb.append(opStack.pop());
        }

        return sb;
    }
    /**
     * 判断是否为操作符 + - * /
     *
     * @param charAt
     * @return boolean
     */
    public static boolean isOperator(char charAt) {
        return charAt == '+' || charAt == '-' || charAt == '*' || charAt == '/';
    }

}
