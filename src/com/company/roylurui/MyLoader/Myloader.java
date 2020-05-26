package com.company.roylurui.MyLoader;


import com.company.roylurui.MethodArea.methodArea;
import com.company.roylurui.utils.Myconverse;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/**
 * 自定义装载模块
 * 返回的结果是包含pc和指令的map集合
 */
public class Myloader {

    public static void loadInArea() {
        //文件io
        File compiled = new File("byteCodeClass.txt");

        Myconverse myconverse = new Myconverse();
        //得到每一行字节码信息
        ArrayList<String> conversed = myconverse.testConverse(compiled);

        /*

            @Override
    public List<Commodity> getAll() {

        List<CommodityEntity> commodities = commodityRepository.findByComStatus("released");

        List<Commodity> commodityList = commodities.stream().map( entity ->{

            Commodity commodity = new Commodity();
            BeanUtils.copyProperties(entity,commodity);
            return commodity;
        }).collect(Collectors.toList());
         */
//        System.out.println(conversed);
        //得到指令信息
        Map<Integer,String[]> instruct_num = LoadInMethodArea.loader(conversed);
        //放到方法区中
        methodArea.setInstructMap(instruct_num);
    }
}
