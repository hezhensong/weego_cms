<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
	<meta charset="UTF-8">
	<title>PGC活动</title>
	<link rel="stylesheet" type="text/css" href="../css/PGC.css">
	<script type="text/javascript" src="../resource/jquery-1.3.2.min.js"></script>
	<style type="text/css">
	header{
		background-image: url(${bg});
		background-size: cover;
		height: 640px;
		width: 100%;

	}
	.page .poi{
		height: 420px;
		background-image: url(${poi_bg});
		background-size: cover;
		margin: 30px 0;
	}
	</style>
</head>
<body>
	<header>
		<h1>${title}</h1>
	</header>

	<div class="author">
		<div class="head">
			<img id="author_pic" src="${author_pic}">
		</div>
		<h1 id="author_name">${author_name}</h1>
		<p>${author_breif}</p>
		<div class="line"></div>
	</div>

	<div class="from">作者：<span id="author">${author}</span>,来源：<span id="from">${from}</span>
	</div>

	<div class="drb"><img src="../resource/img/pgc/yin1.png"></br>&nbsp;${breif}</br><img class="float-r" src="../resource/img/pgc/yin2.png"></div>

	<div class="page">
		<div class="page_title">
			<div class="small">
			</div>
			<h2 id="text_title">${text_title}</h2>
		</div>

		<div id="text" class="drb">${text}</div>
		<div class="poi" id="poi">
			<img class="overlay" id="poi_pic" src="../resource/img/pgc/overlay.png">
			<div class="type" id="poi_tag">${poi_tag}</div>
			<div class="center">
				<div class="line"></div>
				<div class="icon"></div>
				<div class="line"></div>
				<h2 id="poi_title">${poi_title}</h2>
			</div>
		</div>
		<div class="page_pic">
			<img id="pic" src="${page_pic}">
			<h3 class="resource">(图片来源：<span id="pic_resource">${pic_resource}</span>)</h3>
		</div>
	</div>

	<footer>
		<h5>由weego重新排版&nbsp;<a>阅读原文</a></h5>
		<div class="logo"><img src="${public_logo}"></div>
		<p class="public">${public}</p>
		<div class="public_breif">${public_breif}</div>
	</footer>
</body>
<script type="text/javascript" src="../js/PGC.js"></script>
</html>