<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세페이지</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
<style>
.card {
	width: 50px;
	height: 100px;
	margin-top: 10px;
}

.card-img-top {
	width: 268px;
	height: 200px;
}
</style>
</head>
<body>

	<!-- 헤더 -->
	<div class="container">
		<header class="d-flex justify-content-center py-3">
			<h1 style="color: #1E4FFF;">🕊부산로드🕊 &nbsp;&nbsp;&nbsp;</h1>
			<ul class="nav nav-pills">
				<li class="nav-item"><a href="#" class="nav-link">지역별로 보기</a></li>
				<li class="nav-item"><a href="#" class="nav-link">해수욕장</a></li>
				<li class="nav-item"><a href="#" class="nav-link">무장애 여행</a></li>
				<li class="nav-item"><a href="#" class="nav-link">검색</a></li>
				<li class="nav-item"><a href="#" class="nav-link">혼잡도 알아보기</a></li>
			</ul>
		</header>
	
		<hr>
		
			<div class="col-md-9 col-lg-8 "
				style="text-align: center; padding-top: 20px;">

				<h3>${one.title}</h3>
				<br> <img alt="" src=${one.firstimage}><br>
				<table class="table">
							<tr>
								<td>주차시설 : ${one.parking}</td>
							</tr>
							
				</table>
				<br>
				감천문화마을(甘川文化마을)은 행정구역상 부산광역시 사하구 감천동에 위치한 마을이다. 1950년대에 태극도 신도들과 6.25 전쟁 피난민들이 모여서 이루어졌다. 지금도 태극도의 본부가 있다. 그동안 태극도마을이라는 이름의 낙후된 동네로 알려졌으나 ‘보존과 재생’을 바탕으로 진행된 도시재생의 일환으로 부산지역의 예술가와 주민들이 합심해 담장이나 건물 벽에 벽화 등을 그리는 '마을미술 프로젝트'가 진행되어 부산의 대표적인 관광지로 자리잡았다.

대한민국 이외의 국가에서도 감천문화마을을 도시재생 사업으로 벤치마킹하고 있다. 2012년 우간다와 탄자니아의 공무원들이 도시재생 노하우를 익히기 위해 방문한 것을 시작으로 2018년까지 25회에 걸쳐 외국 공무원과 국제기구 관계자, 외신 기자 등 500여 명이 다녀갔다.
			</div>
		</div>
</body>
</html>