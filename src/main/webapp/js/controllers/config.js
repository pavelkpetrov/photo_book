 var app = angular.module('App', ['ngRoute']);

    // configure our routes
    app.config(function($routeProvider) {
        $routeProvider
            // route for the home page
		.when('/', {
				controller: 'firstCtrl',
				templateUrl: '/albums'
            })
			
            // route for the about page
            .when('/login', {
                templateUrl : 'login.html',
                controller  : 'loginCtrl'
            })
			.when('/start', {
                templateUrl : 'start.html',
				 controller  :'mainController'				               
            })
			
			.when('/page', {
                templateUrl : 'page.html',
                controller  : 'pageCtrl'
            })

            // route for the contact page
            .when('/signup', {
                templateUrl : 'signup.html',
                controller  : 'signCtrl'
            });
    });
	
		 app.controller('firstCtrl', ['$scope', '$location', function($scope,$location) {
		 $scope.mySwitch = true;
		 
		 $scope.enableButton = function(){			
		 $scope.mySwitch = false;
		}; 
		 
		$scope.showStart = function() {
		$location.path('/start');
		};		 
        
    }]);	

    // create the controller and inject Angular's $scope
    app.controller('mainController', ['$scope', '$location', function($scope,$location) {

		 $scope.showLogin = function() {
			$location.path('/login');
		},		
	
		 $scope.showSign = function() {
			$location.path('/signup');
		};	
		       
    }]);

    app.controller('loginCtrl', function($scope, $location, $http) {
		
		 $scope.person = {
			name:"",
			mail: "",
			pass: ""
		},
		
		$scope.showPage = function() {
			$location.path('/page');
		};	
	});		

	

    app.controller('signCtrl', function($scope) {
		$scope.person = {
			name:"",
			mail: "",
			pass: ""
		};		
	});
	
	app.controller('pageCtrl', function($scope) {
		 $scope.person = {
			name:"dear guest"
		};

	});	
	
	