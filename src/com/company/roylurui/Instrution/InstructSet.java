package com.company.roylurui.Instrution;

import java.util.HashMap;
import java.util.Map;

/**
 * 见甲骨文官网
 * 指令集
 */
public class InstructSet {
     private static Map<String,String> InstructSet = new HashMap<>();


     public static  Map<String, String> getInstructSet(){
      InstructSet.put("iconst","PUSH");//推送到操作数栈

      InstructSet.put("istore","STORE");//操作数栈到局部变量

      InstructSet.put("iload","LOAD");//局部变量到操作数栈

      InstructSet.put("imul","MUL");

      InstructSet.put("isub","SUB");


      InstructSet.put("iadd","ADD");


      InstructSet.put("idiv","DIV");

      InstructSet.put("return","HALT");//停机

      return InstructSet;
     }

}
