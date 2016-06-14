<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Cr�er un Objectif</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="addValidateGoal.htm" method="POST">
					<div class="form-row">
						<div class="form-field">
							<div class="form-label">Libell� de l'objectif :</div>
							<div class="form-input">
								<input type="text" name="wording" />
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