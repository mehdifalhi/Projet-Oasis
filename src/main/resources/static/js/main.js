/**
 * 
 */

$(document).ready(function(){
	
	$('.table .eBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		
		$.get(href,function(commande,status){
			$('.myForm #id').val(commande.id);
			$('.myForm #nameCommande').val(commande.nameCommande);
			$('.myForm #prixCommande').val(commande.prixCommande);
			$('.myForm #designation').val(commande.designation);
			
		});
		
		$('.myForm #exampleModal').modal();
	});
});
