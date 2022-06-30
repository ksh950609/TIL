

## TODAY I LEARN 

---



1. Servlet 

2. JSP 



- Servlet



- JSP

-- 서버 사이드 스크립트 언어 

-- **Java** 기반으로 **HTML 문서** 내에 자바코드를 삽입해서 웹 서버에서 동적으로 웹 페이지를 

-- 생성해서 클라이언트에게 반환 

-- JSP를 통해 HTML과 동적으로 생성된 컨텐츠를 혼합해서 사용 

-- Servlet을 보완한 스크립트 방식 표준 

-- Servlet 기능 + 추가 기능 

-- JSP 는 실행하면 Servlet(.java)으로 변환 되어 컴파일되어 **클래스(.class)**파일로 만들어져 실행

-- View를 담당하는 페이지로 사용 *( 나중에 View나오는 부분 있음 )*



**JSP VS Servlet**



JSP

- HTML 내부에 JAVA 소스코드가 들어 있는 형식
- 사용하기 편리 : 쉬움 

Servlet

- JAVA 코드 내에 HTML 코드 포함 
- 읽고 쓰기 불편 



**JSP**



-- 정적페이지 + 동적페이지

-- 정적 페이지 구현 : HTML 태그 

-- 동적 페이지 구현 : 스크립트 사용 

- <%@ %>
- <% %>
- <%! %>
- <%= %>



------

1) JSP페이지 인코딩 설정 

 	Preference / Web / JSP Files

​	Encoding : ISO 10646/Unicode(UTF-8)

2. 새 프로젝트 생성 / JSP 파일 생성 

   JSP01

   test.jsp

   ```Html
   
   <%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8"%>
       // HTML 기본 형식에 JSP 코드가 들어 있다.
   <!DOCTYPE html>
   <html>
   <head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   </head>
   <body>
   
   </body>
   </html>
   ```

   

JSP 페이지의 기본 구성 요소 



JSP 페이지 내용 

- HTML 문서 내용 / JSP 태그 / 자바 코드 



구성

지시어 : page, include, taglib

스크립트 요소 

- 선언문
- 표현식
- 스크립트릿
- 액션코드



JSP 태그 

**<% 로 시작하고 %>로 종료 **

@,!,=,-- 문자를 추가하여 태그의 의미 부여

