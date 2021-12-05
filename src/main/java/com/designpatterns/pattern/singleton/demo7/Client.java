package com.designpatterns.pattern.singleton.demo7;

import java.io.*;

/**
 * @author tanyun
 * @Description 序列化破坏（让其类可以产生多个对象）单例模式
 * @date 2021/12/1 23:14
 */
public class Client {
    private final static String path = "C:\\Users\\pupu\\Desktop\\";

    public static void main(String[] args) {
//        writeObjectToFile();
        readFileToObject();
        readFileToObject();
    }

    /**
     * 反序列化文件为对象
     */
    public static void readFileToObject() {
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(path + "object.txt"));) {
            // 读取对象
            Singleton instance = (Singleton) oos.readObject();
            System.out.println("反序列化为： " + instance);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 序列化对象到文件中
     */
    public static void writeObjectToFile() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path + "object.txt"))) {
            // 创建对象
            Singleton instance = Singleton.getInstance();
            // 序列化对象到文件中
            oos.writeObject(instance);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
