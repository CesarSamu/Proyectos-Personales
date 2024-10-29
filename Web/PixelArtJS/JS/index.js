let loginForm = document.querySelector(".my-form");

document.addEventListener('DOMContentLoaded', function(){
    let usersList = localStorage.getItem('usersList');

    if (!usersList) {
        let firstUser = [
            {email: 'admin@gmail.com', password: 'admin', plan: 'premium'}
        ]

        localStorage.setItem('usersList', JSON.stringify(firstUser));
    }
});

loginForm.addEventListener("submit", (e) => {
    e.preventDefault();
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let userExist = false;

    let usersList = localStorage.getItem('usersList');
    let usersListRecuperada = JSON.parse(usersList);

    for (let i = 0; i < usersListRecuperada.length; i++) {
        if(email === usersListRecuperada[i].email && password === usersListRecuperada[i].password){
            userExist = true;
            localStorage.setItem('xd', i);
        }
    }
    if (userExist) {
        window.location.href = '/juego.html';
    }
    else{
        alert('Datos incorrectos');
    }
});