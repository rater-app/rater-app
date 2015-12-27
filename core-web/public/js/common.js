app.controller('commonController', function ($scope, $http) {
    // Makes the REST request to get the data to populate the grid.
    $scope.refreshGrid = function (page) {
        $http({
            url: 'hello',
            method: 'GET',

        }).success(function (data) {
            $scope.hello = data;
        });
    };
}