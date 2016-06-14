<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Créer une action</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="addValidateAction.htm" method="POST">
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Libellé de l'action :</div>
							<div class="form-input">
								<input type="text" name="wording" />
							</div>
						</div>
						<div class="form-field form-field-right">
							<div class="form-label">Score minimum :</div>
							<div class="form-input">
								<input type="number" name="scoreminimum" min="0" />
							</div>
						</div>
					</div>
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Action suivante :</div>
							<SELECT class="form-input" name="fk_action">
								<c:forEach items="${actions}" var="action">
	        						<option value=${action.id}>${action.wording}</option>
	        					</c:forEach>
        					</SELECT>
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