package com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.sqlserver;

import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.DeptRepo;
import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.IFactory;
import com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition.UserRepo;

public class SqlServerFactoryImpl implements IFactory {
    @Override
    public UserRepo createUserRepo() {
        return new SqlServerUserRepoImpl();
    }

    @Override
    public DeptRepo createDeptRepo() {
        return new SqlServerDeptRepoImpl();
    }
}
