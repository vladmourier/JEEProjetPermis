<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<h1 class="page-title">Liste des jeux</h1>
	<div class="card-group" data-type="Game">
		<c:forEach items="${games}" var="game">
			<div class="card card-primary text-xs-center z-depth-2 list-item">
				<div class="card-block main-panel-content">
					<p class="white-text">${game.wording }</p>
					<p class="white-text"></p>
					<span class="buttons-group"> <span class="btn btn-default"
						data-toggle="tooltip" data-placement="bottom" title="Details"><a
							class="glyphicon glyphicon-edit" 
							href="detailsGame.htm?id=${game.id }"></a></span> 
					<span class="btn btn-warning" data-toggle="tooltip"
						data-placement="bottom" title="Remove"><a
							class="glyphicon glyphicon-remove" 
							href="deleteGame.htm?id=${game.id }"></a></span>
					</span>
				</div>
		</div>
		</c:forEach>
		<div
			class="card btn-success BG4285F4 card-create-item text-xs-center z-depth-2 list-item">
			<div class="">
				<span class="glyphicon glyphicon-plus"></span>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../layout/afterContent.jsp"></jsp:include>