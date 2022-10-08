const botaoFipa = document.querySelector('.btnFipa');
const botaoLocalizacao = document.querySelector('.btnLocalizacao');
const botaoWhtasapp = document.querySelector('.btnWhatsapp');
const botaoTwitter = document.querySelector('.btnTwitter');
const botaoFacebook = document.querySelector('.btnFacebook');
const botaoYoutube = document.querySelector('.btnYoutube');
const botaoCalendario = document.querySelector('.btnCalendario');
const botaoInternet = document.querySelector('.btnInternet');
const botaoGmail = document.querySelector('.btnGmail');
const botaoNavegador = document.querySelector('.btnNavegador');
const botaoHome = document.querySelector('.btnHome');
const botaoConfiguracoes = document.querySelector('.btnConfiguracoes');

function Relogio() {
   const data = new Date();
   const hr = data.getHours();
   const mn = data.getMinutes();
   document.getElementById('relogio').innerHTML = hr + ":" + mn;
}

setInterval( Relogio, 500);

botaoFipa.onclick = function () {
   location.href='fipa.html';
 }

botaoLocalizacao.onclick = function () {
   location.href='https://www.google.com.br/maps';
}

botaoWhtasapp.onclick = function () {
   location.href='https://web.whatsapp.com/';
}

botaoTwitter.onclick = function () {
   location.href='https://twitter.com/';
}

botaoFacebook.onclick = function () {
   location.href='https://www.facebook.com/';
}

botaoYoutube.onclick = function () {
   location.href='https://www.youtube.com/';
}

botaoCalendario.onclick = function () {
   location.href='https://www.calendarr.com/brasil/';
}

botaoInternet.onclick = function () {
   location.href='https://www.google.com.br/';
}

botaoNavegador.onclick = function() {
   location.href='https://www.google.com.br/';
}

botaoGmail.onclick = function() {
   location.href='https://www.gmail.com';
}

botaoHome.onclick = function () {
   location.href='index.html';
}
