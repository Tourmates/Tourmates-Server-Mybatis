<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <%@ include file="../common/head.jsp" %>
</head>

<body>

<!-- header start -->
<div class="container">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4">
        <a href="/"
           class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <svg class="bi me-2" width="40" height="32">
                <use xlink:href="#bootstrap"/>
            </svg>
            <span class="fs-4">Tourmates</span>
        </a>
        <ul class="nav">
            <li class="nav-item"><a href="#" class="nav-link active text-dark" aria-current="page">지역별여행지</a>
            </li>
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
    <h1 class="text-center"> 공지사항 등록 </h1>

    <form method="post" action="/register/add">
        <div class="mb-3">
            <label for="noticeTitle" class="form-label ">공지 제목</label>
            <input type="text" class="form-control border border-black" id="exampleInputEmail1"
                   aria-describedby="emailHelp">
        </div>

        <label for="noticeText" class="form-label ">공지 내용</label>
        <div class="input-group">
            <textarea class="form-control h-25 border border-black" rows="10"
                      id="submission_content{{submission.id}}"
                      aria-label="With textarea"></textarea>
        </div>
        <br/>
        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="top">
            <label class="form-check-label" for="top">상단 등록</label></div>
        <button type="submit" class="d-grid gap-2 col-2 mx-auto btn btn-primary text-center ">등록
        </button>
    </form>

</section>

<%@ include file="../common/footer.jsp" %>

</body>


</html>