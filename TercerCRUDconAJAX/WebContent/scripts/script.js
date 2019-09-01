let xhr = new XMLHttpRequest();

window.onload = function (){
	var miBoton = document.querySelector("#btnMuestraMensaje");
	miBoton.onclick = enviarPeticionAsincronaAjax;
	
	var btnSuma = document.querySelector("#btnSuma");
	btnSuma.onclick = enviarPeticionSuma;
}

function enviarPeticionAsincronaAjax(){
	
	var miMensaje = document.querySelector("#txtMensajeFrontEnd");
	console.log(miMensaje);
	xhr.open("GET","MostrarMensajeServlet?txtMensajeAjax=" + miMensaje.value);
	xhr.onload = funcionCallBack;
	xhr.send(null);
}

function funcionCallBack(){
	if(xhr.status == 200){
		document.querySelector("#resultadoAjax").innerHTML += xhr.responseText;
	}
}

function enviarPeticionSuma(){
	var num1 = document.querySelector("#txtNum1");
	var num2 = document.querySelector("#txtNum2");
	
	xhr.open("GET","SumaNumerosServlet?txtNum1Servlet=" + num1.value + "&txtNum2Servlet="+num2.value);
	xhr.onload = funcionCallBack2;
	xhr.send(null);
}

function funcionCallBack2(){
	if(xhr.status == 200){
		document.querySelector("#sumResultado").innerHTML = xhr.responseText;
	}
}