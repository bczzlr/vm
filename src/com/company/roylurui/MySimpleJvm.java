package com.company.roylurui;



import com.company.roylurui.Compile.Compile;
import com.company.roylurui.Engine.engine;
import com.company.roylurui.MyLoader.Myloader;

import java.io.File;
import java.io.IOException;

public class MySimpleJvm {
    public static void main(String[] args) {
        //1.获取源文件 (源程序)
        //String filename = "F:\\idea-workspace\\A-VerySimpleJVM\\A-VerySimpleJVM\\source.txt";
        File file = new File("source.txt");
        //File file = new File(filename);
        System.out.println("success");
        //2.交给编译器 编译 生成字节码"byteCodeClass"文件
        try {
            Compile.startCompile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //3.用自定义的装载器 解析 存放到方法区中
        Myloader.loadInArea();
        //4.手动启动执行引擎 返回计算结果
        Integer integer = engine.runEngine();
        System.out.println("处理结果是 : "+integer);

    }
}
