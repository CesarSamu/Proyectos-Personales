let loginForm = document.querySelector(".my-form");

loginForm.addEventListener("submit", (e) => {
    e.preventDefault();
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let userExist = false;

    let usersList = localStorage.getItem('usersList');
    let usersListRecuperada = JSON.parse(usersList);

    

    for (let i = 0; i < usersListRecuperada.length; i++) {
        if(email === usersListRecuperada[i].email || password === usersListRecuperada[i].password){
            userExist = true;
            break;
        }
    }
    
    if (!userExist) {
        let newUser = {email: email, password: password, plan: 'gratis', fotos: 1};
        usersListRecuperada.push(newUser);

        // Guarda la lista actualizada en localStorage
        localStorage.setItem('usersList', JSON.stringify(usersListRecuperada));

        localStorage.setItem('xd', usersListRecuperada.length + 1);

        window.location.href = '/juego.html';
    } else {
        alert('Datos incorrectos o usuario ya existente');
    }

});