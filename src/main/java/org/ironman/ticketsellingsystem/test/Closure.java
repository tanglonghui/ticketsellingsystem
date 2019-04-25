package org.ironman.ticketsellingsystem.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Closure {
    private List<String> list;
    private int a = 0;
    private Sum sum;
    private void initList() {
        list = new ArrayList<>();
        for (int i = 100; i > 0; i--) {
            list.add("" + i);
        }
    }

    public void sort(int c) {
        int b = 0;
        initList();
        setSum(new Sum() {
            @Override
            public int add(int x, int y) {
                System.out.println(c);
                return 0;
            }
        });
        //匿名函数
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                if (first.length() < second.length()) return -1;
                else if (first.length() > second.length()) return 1;
                else return 0;
            }
        });
        list.sort((String first, String second) -> {
            if (first.length() < second.length()) return -1;
            else if (first.length() > second.length()) return 1;
            else return 0;
        });
        for (String s :
                list) {
            System.out.println(s);
        }
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }


    interface Sum {
        int add(int x, int y);
    }
}
