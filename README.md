# 背景说明

- 日志出现的前后顺序

log4j -> jul -> jcl -> slf4j -> logback -> log4j2

- 日志门面: jcl, slf4j

- 日志实现: log4j, jul, logback, log4j2

- 说明：
  - (1) jcl是早期的日志门面，目前已基本不使用
  - (2) springboot 内置的日志组合是：slf4j + logback
  
# 推荐组合

- slf4j + logback + lombok

```xml
<properties>
    <slf4j.version>1.7.32</slf4j.version>
    <lombok.version>1.18.20</lombok.version>
    <logback.version>1.2.6</logback.version>
</properties>

<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>${lombok.version}</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>${slf4j.version}</version>
    </dependency>
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>${logback.version}</version>
    </dependency>
</dependencies>
```

# 参考链接

- [日志组件slf4j+logback+lombok使用实例](https://www.cnblogs.com/kendoziyu/p/15572311.html)
- [从源码看logback配置文件的加载顺序](https://blog.csdn.net/qq_28112995/article/details/107871235)
- [springboot 源码阅读之 logback-spring.xml 是在哪里加载的?](https://blog.csdn.net/heshiyuan1406146854/article/details/100930734?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1.pc_relevant_default&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1.pc_relevant_default&utm_relevant_index=1)
