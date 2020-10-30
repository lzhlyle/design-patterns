package com.lzhlyle.demo.design.pattern.gof.decorator.before;

import com.lzhlyle.demo.design.pattern.gof.decorator.common.Man;
import com.lzhlyle.demo.design.pattern.gof.decorator.common.Person;

public class Client {
    public static void main(String[] args) {
        Person lyle = new Man("Lyle");
        lyle.sayHello();

        // lyle 打招呼的方式很干，
        // 若希望教 lyle 更绅士地打招呼的方式
        // 为其前、后增加一些话题，而且这些话题还能适时地动态选择
        // 就不得不修改 Man 中 sayHello() 的代码，违反 OCP，也让 Man 更复杂，不再 SRP
    }
}
