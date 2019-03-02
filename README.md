#Webjar 사용하기 

## 라이블러리 사용 방법 (bootstrap, jquery)
    1. 다운로드 받아서 프로젝트에 넣어서 사용
    2. CDN 사용 (예 : <link href="//cdn.site.com/~/bootstrap.css" rel="stylesheet">)
    3. bower, grunt, yeoman 등 사용

## WEBJAR 사용 가능 이유
    메이븐을 사용해 자바 라이브러리(jar)를 관리중이다.  
    `서블릿(servlet) 3`부터 `라이브러리(WEB-INF/lib)에 있는 파일을 리소스 주소(META-INF/resources)를 통해 접근`할 수 있게 되었다. 
    webjars는 프론트 부분 라이브러리를 jar로 패키징 하여 메이븐(pom.xml)을 통해 관리할 수 있도록 도와준다.

## WEBJAR 사용 방법

## 1. pom.xml 추가
> jquery와 bootstrap를 의존성을 추가하기 위해서는 다음과 같이 메이븐에 의존성을 추가해야 합니다.

    <!-- Webjar 추가 : jquery -->
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>jquery</artifactId>
        <version>3.3.1-2</version>
    </dependency>
    
     <!-- Webjar 추가 : bootstrap -->
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>bootstrap</artifactId>
        <version>4.3.1</version>
    </dependency>

> jquery에서 자동적으로 버전을 관리하기 위한 의존성을 추가할 수 있습니다.

    <!-- webjars-locator 추가 : Webjar 버전 문제 해결 위해 -->
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>webjars-locator-core</artifactId>
        <version>0.35</version>
    </dependency>

## 2. html 수정

> 원래 //webjars/bootstrap/4.3.1/css/bootstrap.min.css 라 명시해야하지만 위에서   
추가한 webjars-locator-core 의 버전 관리 기능때문에 버전을 명시하지 않아도 스프링부트가 의존하고 있는 jquery 버전이 자동적으로 작동됩니다.
>> 
|webjars-locator-core 적용전 | webjars-locator-core 적용 후 |
|--- | ---|
| `<link rel="stylesheet" href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css">` | `<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">`  |
| `<script src="/webjars/jquery/3.3.1-2/jquery.min.js"></script>` |  `<script src="/webjars/jquery/jquery.min.js"></script>`  |
|`<script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>` | `<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>`   |

> JSP 적용 예제
```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="ko">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

    <title>${text}</title>
</head>
<body>
<h1>${text}</h1>
<div class="alert alert-primary" role="alert">
    A simple primary alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>
<div class="alert alert-secondary" role="alert">
    A simple secondary alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>
<div class="alert alert-success" role="alert">
    A simple success alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>
<div class="alert alert-danger" role="alert">
    A simple danger alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>
<div class="alert alert-warning" role="alert">
    A simple warning alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>
<div class="alert alert-info" role="alert">
    A simple info alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>
<div class="alert alert-light" role="alert">
    A simple light alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>
<div class="alert alert-dark" role="alert">
    A simple dark alert with <a href="#" class="alert-link">an example link</a>. Give it a click if you like.
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
```

## 참고 URL
    * http://millky.com/@origoni/post/1147
    * [Webjar] : https://wwww.webjars.org/
    * https://www.webjars.org/documentation#springboot
    * https://engkimbs.tistory.com/772