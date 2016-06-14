<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Détails de l'objectif</div>
		</div>
		<div class="main-panel-content">
			<table class="table table-responsive table-hover">
				<tr>
					<td class="table-field">ID de l'objectif</td>
					<td>${goal.id }</td>
				</tr>
				<tr>
					<td class="table-field">Libellé de l'objectif</td>
					<td>${goal.wording }</td>	
				</tr>
			</table>
		</div>
	</div>
</div>
<jsp:include page="../layout/afterContent.jsp"></jsp:include>