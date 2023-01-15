<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Releve bancaire</title>
                <style>
                    html{
                    font-size : 16px;
                    font-famly : monospace;                        
                    }
                    table{
                    width : 100%;
                    }
                    table, tr, th, td{                    
                    border : 1px solid green;   
                    border-collapse: collapse;
                    }
                    header{
                    background : black;
                    color : white;
                    width : 60%;
                    margin : auto;
                    }
                    section{
                    width : 60%;
                    margin : auto;
                    background : rgba(202,40,45,0.2);
                    }
                </style>                
            </head>
            <body>                
                <header>
                    Releve du compte fait le,  <xsl:value-of select="/releve/dateReleve"/><br />                
                    RIB : <xsl:value-of select="/releve/@RIB"/><br />
                    Solde : <xsl:value-of select="(sum(releve/operations/operation[@type='CREDIT']/@montant)  - sum(releve/operations/operation[@type='DEBIT']/@montant))"/>DH<br />
                    <br />
                    Les opérations du <xsl:value-of select="releve/operations/@dateDebut"/> jusqu'à <xsl:value-of select="releve/operations/@dateFin"/>
                    <br />   
                </header>
                <section>
                    <table>
                        <tr>
                            <th>Date</th><th>Montant</th><th>Type</th><th>Description</th>
                        </tr>
                        <xsl:for-each select="/releve/operations/operation[@type='CREDIT']">                       
                            <tr>
                                <td><xsl:value-of select="@date"/></td>
                                <td><xsl:value-of select="@montant"/></td>
                                <td><xsl:value-of select="@type"/></td>
                                <td><xsl:value-of select="@description"/></td>
                            </tr>                         
                        </xsl:for-each>                       
                        <tr style="background : orange">
                            <td colspan="3">Total CREDIT</td>
                            <td><xsl:value-of select="releve/operations/sum(operation[@type='CREDIT']/@montant)"/> </td>
                        </tr>
                    </table>
                </section>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>