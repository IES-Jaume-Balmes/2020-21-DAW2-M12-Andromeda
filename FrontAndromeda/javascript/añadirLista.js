//var otraId; creo que borrar

function anadirLista() {
  
    // Get the modal
    var modal = document.getElementById("myModal");
  
    // Get the button that opens the modal
    var btn = document.getElementsByClassName("myBtn");
 
    // Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];
  
    // When the user clicks the button, open the modal 
    //También asigna al formulario de envio de datos la id de la cancion en un input
    
    for (let index = 0; index < btn.length; index++) {
    btn[index].onclick = function () {
      var id=this.children[1];
      
      var form = document.getElementById("formulario");/*obtenemos el formulario*/ 
      var idCan = document.createElement("input");
      idCan.setAttribute("hidden",true);
     
      var transf = document.createTextNode(id.textContent);/*le hacemos append child al formulario 
                                                           con el input y el valor deseado*/ 
      idCan.appendChild(transf);
      form.appendChild(idCan);
          
        modal.style.display = "block";
      } 
    }

    // When the user clicks on <span> (x), close the modal
    span.onclick = function () {
      modal.style.display = "none";
    }
    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function (event) {
      if (event.target == modal) {
        modal.style.display = "none";
      }
  
    }
  /*Este ajax crea una select box cargando en sus options las listas existentes
  para así selecionarlas y mandarlas al form de envio de datos*/ 
      var xhttp = new XMLHttpRequest();
      xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
          var datos = JSON.parse(this.responseText);
  
          var select = document.getElementById("lista");
  
          for (let index = 0; index < datos.length; index++) {
                    
            var option = document.createElement("option");
            var va=datos[index].nombre_Lista;
            var valor = datos[index].id_lista;
            option.setAttribute("value",valor);

            var text = document.createTextNode(va);
          
            /*Append Child's*/
            select.appendChild(option);
            option.appendChild(text);  
          }   
        }
      }
      xhttp.open("GET", "http://localhost:8080/lista/mostrar", true);
      xhttp.send();

      creaForm();
    }
/*Obtiene la id de la  opcion seleccionada en un select box de listas*/ 
    function obtenId(){

        var idCancion = document.createElement("input");
            idCancion.setAttribute("hidden",true);

           var ids = document.getElementById("lista");
           ids.addEventListener('change',detectaId);
            
            var resultado = ids;
           
           var transf = document.createTextNode(resultado.value); 

          idCancion.appendChild(transf);

           
            
            var form = document.getElementById("formulario");
            form.appendChild(idCancion);
            
    }

    /*Añade un boton de envio al formulario de datos*/ 
    function creaForm(){
      var form = document.getElementById("formulario");

      var inputSubmit = document.createElement("input");
      inputSubmit.setAttribute("type","submit");
       form.appendChild(inputSubmit);
    }