**![img](https://lh5.googleusercontent.com/TWP5ON8WryQjmGN09W8JKWse6YcX04bt2oqBBrnq41xHHT2WVHHNGcWYBd92C_1LYR5ZfjqtR037ixuCga24rqk-2uLrriAyRsuk7MBZ77HZwCqJys_7fgfAdEsY_lhW3Tg1FptbqT1Waz4bSA)**





JSP 시작 예제 : Start.JSP

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start</title>
</head>
<body>
JSP 세상에 오신 것을 환영합니다.<P> 여기는 HTML 영역입니다.</P>

여기는 자바 형식<%
	out.println("JSP를 시작합니다."); /* html 문서에 출력 */
%>

여기는 자바 형식<%
%>


</body>
</html>

형식을 구분해서 사용할 수 있다.
```





지시어 



- JSP 페이지의 전체적인 속성을 지정할 때 사용

- JSP 컨테이너에게 전달하는 JSP페이지 관련 메시지

- <%@ 지시어 속성1 = 값, 속성2 = 값 , ... %>

  **![img](https://lh5.googleusercontent.com/oWQ5TPqMENDmueitJkQLwaG3ioi30KJq_nWRrWcsjiznZOI6lLNoILDr4txv-QvNGYdyWQGUiVRRqwVWFozFL3cRJk6OaooefXBqRgTjJacoKSGp58JuZhVUCyctpfo281j-jIg3f6tJazViPQ)**



**page 지시어 :<%@ page … %>**

JSP 페이지에 대한 속성 설정 



Include 지시어 

- <%@ include file = '포함될 파일의 URI'%>

- 공통적으로 포함될 내용을 가진 파일을 해당 JSP 페이지 내에 삽입하는 기능을 제공

- 복사 & 붙여넣기 방식으로 두개의 파일이 하나의 파일로 합쳐진 후 하나의 파일로서 

   	변환되고 컴파일 



tag lib 지시어 

- <% taglib prefix="c" uri="http:...." %>

- 표현 언어 (EL : Expression Language), JSTL(JSP Standard Tag Library)

  를 JSP페이지 내에서 사용할때 씀



JSP 페이지의 스크립트 요소

- 선언문
- 표현식
- 스크립트릿



선언문 (Declaration)

JSP 페이지의 멤버 필드 선언 또는 메소드를 정의 할 떄 사용 

선언문에서 선언된 변수는 페이지 전체에서 사용 가능 (전역 변수 의미)

형식 : <%! 선언 %> 

예 : <% int a = 20; %> 



<%! 

int a = 10;

String str = "문자열";

%>



표현식(Expression)

변수 값, 계산 결과, 함수 호출 결과를 직접 출력하기 위해 사용 

<%= 식%>

<%= 변수명 %>

예: <%= 3*5%>

<%! String name = "홍길동 "; %>

<% name %>



스크립트릿 (Scriptlet)

자유롭게 자바 코드를 기술 할 수 있는 영역 

<% 자바코드 %>

스크립트릿에서 선언된 변수는 지역 변수의 개념

선언된 이후부터 사용 가능 





----

변수 선언 Variable1 

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>변수 선언 예제</title>
	</head>
	<body>
		int x = 10; // 선언과 동시에 초기화 가능 
        long y;
        
        //y =100; 선언부에서 값을 지정하면 오류
        
        float floatValue = 3.14f;// float인 경우 f,F
        double doubleValue = 3.14; //double인 경우 기본
        
        char ch = 'a';
        String myJob = "풀스택 개발자";
        
        boolean b = true; // 또는 false
       /%>
        <%
           y=100;
           String address = "제주";
           /%>
            
            <h3>변수 값 출력              
            </h3> 변수 값 출력
      x : <%= x %> <br>
		y : <%= y %> <br>
            floatValue : <%= floatValue %> <br>
		doubleValue : <%= doubleValue %> <br>
		ch : <%= ch %> <br>
		myJob : <%= myJob %> <br>
		b : <%= b %> <br>
		address : <%= address %> <br>
            
	</body>
</html>
```





**메소드 선언 예제 : method.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메소드 정의</title>
</head>
<body>
	<h2>메소드 선언 및 정의</h2>

	<%!String id = "abcd";
// 메소드는 반드시 선언부에서 정의 (스크립트릿 영역에서 정의하면 오류 발생)
	public String getId() {
		return id;
              // 아이디 값을 돌려 받음 

	}%>

	id :
	<%=id%>
	<br> 메소드 getID() 호출한 결과 : <%=getId()%>


</body>
</html>

// 메소드 반드시 선언부에서 정의해야 함 


```



**include 지시어 예제**

JSP 파일 Include

top.jsp / bottom.jsp / jspInclude.jsp

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %> // 페이지 다음에는 내가 쓰고 싶은거 
    <%
    Date today = new Date();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Top</title>
</head>
<body>
<font color = "blue" size="3pt">
top.jsp입니다.<P></P>
<%= today.toLocaleString() %>
</font>
</body>
</html>
```

```JSp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>include 지시어 : bottom.jsp</title>
	</head>
	<body>
		<font color="green">
			bottom.jsp입니다. <p>
			작성자 :  <b><%= name  %></b> 입니다 
		</font>
	</body>
</html>
```

```JSP
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    String name = "홍길동";
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- top -->

이 부분에 top.jsp 페이지 내용이 포함될 것입니다.<p>
<%@ include file = "top.jsp" %>

<!-- 본문 -->
<h2>본문</h2>
이 부분에 jspInclude.jsp의 내용입니다.<p>


<hr>

<!-- bottom -->
이 부분에 bottom페이지 들어와요
<%@ include file="bottom.jsp" %>
</body>
</html>
```



주석처리 

HTML은 <!-- -->

JSP 주석은 <%-- --%>

자바는 //, /* */ 

shift ctrl /



JSP 내장 객체 



내장 객체 

클라이언트에서 웹 서버에게 JSP페이지를 요청하면 자동으로 생성 

객체 생성하지 않고 바로 사용 가능 



내장 객체 종류 

- 입출력 : request, response, out
- 서블릿 : page / config 
- 컨텍스트 : session / application / pageContext
- 에외 처리 : exception

**![img](https://lh3.googleusercontent.com/3_U5NAdcu9BCWXRs2m8EADPgadc0HbdkDBlBXASRfAOEKtqy3jx4b6--Zqt8w8Q6C24jk-FDdFz0LqrYbohjWDBvN1yxQYt1GyxCrNbgwuOez0RB-HbqtcnrOH8SVE2-nD0lIUEO0Krtdc2Sug)**

request  객체 예제 : request.jsp

request 객체의 파라미터 관련 메소드 

**![img](https://lh3.googleusercontent.com/ImvagCnvbLh1xoJ4pQT2lU-Q_v5tv_O6ULXvAB61niHTLRXe9muZ-kdqOd-5fJ12EdmKjL8nOiCMYZE39wXTn9JHzPwyiL0l8e4RDHP6HRKv80SQhzyoKBEkcbhoektpK3Gu74thG7lY09yG2g)**

HTML 태그의 name 속성 값을 받음 

<input type = "text" name="name">



request객체의 파라미터 관련 메소드 예제

requestFrom.Jsp

requestFromOK.Jsp

**request.getParameter()****

request.getParameterValues()

변수로 출력

**![img](https://lh5.googleusercontent.com/VzW85tHOSsKwPaM1tNC3Ekh1Z3H23kgOQBi3WXDH1mkn_bKzfbUW7-allIy1KosLjpkdlS6V5JcVfPY3CkmMQz8UnpKynZu9SJcpUuKdi26zUVQKnnOSxv1WmDMMIwVCjHcHjhKgybakLpQ27g)**

``` JSP
```



**response** **객체**



JSP 페이지에서 처리한 결과를 웹 브라우저에 응답할 떄 사용

해더 설정 코드 상태 쿠키 등 정보 포함되어 있음 

응담 콘텐츠 설정 응답 헤더 설정 상태 코드 설정과 관련 된 메소드 제공

![image-20220630201254919](C:\Users\kimsanghoon\AppData\Roaming\Typora\typora-user-images\image-20220630201254919.png)

**response** **객체 예제**

response.JSP

responseOK.jsp\-   **(response.sendRedirect("pass.jsp");)**

\-   **결과에 따라 다른 페이지로 이동** 

\-   **pass.jsp**

\-   **fail.jsp**

```jsp
```



OUT  객체 



웹 서버에서 웹 브라우저에게 출력스트림으로 응답하기 위해 사용됨

**OUT.PRINTLN("출력 문자열");**

- 표현식 <%=  출력문자열 %>과 동일 

- println() : 줄바꿈 적용되지 않음 

- (LN없는 것도 스페이지 한칸 정도 차이)

- 줄바꿈 하기 위해서는 br태그 사용



전송되는 데이터 타입 : 문자열 



숫자 연산을 할 경우 숫자형으로 형 변환 필요 

형변환 예제

\-   **typeConversion.jsp**

\-   **사각형의 가로길이, 세로길이 입력받아서 전송**

\-   **typeConversionOk.jsp**

\-   **사각형의 넓이 구해서 출력**

\-   **사각형의 넓이 : 200**

```html
```

JSP 제어문 (JAVA와 동일)

- if for while



제어문 예제 구구단의 단 수 입력 받아서 출력 

forForm.jsp

forResilt.jsp

![image-20220630201910789](C:\Users\kimsanghoon\AppData\Roaming\Typora\typora-user-images\image-20220630201910789.png)

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>for 문 </title>
</head>
<body>
	<form method="post" action="forResultOk.jsp">
			구구단 단 입력 : 
			<input type="text" name="dan" size="10">
			<input type="submit" value="입력">
		</form>
</body>
</html>
```

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>for 문 결과</title>
	</head>
	<body>
	<%
		//request.setCharacterEncoding("UTF-8");				
		int dan = Integer.parseInt(request.getParameter("dan"));
	%>
		<h3><%= dan %>단</h3>
		<table border="1">
			<% for(int i=1; i<10; i++) { %>
				<tr><td><%= dan %> * <%= i %> = <%= dan * i %></td></tr>
			<% } %>
		</table>
	</body>
</html>
```



**액션 태그 **

- JSP 페이지 내에서 어떤 동작을 지시하는 태그 

- 어떤 동작 또는 액션이 일어나는 시점에 페이지와 페이지 사이에서의 제어 이동 또는 

- 다른 페이지의 실행 결과를 현재 페이지에 포함하는 기능 제공



**액션 태그 종류**

\-   **include**

\-   **forward**

\-   **useBean**

\-   **setProperty**

\-   **getProperty**

\-   **plug-in**



Include 액션 태그 : <jsp.include>

-->  다른 페이지의 실행 결과를 현재 페이지에 포함시킬 때 사용



forward 액션 태그 <Jsp:forward>

- 페이지에서 다른 특정 페이지로 전환
- 웹 페이지 간의 제어를 이동시킬 때 사용



parm 액션 태그 <jsp:param>

- 이동하는 페이지에 파라미터 값을 전달할 때 사용 



useBean 액션 태그 : <Jsp : useBean>

- 자바빈을 jsp페이지에서 이용할 떄 사용 
- DTO/VO 해당



SetProperty 액션 태그 **<jsp:setProperty>**

\-   **프로펄티의 값을 세팅할 때 사용**

\-   **setter**





**getProperty** **액션 태그 <jsp:getProperty>**

\-   **getter**



**include** **액션 태그 :** **<jsp:include>**

\-   **다른 페이지의 실행 결과를 현재 페이지에 포함시킬 때 사용**

\-   **페이지를 모듈화할 때 사용**

\-   **<jsp:include page=”****포함될 페이지” flush=”true” />**

\-   **page** **속성 : 결과가 포함될 페이지면**

\-   **flush** **속성**

\-   **포함될 페이지로 제어가 이동될 때** 

\-   **현재 포함하는 페이지가 지금까지 출력 버퍼에 저장한 결과를 처리하는 방법을 결정**

\-   **true**

\-   **현재 페이지가 지금까지 버퍼에 저장한 내용을 웹 브라우저에 출력하고 버퍼를 비움**

 

**include** **액션 태그 예제** 

\-   **includeAction1.jsp**

\-   **includeAction2.jsp**

\-   **1****에 2 포함**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>include 액션 태그</title>
	</head>
	<body>
		<h3>includeAction1.jsp 입니다</h3>
		<hr>
		<!-- include 액션 태그 -->
		<jsp:include page="includeAction2.jsp" flush="true" />
	</body>
</html>
```



 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>include 액션 태그</title>
 	</head>
 	<body>
 		<h3>includeAction2.jsp 입니다</h3>
 	</body>
 </html>
 ```

둘이 합쳐져서 나옴 

 ![image-20220630203501794](C:\Users\kimsanghoon\AppData\Roaming\Typora\typora-user-images\image-20220630203501794.png)

이렇게





 

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image002.gif)**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image004.gif)**

 

 

 

**—---------------------------------------------------------------**

**forward** **액션 태그**

\-   **<jsp:forward page=”****포워딩할 JSP 페이지” />**

\-   **현재 페이지에서 다른 특정 페이지로 전환**

\-   **웹 페이지 간의 제어를 이동시킬 때 사용**

 

**forward** **액션 태그 예제**

\-   **login.jsp**

\-   **loginResult.jsp**

\-   **ID****를 입력하지 않은 경우 login.jsp 포워딩**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>로그인창</title>
 	</head>
 	<body>	
 	<%
 		String userId = request.getParameter("user_id");
 		if(userId == null) {
 	%>
 		<h3>로그인</h3>
 	<%
 		} else {	
 	%>		
 		<h3>로그인</h3>
 		<h4>아이디를 입력하지 않았습니다. 아이디를 입력하세요.</h4>
     <%
 		} 
 	%>		
 	  <form name="frmLogin" method="post" action="loginResult.jsp" >
 		   아이디  :<input type="text" name="user_id"><br>
 	     비밀번호:<input type="password" name="user_pw" ><br>
 	    <input type="submit" value="로그인">  <input type="reset" value="다시입력">
 	  </form>
 	</body>
 </html>
 ```



```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>loginResult</title>
	</head>
	<body>
	<%
		String userId = request.getParameter("user_id");
		// 아이디 값이 없는 경우 login.jsp로 포워딩
		/* if(userId.equals("")){ */
		if(userId.length() == 0) {
	%>
			<jsp:forward page="login.jsp" />
	<%
		}
	%>
		<h3>환영합니다 <%= userId %>님!</h3>
	</body>
</html>
```





**html** **파일을 jsp로 사용하려면**

\-   **먼저 jsp 파일 생성하고**

\-   **html** **내용 복사해서 붙여넣기**

 

 

 

 

**—---------------------------------------------------------------**

**자바빈 (JavaBeans)**

\-   **DTO / VO****와 같은 개념**

\-   **데이터를 다루기 위해 자바로 작성되는 소프트웨어 컴포넌트로 재사용 가능**

\-   **입력 폼의 데이터와 데이터베이스의 데이터 처리 부분에서 활용**

\-   **클래스로 작성**

\-   **멤버 필드로 속성 (property)이 있고**

\-   **멤버 메소드로 Getter/Setter 메소드 포함**

\-   **setXXX() :** **프로퍼티에 값 저장**

\-   **getXXX() :** **프로퍼티 값 반환**

\-   **액션 태그를 이용해서 빈 사용**

\-   **속성 접근 제어자는 private**

\-   **Getter/Setter** **메소드와 클래스는 public** 

 

**자바빈 관련 액션 태그**

\-   **useBean** **액션 태그 : <jsp:useBean>**

\-   **자바빈을 JSP 페이지에서 사용할 때 사용**

\-   **setProperty** **액션 태그 : <jsp:setProperty>**

\-   **프로퍼티(속성) 값을 설정할 때 사용**

\-   **데이터 설정(저장)**

\-   **getProperty** **액션 태그 : <jsp:getProperty>**

\-   **프로펄티의 값을 얻어낼 때 사용**

 

 **<jsp:useBean>** **속성**

\-    **<jsp:useBean id=”” class=”” scope=”” (안써도 된다고 함 ) />**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image006.gif)**

 

**setProperty** 

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image008.gif)**

**getProperty** 

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image010.gif)**

 

**자바빈 액션 태그 예제**

\-   **빈 클래스 : StudentBean.java**

\-   **src/main/java** **폴더에 패키지 생성 : sec01**

\-   **studentBean.jsp**

\-   **<jsp:useBean>**

\-   **<jsp:setProperty> :** **속성 값 설정**

\-   **<jsp:getProperty> :** **속성 값 출력**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
   <jsp:useBean id="student" class="sec01.StudentBean" scope="page" />
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>자바빈</title>
 	</head>
 	<body>
 		<h3>빈 속성 값 설정</h3>
 		<jsp:setProperty property="stdNo" name="student" value="2022001"  />
 		<jsp:setProperty property="stdName" name="student" value="홍길동"  />
 		<jsp:setProperty property="stdPhone" name="student" value="010-1234-1234"  />
 		<jsp:setProperty property="stdAddress" name="student" value="서울시 종로구"  />
 		<jsp:setProperty property="stdYear" name="student" value="4"  />
 		
 		<h3>빈 속성 값 출력</h3>
 		학번 : <jsp:getProperty property="stdNo" name="student" /><br>
 		성명 : <jsp:getProperty property="stdName" name="student" /><br>
 		전화 : <jsp:getProperty property="stdPhone" name="student" /><br>
 		주소 : <jsp:getProperty property="stdAddress" name="student" /><br>
 		학년 : <jsp:getProperty property="stdYear" name="student" /><br>
 		
 		<h3>빈 속성 값 출력 (Getter 사용)</h3>
 		학번 : <%= student.getStdNo() %> <br>
 		성명 : <%= student.getStdName() %> <br>
 		전화 : <%= student.getStdPhone() %> <br>
 		주소 : <%= student.getStdAddress() %> <br>
 		학년 : <%= student.getStdYear() %> <br>
 	</body>
 </html>
 ```

```java
package sec01;

public class StudentBean {
	private String stdNo;
	private String stdName;
	private String stdPhone;
	private String stdAddress;
	private int stdYear;
	
	// 생성자 없이 Getter/Setter만 포함
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public int getStdYear() {
		return stdYear;
	}
	public void setStdYear(int stdYear) {
		this.stdYear = stdYear;
	}
	
}
```



**—-------------------------------------------------------------**

**모든 속성을 한꺼번에 설정**

**form****의 <input> 태그 속성명을 클래스 필드명과 동일하게 지정하고** 

**<jsp:setProperty property="\*".. />****로 설정**

**모든 속성을 한번에 설정 연습문제**

\-   **MemberBean.java** **클래스**

\-   **memberForm.jsp**

\-   **newMemberOk.jsp**

\-   **<jsp:useBean> /** **한 번에 속성값 설정**

\-   **Getter** **사용해서 빈 속성값 출력**

 ```java
 package sec01;
 
 public class MemberBean {
 	private String id;
 	private String pwd;
 	private String name;
 	private String email;
 	
 	public String getId() {
 		return id;
 	}
 	public void setId(String id) {
 		this.id = id;
 	}
 	public String getPwd() {
 		return pwd;
 	}
 	public void setPwd(String pwd) {
 		this.pwd = pwd;
 	}
 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
 	public String getEmail() {
 		return email;
 	}
 	public void setEmail(String email) {
 		this.email = email;
 	}
 	
 	
 }
 ```

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param 내장 객체</title>
</head>
<body>
<h3>폼에서 전달된 값 출력(EL : param 내장 객체 사용)</h3>
아이디 : ${param.id }<br>
비밀번호 : ${param.pwd }<br>
성명 : ${param.name }<br>
이메일 : ${param.email}<br>

</body>
</html>
```

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ page import="java.util.*" %>
	<head>
		<meta charset="UTF-8">
		<title>회원가입 폼</title>
		<style>			
			#id, #pwd { width: 100px;}
			table { margin:0 auto; width:600px; }
		</style>
			
	</head>
	<body>
		<div id="wrap">
	        <h3 align="center">회원 가입</h3>
	        <hr>
	        <form id="newMemberForm" name="newMemberForm" method="post" action="Member">
	          <table>
	          	<tr><td> 성명</td><td><input type="text" id="name" name="name"></td></tr>
	            <tr><td> ID</td><td><input type="text" id="id" name="id"></td></tr>
	            <tr><td>비밀번호</td><td><input type="password" id="pwd" name="pwd"></td></tr>
	            <tr><td>휴대폰 번호</td><td><input type="text" id="hp1" name="hp1" size="3"> 
	                    - <input type="text" id="hp2" name="hp2" size="4">
	                    - <input type="text" id="hp3" name="hp3" size="4"></td></tr>   
	            <tr><td>학년</td><td><input type="radio" id="year1" name="year" value="1" >1학년
	                                     <input type="radio" id="year2" name="year" value="2">2학년
	                                     <input type="radio" id="year3" name="year" value="3">3학년
	                                     <input type="radio" id="year4" name="year" value="4">4학년</td></tr>
	            <tr><td>관심분야</td>
	                  <td><input type="checkbox"  id="web" name="interest" value="웹 프로그래밍">웹 프로그래밍
	                         <input type="checkbox"  id="design" name="interest" value="파이썬">파이썬
	                         <input type="checkbox"  id="bigdata" name="interest" value="빅데이터">빅데이터
	                         <input type="checkbox"  id="java" name="interest" value="자바">자바 프로그래밍</td></tr>
	            <tr><td>학과</td>
	                  <td><select id="department" name="department">
	                               <option value="">선택하세요</option>
								   <option value="경영학과">경영학과</option>
								   <option value="산업공학과">산업공학과</option>
								   <option value="경제학과">경제학과</option>
								   <option value="전자공학과">전자공학과</option>
								   <option value="컴퓨터학과">컴퓨터학과</option>
	                          </select></td></tr>
	             <tr>
	                <td colspan="2" align="center">
	                    <br><input type="submit" value="완료">
	                    <input type="reset" value="취소">
	                </td>
	            </tr>             
	          </table>
      		</form>	
      	 </div>            
    </body>
</html>
```



**—-----------------------------------------------------------------****표현 언어 : EL (Expression Language)**

 

**JSP** **발전 과정**

\-   **초기 : HTML 태그를 중심으로 자바를 이용해 화면 구현**

\-   **화면에 대한 요구 사항이 복잡해지면서 자바 코드를 대체하는 액션 태그 등장**

\-   **복잡 자바 코드를 제거하는 방향으로 발전**

\-   **복잡한 자바 코드로 인해 화면 작업 어려움**

\-   **현재 JSP 페이지는 스크립트 요소보다 표현 언어나 JSTL 사용**

 

 

**EL (Expression Language)**

\-   **표현 언어**

\-   **자바 코드가 들어가는 표현식을 좀 더 편리하게 사용하기 위해 JSP 2.0부터 도입된 데이터 출력 기능**

\-   **표현식 또는 액션 태그 대신 값을 표현**

\-   **<%=** **값 %>  -=> ${값}**

\-   **parameter : ${ param.****이름 }**

 

**EL** **연산자**

\-   **산술 연산자 : +, -, \*, /, %, (div, mod)**

\-   **관계 연산자 : >, >=, <, <=, ==, !=**

\-   **(gt, ge, lt, le, eq, ne)**

\-   **논리 연산자 : &&, ||, !, (and, or, not)**

\-   **조건 연산자 : 수식 ? 참일때 값 : 거짓일때 값**

\-   **empty** **연산자**

\-   **값이 null 이거나 길이가 0이면 참 (true)**

\-   **${empty** **변수} : 변수가 null 이거나 0이면 참**

\-   **${not empty** **변수}** 

\-   **변수가 null 이 아니거나 0이 아니면 참**

 

 

**EL** **예제 : el.jsp**

\-   **<%= "****홍길동" %> 와 ${“홍길동”} 동일**

\-   **주의! : EL 주석 처리**

\-   **<%--**  **${"hello" + "world" }  --%>**

\-   **JSP** **주석 처리**

\-   **<!--**  **${"hello" + "world" } -->**

\-   **HTML** **주석 사용하면 오류**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 <head>
 <meta charset="UTF-8">
 <title>EL</title>
 </head>
 <body>
  \${100 } : ${100}<br>
 ${3.14}<br>
 ${"홍길동"}<br>
 ${true}
 ${true && true}<BR>
 ${10+1} <BR>
 ${100 	mod 9} <BR>
 <%-- <%= "홍길동" %> = ${"홍길동"" }
  --%>
  </body>
 </html>
 ```



**<jsp:getProperty>** **대신 사용**

\-   **<jsp:getProperty name=”member” property=”id” />**

\-   **=> ${member.id}**

 

**액션 태그와 사용 예제 : el2.jsp**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
     
  <jsp:useBean id="member" class="sec01.MemberBean" scope="page">
 		<jsp:setProperty  name="member" property="name" value="홍길동" />
 </jsp:useBean>
 
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>EL</title>
 	</head>
 	<body>
 		${empty member } <br>
 		${not empty member } <br>
 		${member.name }
 	</body>
 </html>
 ```



**—------------------------------------------------------------**

**EL** **내장 객체**

 

 

 

**![image-20220630205526899](C:\Users\kimsanghoon\AppData\Roaming\Typora\typora-user-images\image-20220630205526899.png)**

 

**param** **내장 객체 사용**

\-   **memberForm_param.jsp**

\-   **memberForm_param_result.jsp**

 

**pageContext** **내장 객체**

\-   **컨텍스 이름 (프로젝트명) 출력**

\-   **${pageContext.request.contextPath}** 

\-   **getContextPath()** **메소드 이용해서 컨텍스트 이름 가져오기**

\-   **<a href="/JSP01/el/login.jsp">****로그인</a>**

\-   **<a href=”<%=request.getContextPath()%>****/el/login.jsp****”>****로그인</a>**

\-   **<a href=”${pageContext.request.contextPath}****/el/login.jsp****”>****로그인</a>**

**pageContext** **내장 객체 예제 : pageContext.jsp**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>pageContext 내장 객체</title>
 	</head>
 	<body>
 		<!-- 로그인 페이지로 이동하는 여러 가지 방법 -->
 		<a href="http://localhost:8080/JSP01/el/login.jsp">로그인1</a><br>
 		<a href="/JSP01/el/login.jsp">로그인2</a><br>
 		<a href="<%=request.getContextPath()%>/el/login.jsp">로그인3</a><br>
 		<a href="${pageContext.request.contextPath}/el/login.jsp">로그인4</a><br>
 		
 	</body>
 </html>
 ```



**—------------------------------------------------------------**

**표현 언어로 바인딩 속성 출력**

\-   **request, session, application** **내장 객체에 속성을 바인딩한 다른 서블릿이나 JSP에 전달 가능**

\-   **자바 코드 사용하지 않고 바인딩된 속성 이름으로 바로 값 출력**

\-   **request.setAttribute(“****바인딩이름”, 값);**

\-   **=> ${****바인딩이름}**

 

**표현 언어로 바인딩 속성 출력 예제**

\-   **el_binding_forward.jsp**

\-   **request.setAttribute(“****바인딩이름”, 값);**



\-   **${****바인딩이름}**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>EL 바인딩</title>
 	</head>
 	<body>
 		<%
 			// setAttribute(속성명(바인딩되는 속성 이름), 속성값)
 			request.setAttribute("id", "kim");
 			request.setAttribute("pwd", "1111");
 			request.setAttribute("name", "김길동");
 			request.setAttribute("email", "kim@abc.com");			
 		%>
 		
 		<jsp:forward page="el_binding_forward_result.jsp"/>
 	</body>
 </html>
 ```

\-   **el_binding_forward_result.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL 바인딩</title>
	</head>
	<body>
		id : ${id }  <br>
		pwd : ${pwd }  <br>
		name : ${name }  <br>
		email : ${email }  <br>
	</body>
</html>
```



**MemberBean** **객체 바인딩** **예제**

\-   **el_binding_forward_member.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="sec01.MemberBean2" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>MemberBean 객체 바인딩</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");	
			
			// MemberBean2 객체 생성하면서 초기화 : 생성자에게 값 전달
			// MemberBean2 클래스에 매개변수가 있는 생성자 필요
			MemberBean2 mem = new MemberBean2("lee", "1234", "이몽룡", "lee@abc.com");
			// 바인딩
			request.setAttribute("mem", mem);		
		%>
		<jsp:forward page="el_binding_forward_member_result.jsp" />
	</body>
</html>
```



\-   **el_binding_forward_member_result.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>MemberBean 객체 바인딩</title>
	</head>
	<body>
<%
   	request.setCharacterEncoding("UTF-8");		
%>		
	<!-- 바인딩된 MemberBean 객체로 속성에 접근하여 데이터 출력  -->
		id : ${mem.id }  <br>
		pwd : ${mem.pwd }  <br>
		name : ${mem.name }  <br>
		email : ${mem.email }  <br>
	</body>
</html>
```



**—---------------------------------------------------------------**

**StudentBean** **객체 바인딩 연습문제**

\-   **StudentBean2** **생성** 

\-   **매개변수가 있는 생성자 추가**

\-   **el_binding_forward_student.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sec01.StudentBean2"%>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>StudentBean 객체 바인딩</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		
			// MemberBean2  객체 생성하면서 초기화 : 생성자에게 값 전달
			// MemberBean2 클래스에 매개변수가 있는 생성자 필요
			StudentBean2 std = new StudentBean2("1001", "홍길동", "101-111-1234", "서울시 종로구", 2);
			
			// 바인딩
			request.setAttribute("std", std);
		%>
		<jsp:forward page="el_binding_forward_student_result.jsp" />
	</body>
</html>
```



\-   **el_binding_forward_student_result.jsp**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>StudentBean 객체 바인딩</title>
 	</head>
 	<body>
 		<%
 			request.setCharacterEncoding("utf-8");
 		%>
 		<!-- 바인딩 된 StudentBean2 객체로 속성에 접근하여 데이터 출력 -->
 		학번 : ${std.stdNo}<br>
 		성명 : ${std.stdName}<br>
 		핸드폰번호 : ${std.stdPhone}<br>
 		주소 : ${std.stdAddress}<br>
 		학년 : ${std.stdYear}<br>
 	</body>
 </html>
 ```



**—---------------------------------------------------------------**

**MemberBean** **객체를 ArrayList에 담아서 바인딩** **예제**

\-   **el_binding_forward_member_arr.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="sec01.StudentBean2"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		
			StudentBean2 vo1 = new StudentBean2("1001", "홍길동", "101-111-1234", "서울시 종로구", 2);
			StudentBean2 vo2 = new StudentBean2("1002", "박훈", "101-657-1234", "경기도 파주시", 1);
			StudentBean2 vo3 = new StudentBean2("1003", "김정률", "101-435-1234", "경기도 분당", 3);
			
			ArrayList<StudentBean2> stdList = new ArrayList<StudentBean2>();
			stdList.add(vo1);
			stdList.add(vo2);
			stdList.add(vo3);
			
			// 바인딩
			request.setAttribute("stdList", stdList);
		%>
		<jsp:forward page="el_binding_forward_student_arr_result.jsp" />
	</body>
</html>
```



\-   **el_binding_forward_member_arr_result.jsp**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>StudentBean 객체 + ArrayList</title>
 	</head>
 	<body>
 	<%
 		request.setCharacterEncoding("utf-8");	
 	%>
 	<!-- 바인딩 된 ArrayList 인덱스로 속성에 접근하여 데이터 출력 -->
 	<table border="1">
 		<tr><th>학번</th><th>성명</th><th>전화번호</th><th>주소</th><th>학년</th></tr>
 		<tr>
 			<td>${stdList[0].stdNo}</td><td>${stdList[0].stdName}</td>
 			<td>${stdList[0].stdPhone}</td><td>${stdList[0].stdAddress}</td>
 			<td>${stdList[0].stdYear}</td>
 		</tr>
 		<tr>
 			<td>${stdList[1].stdNo}</td><td>${stdList[1].stdName}</td>
 			<td>${stdList[1].stdPhone}</td><td>${stdList[1].stdAddress}</td>
 			<td>${stdList[1].stdYear}</td>
 		</tr>
 		<tr>
 			<td>${stdList[2].stdNo}</td><td>${stdList[2].stdName}</td>
 			<td>${stdList[2].stdPhone}</td><td>${stdList[2].stdAddress}</td>
 			<td>${stdList[2].stdYear}</td>
 		</tr>
 	</table>
 	
 	<!-- JST 사용해서 출력 -->
 	</body>
 </html>
 ```

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>StudentBean 객체 + ArrayList</title>
	</head>
	<body>
	<%
		request.setCharacterEncoding("utf-8");	
	%>
	<!-- 바인딩 된 ArrayList 인덱스로 속성에 접근하여 데이터 출력 -->
	<table border="1">
		<tr><th>학번</th><th>성명</th><th>전화번호</th><th>주소</th><th>학년</th></tr>
		<tr>
			<td>${stdList[0].stdNo}</td><td>${stdList[0].stdName}</td>
			<td>${stdList[0].stdPhone}</td><td>${stdList[0].stdAddress}</td>
			<td>${stdList[0].stdYear}</td>
		</tr>
		<tr>
			<td>${stdList[1].stdNo}</td><td>${stdList[1].stdName}</td>
			<td>${stdList[1].stdPhone}</td><td>${stdList[1].stdAddress}</td>
			<td>${stdList[1].stdYear}</td>
		</tr>
		<tr>
			<td>${stdList[2].stdNo}</td><td>${stdList[2].stdName}</td>
			<td>${stdList[2].stdPhone}</td><td>${stdList[2].stdAddress}</td>
			<td>${stdList[2].stdYear}</td>
		</tr>
	</table>

	<!-- JST 사용해서 출력 -->
	</body>
</html>

**StudentBean** **객체를 ArrayList에 담아서 바인딩 예제**

\-   **StudentBean2**

\-   **el_binding_forward_student_arr.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="sec01.StudentBean2"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
		
			StudentBean2 vo1 = new StudentBean2("1001", "홍길동", "101-111-1234", "서울시 종로구", 2);
			StudentBean2 vo2 = new StudentBean2("1002", "박훈", "101-657-1234", "경기도 파주시", 1);
			StudentBean2 vo3 = new StudentBean2("1003", "김정률", "101-435-1234", "경기도 분당", 3);
			
			ArrayList<StudentBean2> stdList = new ArrayList<StudentBean2>();
			stdList.add(vo1);
			stdList.add(vo2);
			stdList.add(vo3);
			
			// 바인딩
			request.setAttribute("stdList", stdList);
		%>
		<jsp:forward page="el_binding_forward_student_arr_result.jsp" />
	</body>
</html>
```

\-   **el_binding_forward_student_arr_result.jsp**

 ```jsp
 <%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 	<head>
 		<meta charset="UTF-8">
 		<title>StudentBean 객체 + ArrayList</title>
 	</head>
 	<body>
 	<%
 		request.setCharacterEncoding("utf-8");	
 	%>
 	<!-- 바인딩 된 ArrayList 인덱스로 속성에 접근하여 데이터 출력 -->
 	<table border="1">
 		<tr><th>학번</th><th>성명</th><th>전화번호</th><th>주소</th><th>학년</th></tr>
 		<tr>
 			<td>${stdList[0].stdNo}</td><td>${stdList[0].stdName}</td>
 			<td>${stdList[0].stdPhone}</td><td>${stdList[0].stdAddress}</td>
 			<td>${stdList[0].stdYear}</td>
 		</tr>
 		<tr>
 			<td>${stdList[1].stdNo}</td><td>${stdList[1].stdName}</td>
 			<td>${stdList[1].stdPhone}</td><td>${stdList[1].stdAddress}</td>
 			<td>${stdList[1].stdYear}</td>
 		</tr>
 		<tr>
 			<td>${stdList[2].stdNo}</td><td>${stdList[2].stdName}</td>
 			<td>${stdList[2].stdPhone}</td><td>${stdList[2].stdAddress}</td>
 			<td>${stdList[2].stdYear}</td>
 		</tr>
 	</table>
 	
 	<!-- JST 사용해서 출력 -->
 	</body>
 </html>
 ```



**—------------------------------------------------------------**

**데이터 바인딩 : 다른 페이지로 데이터를 전달할 때 사용**

\-   **포워딩 할 때 전달되는 데이터를** 

\-   **이름:값으로 묶어서 전달하면**

\-   **받는 페이지에서 이름으로 값을 추출하여 사용하기 위한 방식**

**—------------------------------------------------------------**

**스코프 (scope) 우선순위**

\-   **request, session, application** **내장 객체에는 데이터를 바인딩해서 다른 JSP로 전달**

\-   **각 내장 객체에 바인딩하는 속성 이름이 같은 경우**

\-   **각 내장 객체에 지정된 출력 우선순위에 따라 순서대로 속성에 접근**

\-   **높 page < request < session < application 낮**

\-   **pageScope :** **현재 페이지 영역의 변수**

\-   **requestScope :** **이전 페이지에서 받아온 영역의 변수** 

\-   **sessionScope : session** **영역의 변수**

\-   **applicationScope : application** **영역의 변수**

 

**스코프 (scope) 우선순위 예제**

\-   **scope_priority.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>scope 우선순위</title>
	</head>
	<body>
	<%	
		session.setAttribute("name", "세션");
		//request.setAttribute("name", "request");
		application.setAttribute("name", "애플리케이션");		
	%>
	
	<jsp:forward page="scope_priority_result.jsp" />		
	</body>
</html>
```



\-   **scope_priority_result.jsp**

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>scope 우선순위</title>
	</head>
	<body>
		scope 우선순위 <br>
		누가 우선순위가 높나 : ${name}
	</body>
</html>
```



**=======================================**

**JSTL (JSP Standard Tag Library)**

\-   **JSP** **표준 태그 라이브러리**

\-   **JSP****와 HTML을 같이 사용함으로써 가독성이 떨어지는 것을 보완하고자 만들어진 태그 라이브러리**

\-   **JSP** **페이지 내에서 자바 코드를 사용하지 않고 태그를 사용하도록 함**

\-   **JSP** **페이지의 로직을 담당하는 부분인 제어문 및 데이터베이스 처리 등을 표준 커스텀 태그 제공**

\-   **사용하기 위해서는 라이브러리 별도 필요**

\-   **<%@ taglib uri=”..” prefix=”” />**

 

**—-----------------------------------------------------------**

**JSTL** **다운로드**

\-   **https://tomcat.apache.org**

\-   **Taglibs**

\-   **파일 4개 다운로드** 

\-   **C:\apache-tomcat-9.0.64\lib** **폴더에 저장**

\-   **이클립스 종료했다가 새로 열기**

 

**—-----------------------------------------------------------**

**JSTL** **라이브러리 : 5개의 라이브러리로 구성**

**![img](file:///C:/Users/KIMSAN~1/AppData/Local/Temp/msohtmlclip1/01/clip_image014.gif)**

 

**Core (****코어)**

\-   **URI : http://java.sun.com/jsp/jstl/core**

\-   **prefix : c**

\-   **제공 기능**

\-   **변수의 선언 및 삭제 등의 변수와 관련된 작업**

\-   **if, for** **문 등과 같은 제어문**

\-   **url** **처리 및 그밖에 예외처리 및 화면 출력**

 

**Core** **태그** 

**<c:set>**

\-   **JSP****의 setAttribute()와 같은 역할. (page|request|session|application) 범위의 변수(속성)를 설정**

**<c:remove>**

\-   **JSP****의 removeAttribute()와 같은 역할. (page|request|session|application) 범위의 변수(속성)를 제거**

**<c:out>** 

\-   **화면 출력. JSP의 표현식 대체**

**<c:redirect>** 

\-   **response.sendRedirect()****를 대체하는 태그로 지정한 다른 페이지로 이동**

**<c:if>**

\-   **조건문을 사용할 때 씀 : else문 없을 때**

**<c:choose>**

\-   **자바의 switch 문과 같지만, 조건에 문자열 비교도 가능하고 쓰임의 범위가 넓음. 서브 태그로 <when>과 <otherwise>를 가짐** 

\-   **else** **가 필요할 때**

**<c:when>**

\-   **choose****의 서브 태그로 조건의 비교 시에 조건을 만족한 경우에 사용**

**<c:otherwise>**

\-   **조건을 만족하지 못한 경우에 사용**

**<c:forEach>**

\-   **객체 전체에 걸쳐 반복 실행을 할 때 사용**

**<c:forToken>** 

\-   **자바의 StringTokenizer 클래스를 사용하는 것과 같음**

**<c:catch>**

\-   **body** **위치에서 실행되는 코드의 예외를 잡아내는 역할을 담당**

**<c:import>**

\-   **웹 애플리케이션 내부의 자원 접근은 물론이고, http, ftp 같은 외부에 있는 자원(html, jsp등)을 가져옴**

**<c:param>** 

\-   **파라미터사용시 필요. <import>태그의 URL뒤에 파라미터로 붙여서 사용되기도 함** 

**<c:url>**

\-   **쿼리 파라미터로 부터 URL을 생성**

**—-----------------------------------------------------------**

**<c:set>** **태그**

\-   **변수 선언**

\-   **<c:set var=”****변수명” value=”변수값” [scope] />**

**<c:set>** **태그 예제 : c_set.jsp**

 

**<c:if>** **태그**

\-   **조건문을 사용할 때 씀 : else문 없을 때**

\-   **<c:if test=”${****조건식}” [scope] />**

**<c:if>** **태그 예제 : c_if.jsp**

 

**<c:choose>**

\-   **자바의 switch 문과 같지만, 조건에 문자열 비교도 가능하고 쓰임의 범위가 넓음. 서브 태그로 <when>과 <otherwise>를 가짐** 

\-   **else** **가 필요할 때**

\-   **<c:choose>**

​       **<c:when test=”****조건식1”>내용1</c:when>**

**<c:when test=”****조건식2”>내용1</c:when>**

**<c:otherwise>****내용n</c:otherwise>**

\-   **</c:choose>**

 

**<c:choose>** **예제 : c_choose.jsp**



```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="id" value="hong2" scope="page" />
<c:set var="pwd" value="1234" scope="page" />
 <%-- <c:set var="name" value="홍길동" scope="page" /> --%>
<c:set var="age" value="${20}" scope="page" />
<c:set var="height" value="${170}" scope="page" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL - c:choose</title>
	</head>
	<body>
		<table border="1" align="center">
			<tr align="center" bgcolor="lightgreen">
				<td width="7%">아이디</td>
				<td width="7%">비밀번호</td>
				<td width="7%">이름</td>
				<td width="7%">나이</td>
				<td width="7%">키</td></tr>
				
		<c:choose>
			<c:when test="${name==null }">
				<tr align="center"><td colspan="5">이름이 없습니다.</td></tr>
			</c:when>
		
			<c:otherwise>
				<tr  align="center">
					<td>${id }</td>
					<td>${pwd }</td>
					<td>${name }</td>
					<td>${age }</td>
					<td>${height }</td>
				</tr>
			</c:otherwise>		
		</c:choose>	
		</table>
	</body>
</html>
```



```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="id" value="hong2" scope="page" />
<c:set var="pwd" value="1234" scope="page" />
 <c:set var="name" value="홍길동" scope="page" />
<c:set var="age" value="${20}" scope="page" />
<c:set var="height" value="${170}" scope="page" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL -  c:if</title>
	</head>
	<body>
		<c:if test="${true}">
			<h3>항상 참입니다.</h3>
		</c:if>
		
		<c:if test="${height>160}">
			<h3>${name }의 키는 160보다 큽니다.</h3>
		</c:if>
		
		<!-- 아이디가 'hong'이고 비밀번호가 '1234'  이면 '로그인 성공' 출력-->
		<c:if test="${id == 'hong' && pwd == '1234'}">
			<h3>로그인 성공</h3>
		</c:if>
		
		
		<!-- 아이디가 'hong'이고 비밀번호가 '1234'  이 아니면  '로그인 실패' 출력-->
		<%-- <c:if test="${!(id == 'hong' && pwd == '1234')}">
			<h3>로그인 실패</h3>
		</c:if> --%>
		
		<c:if test="${id != 'hong' || pwd != '1234'}">
			<h3>로그인 실패</h3>
		</c:if>
		
	</body>
</html>


```

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="id" value="hong" scope="page" />
<c:set var="pwd" value="1234" scope="page" />
 <c:set var="name" value="홍길동" scope="page" />
<c:set var="age" value="${20}" scope="page" />

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL : c:set </title>
	</head>
	<body>
		${id } <br>
		${pwd } <br>
		${name } <br>
		${age } <br><br>
		
		<a href="${contextPath}/el/login.jsp">로그인 페이지로 이동</a> <br>
		<a href="${pageContext.request.contextPath}/el/login.jsp">로그인4</a><br>
	</body>
</html>
```

