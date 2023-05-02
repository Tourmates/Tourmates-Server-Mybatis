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

<!-- header start -->
<div class="container">
  <header class="d-flex flex-wrap justify-content-center py-3 mb-4">
    <a href="/"
       class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
      <svg class="bi me-2" width="40" height="32">
        <use xlink:href="#bootstrap" />
      </svg>
      <span class="fs-4">Tourmates</span>
    </a>
    <ul class="nav">
      <li class="nav-item"><a href="#" class="nav-link active text-dark" aria-current="page">지역별여행지</a></li>
      <li class="nav-item"><a href="#" class="nav-link text-dark">나의여행계획</a></li>
      <li class="nav-item"><a href="#" class="nav-link text-dark">핫플자랑하기</a></li>
      <li class="nav-item"><a href="#" class="nav-link text-dark">여행정보공유</a></li>
      <li class="nav-item"><a href="#" class="nav-link text-dark">회원가입</a></li>
      <li class="nav-item"><a href="#" class="nav-link text-dark">로그인</a></li>
    </ul>
  </header>
</div>
<!-- header end -->
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
        <th scope="col">조회</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var = "dto" items = "${detailNoticeDtoList}">
        <tr>
          <th scope="row">${dto.noticeId}</th>
          <td>${dto.noticeId}</td>
          <td>${dto.createdBy.loginId}</td>
          <td>${dto.createdBy.createdDate}</td>
          <td>${dto.createdBy.lastModifiedDate}</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</section>
<!-- footer start -->
<div class="container">
  <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
    <p class="col-md-4 mb-0 text-body-secondary">&copy; 2023 Company, Inc</p>

    <a href="/"
       class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
      <svg class="bi me-2" width="40" height="32">
        <use xlink:href="#bootstrap" />
      </svg>
    </a>

    <ul class="nav col-md-4 justify-content-end">
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">공지사항</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">이용약관</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">개인정보처리방침</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">FAQs</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">About</a></li>
    </ul>
  </footer>
</div>
<!-- footer end -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>



</html>