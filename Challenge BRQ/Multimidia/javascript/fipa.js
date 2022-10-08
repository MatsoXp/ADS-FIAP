const botaoFipa = document.querySelector('.btConfig');
const botaoGmail = document.querySelector('.btnGmail');
const botaoNavegador = document.querySelector('.btnNavegador');
const botaoHome = document.querySelector('.btnHome');
const botaoConfiguracoes = document.querySelector('.btnConfiguracoes');

function Relogio() {
	const data = new Date();
	const hr = data.getHours().toString().padStart(2, '0');
	const mn = data.getMinutes().toString().padStart(2, '0');
	document.getElementById('relogio').innerHTML = hr + ':' + mn;
}

setInterval(Relogio, 500);

botaoNavegador.onclick = function () {
	location.href = 'https://www.google.com.br/';
};

botaoGmail.onclick = function () {
	location.href = 'https://www.gmail.com';
};

botaoHome.onclick = function () {
	location.href = 'index.html';
};

function abrirMenu() {
	let menuMobile = document.querySelector('.menu');
	if (menuMobile.classList.contains('open')) {
		menuMobile.classList.remove('open');
	} else {
		menuMobile.classList.add('open');
	}
}
