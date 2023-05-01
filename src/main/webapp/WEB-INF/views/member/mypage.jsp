<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <%@ include file="../common/head.jsp" %>
  <style>
    a {
        text-decoration-line: none;
    }
  </style>
</head>
<body>
<%@ include file="../common/header.jsp" %>
<%-- section start --%>
<div class="bg-body-tertiary">
  <section class="container pt-4 pb-5">
    <h1>마이페이지</h1>
    <p>여기에서 계정 및 설정을 관리합니다.</p>
    <div class="row row-cols-1 row-cols-md-3 g-4">
      <div class="col">
        <div class="card h-100 border-0 shadow">
          <div class="card-body">
            <div
                class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3 rounded-circle">
              <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                   class="bi bi-person-fill m-2" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
              </svg>
            </div>
            <h5 class="card-title">나의 핫플레이스</h5>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional
              content. This content is a little bit longer.</p>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 border-0 shadow">
          <div class="card-body">
            <div
                class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3 rounded-circle">
              <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                   class="bi bi-person-fill m-2" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
              </svg>
            </div>
            <h5 class="card-title">나의 여행계획</h5>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional
              content. This content is a little bit longer.</p>
          </div>
        </div>
      </div>
      <div class="col" onclick="location.href='${root}/my/articles'">
        <div class="card h-100 border-0 shadow">
          <div class="card-body">
            <div
                class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3 rounded-circle">
              <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                   class="bi bi-person-fill m-2" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
              </svg>
            </div>
            <h5 class="card-title">나의 게시물</h5>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional
              content. This content is a little bit longer.</p>
          </div>
        </div>
      </div>
      <div class="col" onclick="location.href='${root}/my/personal'">
        <div class="card h-100 border-0 shadow">
          <div class="card-body">
            <div
                class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3 rounded-circle">
              <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                   class="bi bi-person-fill m-2" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
              </svg>
            </div>
            <h5 class="card-title">개인 정보 변경</h5>
            <p class="card-text">개인적인 세부 사항과 연락 방법을 제공합니다</p>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 border-0 shadow">
          <div class="card-body">
            <div
                class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3 rounded-circle">
              <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                   class="bi bi-person-fill m-2" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
              </svg>
            </div>
            <h5 class="card-title">비밀번호 변경</h5>
            <p class="card-text">암호를 업데이트하고 계정을 보호합니다</p>
          </div>
        </div>
      </div>
      <div class="col">
        <div class="card h-100 border-0 shadow">
          <div class="card-body">
            <div
                class="feature-icon d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-2 mb-3 rounded-circle">
              <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
                   class="bi bi-person-fill m-2" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
              </svg>
            </div>
            <h5 class="card-title">회원탈퇴</h5>
            <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional
              content. This content is a little bit longer.</p>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
