const formulario = document.querySelector("form");
const botao=document.querySelector("button");
const Iname = document.querySelector(".name");
const Iemail = document.querySelector(".email");
const Ipassword = document.querySelector(".password");
const Inumber = document.querySelector(".number");

function cadastra (){

    fetch("http://localhost:8080/usuarios",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            name: Iname.value,
            email: Iemail.value,
            password: Ipassword.value,
            number: Inumber.value
        })
    })
    .then(function (res) { console.log(res)})
    .catch(function (res) { console.log(res)})
};

function limpar(){
    Iname.value = "";
    Iemail.value = "";
    Ipassword.value = "";
    Inumber.value = "";
};

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastra();
    limpar();
});