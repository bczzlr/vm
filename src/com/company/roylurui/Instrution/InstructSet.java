package com.company.roylurui.Instrution;

import java.util.HashMap;
import java.util.Map;

/**
 * 指令集
 */
public class InstructSet {
     private static Map<String,String> InstructSet = new HashMap<>();

     public static  Map<String, String> getInstructSet(){
      InstructSet.put("iconst","PUSH");//推送到操作数栈

      InstructSet.put("istore","STORE");//操作数栈到局部变量

      InstructSet.put("iload","LOAD");//局部变量到操作数栈

      InstructSet.put("imul","MUL");//弹出栈顶两个 做乘法 压到栈顶

      InstructSet.put("isub","SUB");//弹出两个  做减法  压到栈顶


      InstructSet.put("iadd","ADD");//弹出两个  做加法 压到栈顶


      InstructSet.put("idiv","DIV");//弹出两个 做除法 压到栈顶

      InstructSet.put("return","HALT");//返回 停机指令

      return InstructSet;
     }

}
