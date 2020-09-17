package oracle.apps.hcm.lovHelper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Entity
@Table(name="CUSTOM_CONTENT_ITEM")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class ContentItem {
	
	@Id
	private Long contentItemId;
    private Long BusinessGroupId;
    private String ContentItemCode;
    private Long ContentKeyflexId;
    private String ContentSupplierCode;
    private Long contentTypeId;
    private String ContentValueSetId;
    private Long CountryId;
    private String DateFrom;
    private String DateTo;
    @Column(name="ITEM_DATE_1")
    private String ItemDate1;
    @Column(name="ITEM_DATE_10")
    private String ItemDate10;
    @Column(name="ITEM_DATE_2")
    private String ItemDate2;
    @Column(name="ITEM_DATE_3")
    private String ItemDate3;
    @Column(name="ITEM_DATE_4")
    private String ItemDate4;
    @Column(name="ITEM_DATE_5")
    private String ItemDate5;
    @Column(name="ITEM_DATE_6")
    private String ItemDate6;
    @Column(name="ITEM_DATE_7")
    private String ItemDate7;
    @Column(name="ITEM_DATE_8")
    private String ItemDate8;
    @Column(name="ITEM_DATE_9")
    private String ItemDate9;
    private String ItemDescription;
    private String ItemDescrlong;
    @Column(name="ITEM_NUMBER_1")
    private Long ItemNumber1;
    @Column(name="ITEM_NUMBER_10")
    private Long ItemNumber10;
    @Column(name="ITEM_NUMBER_2")
    private Long ItemNumber2;
    @Column(name="ITEM_NUMBER_3")
    private Long ItemNumber3;
    @Column(name="ITEM_NUMBER_4")
    private Long ItemNumber4;
    @Column(name="ITEM_NUMBER_5")
    private Long ItemNumber5;
    @Column(name="ITEM_NUMBER_6")
    private Long ItemNumber6;
    @Column(name="ITEM_NUMBER_7")
    private Long ItemNumber7;
    @Column(name="ITEM_NUMBER_8")
    private Long ItemNumber8;
    @Column(name="ITEM_NUMBER_9")
    private Long ItemNumber9;
    @Column(name="ITEM_TEXT_1")
    private String ItemText1;
    @Column(name="ITEM_TEXT_10")
    private String ItemText10;
    @Column(name="ITEM_TEXT_11")
    private String ItemText11;
    @Column(name="ITEM_TEXT_12")
    private String ItemText12;
    @Column(name="ITEM_TEXT_13")
    private String ItemText13;
    @Column(name="ITEM_TEXT_14")
    private String ItemText14;
    @Column(name="ITEM_TEXT_15")
    private String ItemText15;
    @Column(name="ITEM_TEXT_16")
    private String ItemText16;
    @Column(name="ITEM_TEXT_17")
    private String ItemText17;
    @Column(name="ITEM_TEXT_18")
    private String ItemText18;
    @Column(name="ITEM_TEXT_19")
    private String ItemText19;
    @Column(name="ITEM_TEXT_2")
    private String ItemText2;
    @Column(name="ITEM_TEXT_20")
    private String ItemText20;
    @Column(name="ITEM_TEXT_21")
    private String ItemText21;
    @Column(name="ITEM_TEXT_22")
    private String ItemText22;
    @Column(name="ITEM_TEXT_23")
    private String ItemText23;
    @Column(name="ITEM_TEXT_24")
    private String ItemText24;
    @Column(name="ITEM_TEXT_25")
    private String ItemText25;
    @Column(name="ITEM_TEXT_26")
    private String ItemText26;
    @Column(name="ITEM_TEXT_27")
    private String ItemText27;
    @Column(name="ITEM_TEXT_28")
    private String ItemText28;
    @Column(name="ITEM_TEXT_29")
    private String ItemText29;
    @Column(name="ITEM_TEXT_3")
    private String ItemText3;
    @Column(name="ITEM_TEXT_30")
    private String ItemText30;
    @Column(name="ITEM_TEXT_4")
    private String ItemText4;
    @Column(name="ITEM_TEXT_5")
    private String ItemText5;
    @Column(name="ITEM_TEXT_6")
    private String ItemText6;
    @Column(name="ITEM_TEXT_7")
    private String ItemText7;
    @Column(name="ITEM_TEXT_8")
    private String ItemText8;
    @Column(name="ITEM_TEXT_9")
    private String ItemText9;
    @Column(name="ITEM_TEXT_TL_1")
    private String ItemTextTl1;
    @Column(name="ITEM_TEXT_TL_10")
    private String ItemTextTl10;
    @Column(name="ITEM_TEXT_TL_11")
    private String ItemTextTl11;
    @Column(name="ITEM_TEXT_TL_12")
    private String ItemTextTl12;
    @Column(name="ITEM_TEXT_TL_13")
    private String ItemTextTl13;
    @Column(name="ITEM_TEXT_TL_14")
    private String ItemTextTl14;
    @Column(name="ITEM_TEXT_TL_15")
    private String ItemTextTl15;
    @Column(name="ITEM_TEXT_TL_2")
    private String ItemTextTl2;
    @Column(name="ITEM_TEXT_TL_3")
    private String ItemTextTl3;
    @Column(name="ITEM_TEXT_TL_4")
    private String ItemTextTl4;
    @Column(name="ITEM_TEXT_TL_5")
    private String ItemTextTl5;
    @Column(name="ITEM_TEXT_TL_6")
    private String ItemTextTl6;
    @Column(name="ITEM_TEXT_TL_7")
    private String ItemTextTl7;
    @Column(name="ITEM_TEXT_TL_8")
    private String ItemTextTl8;
    @Column(name="ITEM_TEXT_TL_9")
    private String ItemTextTl9;
    private String Name;
    private Long RatingModelId;
    private Long StateProvinceId;
    private String GoalCategory;
    private String GoalSubType;
    private String GoalBusinessUnitName;
    private String GoalDepartmentName;
    private String GoalLegalEntityName;
    private String GoalJobFamilyName;
    private String ContentTypeName;
    private String ContentValueSetCode;
    
    public ContentItem() {
    	
    }
    
	public Long getContentItemId() {
		return contentItemId;
	}
	public void setContentItemId(Long contentItemId) {
		this.contentItemId = contentItemId;
	}
	public Long getBusinessGroupId() {
		return BusinessGroupId;
	}
	public void setBusinessGroupId(Long businessGroupId) {
		BusinessGroupId = businessGroupId;
	}
	public String getContentItemCode() {
		return ContentItemCode;
	}
	public void setContentItemCode(String contentItemCode) {
		ContentItemCode = contentItemCode;
	}
	public Long getContentKeyflexId() {
		return ContentKeyflexId;
	}
	public void setContentKeyflexId(Long contentKeyflexId) {
		ContentKeyflexId = contentKeyflexId;
	}
	public String getContentSupplierCode() {
		return ContentSupplierCode;
	}
	public void setContentSupplierCode(String contentSupplierCode) {
		ContentSupplierCode = contentSupplierCode;
	}
	public Long getContentTypeId() {
		return contentTypeId;
	}
	public void setContentTypeId(Long contentTypeId) {
		this.contentTypeId = contentTypeId;
	}
	public String getContentValueSetId() {
		return ContentValueSetId;
	}
	public void setContentValueSetId(String contentValueSetId) {
		ContentValueSetId = contentValueSetId;
	}
	public Long getCountryId() {
		return CountryId;
	}
	public void setCountryId(Long countryId) {
		CountryId = countryId;
	}
	public String getDateFrom() {
		return DateFrom;
	}
	public void setDateFrom(String dateFrom) {
		DateFrom = dateFrom;
	}
	public String getDateTo() {
		return DateTo;
	}
	public void setDateTo(String dateTo) {
		DateTo = dateTo;
	}
	public String getItemDate1() {
		return ItemDate1;
	}
	public void setItemDate1(String itemDate1) {
		ItemDate1 = itemDate1;
	}
	public String getItemDate10() {
		return ItemDate10;
	}
	public void setItemDate10(String itemDate10) {
		ItemDate10 = itemDate10;
	}
	public String getItemDate2() {
		return ItemDate2;
	}
	public void setItemDate2(String itemDate2) {
		ItemDate2 = itemDate2;
	}
	public String getItemDate3() {
		return ItemDate3;
	}
	public void setItemDate3(String itemDate3) {
		ItemDate3 = itemDate3;
	}
	public String getItemDate4() {
		return ItemDate4;
	}
	public void setItemDate4(String itemDate4) {
		ItemDate4 = itemDate4;
	}
	public String getItemDate5() {
		return ItemDate5;
	}
	public void setItemDate5(String itemDate5) {
		ItemDate5 = itemDate5;
	}
	public String getItemDate6() {
		return ItemDate6;
	}
	public void setItemDate6(String itemDate6) {
		ItemDate6 = itemDate6;
	}
	public String getItemDate7() {
		return ItemDate7;
	}
	public void setItemDate7(String itemDate7) {
		ItemDate7 = itemDate7;
	}
	public String getItemDate8() {
		return ItemDate8;
	}
	public void setItemDate8(String itemDate8) {
		ItemDate8 = itemDate8;
	}
	public String getItemDate9() {
		return ItemDate9;
	}
	public void setItemDate9(String itemDate9) {
		ItemDate9 = itemDate9;
	}
	public String getItemDescription() {
		return ItemDescription;
	}
	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}
	public String getItemDescrlong() {
		return ItemDescrlong;
	}
	public void setItemDescrlong(String itemDescrlong) {
		ItemDescrlong = itemDescrlong;
	}
	public Long getItemNumber1() {
		return ItemNumber1;
	}
	public void setItemNumber1(Long itemNumber1) {
		ItemNumber1 = itemNumber1;
	}
	public Long getItemNumber10() {
		return ItemNumber10;
	}
	public void setItemNumber10(Long itemNumber10) {
		ItemNumber10 = itemNumber10;
	}
	public Long getItemNumber2() {
		return ItemNumber2;
	}
	public void setItemNumber2(Long itemNumber2) {
		ItemNumber2 = itemNumber2;
	}
	public Long getItemNumber3() {
		return ItemNumber3;
	}
	public void setItemNumber3(Long itemNumber3) {
		ItemNumber3 = itemNumber3;
	}
	public Long getItemNumber4() {
		return ItemNumber4;
	}
	public void setItemNumber4(Long itemNumber4) {
		ItemNumber4 = itemNumber4;
	}
	public Long getItemNumber5() {
		return ItemNumber5;
	}
	public void setItemNumber5(Long itemNumber5) {
		ItemNumber5 = itemNumber5;
	}
	public Long getItemNumber6() {
		return ItemNumber6;
	}
	public void setItemNumber6(Long itemNumber6) {
		ItemNumber6 = itemNumber6;
	}
	public Long getItemNumber7() {
		return ItemNumber7;
	}
	public void setItemNumber7(Long itemNumber7) {
		ItemNumber7 = itemNumber7;
	}
	public Long getItemNumber8() {
		return ItemNumber8;
	}
	public void setItemNumber8(Long itemNumber8) {
		ItemNumber8 = itemNumber8;
	}
	public Long getItemNumber9() {
		return ItemNumber9;
	}
	public void setItemNumber9(Long itemNumber9) {
		ItemNumber9 = itemNumber9;
	}
	public String getItemText1() {
		return ItemText1;
	}
	public void setItemText1(String itemText1) {
		ItemText1 = itemText1;
	}
	public String getItemText10() {
		return ItemText10;
	}
	public void setItemText10(String itemText10) {
		ItemText10 = itemText10;
	}
	public String getItemText11() {
		return ItemText11;
	}
	public void setItemText11(String itemText11) {
		ItemText11 = itemText11;
	}
	public String getItemText12() {
		return ItemText12;
	}
	public void setItemText12(String itemText12) {
		ItemText12 = itemText12;
	}
	public String getItemText13() {
		return ItemText13;
	}
	public void setItemText13(String itemText13) {
		ItemText13 = itemText13;
	}
	public String getItemText14() {
		return ItemText14;
	}
	public void setItemText14(String itemText14) {
		ItemText14 = itemText14;
	}
	public String getItemText15() {
		return ItemText15;
	}
	public void setItemText15(String itemText15) {
		ItemText15 = itemText15;
	}
	public String getItemText16() {
		return ItemText16;
	}
	public void setItemText16(String itemText16) {
		ItemText16 = itemText16;
	}
	public String getItemText17() {
		return ItemText17;
	}
	public void setItemText17(String itemText17) {
		ItemText17 = itemText17;
	}
	public String getItemText18() {
		return ItemText18;
	}
	public void setItemText18(String itemText18) {
		ItemText18 = itemText18;
	}
	public String getItemText19() {
		return ItemText19;
	}
	public void setItemText19(String itemText19) {
		ItemText19 = itemText19;
	}
	public String getItemText2() {
		return ItemText2;
	}
	public void setItemText2(String itemText2) {
		ItemText2 = itemText2;
	}
	public String getItemText20() {
		return ItemText20;
	}
	public void setItemText20(String itemText20) {
		ItemText20 = itemText20;
	}
	public String getItemText21() {
		return ItemText21;
	}
	public void setItemText21(String itemText21) {
		ItemText21 = itemText21;
	}
	public String getItemText22() {
		return ItemText22;
	}
	public void setItemText22(String itemText22) {
		ItemText22 = itemText22;
	}
	public String getItemText23() {
		return ItemText23;
	}
	public void setItemText23(String itemText23) {
		ItemText23 = itemText23;
	}
	public String getItemText24() {
		return ItemText24;
	}
	public void setItemText24(String itemText24) {
		ItemText24 = itemText24;
	}
	public String getItemText25() {
		return ItemText25;
	}
	public void setItemText25(String itemText25) {
		ItemText25 = itemText25;
	}
	public String getItemText26() {
		return ItemText26;
	}
	public void setItemText26(String itemText26) {
		ItemText26 = itemText26;
	}
	public String getItemText27() {
		return ItemText27;
	}
	public void setItemText27(String itemText27) {
		ItemText27 = itemText27;
	}
	public String getItemText28() {
		return ItemText28;
	}
	public void setItemText28(String itemText28) {
		ItemText28 = itemText28;
	}
	public String getItemText29() {
		return ItemText29;
	}
	public void setItemText29(String itemText29) {
		ItemText29 = itemText29;
	}
	public String getItemText3() {
		return ItemText3;
	}
	public void setItemText3(String itemText3) {
		ItemText3 = itemText3;
	}
	public String getItemText30() {
		return ItemText30;
	}
	public void setItemText30(String itemText30) {
		ItemText30 = itemText30;
	}
	public String getItemText4() {
		return ItemText4;
	}
	public void setItemText4(String itemText4) {
		ItemText4 = itemText4;
	}
	public String getItemText5() {
		return ItemText5;
	}
	public void setItemText5(String itemText5) {
		ItemText5 = itemText5;
	}
	public String getItemText6() {
		return ItemText6;
	}
	public void setItemText6(String itemText6) {
		ItemText6 = itemText6;
	}
	public String getItemText7() {
		return ItemText7;
	}
	public void setItemText7(String itemText7) {
		ItemText7 = itemText7;
	}
	public String getItemText8() {
		return ItemText8;
	}
	public void setItemText8(String itemText8) {
		ItemText8 = itemText8;
	}
	public String getItemText9() {
		return ItemText9;
	}
	public void setItemText9(String itemText9) {
		ItemText9 = itemText9;
	}
	public String getItemTextTl1() {
		return ItemTextTl1;
	}
	public void setItemTextTl1(String itemTextTl1) {
		ItemTextTl1 = itemTextTl1;
	}
	public String getItemTextTl10() {
		return ItemTextTl10;
	}
	public void setItemTextTl10(String itemTextTl10) {
		ItemTextTl10 = itemTextTl10;
	}
	public String getItemTextTl11() {
		return ItemTextTl11;
	}
	public void setItemTextTl11(String itemTextTl11) {
		ItemTextTl11 = itemTextTl11;
	}
	public String getItemTextTl12() {
		return ItemTextTl12;
	}
	public void setItemTextTl12(String itemTextTl12) {
		ItemTextTl12 = itemTextTl12;
	}
	public String getItemTextTl13() {
		return ItemTextTl13;
	}
	public void setItemTextTl13(String itemTextTl13) {
		ItemTextTl13 = itemTextTl13;
	}
	public String getItemTextTl14() {
		return ItemTextTl14;
	}
	public void setItemTextTl14(String itemTextTl14) {
		ItemTextTl14 = itemTextTl14;
	}
	public String getItemTextTl15() {
		return ItemTextTl15;
	}
	public void setItemTextTl15(String itemTextTl15) {
		ItemTextTl15 = itemTextTl15;
	}
	public String getItemTextTl2() {
		return ItemTextTl2;
	}
	public void setItemTextTl2(String itemTextTl2) {
		ItemTextTl2 = itemTextTl2;
	}
	public String getItemTextTl3() {
		return ItemTextTl3;
	}
	public void setItemTextTl3(String itemTextTl3) {
		ItemTextTl3 = itemTextTl3;
	}
	public String getItemTextTl4() {
		return ItemTextTl4;
	}
	public void setItemTextTl4(String itemTextTl4) {
		ItemTextTl4 = itemTextTl4;
	}
	public String getItemTextTl5() {
		return ItemTextTl5;
	}
	public void setItemTextTl5(String itemTextTl5) {
		ItemTextTl5 = itemTextTl5;
	}
	public String getItemTextTl6() {
		return ItemTextTl6;
	}
	public void setItemTextTl6(String itemTextTl6) {
		ItemTextTl6 = itemTextTl6;
	}
	public String getItemTextTl7() {
		return ItemTextTl7;
	}
	public void setItemTextTl7(String itemTextTl7) {
		ItemTextTl7 = itemTextTl7;
	}
	public String getItemTextTl8() {
		return ItemTextTl8;
	}
	public void setItemTextTl8(String itemTextTl8) {
		ItemTextTl8 = itemTextTl8;
	}
	public String getItemTextTl9() {
		return ItemTextTl9;
	}
	public void setItemTextTl9(String itemTextTl9) {
		ItemTextTl9 = itemTextTl9;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getRatingModelId() {
		return RatingModelId;
	}
	public void setRatingModelId(Long ratingModelId) {
		RatingModelId = ratingModelId;
	}
	public Long getStateProvinceId() {
		return StateProvinceId;
	}
	public void setStateProvinceId(Long stateProvinceId) {
		StateProvinceId = stateProvinceId;
	}
	public String getGoalCategory() {
		return GoalCategory;
	}
	public void setGoalCategory(String goalCategory) {
		GoalCategory = goalCategory;
	}
	public String getGoalSubType() {
		return GoalSubType;
	}
	public void setGoalSubType(String goalSubType) {
		GoalSubType = goalSubType;
	}
	public String getGoalBusinessUnitName() {
		return GoalBusinessUnitName;
	}
	public void setGoalBusinessUnitName(String goalBusinessUnitName) {
		GoalBusinessUnitName = goalBusinessUnitName;
	}
	public String getGoalDepartmentName() {
		return GoalDepartmentName;
	}
	public void setGoalDepartmentName(String goalDepartmentName) {
		GoalDepartmentName = goalDepartmentName;
	}
	public String getGoalLegalEntityName() {
		return GoalLegalEntityName;
	}
	public void setGoalLegalEntityName(String goalLegalEntityName) {
		GoalLegalEntityName = goalLegalEntityName;
	}
	public String getGoalJobFamilyName() {
		return GoalJobFamilyName;
	}
	public void setGoalJobFamilyName(String goalJobFamilyName) {
		GoalJobFamilyName = goalJobFamilyName;
	}
	public String getContentTypeName() {
		return ContentTypeName;
	}
	public void setContentTypeName(String contentTypeName) {
		ContentTypeName = contentTypeName;
	}
	public String getContentValueSetCode() {
		return ContentValueSetCode;
	}
	public void setContentValueSetCode(String contentValueSetCode) {
		ContentValueSetCode = contentValueSetCode;
	}
    
}
