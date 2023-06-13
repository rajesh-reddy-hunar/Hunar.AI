package com.ai.pages;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Leads_filters {


	@FindBy(xpath="//div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Enter_Login_Email;

	@FindBy(xpath="//div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private  WebElement Enter_Password;

	@FindBy(xpath="//div[1]/div[1]/div[2]/div[1]/div[4]/button[1]")
	private WebElement click_on_Submit_btn;

	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement Click_on_Listing_menu1;

	@FindBy(xpath="//div[1]/div[2]/ul[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement click_on_Leads1;


	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement Click_on_Listing_menu;

	@FindBy(xpath="//div[1]/div[2]/ul[1]/div[1]/a[1]/div[1]/div[2]/span[1]")
	private WebElement click_on_Leads;


	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[2]/div[1]/div[2]/div[1]/button[1]/*[name()='svg'][1]")
	private WebElement click_on_Full_name_filter;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Sort_AtoZ;

	@FindBy(xpath="//div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Sort_ZtoA;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement click_on_apply;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_Cancel;

	@FindBy(xpath="//tr[1]/th[3]/div[1]/div[2]/div[1]/button[1]")
	private WebElement click_on_mobile_Number_filter;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_sort_smallest_to_largest;

	@FindBy(xpath="//div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_Largest_to_Smallest;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement click_on_mobile_Number_filter_Apply_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_cancel_btn;

	@FindBy(xpath="//thead[1]/tr[1]/th[4]/div[1]/div[2]/div[1]")
	private WebElement click_on_Gender_filter;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_Sort_AtoZ;;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_Sort_ZtoA;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_select_all;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_unselect_All;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement enter_search;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[1]/label[1]/span[2]")
	private WebElement click_on_Blank_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[2]/label[1]/span[2]")
	private WebElement click_on_Male_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[3]/label[1]/span[2]")
	private WebElement click_on_Female;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[4]/label[1]/span[2]")
	private WebElement click_on_Others;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[1]/button[1]")
	private WebElement click_on_Gender_Apply_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[2]/button[1]")
	private WebElement click_on_Gender_Cancel_btn;

	@FindBy(xpath="//table[1]/thead[1]/tr[1]/th[5]/div[1]/div[2]/div[1]/button[1]")
	private WebElement Click_on_Education_Qualification_filter;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Education_Qualification_Sort_AtoZ;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Education_Qualification_Sort_ZtoA;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_select_ALL;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
	private WebElement click_on_CLR_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement enter_text_in_Education_Qualification_Search;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[1]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_Blank_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[2]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_10andBelow_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[3]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_10passed_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[4]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_12thpassed_checkbox;

	@FindBy(xpath="//div[3]/div[1]/div[4]/div[5]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_IT_Training_institute_degree_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[6]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_Dipploma_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[7]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_Bachelors_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[8]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_Masters_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[9]/label[1]/span[2]")
	private WebElement Click_on_Education_Qualification_Others_checkbox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[1]/button[1]")
	private WebElement Click_on_Education_Qualification_Apply_btn;

	@FindBy(xpath="//div[3]/div[1]/div[5]/div[1]/div[2]/button[1]")
	private WebElement Click_on_Education_Qualification_cancel_btn;

	@FindBy(xpath="//thead[1]/tr[1]/th[6]/div[1]/div[2]/div[1]/button[1]")
	private WebElement Click_on_Created_on_filter;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Click_on_Sort_oldest_to_newest;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Click_on_Sort_newest_Oldest;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement Click_on_created_Apply_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement Click_on_created_Cancel_btn;

	@FindBy(xpath="//div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[7]/div[1]/div[2]/div[1]/button[1]")
	private WebElement click_on_Update_on_Filters;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Click_on_Updated_Sort_oldest_to_newest;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Click_on_Updated_Sort_Newest_to_Oldest;

	@FindBy(xpath="//body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement click_on_Updated_apply_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_Updated_cancel_btn;

	@FindBy(xpath="//thead[1]/tr[1]/th[6]/div[1]/div[2]/div[1]/button[1]")
	private WebElement Click_on_english_Proficiency_filter ;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_Sort_A_to_Z;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_Sort_Z_to_A;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_Select_ALL;

	@FindBy(xpath="//body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
	private WebElement click_on_Clr_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[1]/label[1]/span[2]")
	private WebElement click_on_english_proficiency_Blank_checkBox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[2]/label[1]/span[2]")
	private WebElement click_on_english_proficiency_Beginner_checkBox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[3]/label[1]/span[2]")
	private WebElement click_on_english_proficiency_Intermediate_checkBox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[4]/label[1]/span[2]")
	private WebElement click_on_english_proficiency_Advanced_checkBox;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[1]/button[1]")
	private WebElement click_on_ApplY_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[2]/button[1]")
	private WebElement click_on_cancel;

	@FindBy(xpath="//main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[8]/div[1]/div[2]/div[1]")
	private WebElement Click_on_Current_Address_filter;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Click_Current_Address_filter_sort_AtoZ;

	@FindBy(xpath="//div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement Click_Current_Address_filter_sort_ZtoA;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
	private WebElement Click_Current_Address_Apply_btn;

	@FindBy(xpath="//body[1]/div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement Click_Current_Address_cancel_btn;

	@FindBy(xpath="//thead[1]/tr[1]/th[9]/div[1]/div[2]/div[1]/button[1]")
	private WebElement click_on_Current_state_Filter;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_Sort_ATOZ;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_Sort_ZTOA;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_select_ALL_Btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
	private WebElement click_on_cLR_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement enter_SeArch_text;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[1]/label[1]/span[2]")
	private WebElement click_on_blank;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[2]/label[1]/span[2]")
	private WebElement Click_Andaman_and_Nicobar;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[3]/label[1]/span[2]")
	private WebElement click_on_AP;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[4]/label[1]/span[2]")
	private WebElement Click_on_Arunachal_Pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[5]/label[1]/span[2]")
	private WebElement click_on_assam;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[6]/label[1]/span[2]")
	private WebElement click_on_Bihar;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[7]/label[1]/span[2]")
	private WebElement click_on_Chattisgarh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[8]/label[1]/span[2]")
	private WebElement click_on_chandigar;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[9]/label[1]/span[2]")
	private WebElement click_on_Dadra;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[10]/label[1]/span[2]")
	private WebElement click_on_dam_and_Diu;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[11]/label[1]/span[2]")
	private WebElement click_on_Delhi;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[12]/label[1]/span[2]")
	private WebElement click_on_GOA;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[13]/label[1]/span[2]")
	private WebElement click_on_Gujarat;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[14]/label[1]/span[2]")
	private WebElement click_on_Haryana;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[15]/label[1]/span[2]")
	private WebElement click_on_Himachal_pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[16]/label[1]/span[2]")
	private WebElement click_on_Jammu_and_kashmir;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[17]/label[1]/span[2]")
	private WebElement click_on_Jarkhand;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[18]/label[1]/span[2]")
	private WebElement click_on_Karnataka;

	@FindBy(xpath="//div[3]/div[1]/div[4]/div[19]/label[1]/span[2]")
	private WebElement click_on_Kerala;

	@FindBy(xpath="//div[3]/div[1]/div[4]/div[20]/label[1]/span[2]")
	private WebElement click_on_Ladhak;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[21]/label[1]/span[2]")
	private WebElement click_on_Lakwshadeep_island;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[22]/label[1]/span[2]")
	private WebElement click_on_Madhyapradesh;

	@FindBy(xpath="//div[3]/div[1]/div[4]/div[23]/label[1]/span[2]")
	private WebElement click_on_Maharastra;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[24]/label[1]/span[2]")
	private WebElement click_on_Manipur;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[25]/label[1]/span[2]")
	private WebElement click_on_Meghalaya;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[26]/label[1]/span[2]")
	private WebElement click_on_Mizoram;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[27]/label[1]/span[2]")
	private WebElement click_on_Nagaland;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[28]/label[1]/span[2]")
	private WebElement click_on_Odisha;

	@FindBy(xpath="//div[3]/div[1]/div[4]/div[29]/label[1]/span[2]")
	private WebElement click_on_Pudhicherry;

	@FindBy(xpath="//div[3]/div[1]/div[4]/div[30]/label[1]/span[2]")
	private WebElement click_on_Punjab;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[31]/label[1]/span[2]")
	private WebElement click_on_Rajasthan;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[32]/label[1]/span[2]")
	private WebElement click_on_Sikkim;

	@FindBy(xpath="//div[3]/div[1]/div[4]/div[33]/label[1]/span[2]")
	private WebElement click_on_Tamilnadu;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[34]/label[1]/span[2]")
	private WebElement click_on_Telengana;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[35]/label[1]/span[2]")
	private WebElement click_on_Tripura;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[36]/label[1]/span[2]")
	private WebElement click_on_Uttar_pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[37]/label[1]/span[2]")
	private WebElement click_on_Uttarkhand;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[38]/label[1]/span[2]")
	private WebElement click_on_WestBengal;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[1]/button[1]")
	private WebElement click_on_APPLY;

	@FindBy(xpath="//div[3]/div[1]/div[5]/div[1]/div[2]/button[1]")
	private WebElement click_on_canceL;

	@FindBy(xpath="//thead[1]/tr[1]/th[10]/div[1]/div[2]/div[1]/button[1]")
	private WebElement click_on_current_district_filter;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_sort_Atoz;

	@FindBy(xpath="//div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_sort_Ztoa;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement click_on_select_AlL;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
	private WebElement click_on_clr_BTN;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement click_on_enter_text;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[338]/label[1]/span[2]")
	private WebElement click_on_district;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[1]/button[1]")
	private WebElement click_on_applY;





	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[1]/label[1]/span[2]")
	private WebElement click_on_bLank;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[2]/label[1]/span[2]")
	private WebElement click_on_Nicobar_islands;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[3]/label[1]/span[2]")
	private WebElement click_on_North_and_middle_andaman;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[4]/label[1]/span[2]")
	private WebElement click_on_South_andaman;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[5]/label[1]/span[2]")
	private WebElement click_on_Alluri_sita_ramaraju_Andhrapradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[6]/label[1]/span[2]")
	private WebElement click_on_Anikapalli;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[7]/label[1]/span[2]")
	private WebElement click_on_Ananthapuram;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[8]/label[1]/span[2]")
	private WebElement click_on_Annamayya;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[9]/label[1]/span[2]")
	private WebElement click_on_Baptla;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[10]/label[1]/span[2]")
	private WebElement click_on_Chittoor;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[11]/label[1]/span[2]")
	private WebElement click_on_East_godavari;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[12]/label[1]/span[2]")
	private WebElement click_on_Eluru;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[13]/label[1]/span[2]")
	private WebElement click_on_Gunturu;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[14]/label[1]/span[2]")
	private WebElement click_on_Kakinada;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[15]/label[1]/span[2]")
	private WebElement click_on_Konasema;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[16]/label[1]/span[2]")
	private WebElement click_on_Krishna;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[17]/label[1]/span[2]")
	private WebElement click_on_Kurnool;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[18]/label[1]/span[2]")
	private WebElement click_on_Nandyala;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[19]/label[1]/span[2]")
	private WebElement click_on_NTR_andhrapradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[20]/label[1]/span[2]")
	private WebElement click_on_Palnadu;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[21]/label[1]/span[2]")
	private WebElement click_on_Parvathipuram;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[22]/label[1]/span[2]")
	private WebElement click_on_Prakasam;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[23]/label[1]/span[2]")
	private WebElement click_on_Srikakulam;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[24]/label[1]/span[2]")
	private WebElement click_on_Potti_sriramulu_nellore;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[25]/label[1]/span[2]")
	private WebElement click_on_Sri_sathya_sai_andhraPradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[26]/label[1]/span[2]")
	private WebElement click_on_Thirupathi;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[27]/label[1]/span[2]")
	private WebElement click_on_Vishakapatnam;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[28]/label[1]/span[2]")
	private WebElement click_on_Vijayanagaram;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[29]/label[1]/span[2]")
	private WebElement click_on_West_godavari;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[30]/label[1]/span[2]")
	private WebElement click_on_YSR_Andhra_Pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[31]/label[1]/span[2]")
	private WebElement click_on_Anjaw_Arunachal_pradesh;



	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[32]/label[1]/span[2]")
	private WebElement click_on_Changland_ArunachalPradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[33]/label[1]/span[2]")
	private WebElement click_on_East_Siang_ArunachalPradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[35]/label[1]/span[2]")
	private WebElement click_on_Kamle_ArunachalPradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[36]/label[1]/span[2]")
	private WebElement click_on_Kar_daadi_Arunachal_pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[37]/label[1]/span[2]")
	private WebElement click_on_Kurung_Kumkey_ArunachalPradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[38]/label[1]/span[2]")
	private WebElement click_on_Lepa_Arunachal_pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[39]/label[1]/span[2]")
	private WebElement click_on_Lohit_Arunachal_pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[40]/label[1]/span[2]")
	private WebElement click_on_Longding_Arunachal_pradesh;

	@FindBy(xpath="//body[1]/div[3]/div[3]/div[1]/div[4]/div[41]/label[1]/span[2]")
	private WebElement click_on_Lower_dibang_valley_Arunachal_pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[42]/label[1]/span[2]")
	private WebElement click_on_Lower_saing_Arunachal_pradesh;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[43]/label[1]/span[2]")
	private WebElement click_on_Lower_sabnsiri;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[44]/label[1]/span[2]")
	private WebElement click_on_Namsai;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[45]/label[1]/span[2]")
	private WebElement click_on_Pakke_Kessang;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[46]/label[1]/span[2]")
	private WebElement click_on_Papum_pare;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[47]/label[1]/span[2]")
	private WebElement click_on_Shi_yomi;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[48]/label[1]/span[2]")
	private WebElement click_on_Siang;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[49]/label[1]/span[2]")
	private WebElement click_on_Tawang;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[50]/label[1]/span[2]")
	private WebElement click_on_Tirap;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[51]/label[1]/span[2]")
	private WebElement click_on_Upper_dibang_valley;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[52]/label[1]/span[2]")
	private WebElement click_on_Upper_saing;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[53]/label[1]/span[2]")
	private WebElement click_on_Upper_sabnasiri;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[54]/label[1]/span[2]")
	private WebElement click_on_WestKameng;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[55]/label[1]/span[2]")
	private WebElement click_on_West_saing;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[56]/label[1]/span[2]")
	private WebElement click_on_Itanagar_city_Complex;

	


	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[2]/button[1]")
	private WebElement click_on_cancel_BTn;

	@FindBy(xpath="//div[2]/table[1]/thead[1]/tr[1]/th[11]/div[1]/div[2]/div[1]/button[1]")
	private WebElement click_on_Years_of_experience;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_sort_smallest_to_largesT;

	@FindBy(xpath="//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]")
	private WebElement click_on_largest_To_Smallest;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement Enter_text;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
	private WebElement Exter_max_yrs;

	@FindBy(xpath="//div[3]/div[1]/div[2]/div[1]/div[4]/label[1]/span[2]")
	private WebElement click_on_Blanks;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[1]/button[1]")
	private WebElement click_on_YEARS_Apply_btn;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[3]/div[1]/div[2]/button[1]")
	private WebElement click_on_Years_cancel_btn;

	@FindBy(xpath="//tr[1]/th[12]/div[1]/div[2]/div[1]/button[1]")
	private WebElement click_on_Job_roles;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[4]/div[3]/label[1]/span[2]")
	private WebElement click_on_Any_role;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[1]/button[1]")
	private WebElement click_on_appLy_btN;

	@FindBy(xpath="//div[3]/div[3]/div[1]/div[5]/div[1]/div[2]/button[1]")
	private WebElement click_on_canCel;

	/*	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;

	@FindBy(xpath="")
	private WebElement click_on_;
	 */
	public WebDriver driver;
	public Leads_filters(WebDriver driver) 
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void scneario1() throws InterruptedException, AWTException {

		Enter_Login_Email.sendKeys("aniket@hunar.ai");
		System.out.println("Enter E-mail");
		Thread.sleep(5000);

		Enter_Password.sendKeys("T48ead#wa9");
		System.out.println("Enter password");
		Thread.sleep(5000);

		click_on_Submit_btn.click();
		System.out.println("click on Submit Buutton");
		Thread.sleep(3000);

		Click_on_Listing_menu1.click();
		System.out.println("click on Listing menu");
		Thread.sleep(3000);

		click_on_Leads.click();
		System.out.println("click on leads");
		Thread.sleep(3000);


	}
	public void scneario2() throws InterruptedException, AWTException {

		click_on_Full_name_filter.click();
		System.out.println("click on full name filters");
		Thread.sleep(3000);

		Sort_AtoZ.click();
		System.out.println("click on A to Z sort");
		Thread.sleep(3000);

		Sort_ZtoA.click();
		System.out.println("click on Z to A Sort");
		Thread.sleep(3000);

		click_on_apply.click();
		System.out.println("click on Apply Button to sort Z to A");
		Thread.sleep(3000);

		click_on_Full_name_filter.click();
		System.out.println("click on full name filters again");
		Thread.sleep(3000);

		Sort_ZtoA.click();
		System.out.println("click on Z to A Sort");
		Thread.sleep(3000);

		click_on_Cancel.click();
		System.out.println("click on cancel");
		Thread.sleep(3000);

	}
	public void scneario3() throws InterruptedException, AWTException {	


		click_on_mobile_Number_filter.click();
		System.out.println("click on Mobile Number Filter");
		Thread.sleep(3000);

		click_on_sort_smallest_to_largest.click();
		System.out.println("click on Sort Smallest to largest");
		Thread.sleep(3000);

		click_on_mobile_Number_filter_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);

		click_on_mobile_Number_filter.click();
		System.out.println("click on Mobile Number Filter again");
		Thread.sleep(3000);

		click_on_Largest_to_Smallest.click();
		System.out.println("click on largest to smallest");
		Thread.sleep(3000);

		click_on_mobile_Number_filter_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);

		click_on_mobile_Number_filter.click();
		System.out.println("click on Mobile Number Filter");
		Thread.sleep(3000);

		click_on_cancel_btn.click();
		System.out.println("click on cancel button");
		Thread.sleep(3000);


	}
	public void scneario4() throws InterruptedException, AWTException {	


		click_on_Gender_filter.click();
		System.out.println("click on Gender Filter");
		Thread.sleep(3000);

		click_on_Sort_AtoZ.click();
		System.out.println("click on Sort A to Z");
		Thread.sleep(3000);

		click_on_Gender_Apply_btn.click();
		System.out.println("click on Gender Apply Button");
		Thread.sleep(3000);

		click_on_Gender_filter.click();
		System.out.println("click on Gender Filter");
		Thread.sleep(3000);

		click_on_Sort_ZtoA.click();
		System.out.println("click on sort Z to A");
		Thread.sleep(3000);

		click_on_Gender_Apply_btn.click();
		System.out.println("click on Gender Apply Button");
		Thread.sleep(3000);

		click_on_Gender_filter.click();
		System.out.println("click on Gender Filter");
		Thread.sleep(3000);

		click_on_select_all.click();
		System.out.println("click on Select All");
		Thread.sleep(3000);

		click_on_unselect_All.click();
		System.out.println("click on Un-Select All");
		Thread.sleep(3000);


		enter_search.sendKeys("Male");
		System.out.println("enter text in search");
		Thread.sleep(3000);

		enter_search.sendKeys(Keys.CONTROL+"A");
		enter_search.clear();

		click_on_Gender_Apply_btn.click();
		System.out.println("click on Gender Apply Button");
		Thread.sleep(3000);

		click_on_Gender_filter.click();
		System.out.println("click on Gender Filter");
		Thread.sleep(3000);

		click_on_Blank_checkbox.click();
		System.out.println("click on blank checkbox");
		Thread.sleep(3000);

		click_on_Male_checkbox.click();
		System.out.println("click on male checkbox");
		Thread.sleep(3000);

		click_on_Female.click();
		System.out.println("click on female checkbox");
		Thread.sleep(3000);

		click_on_Others.click();
		System.out.println("click on others");
		Thread.sleep(3000);

		click_on_Gender_Apply_btn.click();
		System.out.println("click on gender apply button");
		Thread.sleep(3000);


		click_on_Gender_filter.click();
		System.out.println("click on Gender Filter");
		Thread.sleep(3000);

		click_on_Blank_checkbox.click();
		System.out.println("click on blank checkbox");
		Thread.sleep(3000);

		click_on_Gender_Cancel_btn.click();
		System.out.println("click on Gender cacel button");
		Thread.sleep(3000);


	}
	public void scneario5() throws InterruptedException, AWTException {	



		Click_on_Education_Qualification_filter.click();
		System.out.println("click on Education Qualification Filter");
		Thread.sleep(5000);

		Education_Qualification_Sort_AtoZ.click();
		System.out.println("click on Sort Ato Z");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);

		Click_on_Education_Qualification_filter.click();
		System.out.println("click on Education Qualification Filter");
		Thread.sleep(3000);

		Education_Qualification_Sort_ZtoA.click();
		System.out.println("click on Z to A sort");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(6000);








		Click_on_Education_Qualification_filter.click();
		System.out.println("click on Education Qualification Filter");
		Thread.sleep(5000);

		click_on_select_ALL.click();
		System.out.println("click on select all");
		Thread.sleep(4000);

		Click_on_Education_Qualification_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(4000);






		Click_on_Education_Qualification_filter.click();
		System.out.println("click on Education Qualification Filter");
		Thread.sleep(5000);


		click_on_CLR_btn.click();
		System.out.println("click on clear button");
		Thread.sleep(3000);

		enter_text_in_Education_Qualification_Search.sendKeys("blank");
		System.out.println("Enter text in search box");
		Thread.sleep(6000);

		enter_text_in_Education_Qualification_Search.sendKeys(Keys.CONTROL+"A");
		enter_text_in_Education_Qualification_Search.clear();

		Click_on_Education_Qualification_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);




		Click_on_Education_Qualification_filter.click();
		System.out.println("click on Education Qualification Filter");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Blank_checkbox.click();
		System.out.println("click on blank");
		Thread.sleep(3000);

		Click_on_Education_Qualification_10andBelow_checkbox.click();
		System.out.println("click on 10 & below checkbox");
		Thread.sleep(3000);

		Click_on_Education_Qualification_10passed_checkbox.click();
		System.out.println("click on 10 th passed checkbox");
		Thread.sleep(3000);

		Click_on_Education_Qualification_12thpassed_checkbox.click();
		System.out.println("click on 12th passed");
		Thread.sleep(3000);

		Click_on_Education_Qualification_IT_Training_institute_degree_checkbox.click();
		System.out.println("click on IT traninng degree");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Dipploma_checkbox.click();
		System.out.println("click on diploma checkbox");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Bachelors_checkbox.click();
		System.out.println("click on bachelors checkbox");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Masters_checkbox.click();
		System.out.println("click on Masters checkbox");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Others_checkbox.click();
		System.out.println("click on Others Checkbox");
		Thread.sleep(3000);

		Click_on_Education_Qualification_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);


		Click_on_Education_Qualification_filter.click();
		System.out.println("click on Education Qualification Filter");
		Thread.sleep(3000);


		Click_on_Education_Qualification_cancel_btn.click();
		System.out.println("click on cancel button");
		Thread.sleep(3000);




	}
	public void scneario6() throws InterruptedException, AWTException {	




		Click_on_Created_on_filter.click();
		System.out.println("click on created filters");
		Thread.sleep(3000);

		Click_on_Sort_oldest_to_newest.click();
		System.out.println("click on sorting oldest to newest filter");
		Thread.sleep(3000);

		/*	Click_on_created_Apply_btn.click();
		System.out.println("click on apply button");
		Thread.sleep(3000);


		Click_on_Created_on_filter.click();
		System.out.println("click on created filters");
		Thread.sleep(3000);*/

		Click_on_Sort_newest_Oldest.click();
		System.out.println("click on oldest to newest");
		Thread.sleep(3000);

		Click_on_created_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);



		Click_on_Created_on_filter.click();
		System.out.println("click on created filters");
		Thread.sleep(3000);


		Click_on_created_Cancel_btn.click();
		System.out.println("click on cancel button");
		Thread.sleep(3000);








	}
	public void scneario7() throws InterruptedException, AWTException {	




		click_on_Update_on_Filters.click();
		System.out.println("click on updated filters");
		Thread.sleep(3000);

		Click_on_Updated_Sort_oldest_to_newest.click();
		System.out.println("click on sorting oldest to newest");
		Thread.sleep(3000);

		//	click_on_Updated_apply_btn.click();
		System.out.println("click on apply button");
		Thread.sleep(3000);







		//	click_on_Update_on_Filters.click();
		System.out.println("click on updated filters again");
		Thread.sleep(3000);

		Click_on_Updated_Sort_Newest_to_Oldest.click();
		System.out.println("click on newest to oldest");
		Thread.sleep(3000);

		click_on_Updated_apply_btn.click();
		System.out.println("click on apply button");
		Thread.sleep(3000);





		click_on_Update_on_Filters.click();
		System.out.println("click on updated filters again2");
		Thread.sleep(3000);

		click_on_Updated_cancel_btn.click();
		System.out.println("click on cancel button");
		Thread.sleep(3000);









	}
	public void scneario8() throws InterruptedException, AWTException {	

		Click_on_english_Proficiency_filter.click();
		System.out.println("click on english Proficiency filter");
		Thread.sleep(3000);

		click_on_Sort_A_to_Z.click();
		System.out.println("click on sorting A to Z");
		Thread.sleep(3000);

		click_on_Sort_Z_to_A.click();
		System.out.println("click on sorting Z To A");
		Thread.sleep(3000);

		click_on_ApplY_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);








		Click_on_english_Proficiency_filter.click();
		System.out.println("click on english Proficiency filter again1");
		Thread.sleep(4000);

		click_on_english_proficiency_Blank_checkBox.click();
		System.out.println("click on blank checkbox");
		Thread.sleep(3000);

		click_on_english_proficiency_Beginner_checkBox.click();
		System.out.println("click on beginner checkbox");
		Thread.sleep(3000);

		click_on_english_proficiency_Intermediate_checkBox.click();
		System.out.println("click on intermediate checkbox");
		Thread.sleep(3000);

		click_on_english_proficiency_Advanced_checkBox.click();
		System.out.println("click on advanced checkbox");
		Thread.sleep(3000);

		click_on_ApplY_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);

		Click_on_english_Proficiency_filter.click();
		System.out.println("click on english Proficiency filter2");
		Thread.sleep(3000);

		click_on_cancel.click();
		System.out.println("click on cancel button");
		Thread.sleep(3000);





















		Click_on_english_Proficiency_filter.click();
		System.out.println("click on english Proficiency filter again3");
		Thread.sleep(5000);

		click_on_Select_ALL.click();
		System.out.println("click on select all button");
		Thread.sleep(3000);


		click_on_ApplY_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);

		Click_on_english_Proficiency_filter.click();
		System.out.println("click on english Proficiency filter again4");
		Thread.sleep(3000);

		click_on_Select_ALL.click();
		System.out.println("click on select all button");
		Thread.sleep(3000);


		click_on_Clr_btn.click();
		System.out.println("click on clear button");
		Thread.sleep(6000);


		click_on_ApplY_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(3000);








	}
	public void scneario9() throws InterruptedException, AWTException {	



		Click_on_Current_Address_filter.click();
		System.out.println("click on Current address filter");
		Thread.sleep(10000);





		Click_Current_Address_filter_sort_AtoZ.click();
		System.out.println("click on sorting A to Z");
		Thread.sleep(3000);

		Click_Current_Address_filter_sort_ZtoA.click();
		System.out.println("click on Sorting Z to A");
		Thread.sleep(3000);

		Click_Current_Address_Apply_btn.click();
		System.out.println("click on Apply button");
		Thread.sleep(5000);



	}
	public void scneario10() throws InterruptedException, AWTException {	




		click_on_Current_state_Filter.click();
		System.out.println("click on current state filter");
		Thread.sleep(3000);

		click_on_Sort_ATOZ.click();
		System.out.println("click on sorting A to Z");
		Thread.sleep(3000);

		click_on_Sort_ZTOA.click();
		System.out.println("click on sorting Z to A");
		Thread.sleep(3000);

		click_on_select_ALL_Btn.click();
		System.out.println("click on Select all Button");
		Thread.sleep(3000);

		click_on_cLR_btn.click();
		System.out.println("click on clear button");
		Thread.sleep(3000);

		/*enter_SeArch_text.sendKeys("Blank");
		enter_SeArch_text.sendKeys(Keys.CONTROL+"A");
		enter_SeArch_text.clear();
		System.out.println("enter text");
		Thread.sleep(3000);*/



		click_on_APPLY.click();
		System.out.println("click on apply");
		Thread.sleep(3000);







		click_on_Current_state_Filter.click();
		System.out.println("click on current state filter again");
		Thread.sleep(3000);

		click_on_blank.click();
		System.out.println("click on blank checkbox");
		Thread.sleep(3000);

		Click_Andaman_and_Nicobar.click();
		System.out.println("click on Andaman checkbox ");
		Thread.sleep(3000);

		click_on_AP.click();
		System.out.println("click on Andhrapradesh checkbox");
		Thread.sleep(3000);

		Click_on_Arunachal_Pradesh.click();
		System.out.println("click on Arunachal Pradesh checkbox");
		Thread.sleep(3000);

		click_on_assam.click();
		System.out.println("click on Assam Checkbox");
		Thread.sleep(3000);

		click_on_Bihar.click();
		System.out.println("click on Bihar Checkbox");
		Thread.sleep(3000);

		click_on_Chattisgarh.click();
		System.out.println("click on Chettisgarh");
		Thread.sleep(3000);

		click_on_chandigar.click();
		System.out.println("click on chandigar");
		Thread.sleep(3000);

		click_on_Dadra.click();
		System.out.println("click on dara");
		Thread.sleep(3000);

		click_on_Delhi.click();
		System.out.println("click on Delhi");
		Thread.sleep(3000);

		click_on_GOA.click();
		System.out.println("click on GOA");
		Thread.sleep(3000);

		click_on_Gujarat.click();
		System.out.println("click on Gujarat");
		Thread.sleep(3000);

		click_on_Haryana.click();
		System.out.println("click on Haryana");
		Thread.sleep(3000);

		click_on_Himachal_pradesh.click();
		System.out.println("click on Himachal pradesh");
		Thread.sleep(3000);

		click_on_Jammu_and_kashmir.click();
		System.out.println("click on Jammu and Kashmir");
		Thread.sleep(3000);

		click_on_Jarkhand.click();
		System.out.println("click on Jarkhand");
		Thread.sleep(3000);

		click_on_Karnataka.click();
		System.out.println("click on Karnataka");
		Thread.sleep(3000);

		click_on_Kerala.click();
		System.out.println("click on kerala");
		Thread.sleep(3000);

		click_on_Ladhak.click();
		System.out.println("click on Ladhak");
		Thread.sleep(3000);

		click_on_Lakwshadeep_island.click();
		System.out.println("click on lakwshadeep island");
		Thread.sleep(3000);

		click_on_Madhyapradesh.click();
		System.out.println("click on madhyapradesh");
		Thread.sleep(3000);

		click_on_Maharastra.click();
		System.out.println("click on Maharastra");
		Thread.sleep(3000);

		click_on_Manipur.click();
		System.out.println("click on manipur");
		Thread.sleep(3000);

		click_on_Meghalaya.click();
		System.out.println("click Meghalaya");
		Thread.sleep(3000);

		click_on_Mizoram.click();
		System.out.println("click on Mizoram");
		Thread.sleep(3000);

		click_on_Nagaland.click();
		System.out.println("click on Nagaland");
		Thread.sleep(3000);

		click_on_Odisha.click();
		System.out.println("click on odisha");
		Thread.sleep(3000);

		click_on_Pudhicherry.click();
		System.out.println("click on Pudhicherry");
		Thread.sleep(3000);

		click_on_Punjab.click();
		System.out.println("click on punjab");
		Thread.sleep(3000);

		click_on_Rajasthan.click();
		System.out.println("click on Rajasthan");
		Thread.sleep(3000);

		click_on_Sikkim.click();
		System.out.println("click on Sikkim");
		Thread.sleep(3000);

		click_on_Tamilnadu.click();
		System.out.println("click on Tamilnadu");
		Thread.sleep(3000);

		click_on_Telengana.click();
		System.out.println("click on Telengana");
		Thread.sleep(3000);

		click_on_Tripura.click();
		System.out.println("click on Tripura");
		Thread.sleep(3000);

		click_on_Uttar_pradesh.click();
		System.out.println("click on Uttarpradesh");
		Thread.sleep(3000);

		click_on_Uttarkhand.click();
		System.out.println("click on Uttarkhand");
		Thread.sleep(3000);

		click_on_WestBengal.click();
		System.out.println("click on westbengal");
		Thread.sleep(3000);

		click_on_APPLY.click();
		System.out.println("click on apply");
		Thread.sleep(3000);



		click_on_Current_state_Filter.click();
		System.out.println("click on current state filter");
		Thread.sleep(3000);

		click_on_canceL.click();
		System.out.println("click on cancel");
		Thread.sleep(3000);







	}
	public void scneario11() throws InterruptedException, AWTException {	



		click_on_current_district_filter.click();
		System.out.println("click on current district filter");
		Thread.sleep(3000);

		click_on_sort_Atoz.click();
		System.out.println("click on Sort Ato z");
		Thread.sleep(3000);

		click_on_select_AlL.click();
		System.out.println("click on select all");
		Thread.sleep(3000);

		click_on_clr_BTN.click();
		System.out.println("click on clear");
		Thread.sleep(3000);

		/*click_on_enter_text.sendKeys("Andaman and Nicobar Islands");
		System.out.println("enter text");
		Thread.sleep(3000);
		click_on_enter_text.sendKeys(Keys.CONTROL+"A");

		click_on_enter_text.clear();*/

		click_on_district.click();
		System.out.println("click on district");
		Thread.sleep(3000);

		click_on_applY.click();
		System.out.println("click on apply");
		Thread.sleep(3000);






		click_on_current_district_filter.click();
		System.out.println("click on current district filter");
		Thread.sleep(3000);

		click_on_bLank.click();
		System.out.println("click on blank checkbox");
		Thread.sleep(3000);

		click_on_Nicobar_islands.click();
		System.out.println("click on nicobar isalnds checkbox");
		Thread.sleep(3000);	

		click_on_North_and_middle_andaman.click();
		System.out.println("click on north & middle Andaman Nicobar isalnds checkbox");
		Thread.sleep(3000);	

		click_on_South_andaman.click();
		System.out.println("click on South Andaman &Nicobar Isalnd checkbox");
		Thread.sleep(3000);	

		click_on_Alluri_sita_ramaraju_Andhrapradesh.click();
		System.out.println("click on Allu Sit Ramam Raju, Andhrapradesh checkbox");
		Thread.sleep(3000);	

		click_on_Anikapalli.click();
		System.out.println("click on  Anakapalli checkbox");
		Thread.sleep(3000);	

		click_on_Ananthapuram.click();
		System.out.println("click on  Ananthapur checkbox");
		Thread.sleep(3000);	

		click_on_Annamayya.click();
		System.out.println("click on Annamaya checkbox");
		Thread.sleep(3000);	

		click_on_Baptla.click();
		System.out.println("click on Baptla checkbox");
		Thread.sleep(3000);	

		click_on_Chittoor.click();
		System.out.println("click on Chitoor checkbox");
		Thread.sleep(3000);	

		click_on_East_godavari.click();
		System.out.println("click on EastGodavari checkbox");
		Thread.sleep(3000);	

		click_on_Eluru.click();
		System.out.println("click on eluru checkbox");
		Thread.sleep(3000);	

		click_on_Gunturu.click();
		System.out.println("click on Guntur checkbox");
		Thread.sleep(3000);	

		click_on_Kakinada.click();
		System.out.println("click on Kakinada checkbox");
		Thread.sleep(3000);	

		click_on_Konasema.click();
		System.out.println("click on Konasema checkbox");
		Thread.sleep(3000);	

		click_on_Krishna.click();
		System.out.println("click on Krishna checkbox");
		Thread.sleep(3000);	

		click_on_Kurnool.click();
		System.out.println("click on Kurnool checkbox");
		Thread.sleep(3000);	

		click_on_Nandyala.click();
		System.out.println("click on Nandyala checkbox");
		Thread.sleep(3000);	

		click_on_NTR_andhrapradesh.click();
		System.out.println("click on NTR Andhrapradesh checkbox");
		Thread.sleep(3000);	

		click_on_Palnadu.click();
		System.out.println("click on Palanadu checkbox");
		Thread.sleep(3000);	

		click_on_Parvathipuram.click();
		System.out.println("click on parvathipuram checkbox");
		Thread.sleep(3000);	

		click_on_Prakasam.click();
		System.out.println("click on Prakasam checkbox");
		Thread.sleep(3000);	

		click_on_Srikakulam.click();
		System.out.println("click on Srikakulam checkbox");
		Thread.sleep(3000);	

		click_on_Potti_sriramulu_nellore.click();
		System.out.println("click on Potti Sriramulu nellore checkbox");
		Thread.sleep(3000);	

		click_on_Sri_sathya_sai_andhraPradesh.click();
		System.out.println("click on Sri Sathya Sai checkbox");
		Thread.sleep(3000);	

		click_on_Thirupathi.click();
		System.out.println("click on Thirupathi checkbox");
		Thread.sleep(3000);	

		click_on_Vishakapatnam.click();
		System.out.println("click on Vishakapatnam checkbox");
		Thread.sleep(3000);	

		click_on_Vijayanagaram.click();
		System.out.println("click on Vijayanagaram checkbox");
		Thread.sleep(3000);	

		click_on_West_godavari.click();
		System.out.println("click on WestGodavari checkbox");
		Thread.sleep(3000);	

		click_on_YSR_Andhra_Pradesh.click();
		System.out.println("click on YSR AP checkbox");
		Thread.sleep(3000);	

		click_on_Anjaw_Arunachal_pradesh.click();
		System.out.println("click on Anjaw checkbox");
		Thread.sleep(3000);	

		click_on_Changland_ArunachalPradesh.click();
		System.out.println("click on Chngland checkbox");
		Thread.sleep(3000);	

		click_on_East_Siang_ArunachalPradesh.click();
		System.out.println("click on East Saing checkbox");
		Thread.sleep(3000);	

		click_on_Kamle_ArunachalPradesh.click();
		System.out.println("click on kamle checkbox");
		Thread.sleep(3000);	

		click_on_Kar_daadi_Arunachal_pradesh.click();
		System.out.println("click on Kae Daadi checkbox");
		Thread.sleep(3000);	

		click_on_Lepa_Arunachal_pradesh.click();
		System.out.println("click on lepa checkbox");
		Thread.sleep(3000);	

		click_on_Lohit_Arunachal_pradesh.click();
		System.out.println("click on Lohit  checkbox");
		Thread.sleep(3000);	

		click_on_Longding_Arunachal_pradesh.click();
		System.out.println("click on longding checkbox");
		Thread.sleep(3000);	

		click_on_Lower_dibang_valley_Arunachal_pradesh.click();
		System.out.println("click on  Lowerdibang valley checkbox");
		Thread.sleep(3000);	

		click_on_Lower_saing_Arunachal_pradesh.click();
		System.out.println("click on Lower Saing checkbox");
		Thread.sleep(3000);	

		click_on_Lower_sabnsiri.click();
		System.out.println("click on Lower Sabansiri checkbox");
		Thread.sleep(3000);	

		click_on_Namsai.click();
		System.out.println("click on Namsai checkbox");
		Thread.sleep(3000);	

		click_on_Pakke_Kessang.click();
		System.out.println("click on Pakke Kessang checkbox");
		Thread.sleep(3000);	

		click_on_Papum_pare.click();
		System.out.println("click on Papum pare checkbox");
		Thread.sleep(3000);	

		click_on_Shi_yomi.click();
		System.out.println("click on Shi Yomi checkbox");
		Thread.sleep(3000);	

		click_on_Siang.click();
		System.out.println("click on Saing checkbox");
		Thread.sleep(3000);	

		click_on_Tawang.click();
		System.out.println("click on Twang checkbox");
		Thread.sleep(3000);	

		click_on_Upper_dibang_valley.click();
		System.out.println("click on Upper Dibang valley checkbox");
		Thread.sleep(3000);	

		click_on_Upper_saing.click();
		System.out.println("click on upper saing checkbox");
		Thread.sleep(3000);	

		click_on_Upper_sabnasiri.click();
		System.out.println("click on upper sabnasari checkbox");
		Thread.sleep(3000);	

		click_on_WestKameng.click();
		System.out.println("click on westkameng checkbox");
		Thread.sleep(3000);	

		click_on_West_saing.click();
		System.out.println("click on west saing checkbox");
		Thread.sleep(3000);	

		click_on_Itanagar_city_Complex.click();
		System.out.println("click on itanagara city checkbox");
		Thread.sleep(6000);	


		click_on_applY.click();
		System.out.println("click on apply");
		Thread.sleep(6000);


		/*	click_on_current_district_filter.sendKeys(Keys.ARROW_DOWN);

		// Hit the Enter key to select the option
		click_on_current_district_filter.sendKeys(Keys.ENTER);*/


		click_on_current_district_filter.click();
		System.out.println("click on current district filter");
		Thread.sleep(6000);

		click_on_cancel_BTn.click();
		System.out.println("click on cancel");
		Thread.sleep(6000);







	}
	public void scneario12() throws InterruptedException, AWTException {	

		click_on_Years_of_experience.click();
		System.out.println("click on Years Of experience");
		Thread.sleep(4000);

		click_on_sort_smallest_to_largesT.click();
		System.out.println("click on smallest to largest");
		Thread.sleep(4000);

		click_on_largest_To_Smallest.click();
		System.out.println("click on largest to smallest");
		Thread.sleep(4000);

		Enter_text.sendKeys("2");
		System.out.println("enter Min experience");
		Thread.sleep(4000);

		Exter_max_yrs.sendKeys("5");
		System.out.println("enter Min experience");
		Thread.sleep(4000);

		click_on_Blanks.click();
		System.out.println("click on blank");
		Thread.sleep(3000);

		click_on_YEARS_Apply_btn.click();
		System.out.println("click on apply");
		Thread.sleep(3000);


		click_on_Years_of_experience.click();
		System.out.println("click on Years Of experience");
		Thread.sleep(3000);

		click_on_Years_cancel_btn.click();
		System.out.println("click on cancel");
		Thread.sleep(3000);













	}
	public void scneario13() throws InterruptedException, AWTException {	








		click_on_Job_roles.click();
		System.out.println("click on Job roles Filters");
		Thread.sleep(5000);


		click_on_Any_role.click();
		System.out.println("click on role");
		Thread.sleep(3000);

		click_on_appLy_btN.click();
		System.out.println("click on apply");
		Thread.sleep(3000);

		click_on_Job_roles.click();
		System.out.println("click on job roles");
		Thread.sleep(3000);

		click_on_canCel.click();
		System.out.println("click on cancel");
		Thread.sleep(3000);



	}


}


