<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Détails du Jeu</div>
		</div>
		<div class="main-panel-content">
			<table class="table table-responsive table-hover">
				<tr>
					<td class="table-field">ID du jeu</td>
					<td>${game.id }</td>
				</tr>
				<tr>
					<td class="table-field">Libellé du jeu</td>
					<td>${game.wording }</td>	
				</tr>
			</table>
		</div>
	</div>
</div>
<jsp:include page="../layout/afterContent.jsp"></jsp:include>