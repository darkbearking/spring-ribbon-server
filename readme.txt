Eureka服務總管，類似於提供一個114總台的服務
可以令其他具體服務提供者（如first-police）接入當前服務
并將接入進來的其他服務提供給服務消費者（如first-person）使用

從系統架構上來講。first-114相當於底層的服務容器tomcat
而first-police和first-person都是部署於tomcat中的兩套程序。
區別在於，first-police是最底層的服務提供者，而first-person是高級的服務提供者
這個first-person對外服務的提供，依賴於底層first-police
而first-client相當於用戶終端（手機端、web端等），它發起請求到first-person，獲取由first-person返回的數據

它的pom包中，有一個與眾不同的依賴，叫做“spring-cloud-starter-eureka-server”
而其他的eureka服務提供端中的依賴，最多使用“spring-cloud-starter-eureka”就足夠了