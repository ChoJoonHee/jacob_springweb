<!doctype html>
<!-- p.357 [리스트 13.7] 로그인 화면 수정 -->
<html>
<head>
<base href="${pageContext.request.contextPath }/" />
<title>로그인</title>
</head>
<body>
	<form action="./app/login" method="post">
		<p>
			<label>이메일 :</label><br /> <input type="email" name="email" required />
		</p>
		<p>
			<label>비밀번호 : </label><br /> <input type="password" name="password" required />
		</p>
		<p>
			<button type="submit">로그인</button>
		</p>
	</form>
</body>
</html>