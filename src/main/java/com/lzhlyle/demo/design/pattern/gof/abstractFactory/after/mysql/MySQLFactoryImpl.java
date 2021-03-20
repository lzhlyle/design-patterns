package com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.mysql;

import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.DeptRepo;
import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.IFactory;
import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.UserRepo;

public class MySQLFactoryImpl implements IFactory {
    @Override
    public UserRepo createUserRepo() {
        return new MySQLUserRepoImpl();
    }

    @Override
    public DeptRepo createDeptRepo() {
        return new MySQLDeptRepoImpl();
    }
}
