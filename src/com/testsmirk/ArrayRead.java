package com.testsmirk;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayRead {
    public static void fin(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer==10)
                iterator.remove();   //注意这个地方
        }

    }
}
