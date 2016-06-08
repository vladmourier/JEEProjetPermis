<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel">
		<div class="main-panel-header">
			<div class="main-panel-title">Créer une action</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="" method="POST">
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Libellé de l'action :</div>
							<div class="form-input">
								<input type="text" name="libaction" />
							</div>
						</div>
						<div class="form-field form-field-right">
							<div class="form-label">Score minimum :</div>
							<div class="form-input">
								<input type="number" name="scoremin" min="0" />
							</div>
						</div>
					</div>
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Action suivante :</div>
							<div class="form-input">
								<input type="text" name="libaction" />
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