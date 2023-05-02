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
      <h1>개인 정보 변경</h1>
      <p>여기에서 개인 정보 및 설정을 관리합니다.</p>
    </div>
    <div>
      <div class="d-flex justify-content-between">
        <h5 class="fw-bold">상세 정보</h5>
        <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
          UPDATE
        </button>
      </div>
      <p>
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-lines-fill" viewBox="0 0 16 16">
          <path d="M6 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm-5 6s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H1zM11 3.5a.5.5 0 0 1 .5-.5h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1-.5-.5zm.5 2.5a.5.5 0 0 0 0 1h4a.5.5 0 0 0 0-1h-4zm2 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2zm0 3a.5.5 0 0 0 0 1h2a.5.5 0 0 0 0-1h-2z"/>
        </svg>
        ${personalInfo.username}
        <br/>
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-balloon" viewBox="0 0 16 16">
          <path fill-rule="evenodd" d="M8 9.984C10.403 9.506 12 7.48 12 5a4 4 0 0 0-8 0c0 2.48 1.597 4.506 4 4.984ZM13 5c0 2.837-1.789 5.227-4.52 5.901l.244.487a.25.25 0 1 1-.448.224l-.008-.017c.008.11.02.202.037.29.054.27.161.488.419 1.003.288.578.235 1.15.076 1.629-.157.469-.422.867-.588 1.115l-.004.007a.25.25 0 1 1-.416-.278c.168-.252.4-.6.533-1.003.133-.396.163-.824-.049-1.246l-.013-.028c-.24-.48-.38-.758-.448-1.102a3.177 3.177 0 0 1-.052-.45l-.04.08a.25.25 0 1 1-.447-.224l.244-.487C4.789 10.227 3 7.837 3 5a5 5 0 0 1 10 0Zm-6.938-.495a2.003 2.003 0 0 1 1.443-1.443C7.773 2.994 8 2.776 8 2.5c0-.276-.226-.504-.498-.459a3.003 3.003 0 0 0-2.46 2.461c-.046.272.182.498.458.498s.494-.227.562-.495Z"/>
        </svg>
        ${personalInfo.birth}
        <br/>
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-envelope-open" viewBox="0 0 16 16">
          <path d="M8.47 1.318a1 1 0 0 0-.94 0l-6 3.2A1 1 0 0 0 1 5.4v.817l5.75 3.45L8 8.917l1.25.75L15 6.217V5.4a1 1 0 0 0-.53-.882l-6-3.2ZM15 7.383l-4.778 2.867L15 13.117V7.383Zm-.035 6.88L8 10.082l-6.965 4.18A1 1 0 0 0 2 15h12a1 1 0 0 0 .965-.738ZM1 13.116l4.778-2.867L1 7.383v5.734ZM7.059.435a2 2 0 0 1 1.882 0l6 3.2A2 2 0 0 1 16 5.4V14a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V5.4a2 2 0 0 1 1.059-1.765l6-3.2Z"/>
        </svg>
        ${personalInfo.emailId}@${personalInfo.emailDomain} |
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-telephone" viewBox="0 0 16 16">
          <path d="M3.654 1.328a.678.678 0 0 0-1.015-.063L1.605 2.3c-.483.484-.661 1.169-.45 1.77a17.568 17.568 0 0 0 4.168 6.608 17.569 17.569 0 0 0 6.608 4.168c.601.211 1.286.033 1.77-.45l1.034-1.034a.678.678 0 0 0-.063-1.015l-2.307-1.794a.678.678 0 0 0-.58-.122l-2.19.547a1.745 1.745 0 0 1-1.657-.459L5.482 8.062a1.745 1.745 0 0 1-.46-1.657l.548-2.19a.678.678 0 0 0-.122-.58L3.654 1.328zM1.884.511a1.745 1.745 0 0 1 2.612.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
        </svg>
        ${personalInfo.startPhoneNumber}${personalInfo.middlePhoneNumber}${personalInfo.endPhoneNumber}
      </p>
      <div class="collapse mt-3" id="collapseExample">
        <form class="card card-body" method="post" action="${root}/my/personal">
          <div class="mb-3">
            <label for="nickname" class="form-label">닉네임</label>
            <input type="text" class="form-control" id="nickname" name="nickname" placeholder="닉네임" value="${personalInfo.nickname}">
          </div>
          <div class="mb-3">
            <label for="email" class="form-label">이메일</label>
            <div class="input-group" id="email">
              <input type="text" class="form-control" placeholder="이메일아이디" aria-label="emailId" name="emailId" value="${personalInfo.emailId}">
              <span class="input-group-text">@</span>
              <select class="form-select" aria-label="Default select example" name="emailDomain" value="${personalInfo.emailDomain}">
                <option selected>선택</option>
                <option value="ssafy.com">ssafy.com</option>
                <option value="naver.com">naver.com</option>
                <option value="kakao.com">kakao.com</option>
              </select>
            </div>
          </div>
          <div class="mb-3">
            <label for="phone" class="form-label">연락처</label>
            <div class="input-group" id="phone">
              <select class="form-select" aria-label="Default select example" name="startPhoneNumber" value="${personalInfo.startPhoneNumber}">
                <option value="010" selected>010</option>
                <option value="011">011</option>
                <option value="070">070</option>
              </select>
              <span class="input-group-text">-</span>
              <input type="text" class="form-control" aria-label="middlePhoneNumber" name="middlePhoneNumber"
                     maxlength="4" value="${personalInfo.middlePhoneNumber}">
              <span class="input-group-text">-</span>
              <input type="text" class="form-control" aria-label="endPhoneNumber" name="endPhoneNumber" maxlength="4" value="${personalInfo.endPhoneNumber}">
            </div>
          </div>
          <button type="submit" class="btn btn-outline-primary w-25">상세 정보 변경</button>
        </form>
      </div>
    </div>
  </section>
</div>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
