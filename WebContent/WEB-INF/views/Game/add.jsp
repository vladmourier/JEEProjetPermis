<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel">
		<div class="main-panel-header">
			<div class="main-panel-title">Créer un jeu</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="" method="POST">
					<div class="form-row">
						<div class="form-field">
							<div class="form-label">Libellé du jeu :</div>
							<div class="form-input">
								<input type="text" name="libjeu" />
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