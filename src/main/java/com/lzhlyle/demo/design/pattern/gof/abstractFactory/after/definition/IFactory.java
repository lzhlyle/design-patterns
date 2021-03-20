package com.lzhlyle.demo.design.pattern.gof.abstractFactory.after.definition;

public interface IFactory {
    UserRepo createUserRepo();

    DeptRepo createDeptRepo();
}
