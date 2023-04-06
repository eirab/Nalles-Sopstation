const button = document.querySelector('.play-again-btn');
const canvas = document.querySelector('#canvas');

button.addEventListener('click', whenClicking)


const jsConfetti = new JSConfetti();

 const audio = new Audio("/crowdcheering.mp3");
 audio.play();

document.addEventListener("DOMContentLoaded", function() {

 timeout = setTimeout(startConfetti, 700);
 timeout = setTimeout(startConfetti, 1100);
 timeout = setTimeout(startConfetti, 1500);
});

function startConfetti() {
    jsConfetti.addConfetti();

}


function whenClicking() {
      document.location.href = "/level1"
}