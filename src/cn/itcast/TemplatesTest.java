/*
@author Johnson 
@create  2020/2/2 15:10
*/
package cn.itcast;


import com.sun.istack.internal.NotNull;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.ArrayList;
import java.util.Arrays;

public class TemplatesTest {
    private static final User u=new User();
    public static final int num1=1;
    public static final String string1="helloworld";
    public static void main(String[] args) {
        System.out.println("hello!!");

        int a = 10;
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("a = " + a);
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        for (String arg : args) {

        }
//list 集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(456);
        list.add(789);
        list.add(135);
        for (Integer i : list) {
            System.out.println("i = " + i);
        }
        if (list == null) {

        }
        if (list != null) {

        }
    }
}
