# SpringBoot_exercise

<h1>simple spring boot project</h1>

<p>
Maven과 mySQL을 사용한 simple spring boot project
</p>

<h3>개발 도구</h3>

<br>

<h2>설정</h2>

> ext jar 3개
> bcrypt<br>
> ocn.home<br>
> pc 이름 영어로<br>
> oracle server 설치순서
<hr>
<br><br>

<h4>초기 설정</h4>

> New -> Maven simple project 체크 <br>
> Type : Maven	Packaging  : Jar <br>
> Java Version : 11   Language : Java
> Group : com.ys <br>
> Artifact : sbbs <br>
> Version: 0.0.1-SNAPSHOT <br>
> Description : BBS project for Spring Boot <br>
> Spring Boot Version : 2.7.14 <br>
> Lombok <br>
> Lombok 추가 설치 <br>  
> MyBatis Framework <br>
> MySQL Driver <br>
> Oracle Driver <br>
> Spring Web <br>
> mySQL 메인 <br>
> Oracle 설치 <br>
> PC이름, 사용자 이름 영어로 <br>
> Spring boot 설정 <br>
> JSP 사용하기 위한 확장 설치<br>
> schedul 추가

~~~ java

<properties>
	  <maven.compiler.target>11</maven.compiler.target>
	  <maven.compiler.source>11</maven.compiler.source>
  </properties>

<dependencies>
	<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
	<dependency>
	    <groupId>mysql</groupId>
	    <artifactId>mysql-connector-java</artifactId>
	    <version>8.0.33</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
	<dependency>
	    <groupId>javax.servlet</groupId>
	    <artifactId>javax.servlet-api</artifactId>
	    <version>4.0.1</version>
	    <scope>provided</scope>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.mindrot/jbcrypt -->
	<dependency>
	    <groupId>org.mindrot</groupId>
	    <artifactId>jbcrypt</artifactId>
	    <version>0.4</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
	<dependency>
	    <groupId>javax.servlet</groupId>
	    <artifactId>jstl</artifactId>
	    <version>1.2</version>
	</dependency>
  </dependencies>

~~~
