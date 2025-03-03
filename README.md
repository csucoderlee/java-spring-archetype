# maven java项目骨架

## 约定
- 记得改build.properties中的数据库的配置
- 记得修改web.xml servlet-name


## 自定义骨架生成
- 当前项目下 执行 mvn archetype:create-from-project
- 进入 target/generated-sources/archetype 目录下，mvn clean install
- 这样，在本地的.m2/repository 下 会有这样的一个文件 archetype-catalog.xml
  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <archetype-catalog xsi:schemaLocation="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0 http://maven.apache.org/xsd/archetype-catalog-1.0.0.xsd"
      xmlns="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <archetypes>
      <archetype>
        <groupId>com.example</groupId>
        <artifactId>demo-archetype</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <description>Demo project for Spring Boot</description>
      </archetype>
    </archetypes>
  </archetype-catalog>
  ```
- idea - new project - create from archetype 勾选 - add archetype ，输入上面 archetype-catalog.xml 文件中的骨架的 GAV 即可
- idea 如何删除自定义骨架，只需要修改archetype-catalog.xml  删掉相关的依赖即可
