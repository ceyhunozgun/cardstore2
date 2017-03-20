<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
 <head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.js"></script>
  <script>
   function convertFormToJSON(form){
	    var array = jQuery(form).serializeArray();
	    var json = {};
	    
	    jQuery.each(array, function() {
	        json[this.name] = this.value || '';
	    });
	    
	    return json;
   }
   function cardCreated(card) {
	   alert("Card created with id " + card.id);
	   $("#myForm")[0].reset();
   }
   function saveCard() {
	   var formData = convertFormToJSON($("#myForm"));
	   $.ajax({
		   type: "POST",
		   url: "cards",
		   data: JSON.stringify(formData),
		   success: function(data){cardCreated(data);},
		   dataType: "json",
		   contentType : "application/json"
		 });
   }
  </script>
 </head>
 <body>
  <form id="myForm" onsubmit="return false;">
   <span>Card Name</span>	<input name="name" /> 		<br/>
   <span>Owner Name</span>  <input name="ownerName" />  <br/>
   <button onclick="saveCard()">Create Card</button>
  </form>
  
  <br/>

  <a href="cards">List Cards as JSON</a>
  
  <br/>
  <br/>
  
  <div>
  	##${appVersion} ${publicIp}##
  </div>
 </body>
</html>
