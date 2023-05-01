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
<section class="container mb-3">
  <div class="d-grid gap-2 d-md-flex justify-content-md-end">
    <button class="btn btn-primary" type="button" onclick="location.href='${root}/hotplaces/register'">글쓰기</button>
  </div>
</section>
<section class="bg-body-secondary mt-4 pb-4">
  <div class="container">
    <div class="row row-cols-1 row-cols-md-3 g-4">
      <%-- card start --%>
      <div class="col">
        <div class="card h-100">
          <img src="http://placehold.it/480x270" class="card-img-top" alt="...">
          <div class="card-body">
            <a class="text-uppercase text-mute text-sm letter-spacing-2">Travel</a>
            <h5 class="card-title my-2">
              <a class="text-dark" href="#">Autumn fashion tips and tricks</a>
            </h5>
            <p class="text-gray-500 text-sm my-3">January 16, 2016</p>
            <p class="my-2 text-muted text-sm">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
            <a class="btn btn-link ps-0">READ MORE</a>
          </div>
        </div>
      </div>
      <%-- card end --%>
    </div>
  </div>
</section>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
