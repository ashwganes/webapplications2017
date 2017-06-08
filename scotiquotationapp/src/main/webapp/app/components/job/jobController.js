angular.module('quotationApp')
	.controller('jobController',['$scope','jobService', function($scope, jobService) {
		$scope.jobCreationAttribs;
		$scope.jobsListing;
		$scope.industries;
		$scope.functionTypes;
		$scope.countries;
		
		$scope.industry = [
			{"name":"Construction & Real estate", "value": "Construction & Real estate"}, 
			{"name":"Culture & Media", "value":"Culture & Media"},
			{"name":"Energy/Oil & Gas", "value":"Energy/Oil & Gas"},
			{"name":"FMCG", "value":"FMCG"},
			{"name":"Financial services", "value":"Financial services"},
			{"name":"ICT", "value":"ICT"},
			{"name":"Industry & Manufacturing", "value":"Industry & Manufacturing"},
			{"name":"Logistics and Transport", "value":"Logistics and Transport"}
		];
		$scope.jobFunctions = [
			{"name":"Commercial & Communication", "value": "Commercial & Communication"},
			{"name":"Engineering", "value":"Engineering"},
			{"name":"Executive", "value":"Executive"},
			{"name":"Financial", "value":"Financial"},
			{"name":"HRM", "value":"HRM"},
			{"name":"HSE & Security", "value":"HSE & Security"},
			{"name":"IT", "value":"IT"},
			{"name":"Legal & Admin", "value":"Legal & Admin"},
			{"name":"Marine/Diving/ROV", "value":"Marine/Diving/ROV"},
			{"name":"Operations & Production", "value":"Operations & Production"},
			{"name":"Quality & Inspection", "value":"Quality & Inspection"},
			{"name":"Supply chain", "value":"Supply chain"}
		];
		$scope.country = [
			{"name":"India", "value":"India"},
			{"name":"USA", "value":"USA"},
			{"name":"Ghana", "value":"Ghana"},
			{"name":"Ivory Coast", "value":"Ivory Coast"},
			{"name":"Nigeria", "value":"Nigeria"}
		];
		
		$scope.fetchIndustries = function() {
			console.log("In fetchIndustries()");
			jobService.fetchIndustries(function(response) {
				$scope.industries = response;
				console.log($scope.industries);
			});
		}
		
		$scope.fetchFunctions = function() {
			console.log("In fetchFunctions()");
			jobService.fetchIndustries(function(response) {
				$scope.functionTypes = response;
				console.log($scope.functionTypes);
			});
		}
		
		$scope.fetchCountries = function() {
			console.log("In fetchCountries()");
			jobService.fetchIndustries(function(response) {
				$scope.countries = response;
				console.log($scope.countries);
			});
		}
		
		$scope.submitFormData = function() {
			console.log($scope.jobCreationAttribs);
			jobService.submitFormData($scope.jobCreationAttribs, function(response) {
				$scope.jobsListing = response;
				console.log($scope.jobsListing);
			});
		}
		
		$scope.fetchJobs = function() {
			jobService.fetchJobs(function(response) {
				$scope.jobsListing = response;
				console.log($scope.jobsListing);
			});
		}
		$scope.fetchJobs();
		
		$scope.edit = function(jobId) {
			console.log(jobId);
		}
		
		$scope.removeJob = function(jobId) {
			console.log(jobId);
			jobService.removeJob(jobId);
		}
	}]);