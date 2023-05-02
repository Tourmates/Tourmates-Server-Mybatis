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
      <c:forEach items="${hotplaces}" var="hotplace">
        <div class="col">
          <div class="card h-100">
            <img src="${hotplace.storeFileName}" class="card-img-top" alt="img">
            <div class="card-body">
              <a class="text-uppercase text-mute text-sm letter-spacing-2">${hotplace.tag}</a>
              <h5 class="card-title my-2">
                <a class="text-dark" href="${root}/hotplaces/${hotplace.hotplaceId}">${hotplace.title}</a>
              </h5>
              <p class="text-gray-500 text-sm my-3">${hotplace.visitedDate}</p>
              <p class="my-2 text-muted text-sm">${hotplace.content}</p>
              <a class="btn btn-link ps-0" href="${root}/hotplaces/${hotplace.hotplaceId}">READ MORE</a>
            </div>
          </div>
        </div>
      </c:forEach>
      <%-- card end --%>
    </div>
  </div>
</section>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
