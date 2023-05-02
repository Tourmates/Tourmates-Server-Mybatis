<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <%@ include file="../common/head.jsp" %>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<body>

<section class="container">

  <h1 class="text-center"> 공지사항 </h1>
  <div class="d-grid gap-2 d-md-flex justify-content-md-end p-4">
    <div class="input-group mb-3 w-25">
      <input type="text" class="form-control"                    aria-label="Recipient's username" aria-describedby="button-addon2">
      <button class="btn btn-outline-secondary" type="button" id="button-addon2">검색</button>
    </div>

  </div>
  <div class="position-relative m-4">

    <table class="table table-secondary  w-58 table-bordered table-striped">
      <thead>
      <tr>
        <th scope="col">번호</th>
        <th scope="col">제목</th>
        <th scope="col">작성자</th>
        <th scope="col">작성일</th>
        <th scope="col">최종 수정일</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var = "dto" items = "${detailNoticeDtoList}">
        <tr>
          <th scope="row" onclick = "location.href = '${root}/notice/${dto.noticeId}/detail'" style = "cursor:pointer;">${dto.noticeId}</th>
          <td>${dto.title}</td>
          <td>${dto.createdBy.loginId}</td>
          <td>${dto.createdDate}</td>
          <td>${dto.lastModifiedDate}</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</section>
<!-- footer start -->
<button type="button" class="d-grid gap-2 col-2 mx-auto btn btn-primary text-center" onclick = "location.href = '${root}/notice/add'">공지사항 글쓰기</button>

<%@ include file="../common/footer.jsp" %>

</body>



</html>