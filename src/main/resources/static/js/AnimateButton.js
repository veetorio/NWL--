const button = document.getElementById('mode')
const body = document.querySelector('body')
const modes = document.getElementById('icon')

const icons = ['bi bi-moon-stars-fill','bi bi-brightness-low-fill']



let mode = 0
button.addEventListener('click',() => {
    if(mode === 0){
        button.style.rotate = '360deg'
        body.style.background = 'linear-gradient(to right, rgb(253, 253, 253), rgb(206, 206, 206))'
        modes.setAttribute('class',icons[1])
        mode = 1
    }else{
        button.style.rotate = '0deg'
        body.style.backgroundImage = 'linear-gradient(to right, rgb(1, 1, 1), rgb(26, 26, 26))'
        modes.setAttribute('class',icons[0])
        mode = 0
    }
})