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
<section class='container'>
    <table class="table">
        <tbody class="table-group-divider">
        <tr>
            <td>
                <div class='pt-3 pb-3'>
                    <div class='mb-3'>${hotplace.tag} ${hotplace.title}</div>
                    <div class="d-flex justify-content-between">
                        <div>${hotplace.nickname} | ${hotplace.createdDate}</div>
                        <div>조회수 ${hotplace.hit} | 추천수 ${hotplace.vote}</div>
                    </div>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class='p-3'>
                    ${hotplace.content}
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    <div class="d-flex justify-content-center">
        <a class="btn btn-primary" type="button" href="${root}/hotplaces">목록</a>
    </div>
</section>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
