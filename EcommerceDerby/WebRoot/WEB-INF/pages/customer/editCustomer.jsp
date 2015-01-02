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
							<fmt:message key="customer.customernumber.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="customer_customernumber" path="customernumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_customernumber",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.customernumber.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${customer.customernumber}
						&nbsp;
									<form:hidden id="customer_customernumber" path="customernumber"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.customername.title"/>:
						</td>
						<td>
							<form:input id="customer_customername" path="customername" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_customername",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.customername.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.contactlastname.title"/>:
						</td>
						<td>
							<form:input id="customer_contactlastname" path="contactlastname" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_contactlastname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.contactlastname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.contactfirstname.title"/>:
						</td>
						<td>
							<form:input id="customer_contactfirstname" path="contactfirstname" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_contactfirstname",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.contactfirstname.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.phone.title"/>:
						</td>
						<td>
							<form:input id="customer_phone" path="phone" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_phone",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.phone.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.addressline1.title"/>:
						</td>
						<td>
							<form:input id="customer_addressline1" path="addressline1" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_addressline1",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.addressline1.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.addressline2.title"/>:
						</td>
						<td>
							<form:input id="customer_addressline2" path="addressline2" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_addressline2",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.addressline2.help"/>"}})); </script>
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
							<fmt:message key="customer.postalcode.title"/>:
						</td>
						<td>
							<form:input id="customer_postalcode" path="postalcode" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_postalcode",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.postalcode.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.country.title"/>:
						</td>
						<td>
							<form:input id="customer_country" path="country" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_country",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.country.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.salesrepemployeenumber.title"/>:
						</td>
						<td>
							<form:input id="customer_salesrepemployeenumber" path="salesrepemployeenumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_salesrepemployeenumber",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.salesrepemployeenumber.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.creditlimit.title"/>:
						</td>
						<td>
							<form:input id="customer_creditlimit" path="creditlimit" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "customer_creditlimit",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="customer.creditlimit.help"/>"}})); </script>
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