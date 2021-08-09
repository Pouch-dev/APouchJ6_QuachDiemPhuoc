app = angular.module("admin-app", ["ngRoute"]);

app.config(function ($routeProvider){
    $routeProvider
    .when("/product",{
        templateUrl: "/admin/assets/product/index.html",
        controller: "product-ctrl"
    })
    .when("/authorize",{
        templateUrl: "/admin/assets/authority/index.html",
        controller: "authority-ctrl"    
    })
    .when("unauthorized", {
        templateUrl: "/admin/assets/authority/unauthorized.html",
        controller: "authority-ctrl"
    })
    .otherwise({
        template: "<h1 class='text-center'>PS12705 - QUACH DIEM PHUOC - Administration></h1>"
    });
})