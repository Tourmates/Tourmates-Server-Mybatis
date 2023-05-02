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
    <form method='post' action="${root}/articles/${article.articleId}/edit">
        <table class="table table-bordered">
            <tbody>
            <tr>
                <th class='align-middle'>말머리</th>
                <td>
                    <select class="form-select w-50" aria-label="Default select example" name="tag">
                        <option selected>말머리를 선택하세요.</option>
                        <option value="1">One</option>
                        <option value="2">Two</option>
                        <option value="3">Three</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th class='align-middle'>제목</th>
                <td>
                    <div>
                        <input type="text" class="form-control" id="title" name='title' value="${article.title}" placeholder="제목을 입력하세요.">
                    </div>
                </td>
            </tr>
            <tr>
                <th class='align-middle'>내용</th>
                <td>
                    <textarea class='form-control' name='content' rows='20'>${article.content}</textarea>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="d-flex justify-content-center">
            <a class="btn btn-outline-secondary me-2" href="${root}/articles/${article.articleId}" type="button">취소</a>
            <button class="btn btn-outline-primary ms-2" type="submit">수정</button>
        </div>
    </form>
</section>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
