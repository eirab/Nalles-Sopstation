const trashes = document.querySelectorAll('.trash')
const Gtext = document.getElementById("gameplay")

/*let beingDragged;
let count = 0;*/



trashes.forEach(trash => {
    let randomX = Math.floor(Math.random() * 83) +5;
    let randomY = Math.floor(Math.random() * 45) + 5;
    trash.style.left = randomX + "%";
    trash.style.top = randomY + "%";

})

/*
trashes.forEach(trash => {
    trash.addEventListener("dragstart", dragStart)
})

function dragEnter(e) {
    e.target.classList.add('dragopacity')
}

function dragLeave(e) {
    e.target.classList.remove('dragopacity')
}

function dragOver(e) {
    e.preventDefault();
    console.log(e.target)
}

function dragStart(e) {
      beingDragged = e.target;
}*/
