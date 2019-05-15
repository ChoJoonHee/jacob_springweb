<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<base href="${pageContext.request.contextPath }/" />
<title>게시판</title>
</head>
<body>
	<h2>글 등록</h2>
	<p>
		<a href="./app/article/list">글 목록</a>
	</p>
	<form action="./app/article/add" method="post">
		<p>제목 :</p>
		<p>
			<input type="text" name="title" maxlength="100" required style="width: 100%;">
		</p>
		<p>내용 :</p>
		<p>
			<textarea name="content" style="width: 100%; height: 200px;"></textarea>
		</p>
		<p>
			<button type="submit">등록</button>
		</p>
	</form>
</body>
</html>