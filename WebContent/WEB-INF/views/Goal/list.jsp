<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<h1 class="page-title">Liste des objectifs</h1>
	<div class="card-group" data-type="Goal">
		<c:forEach items="${goals}" var="goal">
			<div class="card card-primary text-xs-center z-depth-2 list-item">
				<div class="card-block main-panel-content">
					<p class="white-text">${goal.wording }</p>
					<p class="white-text"></p>
					<span class="buttons-group"> <span class="btn btn-default"
						data-toggle="tooltip" data-placement="bottom" title="Details"><a
							class="glyphicon glyphicon-edit" 
							href="detailsGoal.htm?id=${goal.id }"></a></span> 
					<span class="btn btn-warning" data-toggle="tooltip"
						data-placement="bottom" title="Remove"><a
							class="glyphicon glyphicon-remove" 
							href="deleteGoal.htm?id=${goal.id }"></a></span>
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