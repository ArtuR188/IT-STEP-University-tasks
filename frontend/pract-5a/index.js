document.addEventListener('DOMContentLoaded', function () {
    const switchImage = (direction) => {
      const sliderItemNodes = document.getElementsByClassName('slider-item');
      let currentIndex = null;
  
      for (let i = 0; i < sliderItemNodes.length; i += 1) {
        if (sliderItemNodes[i].classList.contains('selected')) {
          currentIndex = i;
        }
      }
  
      let nextIndex;
      if (direction === 'right') {
        nextIndex = currentIndex + 1;
        if (nextIndex === sliderItemNodes.length) {
          nextIndex = 0;
        }
      } else if (direction === 'left') {
        nextIndex = currentIndex - 1;
        if (nextIndex === -1) {
          nextIndex = sliderItemNodes.length - 1;
        }
      }
  
      const [selectedNode] = document.getElementsByClassName('selected');
      selectedNode.classList.toggle('selected');
      sliderItemNodes[nextIndex].classList.toggle('selected');
    };
  
    document.getElementById('right').addEventListener('click', () => switchImage('right'));
    document.getElementById('left').addEventListener('click', () => switchImage('left'));
  });
  