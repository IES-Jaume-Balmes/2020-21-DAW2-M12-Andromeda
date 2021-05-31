
function cargarListas() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      let datos = JSON.parse(this.responseText);
     var divDelLado= document.getElementById("sidebar");
      var listarListas = document.createElement("ul");
      for (let index = 0; index <= datos.length; index++) {
        var content = datos[index].nombre_Lista;
        var contenido = document.createTextNode(content);
        console.log(content);
       
       
        var listado = document.createElement("li");


        /*Appen Child's*/
        divDelLado.appendChild(listarListas);
        listarListas.appendChild(listado);
        listado.appendChild(contenido);

      }
    }
  };
  xhttp.open("GET", "http://localhost:8080/lista/mostrar", true);
  xhttp.send();

}