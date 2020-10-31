# design-patterns

- `common/` 既有代码
- `before/` 应用设计模式前的使用，变化到来时的痛点
- `after/` 应用设计模式后的改变

### GoF 23 design patterns

1. [Strategy 策略模式](/src/main/java/com/lzhlyle/demo/design/pattern/gof/strategy)    
将一系列算法逐个封装并可相互替换，易于切换、理解、扩展。
2. [Decorator 装饰模式](/src/main/java/com/lzhlyle/demo/design/pattern/gof/decorator)    
动态增加单个对象的额外职责，比生成子类更灵活。
3. [Proxy 代理模式](/src/main/java/com/lzhlyle/demo/design/pattern/gof/proxy)    
控制对单个对象的访问。
4. [Factory Method 工厂方法](/src/main/java/com/lzhlyle/demo/design/pattern/gof/factoryMethod)    
一般先用工厂方法解决对象创建问题。
5. [Prototype 原型模式](/src/main/java/com/lzhlyle/demo/design/pattern/gof/prototype)     
在初始化信息不发生变化时考虑。
6. [Template Method 模板方法](/src/main/java/com/lzhlyle/demo/design/pattern/gof/templateMethod)    
继承+重写解决代码重复问题。
7. [Facade 外观模式](/src/main/java/com/lzhlyle/demo/design/pattern/gof/facade)    
子系统的高层接口，避免两个类直接关系的第三者。
8. Builder 建造者模式    
多个部件的建造实现相同，只是所需部件、建造顺序不同时考虑。
9. Observer 观察者模式    
一对多依赖关系，一端变化、多端得到通知并自动更新。（目标与观察者可实现弱耦合）
10. Abstract Factory 抽象工厂模式    
当工厂方法无法满足多系列问题时，再重构为抽象工厂。
11. State 状态模式    
当对象内状态改变而执行不同操作时考虑，状态转移逻辑不在if/switch中，而在各子类之间，增/改状态和状态转换较容易。
12. Adapter 适配器模式    
让接口不相容的类能协同工作。（亡羊补牢）
13. Memento 备忘录模式    
不破坏封装，又要取该对象内状态，且要求状态还原时考虑。（保持封装边界）
14. Composite 组合模式    
用树状结构表示“整体-部分”的层次关系，使单个对象（叶节点）与组合对象（枝节点）的使用具有一致性。
15. Iterator 迭代器模式    
将对集合的访问与遍历从集合对象中分离出来到迭代器中。
16. Singleton 单例模式    
只需一个实例时考虑。
17. Bridge 桥接模式    
使继承关系更改为组合关系，使两者可独立变化。（未雨绸缪）
18. Command 命令模式    
将请求发送者与具体实现者解耦，可对请求排列、取消、重做，支持事务。（多请求，单处理）
19. Chain of Responsibility 职责链模式    
将处理者排成链，沿链传递请求。（单请求，多处理）
20. Mediator 中介者模式    
由中介封装一系列对象交互，减少对象间耦合，利于复用。（朋友多）
21. Flyweight 享元模式    
为运用共享技术，支持大量细粒度对象，节省开销。
22. Interpreter 解释器模式    
若某特定问题发生的频率足够高时考虑，需定义文法表示与解释器本身。
23. Visitor 访问者模式    
当Element较稳定、Visitor易增加时考虑。（朋友在精不在多）