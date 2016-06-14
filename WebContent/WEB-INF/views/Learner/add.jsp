<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../layout/beforeContent.jsp"></jsp:include>
<div class="container">
	<c:set var="isEdit" value="${MyLearner != null}" />
	<div class="main-panel card">
		<div class="main-panel-header">
			<div class="main-panel-title">Ajouter un apprenant</div>
		</div>
		<div class="main-panel-content">
			<div class="form">
				<form action="" method="POST">
					<c:if test="${isEdit }">
						<input type="hidden" name="id" value="${MyLearner.id }">
					</c:if>
					<div class="form-row">
						<div class="form-field form-field-left">
							<c:if test="${isEdit}">
								<c:set var="surname" value="${MyLearner.surname}" />
							</c:if>
							<div class="form-label">Nom de l'apprenant :</div>
							<div class="form-input">
								<input type="text" name="surname" value="${surname }" />
							</div>
						</div>
						<div class="form-field form-field-right">
							<c:if test="${isEdit}">
								<c:set var="forname" value="${MyLearner.forname}" />
							</c:if>
							<div class="form-label">Prénom de l'apprenant:</div>
							<div class="form-input">
								<input type="text" name="forname" value="${forname }" />
							</div>
						</div>
					</div>
					<div class="form-row">
						<div class="form-field form-field-left">
							<c:if test="${isEdit}">
								<c:set var="email" value="${MyLearner.email}" />
							</c:if>
							<div class="form-label">Adresse mail de l'apprenant :</div>
							<div class="form-input">
								<input type="text" name="email" value="${email }" />
							</div>
						</div>
						<div class="form-field form-field-right">
							<c:if test="${isEdit}">
								<c:set var="mdp" value="${MyLearner.mdp}" />
							</c:if>
							<div class="form-label">Mot de passe de l'apprenant:</div>
							<div class="form-input">
								<input type="text" name="forname" value="${mdp }" />
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