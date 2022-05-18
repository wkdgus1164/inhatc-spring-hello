<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>

<%@ page import='java.util.*'%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<%
	Random random = new Random();
	int nLottoNum = 6;
	int arrLotto[] = new int[nLottoNum];

	for (int i = 0; i <= nLottoNum - 1; i++) {
		arrLotto[i] = 0;
	}

	int nCurrentCnt = 0;
	int nCurrentVal = 0;

	boolean bExistVal = false;
	int nCurrentNum = 0;

	while (true) {
		nCurrentVal = random.nextInt(45) + 1;
		bExistVal = false;

		for (int i = 0; i <= nCurrentCnt; i++) {
			if (arrLotto[i] == nCurrentVal) {
		out.print("중복발생<br>");
		bExistVal = true;
		continue;
			}
		}

		if (!bExistVal) {
			arrLotto[nCurrentCnt] = nCurrentVal;
			nCurrentCnt++;
		}

		if (nCurrentCnt == 6)
			break;
	}

	for (int i = 0; i <= nLottoNum - 1; i++) {
		out.print(i + 1 + "번째 숫자:" + arrLotto[i] + "<br>");
	}
	%>

</body>
</html>
