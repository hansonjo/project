var idx = 0;

function onClickSlide(index) {
  idx = index;
  var slides = document.getElementsByClassName("image-slider");
console.log(slides);
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }


  if (idx >= slides.length){
    idx = 0;
  } else if (idx < 0) {
    idx = slides.length - 1;
  }

  slides[idx].style.display = "block";
}

function onClickPrev() {
  idx -= 1;
  onClickSlide(idx);
}

function onClickNext() {
  idx += 1;
  onClickSlide(idx);
}
