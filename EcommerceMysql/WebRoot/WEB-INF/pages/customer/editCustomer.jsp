<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.customer-resources"/>
<html>
<head>
<title>Edit <fmt:message key="customer.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="customer.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCustomer"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveCustomer" method="POST" modelAttribute="customer">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="customer_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${customer.id}
						&nbsp;
									<form:hidden id="customer_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.firstname.title"/>:
						</td>
						<td>
							<form:input id="customer_firstName" path="firstName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_firstName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.firstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.lastname.title"/>:
						</td>
						<td>
							<form:input id="customer_lastName" path="lastName" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_lastName",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.lastname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.street.title"/>:
						</td>
						<td>
							<form:input id="customer_street" path="street" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_street",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.street.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.city.title"/>:
						</td>
						<td>
							<form:input id="customer_city" path="city" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_city",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.city.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.state.title"/>:
						</td>
						<td>
							<form:input id="customer_state" path="state" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_state",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.state.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.zip.title"/>:
						</td>
						<td>
							<form:input id="customer_zip" path="zip" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_zip",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.zip.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>