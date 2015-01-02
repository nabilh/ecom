<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.orderline-resources"/>
<html>
<head>
<title>View <fmt:message key="orderline.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="orderline.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexOrderLine"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderline.id.title"/>:
						</td>
						<td>
							${orderline.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="orderline.quantity.title"/>:
						</td>
						<td>
							${orderline.quantity}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="salesorder.title"/></h1>
					
						<c:if test='${orderline.salesOrder != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="salesorder.id.title"/>:
						</td>
						<td>
							${orderline.salesOrder.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="salesorder.datecreated.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${orderline.salesOrder.dateCreated.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderLineSalesOrder?orderline_id=${orderline.id}&salesorder_id=${orderline.salesOrder.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderLineSalesOrder?orderline_id=${orderline.id}&related_salesorder_id=${orderline.salesOrder.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${orderline.salesOrder == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderLineSalesOrder?orderline_id=${orderline.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="salesorder.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="product.title"/></h1>
					
						<c:if test='${orderline.product != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="product.partnumber.title"/>:
						</td>
						<td>
							${orderline.product.partNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="product.color.title"/>:
						</td>
						<td>
							${orderline.product.color}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="product.brand.title"/>:
						</td>
						<td>
							${orderline.product.brand}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="product.category.title"/>:
						</td>
						<td>
							${orderline.product.category}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="product.name.title"/>:
						</td>
						<td>
							${orderline.product.name}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editOrderLineProduct?orderline_id=${orderline.id}&product_id=${orderline.product.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteOrderLineProduct?orderline_id=${orderline.id}&related_product_id=${orderline.product.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${orderline.product == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOrderLineProduct?orderline_id=${orderline.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="product.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>