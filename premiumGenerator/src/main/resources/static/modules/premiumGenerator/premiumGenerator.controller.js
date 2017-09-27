angular.module("premiumGenerator")
	.controller('premiumGeneratorController', function($scope, $http) {
		$scope.user = {};
		$scope.user.currentHealth = [];
		$scope.user.habits = [];
		$scope.user.premium = 0;
		$scope.user.name = undefined;
		$scope.user.gender = undefined;
		$scope.user.age = undefined;

        $scope.curentHealth = function(item){
        	if($scope.user.currentHealth.indexOf(item) >= 0){
        		$scope.user.currentHealth.splice($scope.user.currentHealth.indexOf(item), 1);
        	}else{
        		$scope.user.currentHealth.push(item);
        	}
        };

        $scope.habits = function(item){
        	if($scope.user.habits.indexOf(item) >= 0){
        		$scope.user.habits.splice($scope.user.habits.indexOf(item), 1);
        	}else{
        		$scope.user.habits.push(item);
        	}
        	console.log($scope.user);
        };

        $scope.submit = function(){
        	$http({
        		method: 'POST',
        		url : "http://localhost:8080/premiumGenerator",
        		data : $scope.user})
        			.then(function(response) {
        			$scope.user.premium = response.data;
        		},
        		function(err){
        			console.log(err);
        		})
        };
    });

