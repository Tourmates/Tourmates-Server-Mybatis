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
    <table class="table mt-3">
        <tbody class="table-group-divider">
        <c:forEach items="${articles}" var="article">
            <tr>
                <th class='align-middle text-center'>
                        ${article.tag}
                </th>
                <td>
                    <div>
                        <a href='${root}/articles/${article.articleId}'>
                                ${article.title}
                        </a>
                    </div>
                    <div>
                        ${article.nickname} | ${article.createdDate}
                    </div>
                </td>
                <td class='align-bottom'>
                    조회수 ${article.hit}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <%-- 페이징 시작 --%>
    <div class="d-flex justify-content-center">
        <nav aria-label="Page navigation example">
            <ul class="pagination">
                <%-- 이전버튼 시작 --%>
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <%-- 이전버튼 종료 --%>
                <%-- 페이징번호 처리시작 --%>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <%-- 페이징번호 처리종료 --%>
                <%-- 다음버튼 시작 --%>
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <%-- 다음버튼 시작 --%>
            </ul>
        </nav>
    </div>
    <%-- 페이징 종료 --%>
    <div class="d-grid gap-2 d-md-flex justify-content-md-end">
        <a href="${root}/articles/register" class="btn btn-primary" type="button">글쓰기</a>
    </div>
</section>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
