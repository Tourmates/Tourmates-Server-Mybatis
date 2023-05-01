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
  <h1 class="text-center"> 공지사항 수정 </h1>


  <form method="post" action="${root}/notice/${modifyNoticeDto.id}/modify">
    <div class="mb-3">
      <label for="noticeTitle" class="form-label ">수정할 공지 제목</label>
      <input type="text" class="form-control border border-black" id="title"
             aria-describedby="emailHelp" name = "title" value = "${modifyNoticeDto.title}"/>
    </div>

    <label for="noticeText" class="form-label ">수정할 공지 내용</label>
    <div class="input-group">
            <textarea class="form-control h-25 border border-black" rows="10"
                      id="submission_content{{submission.id}}"
                      aria-label="With textarea" name = "content">${modifyNoticeDto.content}</textarea>
    </div>
    <br/>
    <div class="mb-3 form-check">
      <c:if test = "${modifyNoticeDto.top == true}">
        <input type="checkbox" class="form-check-input" id="top" name = "top" checked>
      </c:if>
      <c:if test = "${modifyNoticeDto.top == false}">
        <input type="checkbox" class="form-check-input" id="top" name = "top">
      </c:if>

      <label class="form-check-label" for="top">상단 등록</label></div>
    <button type="submit" class="d-grid gap-2 col-2 mx-auto btn btn-primary text-center ">수정
    </button>
  </form>

</section>

<%@ include file="../common/footer.jsp" %>

</body>


</html>