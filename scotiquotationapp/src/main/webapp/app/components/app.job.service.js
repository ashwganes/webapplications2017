angular.module('quotationApp')
	.service('jobService', ['$http', function($http) {
		this.submitFormData = function(jobCreationAttribs, callBack) {
			console.log("In submitFormData()");
			$http({
				url: '/scotiquotationapp/createJob',
				method: 'POST',
				data : {industry: jobCreationAttribs.industry,
						functionType: jobCreationAttribs.functionType,
						country: jobCreationAttribs.country,
						briefDesc: jobCreationAttribs.briefDesc,
						detailedDesc: jobCreationAttribs.detailDesc}
			}).then(function(resp) {
				//success callback
				console.log("Successfully inserted");
				console.log(resp);
				console.log(resp.data);
				callBack(resp.data);
			}, function(resp) {
				//error callback
				console.log("Error countered during insertion");
			});
		};
		
		this.fetchJobs = function(callBack) {
			console.log("In fetchJobs()");
			$http({
				url: '/scotiquotationapp/fetchJobs.json',
				method: 'GET'
			}).then(function(resp) {
				//success callback
				console.log("Successfully fetched");
				callBack(resp.data);
			}, function(resp) {
				//error callback
				console.log("Error countered during jobs fetch");
			});
		}
		
		this.removeJob = function(jobId) {
			console.log("In removeJob()");
			$http({
				url: '/scotiquotationapp/removeJob/:jobId',
				method: 'GET',
				params: {jobId: '@jobId'}
			}).then(function(resp) {
				//success callback
				console.log("Successfully deleted");
			}, function(resp) {
				//error callback
				console.log("Error countered during job deletion");
			});
		}
	}]);