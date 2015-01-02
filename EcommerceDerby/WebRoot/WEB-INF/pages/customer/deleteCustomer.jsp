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
							<fmt:message key="customer.customernumber.title"/>:
						</td>
						<td>
							${customer.customernumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.customername.title"/>:
						</td>
						<td>
							${customer.customername}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.contactlastname.title"/>:
						</td>
						<td>
							${customer.contactlastname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.contactfirstname.title"/>:
						</td>
						<td>
							${customer.contactfirstname}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.phone.title"/>:
						</td>
						<td>
							${customer.phone}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.addressline1.title"/>:
						</td>
						<td>
							${customer.addressline1}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.addressline2.title"/>:
						</td>
						<td>
							${customer.addressline2}
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
							<fmt:message key="customer.postalcode.title"/>:
						</td>
						<td>
							${customer.postalcode}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.country.title"/>:
						</td>
						<td>
							${customer.country}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.salesrepemployeenumber.title"/>:
						</td>
						<td>
							${customer.salesrepemployeenumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="customer.creditlimit.title"/>:
						</td>
						<td>
							${customer.creditlimit}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteCustomer?customernumberKey=${customer.customernumber}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>