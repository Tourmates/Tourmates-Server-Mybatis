<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- header start --%>
<div class="container">
  <header class="d-flex flex-wrap justify-content-center py-3">
    <a href="${root}/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
      <img src="${root}/resources/img/logo.svg">
    </a>
    <ul class="nav">
      <li class="nav-item"><a href="${root}/attractionInfos" class="nav-link active text-dark" aria-current="page">지역별여행지</a></li>
      <li class="nav-item"><a href="${root}/tripPlans" class="nav-link text-dark">나의여행계획</a></li>
      <li class="nav-item"><a href="${root}/hotplaces" class="nav-link text-dark">핫플자랑하기</a></li>
      <li class="nav-item"><a href="${root}/articles" class="nav-link text-dark">자유게시판</a></li>
      <c:if test="${empty loginMember}">
        <li class="nav-item"><a href="${root}/" class="nav-link text-dark" data-bs-toggle="modal"
                                data-bs-target="#joinModal">회원가입</a></li>
        <li class="nav-item"><a href="${root}/" class="nav-link text-dark" data-bs-toggle="modal"
                                data-bs-target="#loginModal">로그인</a></li>
      </c:if>
      <c:if test="${not empty loginMember}">
        <li class="nav-item"><a href="${root}/my" class="nav-link text-dark">마이페이지</a></li>
        <li class="nav-item"><a href="${root}/logout" class="nav-link text-dark">로그아웃</a></li>
      </c:if>
    </ul>
  </header>
</div>
<%-- header end --%>