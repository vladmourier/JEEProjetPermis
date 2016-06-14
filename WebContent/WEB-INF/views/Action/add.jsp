<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<c:set var="isEdit" value="${MyAction != null}" />
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Créer une action</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="addValidateAction.htm" method="POST">
					<c:if test="${isEdit }">
						<input type="hidden" name="id" value="${MyAction.id }">
					</c:if>
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Libellé de l'action :</div>
							<div class="form-input">
								<c:if test="${isEdit}">
									<c:set var="wording" value="${MyAction.wording }" />
								</c:if>
								<input type="text" name="wording" value="${wording }" />
							</div>
						</div>
						<div class="form-field form-field-right">
							<div class="form-label">Score minimum :</div>
							<div class="form-input">
								<c:if test="${isEdit}">
									<c:set var="scoreminimum" value="${MyAction.scoreMinimum }" />
								</c:if>
								<input type="number" name="scoreminimum" min="0"
									value="${scoreminimum }" />
							</div>
						</div>
					</div>
					<div class="form-row">
						<div class="form-field form-field-left">
							<div class="form-label">Action suivante :</div>
							<c:if test="${isEdit}">
								<c:set var="fk_action" value="${MyAction.action.id }" />
							</c:if>
							<SELECT class="form-input" name="fk_action">
								<option value="-1">Aucune</option>
								<c:forEach items="${actions}" var="action">
									<option value="${action.id }"
										<c:if test="${fk_action == action.id}"> selected</c:if>>${action.wording}</option>
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