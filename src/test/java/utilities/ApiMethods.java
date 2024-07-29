package utilities;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class ApiMethods {


    public static Response jobSearchPostMethod(String job, String country){
        return  given().contentType("application/x-www-form-urlencoded; charset=UTF-8").
                header("RFT"," 2-OI6Ef6SfvhTXNRy9gqjOuuCmFm2epLWAoft5UUuYBKoAqCGIowuXFHDIfQAbk8WvP8se_RMI4UF3aAf_YpoIyW1Pm5O_VJv2MstSlY2tI6BxK4NVR3jSclCZreWOWBLB2uzg2").
                header("Cookie","tg_rft=^mHOwVU4ei7NrQmF6n2llJb/gAewiggqW8DkdZR4sm9lKjwoWo3Nf4D4dN8aqigFzzljy446oEvDpcUWUpgMSEPcZ3tSH90ojDHue1sa6zgo=; tg_rft_mvc=1Cd0EMoBqbLrr3a1NEfbC_b6c9VnHAP3xu4GUZ7XntnB10_p_DDeT09lKPwSIbuJ9PVTUNwZkF39zEOpCz57m61c0Vhr6mLNKJRWanc_KK7Q9gddSamDFLvr_65enfunT0bW8g2; geo-country=CH; tg_session_25008_5131=^j45VQTl_slp_rhc_Ea3x64wWg0Uim41tTmizU_slp_rhc_hnWGKxv3BoWgduqxy6tGKtTeKKQinX2rw5EX/mV0vEA2wccwoJ4zLWdlnVwkS_slp_rhc_Beoi9B55ZlKoJqY=; campID=CAAS-ActivityStream; ubs_cookie_settings_2.0.4=0-4-3-2-1; sat_track=true; s_visit=1; s_mtouch=ReferringDomains; AMCVS_73FAC51D54C72AE50A4C98BC%40AdobeOrg=1; s_ecid=MCMID%7C78077775986875249254604023937468031913; s_cc=true; aam_uuid=78051290593717328344607016107948545270; at_check=true; DC_4c68e56a629a=true; DC_0a3f2cfa7bfd=true; DC_809f03050cd3=true; investor_type=private-investor; application_start-wizard--1115039343=application%20start; _gcl_au=1.1.2017472496.1721725846; form_start-/content/sites/global/en/careers/search-jobs/support=start; AAMSID=AAM%3D21740122%3A21740132%3A21739909%3A21740178%3A21740131%3A21740182; br_sat_track=true; aam_uuid=78051290593717328344607016107948545270; tg_session_25008_5054=^oZOJ9_slp_rhc_A/XCINHqz4X/ihpx3oH0f8XM3Q3qEiJYSE23_slp_rhc_8BrvYAABowNzuYo6y_slp_rhc_A1i9KCpTg0kYR78MI1Ul7fa9mYSjGo8dHtnEKwR6zuCu/s=; tg_session_25008_5012=^dPpoyR2un2Jvp1bMsF1TSkT5pwzutN74oof5XPNwEksCGJUTntVARwzudU/HTZ9cLDOuIsgB4xWXgCi_slp_rhc_gBdurdNrau0_slp_rhc_lNmNOHQo_slp_rhc_uozpD8=; tg_session=^dPpoyR2un2Jvp1bMsF1TSkT5pwzutN74oof5XPNwEksCGJUTntVARwzudU/HTZ9cLDOuIsgB4xWXgCi_slp_rhc_gBdurdNrau0_slp_rhc_lNmNOHQo_slp_rhc_uozpD8=; ehometrack=Job%20Search%20-%206169; s_gnr=1721737905674-Repeat; interstitial-136756126=true; DC_893611857bf77538466b066509392d93_1715094067659=true; s_gpv_channel=global%3Ahomepage; mbox=PC#721a867dc81e4adc8cba1aaf5e8222cb.37_0#1753754313|session#dad758564df247278f98146677ab7cf8#1722199221; AMCV_73FAC51D54C72AE50A4C98BC%40AdobeOrg=842390332%7CMCMID%7C78077775986875249254604023937468031913%7CMCAAMLH-1722810727%7C6%7CMCAAMB-1722810727%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1722213127s%7CNONE%7CMCAID%7CNONE%7CvVersion%7C5.3.0%7CMCIDTS%7C19933%7CMCCIDH%7C1509598589; s_lv_s=Less%20than%201%20day; s_ppn=https%3A%2F%2Fwww.ubs.com%2Fglobal%2Fen%2Fcareers%2Fsearch-jobs.html; s_gpv_url2=https%3A%2F%2Fwww.ubs.com%2Fglobal%2Fen%2Fcareers%2Fcareer-comeback.html; s_gpv_url=https%3A%2F%2Fwww.ubs.com%2Fglobal%2Fen%2Fcareers%2Fsearch-jobs.html; s_nr=1722206109151-Repeat; s_lv=1722206109152; s_sq=%5B%5BB%5D%5D; s_ppvl=https%253A%2F%2Fwww.ubs.com%2Fglobal%2Fen%2Fcareers%2Fsearch-jobs.html%2C17%2C17%2C383%2C1600%2C383%2C1600%2C900%2C1%2CP; da_sid=57E5F9018E33AE8FD375AA13A4AD01130E.1|3|0|3; da_lid=2AC770909A7BEA13138CBB99E69FC2F890|0|0|0; da_intState=0; scrollTracking=true; s_ppv=https%253A%2F%2Fwww.ubs.com%2Fglobal%2Fen%2Fcareers%2Fsearch-jobs.html%2C49%2C17%2C1104%2C1600%2C204%2C1600%2C900%2C1%2CP; s_ht=1722206232658; s_hc=1%7C0%7C0%7C0%7C0").
                formParam("LocationCustomSolrFields","FORMTEXT2,FORMTEXT23,Location").
                formParam("Keyword",job).
                formParam("KeywordCustomSolrFields","FORMTEXT2,FORMTEXT21,AutoReq,Department,JobTitle").
                formParam("Location",country).
                formParam("PartnerId","25008").
                formParam("SiteId","5012").
                formParam("encryptedsessionvalue","^dPpoyR2un2Jvp1bMsF1TSkT5pwzutN74oof5XPNwEksCGJUTntVARwzudU/HTZ9cLDOuIsgB4xWXgCi_slp_rhc_gBdurdNrau0_slp_rhc_lNmNOHQo_slp_rhc_uozpD8=").
                post(Resources.jobsSearchPage.path);
    }

}



