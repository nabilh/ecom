<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.customer-resources"/>
<html>
<head>
<title>View <fmt:message key="customer.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="customer.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexCustomer"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.id.title"/>:
						</td>
						<td>
							${customer.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.firstname.title"/>:
						</td>
						<td>
							${customer.firstName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.lastname.title"/>:
						</td>
						<td>
							${customer.lastName}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.street.title"/>:
						</td>
						<td>
							${customer.street}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.city.title"/>:
						</td>
						<td>
							${customer.city}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.state.title"/>:
						</td>
						<td>
							${customer.state}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.zip.title"/>:
						</td>
						<td>
							${customer.zip}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="salesorder.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newCustomerSalesOrders?customer_id=${customer.id}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="salesorder.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="salesorder.id.title"/></th>
						<th class="thead"><fmt:message key="salesorder.datecreated.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${customer.salesOrders}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectCustomerSalesOrders?customer_id=${customer.id}&salesorders_id=${current.id}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editCustomerSalesOrders?customer_id=${customer.id}&salesorders_id=${current.id}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteCustomerSalesOrders?customer_id=${customer.id}&related_salesorders_id=${current.id}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.id}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.dateCreated.time}"/>
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