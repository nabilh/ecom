<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.product-resources"/>
<html>
<head>
<title>View <fmt:message key="product.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="product.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexProduct"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.id.title"/>:
						</td>
						<td>
							${product.id}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.partnumber.title"/>:
						</td>
						<td>
							${product.partNumber}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.color.title"/>:
						</td>
						<td>
							${product.color}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.brand.title"/>:
						</td>
						<td>
							${product.brand}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.category.title"/>:
						</td>
						<td>
							${product.category}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="product.name.title"/>:
						</td>
						<td>
							${product.name}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>