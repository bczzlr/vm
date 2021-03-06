package com.company.roylurui.Engine;

import com.company.roylurui.MethodArea.methodArea;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * 执行引擎 根据pc以及指令 进行操作
 */
public class engine {
    //局部变量表
    private static ArrayList<Integer> arrayList = new ArrayList<>();

    //操作数栈
    private static Stack<Integer> operandStack = new Stack<>();


        //执行引擎返回具体运算结果
    public static Integer runEngine() {
        //从方法区获取 执行引擎要执行的指令
        Map<Integer, String[]> instruct = methodArea.getInstructMap();
        Set<Integer> pc = instruct.keySet(); //取出pc要索引的值 编译器编译后已排好序 直接遍历即可

        for (Integer integer : pc) {
            Integer integer1;//操作数1
            Integer integer2;//操作数2
            Integer integer3;//接受结果3
            //取得指令信息
            String[] instructInfo = instruct.get(integer);
            switch (instructInfo[0]) {
                case "PUSH":
                    operandStack.push(Integer.parseInt(instructInfo[1]));
                    break;
                    /*
                    		case '!':
			i++;
			if (test[i] == '=')
			{
				printf("NEQ !=\n");
				return 3;
			}
			else
			{
				i--;
				printf("NOT !\n");
				return 3;
			}
		case '<':
			i++;
			if (test[i] == '=')
			{
				printf("LEQ <=\n");
				return 3;
			}
			else
			{
				i--;
				printf("LSS <\n");
				return 3;
			}
		case '>':
			i++;
			if (test[i] == '=')
			{
				printf("GEQ >=\n");
				return 3;
			}
			else
			{
				i--;
				printf("GRE >\n");
				return 3;
			}
                     */
                case "STORE":
                    Integer operator = operandStack.pop();
                    arrayList.add(Integer.parseInt(instructInfo[1])-1, operator);
                    break;
                case "LOAD":
                    operandStack.push(arrayList.get(Integer.parseInt(instructInfo[1])-1));
                    break;
                case "MUL":
                    integer1 = operandStack.pop();
                    integer2 = operandStack.pop();
                    integer3 = integer1 * integer2;
                    operandStack.push(integer3);
                    break;
                case "DIV":
                    integer1 = operandStack.pop();
                    integer2 = operandStack.pop();
                    integer3 = integer2 / integer1;
                    operandStack.push(integer3);
                    break;
                case "ADD":
                    integer1 = operandStack.pop();
                    integer2 = operandStack.pop();
                    integer3 = integer1 + integer2;
                    operandStack.push(integer3);
                    break;
                case "SUB":
                    integer1 = operandStack.pop();
                    integer2 = operandStack.pop();
                    integer3 = integer2 - integer1;
                    operandStack.push(integer3);
                    break;
                case "HALT":
                    System.out.println("停机...");
            }
        }
        return arrayList.get(arrayList.size()-1);
    }
}

