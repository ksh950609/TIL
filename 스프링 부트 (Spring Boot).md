**스프링 부트 (Spring Boot)** 

\-   **스프링 프레임워크를 사용하는 프로젝트를 아주 간편하게 설정할 수 있는 스프링 프레임워크의 서브프로젝트**

 

**스프링 부트의 특징**

\-   **XML** **기반 설정 과정 없이 간단히 프로젝트를 시작****할 수 있음**

\-   **메이븐의 pom.xml 파일에 의존성 라이브러리의 버전을 일일이 지정하지 않아도 됨 (스프링 부트가 권장 버전 관리)**

\-   **단독 실행되는 스프링 애플리케이션 구현 가능**

\-   **프로젝트 환경 구축에 필요한 서버 외적인 툴들이 내장되어 있어서 별도 설치 필요 없음**

\-   **톰캣 내장되어 있음**

 

 

 

 

 

**—-----------------------------------------------------------------**

**스프링 부트 프로젝트 생성 과정**

**1.** **스프링 부트 프로젝트 생성**

**(1)** **프로젝트명 / Group / Artifact / 패키지명**

**(2)** **Dependencies** **선택**

\-   **SQL : JDBC API / MyBatis Framework / MySQL Driver**

\-   **Web : Spring Web**

**2.** **프로젝트 생성 후 확인**

**(1)** **pom.xml** **내용 확인**

\-   **java.version / jdbc / mysql-connector / tomcat**

**(2)** **자동 생성된 클래스 파일 확인**

\-   **ServletInitializer.java**

\-   **스프링 부트 애플리케이션을 web.xml 없이 톰캣에서 실행하게 해주는 클래스**

\-   **따라서 스프링 부트에는 web.xml, context.xml 설정 파일 없음**

\-   **…….Application.java**

\-   **@SpringBootApplication** **붙어 있음**

\-   **스프링 부트 애플리케이션으로 설정하는 어노테이션**

\-   **main()** **메소드 포함**

**3.** **스프링 설정 파일**

\-   **application.properties** **파일이 자동 생성됨**

\-   **(****내용이 없는 빈 파일로 생성)**

\-   **추가할 내용**

\-   **포트 번호**

\-   **데이터베이스 연결 정보**

\-   **mapper.xml** **위치 지정** 

\-   **src/main/resources** **파일에 생성할 것임**

\-   **여기서 컨트롤러 추가하고 (“/”) 실행시켜서 오류 있는지 확인**

**4. JSP** **뷰 설정**

\-   **스프링 부트는 JSP 뷰가 기본이 아니기 때문에**

\-   **JSP** **뷰를 사용할 경우 추가 설정 필요**

\-   **application.properties** **파일에 JSP 설정 추가**

\-   **pom.xml** **의존성 라이브러리 추가**

\-   **src/main/webapp** **폴더에 WEB-INF/views 폴더 추가**

\-   **hello.jsp** **생성하고**

\-   **컨트롤러에서 @RequestMapping 추가해서 hello.jsp 실행되는 확인**

\-   **스프링 부트에서 리소스 파일 경로 확인 (이미지 출력)**

**5. DB** **연동 CRUD 기능 구현**

\-   **spring_mvc_mybatis** **에서 product 코드는 그대로 사용 (일부 경로 수정)**

\-   **파일 위치 주의**

 

 

 

 

 

 

 

 

 

 

 

 

 

**—-----------------------------------------------------------------**

**1.** **스프링 부트 프로젝트 생성**

**(1)** **프로젝트명 / Group / Artifact / 패키지명**

\-   **File / New / Spring Starter Project**

\-   **프로젝트명 (Name) : spring_boot_mybatis**

\-   **Group : com.spring_boot_mybatis**

\-   **Artifact : project**

\-   **패키지명 (Package)**

\-   **com****.****spring_boot_mybatis****.****project**

\-   **Java Version : 11**

\-   **Packaging : War**

 

**(2)** **Dependencies** **선택**

\-   **SQL : JDBC API / MyBatis Framework / MySQL Driver**

\-   **Web : Spring Web**

**<dependency>**

​               **<groupId>org.springframework.boot</groupId>**

​               **<artifactId>spring-boot-starter-tomcat</artifactId>**

​               **<scope>provided</scope>**

​          **</dependency>**

 

 

 

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image002.gif)**

 

 

 

**—---------------------------------------------------------------**

**2.** **프로젝트 생성 후 확인**

**(3)** **pom.xml** **내용 확인**

\-   **java.version / jdbc / mysql-connector / tomcat**

**(4)** **자동 생성된 클래스 파일 확인**

