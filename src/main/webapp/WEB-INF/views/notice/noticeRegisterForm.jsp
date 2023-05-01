<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko1">
<head>
    <%@ include file="../common/head.jsp" %>
    <%@ include file="../common/header.jsp" %>

</head>

<body>


<section class="container">
    <h1 class="text-center"> 공지사항 등록 </h1>

    <form method="post" action="/${root}/register/add">
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
            <input type="checkbox" class="form-check-input" id="top" name = "top">
            <label class="form-check-label" for="top">상단 등록</label></div>
        <button type="submit" class="d-grid gap-2 col-2 mx-auto btn btn-primary text-center ">등록
        </button>
    </form>

</section>

<%@ include file="../common/footer.jsp" %>

</body>


</html>