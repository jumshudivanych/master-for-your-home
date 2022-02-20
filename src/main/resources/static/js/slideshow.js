var slideIndex = 0;
var slideIndexFinal = 4;

showSlides();

function showSlides() {

  var i;
  var slides = document.getElementsByClassName("mySlides");
  var slides2 = document.getElementsByClassName("mySlides2");
  for (i = 0; i < slides.length; i++) {

    slides[i].style.display = "none";
    slides2[i].style.display = "none";

  }

  slideIndex++;

  if (slideIndex > slides.length) {slideIndex = 1}
  slides[slideIndex-1].style.display = "block";
  slides2[slideIndex-1].style.display = "block";
  if (slideIndex-1 != 3) {
  setTimeout(showSlides, 5000); // Change image every 7 seconds
  } else {showSlidesFinal(slideIndexFinal);}
}

/*
angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/greeting').
        then(function(response) {
            $scope.greeting = response.data;
        });
});
*/



// Next/previous controls
function plusSlides(n) {
  showSlidesFinal(slideIndexFinal += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlidesFinal(slideIndexFinal = n);
}

function showSlidesFinal(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var slides2 = document.getElementsByClassName("mySlides2");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndexFinal = 1}
  if (n < 1) {slideIndexFinal = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
      slides2[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndexFinal-1].style.display = "block";
  slides2[slideIndexFinal-1].style.display = "block";
  dots[slideIndex-1].className += " active";
}
