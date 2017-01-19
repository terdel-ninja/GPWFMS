<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta content="Reset password - GPMS" name="DESCRIPTION">
<meta content="Reset password - GPMS" name="KEYWORDS">
<meta content="@GPMS" name="COPYRIGHT">
<meta content="GENERATOR" name="GENERATOR">
<meta content="Author" name="AUTHOR">
<meta content="DOCUMENT" name="RESOURCE-TYPE">
<meta content="GLOBAL" name="DISTRIBUTION">
<meta content="INDEX, FOLLOW" name="ROBOTS">
<meta content="1 DAYS" name="REVISIT-AFTER">
<meta content="GENERAL" name="RATING">
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
<!-- Mimic Internet Explorer 7 -->
<meta content="IE=EmulateIE7" http-equiv="X-UA-Compatible">
<meta content="RevealTrans(Duration=0,Transition=1)"
	http-equiv="PAGE-ENTER">
<link type="icon shortcut" media="icon" href="favicon.ico">
<!--[if IE 9]>
        <link rel="stylesheet" href="css/ie9.css" type="text/css" media="screen"/><![endif]-->
<!--[if lt IE 9]>
        <link rel="stylesheet" href="css/IE.css" type="text/css" media="screen"/><![endif]-->
<!--[if lt IE 7]>
        <script type="text/javascript" src="js/core/IE8.js"></script>
    <![endif]-->
<title>Audit Log</title>

<script src="js/jQuery/jquery-1.11.3.min.js" type="text/javascript"></script>


<script type="text/javascript">
	//<![CDATA[
	var gpmsAppPath = "";
	
	var userProfileId = '<%=session.getAttribute("userProfileId")%>';
	var gpmsUserName = '<%=session.getAttribute("gpmsUserName")%>';
	var isAdmin = '<%=session.getAttribute("isAdmin")%>';
	var userPositionType = '<%=session.getAttribute("userPositionType")%>';
	var	userPositionTitle = '<%=session.getAttribute("userPositionTitle")%>';
	var userDepartment = '<%=session.getAttribute("userDepartment")%>';
	var userCollege = '<%=session.getAttribute("userCollege")%>';

	var gpmsServicePath = "REST/";
	var gpmsRootPath = "http://localhost:8181/GPMS/";

	//]]>
</script>

<script type="text/javascript" src="js/core/gpmscore.js"></script>


<script type="text/javascript" src="js/core/json2.js"></script>

<script type="text/javascript" src="js/jquery-browser.js"></script>
<script type="text/javascript" src="js/jquery.uniform.js"></script>

<script type="text/javascript" src="js/MessageBox/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/MessageBox/alertbox.js"></script>

<link type="text/css" rel="stylesheet" href="css/MessageBox/style.css" />

<link media="screen" rel="stylesheet"
	href="css/Templates/application.css" type="text/css" />

</head>
<body class="account">
	<div style="display: none;" id="UpdateProgress1">
		<div class="sfLoadingbg">&nbsp;</div>
		<div class="sfLoadingdiv">
			<img id="imgProgress" src="./images/ajax-loader.gif"
				style="border-width: 0px;" alt="Loading..." title="Loading..." /> <br>
			<span id="lblPrgress">Please wait...</span>
		</div>
	</div>
	<noscript>
		<span>This page requires java-script to be enabled. Please
			adjust your browser-settings.</span>
	</noscript>

	<div class="account__header">
		<a href="#"><img alt="GPMS" title="GPMS" class="account__logo"
			src="images/logo.png"> </a>
		<nav class="account__nav"> New to GPMS? <a href="SignUp.jsp"
			class="a">Sign Up</a> </nav>
	</div>
	<div class="account__title">
		<h1 class="account__headline h h--1">Audit logs</h1>

	</div>
	<div class="row">
		<div
			class="row__col row__col--xl-6 row__col--l-7 row__col--m-8 row__col--xl-centered row__col--l-centered row__col--m-centered">
			<div class="account__box box">
				<div id="flash"></div>
				<form accept-charset="UTF-8" action="REST/users/auditLog" method="post">
												<div id="divUserAuditGrid">
															<div class="cssClassCommonBox Curve">
																<div class="sfGridwrapper">
																	<div class="sfGridWrapperContent">
																		<div class="sfFormwrapper sfTableOption">
																			<table width="100%" cellspacing="0" cellpadding="0"
																				border="0">
																				<tbody>
																					<tr>
																						<td><label class="cssClassLabel">
																								Action:</label> <input title="Action" type="text"
																							class="sfInputbox" id="txtSearchAction"
																							placeholder="Action"  name="action"/></td>
																						<td><label class="cssClassLabel"> </label>
																							<button title="Search Audit Log" class="sfBtn"
																								 type="button">
																								<span class="icon-search">Search</span>
																							</button></td>
																					</tr>
																				</tbody>
																			</table>
																		</div>
																		
																		<div class="log"></div>
																		<table id="gdvUsersAuditLog" cellspacing="0"
																			cellpadding="0" border="0" width="100%"></table>
																	</div>
																</div>
															</div>
														</div>
				</form>

			</div>
			<div class="account__meta">
				<a href="Login.jsp" class="a">Log in</a> <span>|</span> <a
					href="ResendConfirmation.jsp" class="a">Resend confirmation</a> <span>
			</div>
		</div>
	</div>

</body>
</html>