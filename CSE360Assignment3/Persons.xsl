<?xml version = "1.0" encoding="UTF-8"?>
<xsl:stylesheet version = "2.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
	<xsl:template match = "/">
	<html>
	<body>
		<h1 align = "center">My Persons Table</h1>
		<table border="1" style="width:100%">
			<tr bgcolor="Yellow" style="width:100%">
				<th colspan = "2">Name</th>
				<th colspan = "3">Credential</th>
				<th colspan = "3">Phone</th>
				<th>Category</th>
			</tr>
			<tr>
				<td><b>First</b></td>
				<td><b>Last</b></td>
				<td><b>ID</b></td>
				<td><b>PWD</b></td>
				<td><b>encryption</b></td>
				<td><b>Work</b></td>
				<td><b>Cell</b></td>
				<td><b>Provider</b></td>
				<td><b>category</b></td>
			</tr>
			<xsl:for-each select="Persons/Person">
				<xsl:sort select="Name/First"/>
				<tr style="font-size: 10pt; font-family: verdana">
					<td><xsl:value-of select="Name/First"/></td>
					<td><xsl:value-of select="Name/Last"/></td>
					<td><xsl:value-of select="Credential/ID"/></td>
					<td><xsl:value-of select="Credential/PWD"/></td>
					<td align="center">						
						<xsl:if test="@encryption">
							<xsl:value-of select="@encryption"/>
						</xsl:if>
					</td>
					<td><xsl:value-of select="Phone/Work"/></td>
					<td><xsl:value-of select="Phone/Cell"/></td>
					<td align="center">
						<xsl:if test="not(@Provider)">
							-
						</xsl:if>
						<xsl:if test="@Provider">
						<xsl:value-of select="@Provider"/>
						</xsl:if>
					</td>
					<td><xsl:value-of select="Category"/></td>
				</tr>
			</xsl:for-each>
		</table>

	</body>
	</html>