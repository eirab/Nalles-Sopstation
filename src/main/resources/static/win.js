const button = document.querySelector('.play-again-btn');
const canvas = document.querySelector('#canvas');


button.addEventListener('click', whenClicking)


const jsConfetti = new JSConfetti();
let timeout;


document.addEventListener("DOMContentLoaded", function() {

 timeout = setTimeout(startConfetti, 700);
 timeout = setTimeout(startConfetti, 1100);
 timeout = setTimeout(startConfetti, 1500);
});

function startConfetti() {
    jsConfetti.addConfetti();
    const audio = document.getElementById("crowd")
    audio.play();


}


function whenClicking() {

        fetch("/restartGame").
        then((response) => response.json()).
        then((data) =>{
            console.log("Level: " + data.message2);
            console.log("Score: " + data.message)
            setLevel(data.message2);
            document.location.href = "/game"

        });


}