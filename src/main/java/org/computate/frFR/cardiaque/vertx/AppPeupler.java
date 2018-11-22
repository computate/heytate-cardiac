package org.computate.frFR.cardiaque.vertx;

import java.time.LocalDate;

import org.computate.frFR.cardiaque.config.ConfigSite;
import org.computate.frFR.cardiaque.contexte.SiteContexte;
import org.computate.frFR.cardiaque.couverture.Couverture;
import org.computate.frFR.cardiaque.requete.RequeteSite;
import org.computate.frFR.cardiaque.utilisateur.UtilisateurSite;
import org.computate.frFR.cardiaque.utilisateur.UtilisateurSiteApiGen;
import org.computate.frFR.cardiaque.warfarin.CalculInr;
import org.computate.frFR.cardiaque.warfarin.CalculInrApiGen;

public class AppPeupler extends AppPeuplerGen<Object> {   

	protected void _requeteSite_(Couverture<RequeteSite> c) throws Exception {
	}

	protected void _siteContexte(SiteContexte o) throws Exception {
	}

	protected void _configSite(Couverture<ConfigSite> c) throws Exception {
		c.o(siteContexte.getConfigSite());
	}

	public static void main(String[] args) throws Exception {
		AppPeupler api = new AppPeupler();
		api.initLoinAppPeupler();
		api.peuplerDonnees();
	}

	public void peuplerDonnees() throws Exception {
		CalculInr calculInr;
		UtilisateurSite employeEntreprise;
		UtilisateurSite patientWarfarin;
		CalculInrApiGen apiCalculInr = new CalculInrApiGen();
		UtilisateurSiteApiGen apiUtilisateurSite = new UtilisateurSiteApiGen();
		
		employeEntreprise = new UtilisateurSite() {{
			setUtilisateurPrenom("Employee");
			setUtilisateurNomFamille("Jones");
			setUtilisateurMail("employee.jones@mailinator.com");
			setUtilisateurId("43c229ce-87ec-5bc2-9ae1-3321d1f88321");
		}}.initLoinUtilisateurSite(requeteSite_);
		apiUtilisateurSite.postUtilisateurSite(patientWarfarin);

		patientWarfarin = new UtilisateurSite() {{
			setUtilisateurPrenom("Jane");
			setUtilisateurNomFamille("Doe");
			setUtilisateurMail("jane.doe@mailinator.com");
		}}.initLoinUtilisateurSite(requeteSite_);
		apiUtilisateurSite.postUtilisateurSite(patientWarfarin);

		calculInr = new CalculInr() {{
			setPatientPrendCoumadin(CalculInr.VAL_patientPrendCoumadinOui);
			setButActuel("1. PAF 2. Goal 2-3. 3. Therapy since 2012. ");
			setDoseActuel("4mg daily except 2mg sat");
			setMedicamentActuel("Wrfarin. 4mg tabs available");
			setChangementDose("11/15 INR @ 1.99. If dose verified/none missed change to 4mg");
			setNotesComplementaires("MDINR (Goes by Pearl); Sensitive to 2mg/titration. ");
			setInfoContact("Home #785-7892 Call after 4pm");
			setDateInr(LocalDate.of(2018, 11, 15));
			setDateReverifier(LocalDate.of(2018,  11,  26));
		}}.initLoinCalculInr(requeteSite_);
		apiCalculInr.postCalculInr(calculInr);
	}
}
