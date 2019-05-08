# Jacob Springweb

교재의 Chapter 11의 회원가입

## Spring MVC와 Spring JDBC를 사용해서 Web application 만드는 방법

* build.gradle : spring-webmvc, spring-jdbc 설정
* META-INF/context.xml : 데이터베이스 커넥션 풀 설정
* WEB-INF/web.xml : ContextLoaderListener와 DispatcherServlet 구성
* WEB-INF/app-context.xml : Spring beans 정의
* DAO를 Spring JDBC를 사용하는 것으로 작성
* @Controller 클래스를 만들어서 url과 메서드 매핑

## Handler Methods

### Method Arguments
|컨트롤러 함수 인자|설명|
|---|---|
|HttpServletRequest, HttpServletResponse|서블릿의 요청과 응답|
|HttpSession|세션|
|@RequestParam|요청 파라미터|
|@SessionAttribute|세션의 attribute|
|Command object|데이터 바인딩한 객체|

### Return Values
|컨트롤러 함수 리턴 값|설명|
|---|---|
|String|지정한 뷰로 forward 또는 redirect|
|void|매핑 값의 뷰로 forward|
