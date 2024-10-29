let usersList = localStorage.getItem('usersList');
let usersListRecuperada = JSON.parse(usersList);
let logo = document.getElementById('planFoto');
let xd = JSON.parse(localStorage.getItem('xd'));

document.querySelectorAll('.comprar').forEach(function(btn){

    btn.addEventListener('click', function(){
        usersListRecuperada[xd].plan = 'premium';

        localStorage.setItem('usersList', JSON.stringify(usersListRecuperada));

        window.location.href = '/juego.html';
    });

});

addEventListener("DOMContentLoaded", function() {
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
})

document.getElementById('logout').addEventListener('click', function(){
    window.location.href = '/index.html';
})