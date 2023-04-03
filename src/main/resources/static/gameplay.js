const trashcans = document.querySelectorAll('.trashcan')
const trashes = document.querySelectorAll('.trash')
const Gtext = document.getElementById("gameplay")

let beingDragged;



trashes.forEach(trash => {
    let randomX = Math.floor(Math.random() * 83) +5;
    let randomY = Math.floor(Math.random() * 45) + 5;
    trash.style.left = randomX + "%";
    trash.style.top = randomY + "%";

})

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
    //If trash is correctly sorted
    if(e.target.id === beingDragged.id) {
        //Make the trash disappear
        beingDragged.classList.add('hide')
        e.target.classList.remove('dragopacity')
        //Notify the RESTController that a trash has been correctly sorted
        fetch("/correctlySorted/" + beingDragged.getAttribute("value"))
            .then((response) => response.json())
            .then((score) => {
                //RESTController returns the new score
                Gtext.innerText = score.message; //Update score
                const newTrash = document.createElement("img");
                newTrash.setAttribute("src", "applecore.png");
                document.getElementById("trash-div").append(newTrash);




            });

        //If not correctly sorted
    } else {
        fetch("/incorrectlySorted").then((response) => response.json()).then((data) => {
            console.log(data.message)

        });
        e.target.classList.remove('dragopacity')
    }
}







