<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- join modal start -->
<div class="modal fade" id="joinModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
     aria-labelledby="joinModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered modal-lg">
    <form class="modal-content" method="post" action="${root}/join">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="joinModalLabel">회원가입</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <!-- 이름 -->
        <div class="mb-3">
          <label for="username" class="form-label">이름 :</label>
          <input type="text" class="form-control" id="username" name="username" placeholder="이름">
        </div>
        <!-- 아이디 -->
        <div class="mb-3">
          <label for="loginId" class="form-label">아이디 :</label>
          <input type="text" class="form-control" id="loginId" name="loginId" placeholder="아이디">
        </div>
        <!-- 비밀번호 -->
        <div class="mb-3">
          <label for="loginPw" class="form-label">비밀번호 :</label>
          <input type="password" class="form-control" id="loginPw" name="loginPw" placeholder="비밀번호">
        </div>
        <!-- 비밀번호확인 -->
        <div class="mb-3">
          <label for="checkLoginPw" class="form-label">비밀번호확인 :</label>
          <input type="password" class="form-control" id="checkLoginPw" name="checkLoginPw" placeholder="비밀번호확인">
        </div>
        <!-- 이메일 -->
        <div class="mb-3">
          <label for="emailId" class="form-label">이메일 :</label>
          <div class="input-group">
            <input type="text" class="form-control" placeholder="이메일아이디" id="emailId" name="emailId"
                   aria-label="emailId">
            <span class="input-group-text">@</span>
            <select class="form-select" aria-label="emailDomain" name="emailDomain">
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
            <select class="form-select" aria-label="startPhoneNumber" name="startPhoneNumber">
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
        <!-- 주민등록번호 -->
        <div class="mb-3">
          <label for="personNumber" class="form-label">주민등록번호 :</label>
          <div class="input-group" id="personNumber">
            <input type="text" class="form-control" placeholder="주민등록번호 앞자리" aria-label="birth" name="birth"
                   maxlength="6">
            <span class="input-group-text">-</span>
            <input type="password" class="form-control" placeholder="주민등록번호 뒷자리" aria-label="gender" name="gender"
                   maxlength="7">
          </div>
        </div>
        <!-- 닉네임 -->
        <div class="mb-3">
          <label for="nickname" class="form-label">닉네임 :</label>
          <input type="text" class="form-control" id="nickname" name="nickname" placeholder="닉네임">
        </div>
      </div>
      <div class="modal-footer">
        <button type="submit" class="btn btn-outline-primary">회원가입</button>
        <button type="reset" class="btn btn-outline-success">초기화</button>
        <button type="button" class="btn btn-outline-secondary" data-bs-dismiss="modal">닫기</button>
      </div>
    </form>
  </div>
</div>
<!-- join modal end -->
<%-- footer start --%>
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
      <li class="nav-item"><a href="/notice/list" class="nav-link px-2 text-body-secondary">공지사항</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">이용약관</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">개인정보처리방침</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">FAQs</a></li>
      <li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">About</a></li>
    </ul>
  </footer>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
<%-- footer end --%>