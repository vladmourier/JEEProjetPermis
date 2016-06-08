<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel">
		<div class="main-panel-header">
			<div class="main-panel-title">Créer un indicateur</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="" method="POST">
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Libellé de l'action :</div>
							<div class="form-input">
								<input type="text" name="numaction" />
							</div>
						</div>
						<div class="form-field form-field-right">
							<div class="form-label">Poids de l'indicateur :</div>
							<div class="form-input">
								<input type="number" name="poids" min="0"/>
							</div>
						</div>
					</div>
					<div class="form-submit">
						<input class="button" type="submit" value="Valider" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../layout/afterContent.jsp"></jsp:include>