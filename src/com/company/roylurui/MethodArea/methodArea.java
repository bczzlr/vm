package com.company.roylurui.MethodArea;

import java.util.Map;

/**
 * 方法区
 */
public class methodArea {
    private static Map<Integer,String[]> instructMap;

    public static Map<Integer, String[]> getInstructMap() {
        /*
         List<Book> books = bookEntities.stream().map(entity -> {
            Book book = new Book();
            BeanUtils.copyProperties(entity, book);
         */
        return instructMap;
    }

    public static void setInstructMap(Map<Integer, String[]> instructMap) {
        methodArea.instructMap = instructMap;
        //return instructMap;
    }
}
