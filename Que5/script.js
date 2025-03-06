window.onload = function () {
  const images = ["image1.jpeg", "image2.jpeg", "image3.jpeg"];

  let currentIndex = 0;
  const imageElement = document.getElementById("image");

  function showImage(index) {
    imageElement.src = images[index];
  }

  function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
  }

  function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
  }

  showImage(currentIndex);

  // Attaching event listeners to buttons after DOM is loaded
  document.querySelector("button:nth-of-type(1)").onclick = prevImage;
  document.querySelector("button:nth-of-type(2)").onclick = nextImage;
};
