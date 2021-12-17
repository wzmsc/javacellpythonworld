package test;

import java.util.ArrayList;

public class RunTimeFunction{
    public static void main(String[] args) {
        ArrayList<String> list = fenci.FileRead("D:\\pythonproject\\test.txt");
        for(String str : list) {
            javapy.executePython(str);
        }
    }
}
