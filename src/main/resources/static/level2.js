const trashcans = document.querySelectorAll('.trashcan')
const trashes = document.querySelectorAll('.trash')
const Gtext = document.getElementById("gameplay")

let beingDragged;
let count = 0;

trashes.forEach(trash => {
  let randomX = Math.floor(Math.random() * 83) + 5;
  let randomY = Math.floor(Math.random() * 45) + 5;
  trash.style.left = randomX + "%";
  trash.style.top = randomY + "%";
});

trashcans.forEach(can => {
  can.addEventListener('dragenter', dragEnter);
  can.addEventListener('dragover', dragOver);
  can.addEventListener('drop', dragDrop);
  can.addEventListener('dragleave', dragLeave);
});

trashes.forEach(trash => {
  trash.addEventListener("dragstart", dragStart);
});

function dragEnter(e) {
  e.target.classList.add('dragopacity');
}

function dragLeave(e) {
  e.target.classList.remove('dragopacity');
}

function dragOver(e) {
  e.preventDefault();
  console.log(e.target);
}

function dragStart(e) {
  beingDragged = e.target;
}

function dragDrop(e) {
  //If trash is correctly sorted
  if (e.target.id === beingDragged.id) {
    count++;

    //Make the trash disappear
    beingDragged.classList.add('hide');
    e.target.classList.remove('dragopacity');

    // Play the correct trash sound
    const correctTrashSound = document.getElementById("trashSound");
    correctTrashSound.play();

    //Notify the RESTController that a trash has been correctly sorted
    fetch("/correctlySorted")
      .then((response) => response.json())
      .then((score) => {
        if (count === 5) {
          console.log("hej");
          document.location.href = "/level3";
        }

        //RESTController returns the new score
        Gtext.innerText = score.message; //Update score
      });

    //If not correctly sorted
  } else {
    // Play the error sound
    const errorSound = document.getElementById("errorSound");
    errorSound.play();

    fetch("/incorrectlySorted")
      .then((response) => response.json())
      .then((data) => {
        console.log(data.message);
      });
    e.target.classList.remove('dragopacity');
  }
}
//Make the trash disappear
        beingDragged.classList.add('hide')
        e.target.classList.remove('dragopacity')
        //Notify the RESTController that a trash has been correctly sorted
        fetch("/correctlySorted")
            .then((response) => response.json())
            .then((score) => {
            if(count === 5) {
            console.log("hej")
            document.location.href =  "/level3"
            }


                //RESTController returns the new score
                Gtext.innerText = score.message; //Update score



            });



        //If not correctly sorted
    } else {
        fetch("/incorrectlySorted").then((response) => response.json()).then((data) => {
            console.log(data.message)

        });
        e.target.classList.remove('dragopacity')
    }
}