\-   **ServletInitializer.java**

\-   **스프링 부트 애플리케이션을 web.xml 없이 톰캣에서 실행하게 해주는 클래스**

\-   **따라서 스프링 부트에는 web.xml, context.xml 설정 파일 없음**

\-   **…….Application.java**

\-   **@SpringBootApplication** **붙어 있음**

\-   **스프링 부트 애플리케이션으로 설정하는 어노테이션**

\-   **main()** **메소드 포함** 

\-   **스프링 부트 생성 시 자동으로 생성**

\-   **스프링 부트 프로젝트에는 반드시 main()이 있어야 함**

\-   **스프링 부트 프로젝트 main() 메소드를 시작점으로 실행**

\-   **main()** **메소드를 포함하는 java 파일이 있어야 함**

\-   **이유 : 스프링 부트 웹 애플리케이션을 일반 자바 애플리케이션처럼 개발하려는 의도 때문**

 

 

 

**—----------------------------------------------------------------**

**3.** **스프링 설정 파일**

\-   **application.properties** **파일이 자동 생성됨**

\-   **src/main/resources** **폴더에 위치**

\-   **(****내용이 없는 빈 파일로 생성)**

\-   **추가할 내용**

\-   **포트 번호 : server.port=8080**

\-   **데이터베이스 연결 정보**

\-   **spring.datasource.****driver-class-name****=**

\-   **spring.datasource.****url****=**

\-   **spring.datasource.****username****=**

\-   **spring.datasource.****password****=**

\-   **mapper.xml** **위치 지정** 

\-   **src/main/resources** **폴더에 생성할 것임**

\-   **DAO****와 mapper 파일 추가한 후에 설정할 것임**

\-   **여기서 컨트롤러 추가하고 (“/”) 실행시켜서 오류 있는지 확인**

\-   **HelloController** **클래스 추가**

\-   **요청 url : “/”**

\-   **http://localhost:8080**

\-   **실행 : Run As / Spring Boot App**

\-   **웹브라우저에 url 직접 입력**

\-   **http://localhost:8080**

\-   **WARN : No MyBatis mapper was found in**

\-   **mapper** **추가하면 없어질 것임**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image004.gif)**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image006.gif)**

 

 

 

 

 

**Port 8080 is already in use**

\-   **(1) server.port=8081**

\-   **(2)** **프로세스 종료할 경우**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image008.gif)**

 

**Port 8080 is already in use** **안 나오게 하려면** 

\-   **프로젝트 실행 시 톰캣 중단 시키고 실행**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image010.gif)**

 

**—-----------------------------------------------------------------**

**4. JSP** **뷰 설정**

\-   **스프링 부트는 JSP 뷰가 기본이 아니기 때문에**

\-   **JSP** **뷰를 사용할 경우 추가 설정 필요**

\-   **application.properties** **파일에 JSP 설정 추가**

\-   **spring.mvc.view.prefix=/WEB-INF/views/**

\-   **spring.mvc.view.suffix=.jsp**

\-   **pom.xml** **의존성 라이브러리 추가**

\-   **![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image012.gif)**

**<dependency>**

 **<groupId>javax.servlet</groupId>**

 **<artifactId>jstl</artifactId>**

**</dependency>**

\-    

\-    

\-    

\-   **![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image014.gif)**

**<dependency>**

​    **<groupId>org.apache.tomcat.embed</groupId>**

​    **<artifactId>tomcat-embed-jasper</artifactId>**

**</dependency>**

\-   **src/main/webapp** **폴더에 WEB-INF 폴더 생성 그 안에 views 폴더 추가**

\-   **hello.jsp** **생성하고**

\-   **컨트롤러에서 @RequestMapping(“/hello”) 추가해서 hello.jsp 실행되는 확인**

\-   **스프링 부트에서 리소스 파일 경로 확인**

\-   **실행 : Run As / Spring Boot App**

\-   **웹브라우저에 url 직접 입력**

\-   **http://localhost:8080/hello**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image016.gif)**

\-   **스프링 부트에서 리소스 파일 경로 확인 (이미지 출력)**

\-   **리소스 파일 경로**

\-   **src/main/resources/static** **폴더가 기본 위치**

\-   **static** **폴더 안에 image 폴더 생성하고** 

\-   **apple.png** **복사**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image018.gif)**

 

**—----------------------------------------------------------**

**스프링 부트 프로젝트 생성 연습문제**

\-   **spring_boot_mybatis2**

\-   **hello.jsp****까지 출력**

**(****일반적인 패키지명 : com.company.app)**

 

**—--------------------------------------------------------------**

**5. DB** **연동 CRUD 기능 구현**

\-   **spring_mvc_mybatis** **에서 product 코드는 그대로 사용 (일부 경로 수정)**

\-   **파일 위치 주의**

\-   **(1)** **패키지 생성** 

\-   **controller / dao / model / service**

\-   **클래스 / 인터페이스 파일 (mapper 제외)**

\-   **VO / service / DAO / Controller**

\-   **복사 시 주의! - 이전 패키지 import 삭제할 것**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image020.gif)**

\-   **(2) mapper** **파일 폴더 생성**

\-   **src/main/****resources** **폴더에 mappers 폴더 생성하고, 그 안에 product 폴더 생성**

\-   **product** **폴더 안에 ProductMapper.xml 파일 복사**

\-   **DAO/VO** **경로 수정**

\-   **application.properties****에 mapper 위치 설정**

\-   **mybatis.mapper-locations=classpath:mappers/\**/\*.xml**

