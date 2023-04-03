const button = document.querySelector('#button');

const canvas = document.querySelector('#canvas');

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