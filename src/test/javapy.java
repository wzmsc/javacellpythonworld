package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class javapy {
    public static void executePython(String toPath) {
        String exe = "python";
        //要执行python文件的位置
        String command = "D:\\pythonproject\\Runtime.py";
        //toPath传递给python的参数
        String[] cmdArr = new String[]{exe, command, toPath};
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(cmdArr);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


