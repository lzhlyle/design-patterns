package com.lzhlyle.demo.design.pattern.gof.abstractFactory.after;

import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.DeptRepo;
import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.IFactory;
import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.UserRepo;
import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.mysql.MySQLFactoryImpl;

public class Client {
    public static void main(String[] args) {
        // 只需改此处
        // 仍然耦合，可通过反射解决
        IFactory factory = new MySQLFactoryImpl();

        // 提供一个创建一系列相关或相互依赖对象的接口，如 UserRepo
        // 而无需指定具体类，如 MySQLUserRepoImpl
        UserRepo userRepo = factory.createUserRepo();
        DeptRepo deptRepo = factory.createDeptRepo();
    }
}
