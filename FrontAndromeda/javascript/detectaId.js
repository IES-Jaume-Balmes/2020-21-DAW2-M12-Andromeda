/*Funcion que detecta la id de la opcion de una select box*/ 
function detectaId(sel) {
   return(sel.options[sel.selectedIndex].value);
  }

  function detectaText(sel) {
    return(sel.options[sel.selectedIndex].text);
   }