let clickAtivo = false;
const color = document.getElementById('selectorColor');
let colorSelect = "#000";
const reset = document.getElementById('reset');
const pincel3x3 = document.getElementById('coso3x3');
const options = document.querySelectorAll('.button');
const borra = document.getElementById('borra');
let hoverDiv;
const openModal = document.getElementById('btnDescarga');
const modal = document.getElementById('modal')
const closeModal = document.getElementById('cerrarLaWebada');
const descargarCoso = document.getElementById('descargarLaWebada');
let usersList = localStorage.getItem('usersList');
let usersListRecuperada = JSON.parse(usersList);
let xd = JSON.parse(localStorage.getItem('xd'));

addEventListener("DOMContentLoaded", function() {


    let logo = document.getElementById('planFoto');
    if(usersListRecuperada[xd].plan === 'premium'){
        logo.src = '/img/VIP.png';
    }
    else{
        logo.src = '/img/Free.png';
        logo.title = 'Mejorar tu plan';

        logo.addEventListener('click', function(){
            window.location.href = 'planes.html'
        })
    }

    // Creamos la cuadricula en el eje Y
    for (let i = 0; i < 50; i++) {
        document.getElementById("mainContainer").innerHTML += `<div class="ejey" id="div${i}"></div>`;
    }

    // Creamos la cuadricula en el eje x
    for (let i = 0; i < 50; i += 2) {
        for (let j = 0; j < 100; j += 2) {
            document.getElementById(`div${i}`).innerHTML += `<div class="ejex gris" id="div${i},${j}" data-tool="gris,nuevo"></div>`;
            document.getElementById(`div${i}`).innerHTML += `<div class="ejex" id="div${i},${j+1}" data-tool="blanco,nuevo" ></div>`;
            document.getElementById(`div${i+1}`).innerHTML += `<div class="ejex" id="div${i+1},${j}" data-tool="blanco,nuevo"></div>`;
            document.getElementById(`div${i+1}`).innerHTML += `<div class="ejex gris" id="div${i+1},${j+1}" data-tool="gris,nuevo"></div>`;
        }
    }

    // Si damos click el cuadro se pinta o un 3x3 se pinta
    document.querySelectorAll('.ejex').forEach(function(div) {
        div.addEventListener('click', function() {
            let divId = this.id;
            let toolValue = borra.getAttribute('data-tool');
            let divPintado = div.getAttribute('data-tool').split[','][0];

            // Está activo el pincel
            if (toolValue === "inactive") {
                if (pincel3x3.checked) {
                    let [x, y] = divId.replace('div', '').split(',').map(Number);
                    for (let i = x - 1; i <= x + 1; i++) {
                        for (let j = y - 1; j <= y + 1; j++) {
                            let divColorear = document.getElementById(`div${i},${j}`);
                            if (divColorear) {
                                divColorear.style.backgroundColor = colorSelect;
                                divColorear.setAttribute('data-tool', divPintado);
                            }
                        }
                    }
                } else {
                    div.style.backgroundColor = colorSelect;
                    div.setAttribute('data-tool', divPintado);
                }
            } else { // Está activo el borrador
                if (pincel3x3.checked) {
                    let [x, y] = divId.replace('div', '').split(',').map(Number);
                    for (let i = x - 1; i <= x + 1; i++) {
                        for (let j = y - 1; j <= y + 1; j++) {
                            let divColorear = document.getElementById(`div${i},${j}`);
                            let divColorearValue = divColorear.getAttribute('data-tool').split[','][0];
                            let toolValueActualizado = divColorearValue + ',nuevo';
                            if (divColorearValue === "gris") {
                                if (divColorear) {
                                    divColorear.style.backgroundColor = "#dcdcdc"; // Light gray
                                    divColorear.setAttribute('data-tool', toolValueActualizado);
                                }
                            }
                            if (divColorearValue === "blanco") {
                                if (divColorear) {
                                    divColorear.style.backgroundColor = "#ffffff"; // White
                                    divColorear.setAttribute('data-tool', toolValueActualizado);
                                }
                            }
                        }
                    }
                } else {
                    let value = div.getAttribute('data-tool').split[','][0];
                    let toolValueActualizado = value+',nuevo'
                    if (value === 'gris') {
                        div.style.backgroundColor = "#dcdcdc"; // Light gray
                        div.setAttribute('data-tool', toolValueActualizado);
                    } else {
                        div.setAttribute('data-tool', toolValueActualizado);
                        div.style.backgroundColor = "#ffffff"; // White
                    }
                }
            }
        });
    });

    // Si movemos el mouse con el click presionado se pinta
    document.querySelectorAll('.ejex').forEach(function(div) {
        div.addEventListener('mouseover', function() {
            hoverDiv = this;
            let divId = this.id;
            let toolValue = borra.getAttribute('data-tool');
            let toolNuevo = div.getAttribute('data-tool').split(',')[0];

            if (toolValue === "inactive") {
                if (clickAtivo) {
                    if (pincel3x3.checked) {
                        let [x, y] = divId.replace('div', '').split(',').map(Number);
                        for (let i = x - 1; i <= x + 1; i++) {
                            for (let j = y - 1; j <= y + 1; j++) {
                                let divColorear = document.getElementById(`div${i},${j}`);
                                divColorear.style.backgroundColor = colorSelect;
                                divColorear.setAttribute('data-tool', toolNuevo);
                            }
                        }
                    } else {
                        div.style.backgroundColor = colorSelect;
                        div.setAttribute('data-tool', toolNuevo);
                    }
                }
            } else {
                if (clickAtivo) {
                    if (pincel3x3.checked) {
                        let [x, y] = divId.replace('div', '').split(',').map(Number);
                        for (let i = x - 1; i <= x + 1; i++) {
                            for (let j = y - 1; j <= y + 1; j++) {
                                let divColorear = document.getElementById(`div${i},${j}`);
                                let divColorearValue = divColorear.getAttribute('data-tool').split[','][0];
                                let toolValueActualizado = divColorearValue + ',nuevo' 
                                if (divColorearValue === "gris") {
                                    if (divColorear) {
                                        divColorear.style.backgroundColor = '#dcdcdc'; // Light gray
                                        divColorear.setAttribute('data-tool', toolValueActualizado);
                                    }
                                } else {
                                    if (divColorear) {
                                        divColorear.style.backgroundColor = '#ffffff'; // White
                                        divColorear.setAttribute('data-tool', toolValueActualizado);
                                    }
                                }
                            }
                        }
                    } else {
                        let value = div.getAttribute('data-tool').split[','][0];
                        let toolValueActualizado = value + ',value';

                        if (value === 'gris') {
                            div.style.backgroundColor = "#dcdcdc"; // Light gray
                            div.setAttribute('data-tool', toolValueActualizado);

                        } else {
                            div.style.backgroundColor = "#ffffff"; // White
                            div.setAttribute('data-tool', toolValueActualizado);
                        }
                    }
                }
            }
        });
    });

    // Borrar todo
    reset.addEventListener("click", function() {
        let divsGrises = document.querySelectorAll('.gris');
        let divsBlancos = document.querySelectorAll('.ejex');

        divsBlancos.forEach(div => {
            div.style.backgroundColor = "#ffffff"; // White
        });

        divsGrises.forEach(div => {
            div.style.backgroundColor = "#dcdcdc"; // Light gray
        });
    });

    console.log(color);
});

