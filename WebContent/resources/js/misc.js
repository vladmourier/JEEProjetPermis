$(document).ready(function (){listenToClick()});

$(function () {
  $('[data-toggle="tooltip"]').tooltip();
})

function listenToClick(){
$(".card-create-item").click(getForm);
}

function getForm(){
	var type = $(".card-group").attr("data-type");
	$.ajax({
		url: 'add'+ type +'.htm',
		type: 'GET',
		success: function (content, status){
			var res = $(content).find(".main-panel");
			displayContent(res);
		},
		error: function(res, status, error){
			alert(res + "\n" + status + "\n" + error)
		}
			
	})
}

function displayContent(HTMLcontent){
	$(HTMLcontent).find(".main-panel-title").append(
			$("<span style=\"float:right\"><a class=\"delete glyphicon glyphicon-remove btn btn-danger\"></a></span>")
			);
	
	var button = $(".card-create-item");
	$(".card-create-item").remove();
	$(".card-group").append($(HTMLcontent).fadeIn());
	$(".card-group").append(button);
	listenToClick();
	$(".delete").click(function (){
		$(HTMLcontent).fadeOut("slow");
	})
}