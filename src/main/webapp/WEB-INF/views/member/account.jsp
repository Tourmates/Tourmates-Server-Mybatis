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
      <h1>비밀번호 변경</h1>
      <p>여기에서 비밀번호를 관리합니다.</p>
    </div>
    <div>
      <div class="d-flex justify-content-between">
        <h5 class="fw-bold">Password</h5>
        <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
          UPDATE
        </button>
      </div>
      <div class="collapse mt-3" id="collapseExample">
        <form class="card card-body" method="post" action="${root}/my/account">
          <div class="mb-3">
            <label for="oldLoginPw" class="form-label">현재 비밀번호</label>
            <input type="password" class="form-control" id="oldLoginPw" name="oldLoginPw">
          </div>
          <div class="row mb-3">
            <div class="col-md-6">
              <label for="newLoginPw" class="form-label">새로운 비밀번호</label>
              <input type="password" class="form-control" id="newLoginPw" name="newLoginPw">
            </div>
            <div class="col-md-6">
              <label for="confirmLoginPw" class="form-label">비밀번호 확인</label>
              <input type="password" class="form-control" id="confirmLoginPw" name="confirmLoginPw">
            </div>
          </div>
          <button type="submit" class="btn btn-outline-primary w-25">비밀번호 변경</button>
        </form>
      </div>
    </div>
  </section>
</div>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