// Cuando está pulsado el click izquierdo 
document.addEventListener('mousedown', function(event) {
    if (event.button === 0) {
        clickAtivo = true;
    }
});

// Cuando lo suelto
document.addEventListener('mouseup', function(event) {
    if (event.button === 0) {
        clickAtivo = false;
    }
});

color.addEventListener("input", function() {
    colorSelect = document.getElementById('selectorColor').value;
    console.log(colorSelect);
});

options.forEach(function(option) {
    option.addEventListener('click', function() {
        // Quitamos la clase de todos los elementos
        options.forEach(function(opt) {
            opt.classList.remove('buttonActive');
            if (opt.id === 'borra') {
                opt.setAttribute('data-tool', 'inactive');
            }
        });

        // Agregar la clase al elemento activo
        this.classList.add('buttonActive');

        // Activa el borrador si este es presionado
        if (this.id === "borra") {
            borra.setAttribute('data-tool', 'active');
        }

        console.log(this);
    });
});

document.addEventListener('keydown', function(event) {
    if ((event.key === 'i' || event.key === 'I') && hoverDiv) {
        let divColor = window.getComputedStyle(hoverDiv).backgroundColor;

        // Convertir el color RGB a Hex
        let rgb = divColor.match(/\d+/g);
        let hexColor = "#" + ((1 << 24) + (parseInt(rgb[0]) << 16) + (parseInt(rgb[1]) << 8) + parseInt(rgb[2])).toString(16).slice(1).toUpperCase();
        
        colorSelect = hexColor;
        color.value = colorSelect;
        // Actualizar el cuadrito de color sin recrear el input
        document.getElementById('selectorColor').jscolor.fromString(colorSelect);
    }

    // Atajo para seleccionar el borrador
    if (event.key === 'e' || event.key === 'E') {
        borra.setAttribute('data-tool', 'active');
        document.getElementById('borra').classList.add('buttonActive');
        document.getElementById('pincel').classList.remove('buttonActive');
    }

    // Atajo para seleccionar el pincel
    if (event.key === 'b' || event.key === 'B') {
        borra.setAttribute('data-tool', 'inactive'); 
        document.getElementById('pincel').classList.add('buttonActive');
        document.getElementById('borra').classList.remove('buttonActive');
    }
});

openModal.addEventListener('click', (e)=>{
    e.preventDefault;
    modal.classList.add('modal--show');
})

descargarCoso.addEventListener('click', (e) => {
    e.preventDefault();
    let nombre = document.getElementById('nombre').value;
    let formato = document.getElementById('formato').value;

    let area = document.getElementById('mainContainer');
    modal.classList.remove('modal--show');  

    if (usersListRecuperada[xd].fotos > 0 || usersListRecuperada[xd].plan === 'premium') {

        window.requestAnimationFrame(() => {
            html2canvas(area, {
                scrollX: window.scrollX,
                scrollY: window.scrollY,
                scale: 9 
            }).then(function(canvas) {
                document.querySelectorAll('.ejex').forEach(function(div){
                    let dataTool = div.getAttribute('data-tool');
                    let tool = dataTool && dataTool.split(',')[1]; // Verifica si data-tool existe y luego intenta hacer split
    
                });
    
                const customFileName = nombre + '.' + formato;
                let link = document.createElement('a');
                link.href = canvas.toDataURL('image/png');
                link.download = customFileName;
                link.click();
            });
        });

        usersListRecuperada[xd].fotos -= 1;

        localStorage.setItem('usersList', JSON.stringify(usersListRecuperada));

    }else{

        alert('No puedes descargar más fotos, mejora tu plan.')
    }
});

closeModal.addEventListener('click', (e) => {
    e.preventDefault;
    modal.classList.remove('modal--show');
})

document.getElementById('logout').addEventListener('click', function(){
    window.location.href = '/index.html';
})