<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <%@ include file="../common/head.jsp" %>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<%-- section start --%>
<div class="bg-body-tertiary">
  <section class="container pt-4 pb-5">
    <div class="mb-5">
      <h1>회원 탈퇴</h1>
      <p>여기에서 회원 탈퇴를 합니다.</p>
    </div>
    <div>
      <div class="d-flex justify-content-between">
        <h5 class="fw-bold">회원 탈퇴</h5>
        <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
          UPDATE
        </button>
      </div>
      <div class="collapse mt-3" id="collapseExample">
        <form class="card card-body" method="post" action="${root}/my/withdrawal">
          <div class="mb-3">
            <label for="loginPw" class="form-label">비밀번호 확인</label>
            <input type="password" class="form-control" id="loginPw" name="loginPw">
          </div>
          <button type="submit" class="btn btn-danger w-25">회원 탈퇴</button>
        </form>
      </div>
    </div>
  </section>
</div>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
