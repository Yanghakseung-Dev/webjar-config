



## 라이블러리 사용 방법 (bootstrap, jquery)
    1. 다운로드 받아서 프로젝트에 넣어서 사용
    2. CDN 사용 (예 : <link href="//cdn.site.com/~/bootstrap.css" rel="stylesheet">)
    3. bower, grunt, yeoman 등 사용

## WEBJAR 사용 가능 이유
    메이븐을 사용해 자바 라이브러리(jar)를 관리중이다.  
    `서블릿(servlet) 3`부터 `라이브러리(WEB-INF/lib)에 있는 파일을 리소스 주소(META-INF/resources)를 통해 접근`할 수 있게 되었다. 
    webjars는 프론트 부분 라이브러리를 jar로 패키징 하여 메이븐(pom.xml)을 통해 관리할 수 있도록 도와준다.

## 참고 URL
    * http://millky.com/@origoni/post/1147
    * [Webjar] : https://wwww.webjars.org/
    * https://www.webjars.org/documentation#springboot