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
    <form class="d-grid gap-2 d-md-flex justify-content-md-end" method="get">
        <div>
            <input type="text" class="form-control" id="keyword" name="keyword" placeholder="작성자, 제목, 내용">
        </div>
        <div>
            <select class="form-select" aria-label="Default select example" name="tag">
                <option value="0" selected>전체</option>
                <option value="1">관광지</option>
                <option value="2">숙박</option>
                <option value="3">음식점</option>
            </select>
        </div>
        <div>
            <select class="form-select" aria-label="Default select example" name="sorted">
                <option value="1">최신등록순</option>
                <option value="2">조회수</option>
            </select>
        </div>
        <div>
            <button class="btn btn-primary" type="submit">검색</button>
        </div>
    </form>
    <table class="table mt-3">
        <tbody class="table-group-divider">
        <c:forEach items="${articles}" var="article">
            <tr>
                <th class='align-middle text-center'>
                    <%-- 수정 --%>
                    ${article.articleId}
                </th>
                <td>
                    <div>
                        <a href='${root}/articles/${article.articleId}'>
                            ${article.title}
                        </a>
                    </div>
                    <div>
                        작성자 | ${article.createdDate}
                    </div>
                </td>
                <td class='align-bottom'>
                    조회수 ${article.hit}
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="d-flex justify-content-center">
        <nav aria-label="Page navigation example">
            <ul class="pagination">
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li class="page-item"><a class="page-link" href="#">1</a></li>
                <li class="page-item"><a class="page-link" href="#">2</a></li>
                <li class="page-item"><a class="page-link" href="#">3</a></li>
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
    <div class="d-grid gap-2 d-md-flex justify-content-md-end">
        <a href="${root}/articles/register" class="btn btn-primary" type="button">글쓰기</a>
    </div>
</section>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
