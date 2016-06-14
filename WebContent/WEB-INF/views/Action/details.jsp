<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Détails de l'action</div>
		</div>
		<div class="main-panel-content">
			<table class="table table-responsive table-hover">
				<tr>
					<td class="table-field">ID de l'action</td>
					<td>${action.id }</td>
				</tr>
				<tr>
					<td class="table-field">Libellé de l'action</td>
					<td>${action.wording }</td>	
				</tr>
				<tr>
					<td class="table-field">Score minimum</td>
					
					<td>${action.scoreMinimum }</td>
				</tr>
				<tr>
					<td class="table-field" >Action suivante </td>
					<td><a href="detailsAction.htm?id=${nextAction.id}">${nextAction.wording}</a></td>
				</tr>
			</table>
		</div>
	</div>
</div>
<jsp:include page="../layout/afterContent.jsp"></jsp:include>