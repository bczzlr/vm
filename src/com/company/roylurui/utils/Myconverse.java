package com.company.roylurui.utils;

import java.io.*;
import java.util.ArrayList;

/**
 * 文件转换工具 将文件按行读取 获取每一行信息
 */

public class Myconverse {
      ArrayList<String> arrayList = new ArrayList<>();


        public  ArrayList<String> testConverse(File file) {
            try {
                arrayList.clear();
                BufferedReader br = new BufferedReader(new FileReader(file));
                String s ;

                while ((s = br.readLine())!=null){
                    //非空则添加
                    arrayList.add(s);
                    //BufferedReader br = new BufferedReader(new FileReader(file));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                //catch (FileNotFoundException e) {
            } catch (IOException e) {
                e.printStackTrace();
            }
            return arrayList;
        }
}
