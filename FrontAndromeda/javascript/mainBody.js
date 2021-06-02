/*Listas las canciones en una unordered list*/ 

function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      var datos = JSON.parse(this.responseText);

      var lista = document.createElement("ul"); //creamos el elemento lista 
      lista.setAttribute("id", "listaRepro");//le atribuimos una id para poder acceder en el css después
     
      for (let index = 0; index < datos.length; index++) {

        var cancion = document.createElement("li"); //creamos el item cancion dentro de la lista
        cancion.setAttribute("id","elementosLista") //id para el css.

        var text = datos[index].cancion;
        var tituloCancion = document.createElement("p"); //p para el titulo
        var titulo = document.createTextNode(text);
        tituloCancion.setAttribute("id", "ides");
        tituloCancion.appendChild(titulo);

        /*Se crea un elemento hidden p en el cual se
         le asigna el valor de la id de la cancion a la 
         que el boton pertenece*/ 
        var attHidden = document.createElement("p");
        attHidden.setAttribute("hidden", "true");
        attHidden.setAttribute("id", "idCancion");
        var idCancion = datos[index].id_cancion;
        var idC = document.createTextNode(idCancion);

        var reproductor = document.createElement("audio"); //creamos el tag audio

        reproductor.setAttribute("controls", "true");//Le añadimos el atributo que le permitira tener controles para la cancion

        var url = datos[index].url; //url de las canciones

        var source = document.createElement("source");
        source.setAttribute("src", url); //añadir url problema undef
        source.setAttribute("type", "audio/mpeg");
        source.setAttribute("id", "reproductor");

        //BOTÓN que aparecerá al lado de cada cancion 
        //ejecutando una funcion que lo añade a la lista
        var boton = document.createElement("button");
        boton.setAttribute("onClick", "anadirLista()");
        
        //Añado al boton una clase para luego acceder a ella desde la funcion añadirLista();
        boton.setAttribute("class", "myBtn");
        var logo = document.createElement("img");
        logo.setAttribute("src", "img/signo-de-mas.png");

        //ADJUNTAR ATRIBUTOS (APPEND CHILD'S)

        var cuerpoDiv = document.getElementById("listado");
        cuerpoDiv.appendChild(lista);
        lista.appendChild(cancion);
        cancion.appendChild(tituloCancion);      
        cancion.appendChild(boton);
        boton.appendChild(logo);
        cancion.appendChild(reproductor);
        reproductor.appendChild(source);
        attHidden.appendChild(idC);
        boton.appendChild(attHidden);
      }
    }
  }
  xhttp.open("GET", "http://localhost:8080/api/canciones", true);
  xhttp.send();
}
