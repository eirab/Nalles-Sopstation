const button = document.querySelector('.rules-button');
const popup = document.getElementById('popup');
const ok = document.getElementById('ok-btn');



button.addEventListener('click', dropDown);
ok.addEventListener('click', disappear);




function dropDown() {
    popup.classList.add('dropdown')

}


function disappear() {
   popup.classList.remove('dropdown')
}