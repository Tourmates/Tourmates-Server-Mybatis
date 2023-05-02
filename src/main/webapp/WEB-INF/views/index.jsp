<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <%@ include file="./common/head.jsp" %>
  <style>
      .subtitle {
          margin-bottom: 0;
          letter-spacing: 0.2em;
          text-transform: uppercase;
          color: #6c757d;
          font-weight: bold;
      }
  </style>
</head>
<body>
<%@ include file="./common/header.jsp" %>
<section>
  <div>
    <img src="./resources/img/main.jpeg" class="c img-fluid w-100" alt="...">
  </div>
  <div>
    <div class="container mt-5 pt-5">
      <p class="subtitle text-primary">STAY AND EAT LIKE A LOCAL</p>
      <h2>Our guides</h2>
      <div class="row row-cols-1 row-cols-md-4 g-4 mt-3">
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/new-york.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/paris.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/new-york.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/paris.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="bg-body-secondary">
    <div class="container mt-5 pt-5">
      <p class="subtitle text-danger">HURRY UP, THESE ARE EXPIRING SOON.</p>
      <h2>Last minute deals</h2>
      <div class="row row-cols-1 row-cols-md-4 g-4 mt-3">
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/new-york.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/paris.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/new-york.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
        <div class="col">
          <div class="card h-100">
            <img src="./resources/img/paris.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<!-- forgot loginId start -->
<div class="modal fade" id="forgotLoginId" aria-hidden="true" aria-labelledby="forgotLoginIdLable" tabindex="-1"
     data-bs-backdrop="static">
  <div class="modal-dialog modal-dialog-centered">
    <form class="modal-content" method="post" action="${root}/forgot/loginId">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="forgotLoginIdLable">아이디찾기</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <!-- 이메일 -->
        <div class="mb-3">
          <label for="emailId" class="form-label">이메일 :</label>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="이메일아이디" aria-label="emailId" name="emailId">
            <span class="input-group-text">@</span>
            <select class="form-select" aria-label="Default select example" name="emailDomain">
              <option selected>선택</option>
              <option value="ssafy.com">ssafy.com</option>
              <option value="naver.com">naver.com</option>
              <option value="kakao.com">kakao.com</option>
            </select>
          </div>
        </div>
        <!-- 연락처 -->
        <div class="mb-3">
          <label for="phone" class="form-label">연락처 :</label>
          <div class="input-group" id="phone">
            <select class="form-select" aria-label="Default select example" name="startPhoneNumber">
              <option value="010" selected>010</option>
              <option value="011">011</option>
              <option value="070">070</option>
            </select>
            <span class="input-group-text">-</span>
            <input type="text" class="form-control" aria-label="middlePhoneNumber" name="middlePhoneNumber"
                   maxlength="4">
            <span class="input-group-text">-</span>
            <input type="text" class="form-control" aria-label="endPhoneNumber" name="endPhoneNumber" maxlength="4">
          </div>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-outline-secondary" data-bs-target="#loginModal" data-bs-toggle="modal">이전
        </button>
        <button type="submit" class="btn btn-outline-primary">아이디찾기</button>
      </div>
    </form>
  </div>
</div>
<!-- forgot loginId end -->
<!-- forgot loginPw start -->
<div class="modal fade" id="forgotloginPw" aria-hidden="true" aria-labelledby="forgotloginPwLable" tabindex="-1"
     data-bs-backdrop="static">
  <div class="modal-dialog modal-dialog-centered">
    <form class="modal-content" method="post" action="${root}/forgot/loginPw">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="forgotloginPwLable">비밀번호찾기</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <!-- 아이디 -->
        <div class="mb-3">
          <label for="loginId" class="form-label">아이디 :</label>
          <input type="text" class="form-control" id="loginId" placeholder="아이디" name="loginId">
        </div>
        <!-- 이메일 -->
        <div class="mb-3">
          <label for="emailId" class="form-label">이메일 :</label>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="이메일아이디" aria-label="emailId" name="emailId">
            <span class="input-group-text">@</span>
            <select class="form-select" aria-label="Default select example" name="emailDomain">
              <option selected>선택</option>
              <option value="ssafy.com">ssafy.com</option>
              <option value="naver.com">naver.com</option>
              <option value="kakao.com">kakao.com</option>
            </select>
          </div>
        </div>
        <!-- 연락처 -->
        <div class="mb-3">
          <label for="phone" class="form-label">연락처 :</label>
          <div class="input-group">
            <select class="form-select" aria-label="Default select example" name="startPhoneNumber">
              <option value="010" selected>010</option>
              <option value="011">011</option>
              <option value="070">070</option>
            </select>
            <span class="input-group-text">-</span>
            <input type="text" class="form-control" aria-label="middlePhoneNumber" name="middlePhoneNumber"
                   maxlength="4">
            <span class="input-group-text">-</span>
            <input type="text" class="form-control" aria-label="endPhoneNumber" name="endPhoneNumber" maxlength="4">
          </div>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-outline-secondary" data-bs-target="#loginModal" data-bs-toggle="modal">이전
        </button>
        <button type="submit" class="btn btn-outline-primary">비밀번호찾기</button>
      </div>
    </form>
  </div>
</div>
<!-- forgot loginPw end -->
<%@ include file="./common/footer.jsp" %>
</body>
</html>