\-   **(3) …Application.java** **클래스에 추가**

\-   **컴포넌트 클래스(Controller와 Service)에 대해 추가**

\-   **@ComponentScan**

\-   **@MapperScan**

\-   **추가하지 않으면 bean이 없다는 오류 발생**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image022.gif)**

\-   **컴포넌트마다 추가하지 않고 기본 패키지로 설정해도 됨**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image024.gif)**

\-   **(4) view** **페이지 복사**

\-   **product** **폴더 복사**

\-   **index.jsp** **복사**

\-   **모든 경로 (요청 경로) 변경**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image026.gif)**

\-   **(5) HelloController** **필요 없음**

\-    **(****삭제 또는 내용 주석 처리)**

\-   **(6) js** **폴더 생성**

\-   **src/main/resources/static** **폴더에 js 폴더 복사**

\-   **(7)** **외부 경로 설정 : 상품 이미지 출력**

\-   **WebConfig** **클래스 생성** 

\-   **MVC** **프로젝트에서 spring-context.xml에 설정한 내용 추가**

\-   **<resources mapping="/images/\**" location="file:///C:/springWorkspace/product_images/" />**

\-   **WebMvcConfigurer** **인터페이스 구현**

\-   **맵핑 이름****과 이미지 위치 설정**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image028.gif)**

 

 

 

 

 

 

 

 

**=====================================**

**스프링 부트 프로젝트 연습문제**

\-   **도서 관리 프로그램 작성**

\-   **spring_boot_mybatis_book**

\-   **CRUD** **기능 구현**

\-   **중복 체크 / 검색 / 외부 파일 경로 설정(이미지 출력)**

 

 

 

 

 

 

 

 

 

 

 

**=======================================**

**스프링 부트 프로젝트에 파일 업로드**

\-   **MultipartFile** **클래스 사용**

\-   **스프링 부트에서는 의존성 라이브러리 추가 필요 없음**

\-   **자동으로 MultipartConfigElement 클래스를 빈으로 등록**

\-   **HTML**

\-   **<form enctype=”multipart/form-data”>**

\-   **<input type=”file”>**

\-   **업로드되는 파일 크기 제한 변경 가능**

\-   **maxFileSize**

\-   **업로드하는 파일 1개의 크기 : 디폴트 1M**

\-   **maxRequestSize** 

\-   **요청 크기 제한**

\-   **모든 파일의 크기를 합한 크기 값 제한**

 

**파일 업로드 예제**

**(1)** **파일명이 중복되지 않게 해서 업로드**

\-   **동일한 파일명으로 업로드 되는 경우 앞의 파일 덮어쓰게 되는 문제**

\-   **파일명이 중복되지 않도록 파일명을 변경해서 업로드**

\-   **UUID :** **식별자 표준**

\-   **16** **옥텟(128비트)의 수**

\-   **총 36개의 문자 (32개 문자와 4개의 하이픈)**

\-   **8-4-4-4-12**

\-   **8e1a2153-edfa-436f-bd72-23b6b7e5cd6b_****원본파일명**

\-   **자바 UUID 클래스의 randomUUID() 메소드를 사용해서 유일한 식별자 생성**

**(2)** **여러 개의 파일 업로드**

**(3)** **파일명 변경하지 않고 파일 업로드**

 

**파일 다운로드 예제**

\-   **폴더 내 모든 파일 목록 출력하고**

\-   **목록에서 파일 선택해서 다운로드**

\-   **파일명에 한글 들어 있는 경우 한글 출력 안 됨**

\-   **다운로드 컨트롤러에서 인코딩**

 

 

 