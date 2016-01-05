# 1、创建工程

    1.1、mvn archetype:generate -DgroupId=wyf.rmi.test -DartifactId=rmi -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local

    1.2、生成的pom.xml做点修改：将  <packaging>jar</packaging>改为 <packaging>pom</packaging>，这样这个pom.xml才成为父pom.

# 2、创建子模块

* mkdir rmi-sample1
    * cd rmi-sample1
    * 进入standalone目录
    * rmi-sample1-client
      * mvn archetype:generate -DgroupId=wyf.rmi.test -DartifactId=rmi-sample1-client -Dpackage=wyf.rmi.test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
    * rmi-sample1-service
      * mvn archetype:generate -DgroupId=wyf.rmi.test -DartifactId=rmi-sample1-server -Dpackage=wyf.rmi.test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
    * rmi-sample1-service-impl
      * mvn archetype:generate -DgroupId=wyf.rmi.test -DartifactId=rmi-sample1-service -Dpackage=wyf.rmi.test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local
    * rmi-sample1-server
      * mvn archetype:generate -DgroupId=wyf.rmi.test -DartifactId=rmi-sample1-service-impl -Dpackage=wyf.rmi.test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local

* rmi-base
    * rmi-base-socket
          * mvn archetype:generate -DgroupId=wyf.rmi.test -DartifactId=rmi-base-socket -Dpackage=wyf.rmi.test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local

