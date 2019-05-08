# Jacob Stringweb

교재의 Chapter 11의 회원가입

## Spring MVC와 Spring JDBC를 사용해서 Web application 만드는 방법

* build.gradle : spring-webmvc, spring-jdbc 설정
* META-INF/context.xml : 데이터베이스 커넥션 풀 설정
* WEB-INF/web.xml : ContextLoaderListener와 DispatcherServlet 구성
* WEB-INF/app-context.xml : Spring beans 정의
* DAO를 Spring JDBC를 사용하는 것으로 작성
* @Controller 클래스를 만들어서 url과 메서드 매핑
