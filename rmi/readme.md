# 1����������

    1.1��mvn archetype:generate -DgroupId=wyf.rmi.test -DartifactId=rmi -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=local

    1.2�����ɵ�pom.xml�����޸ģ���  <packaging>jar</packaging>��Ϊ <packaging>pom</packaging>���������pom.xml�ų�Ϊ��pom.

# 2��������ģ��

* mkdir rmi-sample1
    * cd rmi-sample1
    * ����standaloneĿ¼
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

