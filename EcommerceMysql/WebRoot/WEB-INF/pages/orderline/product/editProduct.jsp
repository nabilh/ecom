<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orderline-resources"/>
<html>
<head>
<title>Edit <fmt:message key="orderline.title"/> <fmt:message key="product.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="product.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectOrderLine?idKey=${orderline_id}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveOrderLineProduct" method="POST" modelAttribute="product">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.id.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="product_id" path="id" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="product.id.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${product.id}
						&nbsp;
									<form:hidden id="product_id" path="id"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.partnumber.title"/>:
						</td>
						<td>
							<form:input id="product_partNumber" path="partNumber" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_partNumber",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="product.partnumber.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.color.title"/>:
						</td>
						<td>
							<form:input id="product_color" path="color" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_color",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="product.color.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.brand.title"/>:
						</td>
						<td>
							<form:input id="product_brand" path="brand" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_brand",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="product.brand.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.category.title"/>:
						</td>
						<td>
							<form:input id="product_category" path="category" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_category",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="product.category.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.name.title"/>:
						</td>
						<td>
							<form:input id="product_name" path="name" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "product_name",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="product.name.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="orderline_id" value="${orderline_id}" >
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
