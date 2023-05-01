<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko1">
<head>
  <%@ include file="../common/head.jsp" %>
  <%@ include file="../common/header.jsp" %>

</head>

<body>

<section class="container">
  <h1 class="text-center"> 공지사항 세부 사항 </h1>

  <table class="table">
    <thead>
    <tr>
      <th> 게시물 번호</th>
      <td>${detailNoticeDto.noticeId}</td>
    </tr>
    </thead>
    <tbody>
    <tr>
      <th> 게시물 제목</th>
      <td>${detailNoticeDto.title}</td>
    </tr>
    <tr>
      <th> 게시물 내용</th>
      <td>${detailNoticeDto.content}</td>
    </tr>
    <tr>
      <th> 게시물 상단 여부</th>
      <c:if test = "${detailNoticeDto.top == true}">
          <td> O </td>
      </c:if>
      <c:if test = "${detailNoticeDto.top == false}">
        <td> X </td>
      </c:if>
    </tr>
    </tbody>
  </table>

</section>

<%@ include file="../common/footer.jsp" %>

</body>


</html>