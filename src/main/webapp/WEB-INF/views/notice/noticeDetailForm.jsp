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
    <tr>
      <th> 게시물 작성자</th>
      <td> ${detailNoticeDto.createdBy.loginId}</td>
    </tr>
    <tr>
      <th> 게시물 최종 수정자 </th>
      <td> ${detailNoticeDto.lastModifiedBy.loginId}</td>
    </tr>
    <tr>
      <th> 게시물 생성일 </th>
      <td> ${detailNoticeDto.createdDate}</td>
    </tr>
    <tr>
      <th> 게시물 최종 수정일 </th>
      <td> ${detailNoticeDto.lastModifiedDate}</td>
    </tr>
    </tbody>
  </table>
    <button type="button" class="d-grid gap-2 col-2 mx-auto btn btn-primary text-center" onclick = "location.href = '${root}/notice/${detailNoticeDto.noticeId}/modify'">수정</button>
    <button type="button" class="d-grid gap-2 col-2 mx-auto btn btn-primary text-center" onclick = "location.href = '${root}/notice/${detailNoticeDto.noticeId}/delete'">삭제</button>
</section>

<%@ include file="../common/footer.jsp" %>

</body>


</html>