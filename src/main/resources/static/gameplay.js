
const trashcans = document.querySelectorAll('.trashcan')
const trashes = document.querySelectorAll('.trash')
const Gtext = document.getElementById("gameplay")
const trashArray = [];



let level;
let backgroundURL;
let beingDragged;
let count = 0;


class Trash {

    id;
    trash_category_id;
    x;
    y;
    url;

    constructor(id, trash_category_id, url) {
        this.id = id;
        this.trash_category_id = trash_category_id;
        this.url = url;
        this.x = randomX();
        this.y = randomY();
    }

}


function addToTrashArray(Trash) {
    trashArray.push(Trash);
}

function setBackground(url){
    backgroundURL = url;
    document.body.style.backgroundImage = backgroundURL;
}

function randomX() {
    return Math.floor(Math.random() * 83) + 5;


}

function randomY() {
    return Math.floor(Math.random() * 45) + 5;

}

function setLevel(lvl){
    level = lvl;
}


trashes.forEach(trash => {
    let randomX = Math.floor(Math.random() * 83) + 5;
    let randomY = Math.floor(Math.random() * 45) + 5;
    trash.style.left = randomX + "%";
    trash.style.top = randomY + "%";
});

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

}

function dragStart(e) {
    beingDragged = e.target;
}


function dragDrop(e) {
    e.preventDefault();
    //If trash is correctly sorted
    if (e.target.id === beingDragged.id) {
        count++;
        //Make the trash disappear


        if (beingDragged.id === "1") {
            const kompostAudio = document.getElementById("kompostAudio");
            kompostAudio.play();

        }

        if (beingDragged.id === "2") {
            const plasticSound = document.getElementById("plasticSound");
            plasticSound.play();

        }

        if (beingDragged.id === "3") {
            const pantAudio = document.getElementById("trashSound");
            pantAudio.play();

        }

        if (beingDragged.id === "4") {
            const metalSound = document.getElementById("metalSound");
            metalSound.play();

        }

        if (beingDragged.id === "5") {
            const cardboardAudio = document.getElementById("cardboardAudio");
            cardboardAudio.play();

        }
        console.log(beingDragged.getAttribute("value"))



        //Notify the RESTController that a trash has been correctly sorted
        fetch("/correctlySorted/" +
            count + "/" +
            level + "/" +
            (beingDragged.getAttribute("value")))
            .then((response) => response.json())
            .then((score) => {

                if (count === 5) {
                    document.location.href = "/game" //Next level
                }
                if (count === 5 && level === 3) {
                    document.location.href = "/vinst"
                }
                //RESTController returns the new score
                Gtext.innerText = score.message; //Update score text
            });




        beingDragged.classList.add('hide')
        e.target.classList.remove('dragopacity')



        //If not correctly sorted
    } else {
        // Play the error sound
        const errorSound = document.getElementById("errorSound");
        errorSound.play();
        e.target.classList.remove('dragopacity')
    }

}