<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<nav class="navbar navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand waves-effect waves-light" href="#"><img class="h1em Dblock" src="resources/img/logo.png"/></a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
            <ul class="nav navbar-nav">
                <li class="active"><a href="listAction.htm" class="waves-effect waves-light">Actions<span class="sr-only">(current)</span></a></li>
                <li><a href="listLearner.htm" class="waves-effect waves-light">Apprenants</a></li>
                <li><a href="listGame.htm" class="waves-effect waves-light">Jeux</a></li>
                <li><a href="listGoals.htm" class="waves-effect waves-light">Objectifs</a></li>
                <li><a href="listIndicator.htm" class="waves-effect waves-light">Indicateurs</a></li>
                <li><a href="listMission.htm" class="waves-effect waves-light">Missions</a></li>
            </ul>
            <form class="navbar-form navbar-right" role="search">
                <div class="form-group waves-effect waves-light">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
            </form>
        </div>
    </div>
</nav>