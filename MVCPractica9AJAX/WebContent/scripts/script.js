let xhr = new XMLHttpRequest();

window.onload = function(){
	var miBoton = document.querySelector("#btnPotencia");
	miBoton.onclick = funcionRequest;
}

function funcionRequest(){
	
	xhr.open("POST","CalculaPotenciaServlet");
	
	var miFormulario = new FormData();
	var miBase = document.getElementById("txtBase").value;
	var miExponente = document.getElementById("txtExponente").value;
	
	miFormulario.append("txtBase",miBase);
	miFormulario.append("txtExponente",miExponente);
	
	xhr.onload = funcionCallBack;
	xhr.send(miFormulario);
}

function funcionCallBack(){
	if(xhr.status == 200){
		document.querySelector("#resultadoPotencia").innerHTML = xhr.responseText;
	}
}