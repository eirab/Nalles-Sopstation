const trashcans = document.querySelectorAll('.trashcan')


trashcans.forEach(can => {
    can.addEventListener('dragenter', dragEnter)
       can.addEventListener('dragover', dragOver)
    can.addEventListener('dragleave', dragLeave)
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