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
                <option value="1">전체</option>
                <option value="12">관광지</option>
                <option value="14">문화시설</option>
                <option value="15">축제공연행사</option>
                <option value="25">여행코스</option>
                <option value="28">레포츠</option>
                <option value="32">숙박</option>
                <option value="38">쇼핑</option>
                <option value="39">음식점</option>
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
                <c:if test="${page.prev}">
                    <li class="page-item">
                        <a class="page-link" href="${root}/articles?pageNum${page.startPage-1}&amount=${page.amount}"
                           aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                </c:if>
                <%-- 이전버튼 종료 --%>
                <%-- 페이징번호 처리시작 --%>
                <c:forEach var="num" begin="${page.startPage}" end="${page.endPage}">
                    <li class="page-item">
                        <a class="page-link" href="${root}/articles?pageNum=${num}&amount=${page.amount}">${num}</a>
                    </li>
                </c:forEach>
                <%-- 페이징번호 처리종료 --%>
                <%-- 다음버튼 시작 --%>
                    <c:if test="${page.next}">
                <li class="page-item">
                    <a class="page-link" href="${root}/articles?pageNum=${page.endPage + 1}&amount=${page.amount}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                    </c:if>
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
