<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- header start --%>
<div class="container">
  <header class="d-flex flex-wrap justify-content-center py-3 mb-4">
    <a href="${root}/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
      <svg class="bi me-2" width="40" height="32">
        <use xlink:href="#bootstrap"/>
      </svg>
      <span class="fs-4">Tourmates</span>
    </a>
    <ul class="nav">
      <li class="nav-item"><a href="${root}/attractionInfo" class="nav-link active text-dark" aria-current="page">지역별여행지</a></li>
      <li class="nav-item"><a href="${root}/tripPlan" class="nav-link text-dark">나의여행계획</a></li>
      <li class="nav-item"><a href="${root}/hotplace" class="nav-link text-dark">핫플자랑하기</a></li>
      <li class="nav-item"><a href="#" class="nav-link text-dark">여행정보공유</a></li>
      <c:if test="${empty loginMember}">
        <li class="nav-item"><a href="${root}/" class="nav-link text-dark" data-bs-toggle="modal"
                                data-bs-target="#joinModal">회원가입</a></li>
        <li class="nav-item"><a href="${root}/" class="nav-link text-dark" data-bs-toggle="modal"
                                data-bs-target="#loginModal">로그인</a></li>
      </c:if>
      <c:if test="${not empty loginMember}">
        <li class="nav-item"><a href="${root}/mypage" class="nav-link text-dark">마이페이지</a></li>
        <li class="nav-item"><a href="${root}/logout" class="nav-link text-dark">로그아웃</a></li>
      </c:if>
    </ul>
  </header>
</div>
<%-- header end --%>