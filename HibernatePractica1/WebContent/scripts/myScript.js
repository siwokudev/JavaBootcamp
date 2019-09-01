window.onload = function(){
    let miCadena = '{"alumno1":{"nombre":"Adan","apellido":"Coladera"},"alumno2":{"nombre":"Axel","apellido":"Unzon"}}';

    console.log(miCadena);
    alert(miCadena);

    let misAlumnos = JSON.parse(miCadena);
    console.log(misAlumnos["alumno1"]);
    alert(misAlumnos);
    
    let miCadena2 = JSON.stringify(misAlumnos);
    console.log(miCadena2);
    alert(miCadena2);
    
    //revisar el foreach de misAlumnos
}