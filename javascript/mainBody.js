function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      var datos = JSON.parse(this.responseText);
      var lista = document.createElement("ul"); //creamos el elemento lista 
      lista.setAttribute("id", "listaRepro");//le atribuimos una id para poder acceder en el css después
      var contadorCancion = 0;
      for (let index = 0; index < datos.length; index++) {
        // console.log(datos[index].cancion);


        var cancion = document.createElement("li"); //creamos el item cancion dentro de la lista

        var text = datos[index].cancion;
        var tituloCancion = document.createElement("p"); //p para el titulo
        var titulo = document.createTextNode(text);
        tituloCancion.setAttribute("id","ides");
        tituloCancion.appendChild(titulo);

        var attHidden = document.createElement("p");
        attHidden.setAttribute("hidden","true");
        attHidden.setAttribute("id","idCancion");
        var idCancion=datos[index].id_cancion;
        var idC= document.createTextNode(idCancion);

       
        


        var reproductor = document.createElement("audio"); //creamos el tag audio

        reproductor.setAttribute("controls", "true");//Le añadimos el atributo que le permitira tener controles para la cancion

        var url = datos[index].url;

        var source = document.createElement("source");
        source.setAttribute("src", url); //añadir url problema undef
        source.setAttribute("type", "audio/mpeg");
        source.setAttribute("id", "reproductor");

        //var imgAñadir = document.createElement()

        //var vinculo = document.createElement("a");
        var boton = document.createElement("button");
        boton.setAttribute("onClick", "anadirLista()");   //BOTÓN
        boton.setAttribute("class", "myBtn");
        var logo=document.createElement("img");
        logo.setAttribute("src","img/signo-de-mas.png");


        //ADJUNTAR ATRIBUTOS (APPEND CHILD'S)

        var cuerpoDiv = document.getElementById("listado");

        cuerpoDiv.appendChild(lista);//
        lista.appendChild(cancion);//ul

        cancion.appendChild(tituloCancion);//p
       // vinculo.appendChild(boton);
        cancion.appendChild(boton);
        boton.appendChild(logo);
        cancion.appendChild(reproductor);
        reproductor.appendChild(source);

       // cancion.appendChild(vinculo);
         //Append Child's
        attHidden.appendChild(idC);

       boton.appendChild(attHidden);
        

      }
    }
  }
  xhttp.open("GET", "http://localhost:8080/api/canciones", true);
  xhttp.send();
}
  

