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
  <form method='post'>
    <table class="table table-bordered">
      <tbody>
      <tr>
        <th class='align-middle'>장소 이름</th>
        <td>
          <div>
            <input type="text" class="form-control" id="title" name='title' placeholder="제목을 입력하세요.">
          </div>
        </td>
      </tr>
      <tr>
        <th class='align-middle'>장소 설명</th>
        <td>
          <textarea class='form-control' name='content' rows='20'></textarea>
        </td>
      </tr>
      </tbody>
    </table>
    <div class="d-flex justify-content-center">
      <button class="btn btn-outline-secondary me-2" type="button">취소</button>
      <button class="btn btn-outline-primary ms-2" type="submit">등록</button>
    </div>
  </form>
</section>
<%-- section end --%>
<%@ include file="../common/footer.jsp" %>
</body>
</html>
