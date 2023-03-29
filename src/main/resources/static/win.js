const button = document.querySelector('#button');

const canvas = document.querySelector('#canvas');

const jsConfetti = new JSConfetti()




document.addEventListener("DOMContentLoaded", function() {

/*  jsConfetti.addConfetti()*/
 timeout = setTimeout(startConfetti, 1000);
});

function startConfetti() {
    jsConfetti.addConfetti();
}