# springbootdemo

#### 介绍

springbootdemo

#### 软件架构

软件架构说明

#### 使用说明

1. graalvm native image编译,并运行

```
mvn compile
mvn spring-boot:process-aot

 mvn -Pnative native:build
```

```
.\target\springbootdemo.exe
```

2. 打包为jar文件,并运行jar包

```
mvn package
```

```
java -jar target\springbootdemo-0.0.1-SNAPSHOT.jar
```

3. 调试运行

```
mvn spring-boot:run
```
