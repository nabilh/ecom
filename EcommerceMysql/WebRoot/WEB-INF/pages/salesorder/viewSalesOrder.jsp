<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.salesorder-resources"/>
<html>
<head>
<title>View <fmt:message key="salesorder.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="salesorder.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexSalesOrder"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="salesorder.id.title"/>:
						</td>
						<td>
							${salesorder.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="salesorder.datecreated.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${salesorder.dateCreated.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="customer.title"/></h1>
					
						<c:if test='${salesorder.customer != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="customer.id.title"/>:
						</td>
						<td>
							${salesorder.customer.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customer.firstname.title"/>:
						</td>
						<td>
							${salesorder.customer.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customer.lastname.title"/>:
						</td>
						<td>
							${salesorder.customer.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customer.street.title"/>:
						</td>
						<td>
							${salesorder.customer.street}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customer.city.title"/>:
						</td>
						<td>
							${salesorder.customer.city}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customer.state.title"/>:
						</td>
						<td>
							${salesorder.customer.state}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="customer.zip.title"/>:
						</td>
						<td>
							${salesorder.customer.zip}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editSalesOrderCustomer?salesorder_id=${salesorder.id}&customer_id=${salesorder.customer.id}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteSalesOrderCustomer?salesorder_id=${salesorder.id}&related_customer_id=${salesorder.customer.id}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${salesorder.customer == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSalesOrderCustomer?salesorder_id=${salesorder.id}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="customer.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="orderline.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSalesOrderOrderLines?salesorder_id=${salesorder.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="orderline.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="orderline.quantity.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${salesorder.orderLines}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectSalesOrderOrderLines?salesorder_id=${salesorder.id}&orderlines_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editSalesOrderOrderLines?salesorder_id=${salesorder.id}&orderlines_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteSalesOrderOrderLines?salesorder_id=${salesorder.id}&related_orderlines_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.quantity}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>