<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Ajouter un apprenant</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="" method="POST">
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Nom de l'apprenant :</div>
							<div class="form-input">
								<input type="text" name="nomapprenant" />
							</div>
						</div>
						<div class="form-field form-field-right">
							<div class="form-label">Prénom de l'apprenant:</div>
							<div class="form-input">
								<input type="text" name="prenomapprenant" />
							</div>
						</div>
					</div>
					<div class="form-submit">
						<input class="btn btn-primary" type="submit" value="Valider" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../layout/afterContent.jsp"></jsp:include>