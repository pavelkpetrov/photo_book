<!doctype html>
<meta charset="utf-8" /> 

<html ng-app="App" >
  <head>   
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">   
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/angular.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/angular-route.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/controllers/config.js"></script>
  <link href="${pageContext.request.contextPath}/styles/style.css" rel="stylesheet">
</head>
  
<body>
<div id="container">
<div ng-view></div>		
</div>	
</body>			 
</html>