angular.module("premiumGenerator")
	.directive('premiumGenerator', function() {
        return {
            restrict: 'E',
            templateUrl: 'modules/premiumGenerator/premiumGenerator.html',
            controller: 'premiumGeneratorController',
            scope: {}
        };
    });

