package com.company.roylurui.Compile;

import com.company.roylurui.utils.Myconverse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 主编译器 其中用到了包下其他的工具 例如 文本转换工具 逆波兰式工具 编译分析工具
 */
public class Compile {
    public static void startCompile (File file) throws IOException {
        Myconverse myconverse = new Myconverse();

        ArrayList<String> strings = myconverse.testConverse(file);
        //将集合的信息 交给真正编译的工具进行编译
        /*
        case '+': printf("PLUS +\n"); return 3;
		case '-': printf("MINU -\n"); return 3;
		case '*': printf("MULT *\n"); return 3;
		case '/': printf("DIV /\n"); return 3;
		case ';': printf("SEMICN ;\n"); return 3;
		case '(': printf("LPARENT (\n"); return 3;
		case ')': printf("RPARENT )\n"); return 3;
		case '{': printf("LBRACE {\n"); return 3;
		case '}': printf("RBRACE }\n"); return 3;
		case '[': printf("LBRACK [\n"); return 3;
		case ']': printf("RBRACK ]\n"); return 3;
         */
        String s = wordAnalyse.test1(strings);

        //写到字节码文件中去
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter("byteCodeClass.txt"));
        bw.write(s);
        //释放资源
        bw.close();
        }
    }

