var R=document.getElementById("Resultado");

function Propiedades(){
    R.style.borderStyle="solid";
    R.style.textAlign="center";
    R.style.fontFamily="pangolin";
    R.style.fontSize="30px";
}

function obtenervalores(){
    var n1=document.getElementById("numero1").value;
    n1=parseInt(n1,10);
    var n2=document.getElementById("numero2").value;
    n2=parseInt(n2,10);
    return [n1,n2];
}

function Sumar() {
    [n1,n2]=obtenervalores();
    Propiedades();
    R.innerHTML="La suma de los numeros es: " +(n1+n2);
}

function Restar() {
    [n1,n2]=obtenervalores();
    Propiedades();
    R.innerHTML="La resta de los numeros es: " +(n1-n2);
}

function Multiplicacion() {
    [n1,n2]=obtenervalores();
    Propiedades();
    R.innerHTML="La multiplicación de los numeros es: " +(n1*n2);
}

function Division() {
    [n1,n2]=obtenervalores();
    Propiedades();
    if (n2===0)
        d="Error: division por 0";
    else
        d=n1/n2
    R.innerHTML="La división de los numeros es: " +(d);
}

function Potenciacion() {
    [n1,n2]=obtenervalores();
    Propiedades();
    R.innerHTML="La Potencia de los numeros es: " +(Math.pow(n1,n2));
}

function Concatenacion() {
    n1=document.getElementById("numero1").value;
    n2=document.getElementById("numero2").value;
    Propiedades();
    R.innerHTML="La Concatenación de los numeros es: " +(n1+n2);
}

function Instruccion_if() {
    [n1,n2]=obtenervalores();
    Propiedades();
    R.innerHTML="Ejemplo con instrucción if usando sweetalert";
    if (n1>n2){
        swal("mensaje", "n1 es mayor a n2");
    }
    else if(n1==n2){
        swal("mensaje", "n1 es igual a n2", success);
    }
    else {
        swal({
            title: "Mensaje",
            text: "n1 es menor que n2",
            icon: "info",
            button: "Salir",
        });
    }
}

function Intruccion_for() {
    [n1,n2]=obtenervalores();
    Propiedades();
    contador=0;
    for (i=n1;i<=n2;i++){
        contador=contador+1;
    }
    R.innerHTML="La ciclos que realizo el for fueron: "+contador;
}

function Instruccion_switch() {
    [n1,n2]=obtenervalores();
    Propiedades();
    R.innerHTML="Ejemplo con instrucción switch usando sweetalert:";
    switch(n1){
        case 1:
        swal("Mensaje", "n1 tiene un valor de 1", "success");
        break;
        case 2:
        swal("Mensaje", "n1 tiene un valor de 2", "success");
        break;
        default:
        swal({
            title: "Mensaje",
            text: "n1 tiene un valor de 2",
            icon: "info",
            button: "Salir",
        });
        break;
            
    }
}
