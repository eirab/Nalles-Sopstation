const trashcans = document.querySelectorAll('.trashcan')
const trashes = document.querySelectorAll('.trash')
const Gtext = document.getElementById("gameplay")

let beingDragged;

trashcans.forEach(can => {
    can.addEventListener('dragenter', dragEnter)
       can.addEventListener('dragover', dragOver)
       can.addEventListener('drop', dragDrop)
       can.addEventListener('dragleave', dragLeave)
})

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
}

function dragDrop(e) {
    if(e.target.id === beingDragged.id) {
        beingDragged.classList.add('hide')
        e.target.classList.remove('dragopacity')
        fetch("/updateScore")
            .then((response) => response.json())
            .then((score) => {
                Gtext.innerText = score.message;


            });

    } else {
        e.target.classList.remove('dragopacity')
    }
}



