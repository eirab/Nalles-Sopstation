
  const startSong = document.getElementById('startSong');
  const muteButton = document.getElementById('mute-button');
  const volumeSlider = document.getElementById('volume-slider');

   var audio = document.getElementById("startSong");
    audio.play();

// mute button
muteButton.addEventListener("click", () => {
  if (audio.muted) {
    audio.muted = false;
    muteButton.textContent = "Mute";
  } else {
    audio.muted = true;
    muteButton.textContent = "Unmute";
  }
});

// volume control
volumeSlider.addEventListener("input", () => {
  const volume = volumeSlider.value / 100;
  audio.volume = volume;
});