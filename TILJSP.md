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







오늘 수업 자료 다운을 못 받아서 이 부분.... 없습니다 .... 

혹시 있으신 분 있으면 한번 보내주실 수 있나요...
