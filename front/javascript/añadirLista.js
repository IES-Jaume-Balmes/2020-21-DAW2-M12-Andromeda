var otraId;

function anadirLista() {
  
    // Get the modal
    var modal = document.getElementById("myModal");
  
    // Get the button that opens the modal
    var btn = document.getElementsByClassName("myBtn");
 
  
    // Get the <span> element that closes the modal
    var span = document.getElementsByClassName("close")[0];
  
    // When the user clicks the button, open the modal 
    for (let index = 0; index < btn.length; index++) {
    btn[index].onclick = function () {
      var id=this.children[1];
      var form = document.getElementById("formulario");
      var idCan = document.createElement("input");
      idCan.setAttribute("hidden",true);
      idCan.setAttribute("value",id.textContent);
      form.appendChild(idCan);

         //console.log(this.children[1]);  
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
  
  ///////////////valores////////////////////////////////////////////
  
  
  
  
  
   /////////////////////////////////////////////////////////////////
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

    function obtenId(){

        var idCancion = document.createElement("input");
            idCancion.setAttribute("hidden",true);

           var ids = document.getElementById("lista");
           ids.addEventListener('change',detectaId);
            
            var resultado = ids;
            idCancion.setAttribute("value",resultado.value);

            var inputSubmit = document.createElement("input");
            inputSubmit.setAttribute("type","submit");
            

            var form = document.getElementById("formulario");
            form.appendChild(idCancion);
           

          
           

            
    }

    function creaForm(){
      var form = document.getElementById("formulario");
     
      
      var inputSubmit = document.createElement("input");
      inputSubmit.setAttribute("type","submit");
       form.appendChild(inputSubmit);
    }