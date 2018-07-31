# maven java项目骨架

## 约定
- 记得改build.properties中的数据库的配置
- 记得修改web.xml servlet-name


## 自定义骨架生成
- 当前项目下 执行 mvn archetype:create-from-project
- 进入 target/generated-sources/archetype 目录下，mvn clean install
- 这样，在本地的.m2/repository 下 会有这样的一个文件 archetype-catalog.xml
- idea - new project - create from archetype 勾选 - add archetype ，输入上面 archetype-catalog.xml 文件中的骨架的 GAV 即可
- idea 如何删除自定义骨架，只需要修改archetype-catalog.xml  删掉相关的依赖即可
