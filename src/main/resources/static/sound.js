const startSong = document.getElementById('startSong');
const muteButton = document.getElementById('mute-button');
const volumeSlider = document.getElementById('volume-slider');

var audio = document.getElementById("startSong");
audio.play();

// mute button
muteButton.addEventListener("click", () => {
  if (audio.muted) {
    audio.muted = false;
    muteButton.textContent = "LJUD AV";
  } else {
    audio.muted = true;
    muteButton.textContent = "LJUD PÅ";
  }
});

// volume control
 volumeSlider.addEventListener("input", () => {
 const volume = parseFloat(volumeSlider.value);
  audio.volume = volume;
 });