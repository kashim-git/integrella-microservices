<?xml version='1.0' ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:a="http://www.fpml.org/2007/FpML-4-3">
	<xsl:template match="/">
		<FpML xmlns="http://www.fpml.org/2007/FpML-4-3" xmlns:fpml="http://www.fpml.org/2007/FpML-4-3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<header>
				<messageId>
					<xsl:value-of select="MxML/events/mainEvent/object/objectId"/>
				</messageId>
			</header>
			<trade>
				<tradeHeader>
					<partyTradeIdentifier>
						<partyReference href="Party1"/>
						<tradeId>
							<xsl:value-of select="MxML/contracts/contract/contractId/internalId"/>
						</tradeId>
					</partyTradeIdentifier>
					<tradeDate id="TRADEDATE">
						<xsl:value-of select="MxML/documentProperties/accountingDate"/>
					</tradeDate>
				</tradeHeader>
				<bondOption>
					<buyerPartyReference href="Patry1"/>
					<sellerPartyReference href="Party2"/>
					<optionType>Call</optionType>
					<premium>
						<payerPartyReference href="Party1"/>
						<receiverPartyReference href="Party2"/>
						<paymentAmount>
							<currency>
								<xsl:value-of select="MxML/trades/trade/tradeBody/bond/settlement/settlementFlow/flow/currency"/>
							</currency>
							<amount>
								<xsl:value-of select="MxML/trades/trade/tradeBody/bond/settlement/settlementFlow/flow/amount"/>
							</amount>
						</paymentAmount>
						<paymentDate>
							<adjustableDate>
								<unadjustedDate>
									<xsl:value-of select="MxML/trades/trade/tradeBody/bond/settlement/settlementFlow/flow/date"/>
								</unadjustedDate>
								<dateAdjustments>
									<businessDayConvention>FOLLOWING</businessDayConvention>
								</dateAdjustments>
							</adjustableDate>
						</paymentDate>
						<premiumType>FIXED</premiumType>
					</premium>
					<notionalAmount>
						<currency>
							<xsl:value-of select="MxML/trades/trade/evaluationFlows/evaluationFlow/flow/currency"/>
						</currency>
						<amount>
							<xsl:value-of select="MxML/trades/trade/evaluationFlows/evaluationFlow/flow/amount"/>
						</amount>
					</notionalAmount>
					<entitlementCurrency>
						<xsl:value-of select="MxML/trades/trade/evaluationFlows/evaluationFlow/flow/currency"/>
					</entitlementCurrency>
					<settlementType>Physical</settlementType>
					<settlementDate>
						<adjustableDate>
							<unadjustedDate>
								<xsl:value-of select="MxML/trades/trade/tradeBody/bond/valueDate"/>
							</unadjustedDate>
						</adjustableDate>
					</settlementDate>
					<bond>
						<instrumentId instrumentIdScheme="CUSIP"/>
						<currency>
							<xsl:value-of select="MxML/trades/trade/tradeBody/bond/settlement/settlementFlow/flow/currency"/>
						</currency>
						<clearanceSystem>Clearstream</clearanceSystem>
						<couponRate>
							<xsl:value-of select="MxML/trades/trade/tradeBody/bond/settlement/settlementFlow/price/bondPriceData/accruedCoupon"/>
						</couponRate>
						<maturity>
							<xsl:value-of select="MxML/trades/trade/tradeInputConditions/validityDate"/>
						</maturity>
						<parValue>
							<xsl:value-of select="MxML/trades/trade/tradeBody/bond/settlement/settlementFlow/flow/amount"/>
						</parValue>
						<faceAmount>
							<xsl:value-of select="MxML/trades/trade/tradeBody/bond/settlement/settlementFlow/flow/amount"/>
						</faceAmount>
					</bond>
				</bondOption>
				<calculationAgent>
					<calculationAgentPartyReference href="Party1"/>
				</calculationAgent>
			</trade>
			<xsl:for-each select="MxML/trades/trade/parties/party">
				<party>
					<xsl:attribute name="id">
						<xsl:value-of select="@id"/>
					</xsl:attribute>
					<partyId>
						<xsl:value-of select="partyName"/>
					</partyId>
				</party>
			</xsl:for-each>
		</FpML>
	</xsl:template>
</xsl:stylesheet><!-- Stylus Studio meta-information - (c) 2004-2009. Progress Software Corporation. All rights reserved.

<metaInformation>
	<scenarios>
		<scenario default="yes" name="Scenario1" userelativepaths="yes" externalpreview="no" url="MXML_Sample_Data.xml" htmlbaseurl="" outputurl="bond-option_output.xml" processortype="saxon8" useresolver="yes" profilemode="0" profiledepth=""
		          profilelength="" urlprofilexml="" commandline="" additionalpath="" additionalclasspath="" postprocessortype="none" postprocesscommandline="" postprocessadditionalpath="" postprocessgeneratedext="" validateoutput="no" validator="internal"
		          customvalidator="">
			<advancedProp name="bSchemaAware" value="true"/>
			<advancedProp name="xsltVersion" value="2.0"/>
			<advancedProp name="iWhitespace" value="0"/>
			<advancedProp name="bWarnings" value="true"/>
			<advancedProp name="bXml11" value="false"/>
			<advancedProp name="bUseDTD" value="false"/>
			<advancedProp name="bXsltOneIsOkay" value="true"/>
			<advancedProp name="bTinyTree" value="true"/>
			<advancedProp name="bGenerateByteCode" value="true"/>
			<advancedProp name="bExtensions" value="true"/>
			<advancedProp name="iValidation" value="0"/>
			<advancedProp name="iErrorHandling" value="fatal"/>
			<advancedProp name="sInitialTemplate" value=""/>
			<advancedProp name="sInitialMode" value=""/>
		</scenario>
	</scenarios>
	<MapperMetaTag>
		<MapperInfo srcSchemaPathIsRelative="yes" srcSchemaInterpretAsXML="no" destSchemaPath="file:///c:/dev/XML/fpML4.3/bond-options/bond-option.xml" destSchemaRoot="FpML" destSchemaPathIsRelative="yes" destSchemaInterpretAsXML="no">
			<SourceSchema srcSchemaPath="file:///c:/dev/XML/MXML_Sample_Data.xml" srcSchemaRoot="MxML" AssociatedInstance="" loaderFunction="document" loaderFunctionUsesURI="no"/>
		</MapperInfo>
		<MapperBlockPosition>
			<template match="/">
				<block path="FpML/xsl:for-each" x="242" y="403"/>
			</template>
		</MapperBlockPosition>
		<TemplateContext></TemplateContext>
		<MapperFilter side="source"></MapperFilter>
	</MapperMetaTag>
</metaInformation>
-->