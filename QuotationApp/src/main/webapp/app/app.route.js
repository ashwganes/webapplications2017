'use strict';

angular.module('quotationApp',['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
    	console.log('Inside routing');
        $routeProvider
        .when('/', {
        	templateURL: 'app/components/dashboard/dashboard.htm',
        	controller: 'dashBoard'
        })
    }]);