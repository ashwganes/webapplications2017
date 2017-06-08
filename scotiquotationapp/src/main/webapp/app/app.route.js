angular.module('quotationApp', ['ngRoute'])
	.config(function($routeProvider) {
        $routeProvider
        	.when('/createJobs', {
	            templateUrl: 'app/components/job/createJob.htm',
	            controller: 'jobController'
        	})
        	.when('/jobListing', {
        		templateUrl: 'app/components/job/jobListing.htm',
	            controller: 'jobController'
        	})
        	.otherwise({ redirectTo: '/'});
    });