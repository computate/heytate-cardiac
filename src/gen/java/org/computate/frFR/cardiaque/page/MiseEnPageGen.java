package org.computate.frFR.cardiaque.page;

import org.computate.frFR.cardiaque.couverture.Couverture;
import java.util.Date;
import org.computate.frFR.cardiaque.cluster.Cluster;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import org.apache.commons.text.StringEscapeUtils;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.time.ZoneId;
import java.util.Objects;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import java.time.format.DateTimeFormatter;
import org.computate.frFR.cardiaque.requete.RequeteSite;
import java.lang.Boolean;
import org.computate.frFR.cardiaque.ecrivain.ToutEcrivain;
import java.lang.Object;
import java.lang.String;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class MiseEnPageGen<DEV> extends Object {

	//////////////////
	// requeteSite_ //
	//////////////////

	/**	L'entité « requeteSite_ »
	 *	 is defined as null before being initialized. 
	 */
	protected RequeteSite requeteSite_;
	public Couverture<RequeteSite> requeteSite_Couverture = new Couverture<RequeteSite>().p(this).c(RequeteSite.class).var("requeteSite_").o(requeteSite_);

	/**	<br/>L'entité « requeteSite_ »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteSite_(Couverture<RequeteSite> c);

	public RequeteSite getRequeteSite_() {
		return requeteSite_;
	}

	public void setRequeteSite_(RequeteSite requeteSite_) {
		this.requeteSite_ = requeteSite_;
		this.requeteSite_Couverture.dejaInitialise = true;
	}

	//////////////////////
	// pageDocumentSolr //
	//////////////////////

	/**	L'entité « pageDocumentSolr »
	 *	 is defined as null before being initialized. 
	 */
	protected SolrDocument pageDocumentSolr;
	public Couverture<SolrDocument> pageDocumentSolrCouverture = new Couverture<SolrDocument>().p(this).c(SolrDocument.class).var("pageDocumentSolr").o(pageDocumentSolr);

	/**	<br/>L'entité « pageDocumentSolr »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageDocumentSolr">Trouver l'entité pageDocumentSolr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageDocumentSolr(Couverture<SolrDocument> c);

	public SolrDocument getPageDocumentSolr() {
		return pageDocumentSolr;
	}

	public void setPageDocumentSolr(SolrDocument pageDocumentSolr) {
		this.pageDocumentSolr = pageDocumentSolr;
		this.pageDocumentSolrCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageDocumentSolrInit() {
		if(!pageDocumentSolrCouverture.dejaInitialise) {
			_pageDocumentSolr(pageDocumentSolrCouverture);
			if(pageDocumentSolr == null)
				setPageDocumentSolr(pageDocumentSolrCouverture.o);
		}
		pageDocumentSolrCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	///////
	// w //
	///////

	/**	L'entité « w »
	 *	 is defined as null before being initialized. 
	 */
	protected ToutEcrivain w;
	public Couverture<ToutEcrivain> wCouverture = new Couverture<ToutEcrivain>().p(this).c(ToutEcrivain.class).var("w").o(w);

	/**	<br/>L'entité « w »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:w">Trouver l'entité w dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _w(Couverture<ToutEcrivain> c);

	public ToutEcrivain getW() {
		return w;
	}

	public void setW(ToutEcrivain w) {
		this.w = w;
		this.wCouverture.dejaInitialise = true;
	}
	protected MiseEnPage wInit() {
		if(!wCouverture.dejaInitialise) {
			_w(wCouverture);
			if(w == null)
				setW(wCouverture.o);
		}
		if(w != null)
			w.initLoinPourClasse(requeteSite_);
		wCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	////////////////////////
	// pageVisibleAuxBots //
	////////////////////////

	/**	L'entité « pageVisibleAuxBots »
	 *	 is defined as null before being initialized. 
	 */
	protected Boolean pageVisibleAuxBots;
	public Couverture<Boolean> pageVisibleAuxBotsCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("pageVisibleAuxBots").o(pageVisibleAuxBots);

	/**	<br/>L'entité « pageVisibleAuxBots »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageVisibleAuxBots">Trouver l'entité pageVisibleAuxBots dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageVisibleAuxBots(Couverture<Boolean> c);

	public Boolean getPageVisibleAuxBots() {
		return pageVisibleAuxBots;
	}

	public void setPageVisibleAuxBots(Boolean pageVisibleAuxBots) {
		this.pageVisibleAuxBots = pageVisibleAuxBots;
		this.pageVisibleAuxBotsCouverture.dejaInitialise = true;
	}
	public MiseEnPage setPageVisibleAuxBots(String o) {
		if(org.apache.commons.lang3.BooleanUtils.isTrue(org.apache.commons.lang3.BooleanUtils.toBoolean(o)))
			this.pageVisibleAuxBots = Boolean.parseBoolean(o);
		this.pageVisibleAuxBotsCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	protected MiseEnPage pageVisibleAuxBotsInit() {
		if(!pageVisibleAuxBotsCouverture.dejaInitialise) {
			_pageVisibleAuxBots(pageVisibleAuxBotsCouverture);
			if(pageVisibleAuxBots == null)
				setPageVisibleAuxBots(pageVisibleAuxBotsCouverture.o);
		}
		pageVisibleAuxBotsCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public Boolean solrPageVisibleAuxBots() {
		return pageVisibleAuxBots;
	}

	public String strPageVisibleAuxBots() {
		return pageVisibleAuxBots == null ? "" : pageVisibleAuxBots.toString();
	}

	public String nomAffichagePageVisibleAuxBots() {
		return null;
	}

	public String htmTooltipPageVisibleAuxBots() {
		return null;
	}

	public String htmPageVisibleAuxBots() {
		return pageVisibleAuxBots == null ? "" : StringEscapeUtils.escapeHtml4(strPageVisibleAuxBots());
	}

	////////////
	// pageH1 //
	////////////

	/**	L'entité « pageH1 »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH1;
	public Couverture<String> pageH1Couverture = new Couverture<String>().p(this).c(String.class).var("pageH1").o(pageH1);

	/**	<br/>L'entité « pageH1 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageH1">Trouver l'entité pageH1 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH1(Couverture<String> c);

	public String getPageH1() {
		return pageH1;
	}

	public void setPageH1(String pageH1) {
		this.pageH1 = pageH1;
		this.pageH1Couverture.dejaInitialise = true;
	}
	protected MiseEnPage pageH1Init() {
		if(!pageH1Couverture.dejaInitialise) {
			_pageH1(pageH1Couverture);
			if(pageH1 == null)
				setPageH1(pageH1Couverture.o);
		}
		pageH1Couverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageH1() {
		return pageH1;
	}

	public String strPageH1() {
		return pageH1 == null ? "" : pageH1;
	}

	public String nomAffichagePageH1() {
		return null;
	}

	public String htmTooltipPageH1() {
		return null;
	}

	public String htmPageH1() {
		return pageH1 == null ? "" : StringEscapeUtils.escapeHtml4(strPageH1());
	}

	////////////
	// pageH2 //
	////////////

	/**	L'entité « pageH2 »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH2;
	public Couverture<String> pageH2Couverture = new Couverture<String>().p(this).c(String.class).var("pageH2").o(pageH2);

	/**	<br/>L'entité « pageH2 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageH2">Trouver l'entité pageH2 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH2(Couverture<String> c);

	public String getPageH2() {
		return pageH2;
	}

	public void setPageH2(String pageH2) {
		this.pageH2 = pageH2;
		this.pageH2Couverture.dejaInitialise = true;
	}
	protected MiseEnPage pageH2Init() {
		if(!pageH2Couverture.dejaInitialise) {
			_pageH2(pageH2Couverture);
			if(pageH2 == null)
				setPageH2(pageH2Couverture.o);
		}
		pageH2Couverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageH2() {
		return pageH2;
	}

	public String strPageH2() {
		return pageH2 == null ? "" : pageH2;
	}

	public String nomAffichagePageH2() {
		return null;
	}

	public String htmTooltipPageH2() {
		return null;
	}

	public String htmPageH2() {
		return pageH2 == null ? "" : StringEscapeUtils.escapeHtml4(strPageH2());
	}

	/////////////////
	// pageH1Court //
	/////////////////

	/**	L'entité « pageH1Court »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH1Court;
	public Couverture<String> pageH1CourtCouverture = new Couverture<String>().p(this).c(String.class).var("pageH1Court").o(pageH1Court);

	/**	<br/>L'entité « pageH1Court »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageH1Court">Trouver l'entité pageH1Court dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH1Court(Couverture<String> c);

	public String getPageH1Court() {
		return pageH1Court;
	}

	public void setPageH1Court(String pageH1Court) {
		this.pageH1Court = pageH1Court;
		this.pageH1CourtCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageH1CourtInit() {
		if(!pageH1CourtCouverture.dejaInitialise) {
			_pageH1Court(pageH1CourtCouverture);
			if(pageH1Court == null)
				setPageH1Court(pageH1CourtCouverture.o);
		}
		pageH1CourtCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageH1Court() {
		return pageH1Court;
	}

	public String strPageH1Court() {
		return pageH1Court == null ? "" : pageH1Court;
	}

	public String nomAffichagePageH1Court() {
		return null;
	}

	public String htmTooltipPageH1Court() {
		return null;
	}

	public String htmPageH1Court() {
		return pageH1Court == null ? "" : StringEscapeUtils.escapeHtml4(strPageH1Court());
	}

	/////////////////
	// pageH2Court //
	/////////////////

	/**	L'entité « pageH2Court »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH2Court;
	public Couverture<String> pageH2CourtCouverture = new Couverture<String>().p(this).c(String.class).var("pageH2Court").o(pageH2Court);

	/**	<br/>L'entité « pageH2Court »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageH2Court">Trouver l'entité pageH2Court dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH2Court(Couverture<String> c);

	public String getPageH2Court() {
		return pageH2Court;
	}

	public void setPageH2Court(String pageH2Court) {
		this.pageH2Court = pageH2Court;
		this.pageH2CourtCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageH2CourtInit() {
		if(!pageH2CourtCouverture.dejaInitialise) {
			_pageH2Court(pageH2CourtCouverture);
			if(pageH2Court == null)
				setPageH2Court(pageH2CourtCouverture.o);
		}
		pageH2CourtCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageH2Court() {
		return pageH2Court;
	}

	public String strPageH2Court() {
		return pageH2Court == null ? "" : pageH2Court;
	}

	public String nomAffichagePageH2Court() {
		return null;
	}

	public String htmTooltipPageH2Court() {
		return null;
	}

	public String htmPageH2Court() {
		return pageH2Court == null ? "" : StringEscapeUtils.escapeHtml4(strPageH2Court());
	}

	///////////////
	// pageTitre //
	///////////////

	/**	L'entité « pageTitre »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageTitre;
	public Couverture<String> pageTitreCouverture = new Couverture<String>().p(this).c(String.class).var("pageTitre").o(pageTitre);

	/**	<br/>L'entité « pageTitre »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageTitre">Trouver l'entité pageTitre dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageTitre(Couverture<String> c);

	public String getPageTitre() {
		return pageTitre;
	}

	public void setPageTitre(String pageTitre) {
		this.pageTitre = pageTitre;
		this.pageTitreCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageTitreInit() {
		if(!pageTitreCouverture.dejaInitialise) {
			_pageTitre(pageTitreCouverture);
			if(pageTitre == null)
				setPageTitre(pageTitreCouverture.o);
		}
		pageTitreCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageTitre() {
		return pageTitre;
	}

	public String strPageTitre() {
		return pageTitre == null ? "" : pageTitre;
	}

	public String nomAffichagePageTitre() {
		return null;
	}

	public String htmTooltipPageTitre() {
		return null;
	}

	public String htmPageTitre() {
		return pageTitre == null ? "" : StringEscapeUtils.escapeHtml4(strPageTitre());
	}

	/////////////
	// pageUri //
	/////////////

	/**	L'entité « pageUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUri;
	public Couverture<String> pageUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri").o(pageUri);

	/**	<br/>L'entité « pageUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUri">Trouver l'entité pageUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUri(Couverture<String> c);

	public String getPageUri() {
		return pageUri;
	}

	public void setPageUri(String pageUri) {
		this.pageUri = pageUri;
		this.pageUriCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageUriInit() {
		if(!pageUriCouverture.dejaInitialise) {
			_pageUri(pageUriCouverture);
			if(pageUri == null)
				setPageUri(pageUriCouverture.o);
		}
		pageUriCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageUri() {
		return pageUri;
	}

	public String strPageUri() {
		return pageUri == null ? "" : pageUri;
	}

	public String nomAffichagePageUri() {
		return null;
	}

	public String htmTooltipPageUri() {
		return null;
	}

	public String htmPageUri() {
		return pageUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageUri());
	}

	//////////////
	// pageUris //
	//////////////

	/**	L'entité « pageUris »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> pageUris = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> pageUrisCouverture = new Couverture<List<String>>().p(this).c(List.class).var("pageUris").o(pageUris);

	/**	<br/>L'entité « pageUris »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUris">Trouver l'entité pageUris dans Solr</a>
	 * <br/>
	 * @param pageUris est l'entité déjà construit. 
	 **/
	protected abstract void _pageUris(List<String> l);

	public List<String> getPageUris() {
		return pageUris;
	}

	public void setPageUris(List<String> pageUris) {
		this.pageUris = pageUris;
		this.pageUrisCouverture.dejaInitialise = true;
	}
	public MiseEnPage addPageUris(String...objets) {
		for(String o : objets) {
			addPageUris(o);
		}
		return (MiseEnPage)this;
	}
	public MiseEnPage addPageUris(String o) {
		if(o != null && !pageUris.contains(o))
			this.pageUris.add(o);
		return (MiseEnPage)this;
	}
	protected MiseEnPage pageUrisInit() {
		if(!pageUrisCouverture.dejaInitialise) {
			_pageUris(pageUris);
		}
		pageUrisCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public List<String> solrPageUris() {
		return pageUris;
	}

	public String strPageUris() {
		return pageUris == null ? "" : pageUris.toString();
	}

	public String nomAffichagePageUris() {
		return null;
	}

	public String htmTooltipPageUris() {
		return null;
	}

	public String htmPageUris() {
		return pageUris == null ? "" : StringEscapeUtils.escapeHtml4(strPageUris());
	}

	/////////////
	// pageUrl //
	/////////////

	/**	L'entité « pageUrl »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUrl;
	public Couverture<String> pageUrlCouverture = new Couverture<String>().p(this).c(String.class).var("pageUrl").o(pageUrl);

	/**	<br/>L'entité « pageUrl »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUrl">Trouver l'entité pageUrl dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUrl(Couverture<String> c);

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
		this.pageUrlCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageUrlInit() {
		if(!pageUrlCouverture.dejaInitialise) {
			_pageUrl(pageUrlCouverture);
			if(pageUrl == null)
				setPageUrl(pageUrlCouverture.o);
		}
		pageUrlCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageUrl() {
		return pageUrl;
	}

	public String strPageUrl() {
		return pageUrl == null ? "" : pageUrl;
	}

	public String nomAffichagePageUrl() {
		return null;
	}

	public String htmTooltipPageUrl() {
		return null;
	}

	public String htmPageUrl() {
		return pageUrl == null ? "" : StringEscapeUtils.escapeHtml4(strPageUrl());
	}

	//////////////////
	// pageImageUri //
	//////////////////

	/**	L'entité « pageImageUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageImageUri;
	public Couverture<String> pageImageUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageUri").o(pageImageUri);

	/**	<br/>L'entité « pageImageUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageUri">Trouver l'entité pageImageUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageUri(Couverture<String> c);

	public String getPageImageUri() {
		return pageImageUri;
	}

	public void setPageImageUri(String pageImageUri) {
		this.pageImageUri = pageImageUri;
		this.pageImageUriCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageImageUriInit() {
		if(!pageImageUriCouverture.dejaInitialise) {
			_pageImageUri(pageImageUriCouverture);
			if(pageImageUri == null)
				setPageImageUri(pageImageUriCouverture.o);
		}
		pageImageUriCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageImageUri() {
		return pageImageUri;
	}

	public String strPageImageUri() {
		return pageImageUri == null ? "" : pageImageUri;
	}

	public String nomAffichagePageImageUri() {
		return null;
	}

	public String htmTooltipPageImageUri() {
		return null;
	}

	public String htmPageImageUri() {
		return pageImageUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageUri());
	}

	//////////////////
	// pageImageUrl //
	//////////////////

	/**	L'entité « pageImageUrl »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageImageUrl;
	public Couverture<String> pageImageUrlCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageUrl").o(pageImageUrl);

	/**	<br/>L'entité « pageImageUrl »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageUrl">Trouver l'entité pageImageUrl dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageUrl(Couverture<String> c);

	public String getPageImageUrl() {
		return pageImageUrl;
	}

	public void setPageImageUrl(String pageImageUrl) {
		this.pageImageUrl = pageImageUrl;
		this.pageImageUrlCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageImageUrlInit() {
		if(!pageImageUrlCouverture.dejaInitialise) {
			_pageImageUrl(pageImageUrlCouverture);
			if(pageImageUrl == null)
				setPageImageUrl(pageImageUrlCouverture.o);
		}
		pageImageUrlCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageImageUrl() {
		return pageImageUrl;
	}

	public String strPageImageUrl() {
		return pageImageUrl == null ? "" : pageImageUrl;
	}

	public String nomAffichagePageImageUrl() {
		return null;
	}

	public String htmTooltipPageImageUrl() {
		return null;
	}

	public String htmPageImageUrl() {
		return pageImageUrl == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageUrl());
	}

	/////////////////
	// pageVideoId //
	/////////////////

	/**	L'entité « pageVideoId »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageVideoId;
	public Couverture<String> pageVideoIdCouverture = new Couverture<String>().p(this).c(String.class).var("pageVideoId").o(pageVideoId);

	/**	<br/>L'entité « pageVideoId »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageVideoId">Trouver l'entité pageVideoId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageVideoId(Couverture<String> c);

	public String getPageVideoId() {
		return pageVideoId;
	}

	public void setPageVideoId(String pageVideoId) {
		this.pageVideoId = pageVideoId;
		this.pageVideoIdCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageVideoIdInit() {
		if(!pageVideoIdCouverture.dejaInitialise) {
			_pageVideoId(pageVideoIdCouverture);
			if(pageVideoId == null)
				setPageVideoId(pageVideoIdCouverture.o);
		}
		pageVideoIdCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageVideoId() {
		return pageVideoId;
	}

	public String strPageVideoId() {
		return pageVideoId == null ? "" : pageVideoId;
	}

	public String nomAffichagePageVideoId() {
		return null;
	}

	public String htmTooltipPageVideoId() {
		return null;
	}

	public String htmPageVideoId() {
		return pageVideoId == null ? "" : StringEscapeUtils.escapeHtml4(strPageVideoId());
	}

	//////////////////
	// pageVideoUrl //
	//////////////////

	/**	L'entité « pageVideoUrl »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageVideoUrl;
	public Couverture<String> pageVideoUrlCouverture = new Couverture<String>().p(this).c(String.class).var("pageVideoUrl").o(pageVideoUrl);

	/**	<br/>L'entité « pageVideoUrl »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageVideoUrl">Trouver l'entité pageVideoUrl dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageVideoUrl(Couverture<String> c);

	public String getPageVideoUrl() {
		return pageVideoUrl;
	}

	public void setPageVideoUrl(String pageVideoUrl) {
		this.pageVideoUrl = pageVideoUrl;
		this.pageVideoUrlCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageVideoUrlInit() {
		if(!pageVideoUrlCouverture.dejaInitialise) {
			_pageVideoUrl(pageVideoUrlCouverture);
			if(pageVideoUrl == null)
				setPageVideoUrl(pageVideoUrlCouverture.o);
		}
		pageVideoUrlCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageVideoUrl() {
		return pageVideoUrl;
	}

	public String strPageVideoUrl() {
		return pageVideoUrl == null ? "" : pageVideoUrl;
	}

	public String nomAffichagePageVideoUrl() {
		return null;
	}

	public String htmTooltipPageVideoUrl() {
		return null;
	}

	public String htmPageVideoUrl() {
		return pageVideoUrl == null ? "" : StringEscapeUtils.escapeHtml4(strPageVideoUrl());
	}

	///////////////////////
	// pageVideoUrlEmbed //
	///////////////////////

	/**	L'entité « pageVideoUrlEmbed »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageVideoUrlEmbed;
	public Couverture<String> pageVideoUrlEmbedCouverture = new Couverture<String>().p(this).c(String.class).var("pageVideoUrlEmbed").o(pageVideoUrlEmbed);

	/**	<br/>L'entité « pageVideoUrlEmbed »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageVideoUrlEmbed">Trouver l'entité pageVideoUrlEmbed dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageVideoUrlEmbed(Couverture<String> c);

	public String getPageVideoUrlEmbed() {
		return pageVideoUrlEmbed;
	}

	public void setPageVideoUrlEmbed(String pageVideoUrlEmbed) {
		this.pageVideoUrlEmbed = pageVideoUrlEmbed;
		this.pageVideoUrlEmbedCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageVideoUrlEmbedInit() {
		if(!pageVideoUrlEmbedCouverture.dejaInitialise) {
			_pageVideoUrlEmbed(pageVideoUrlEmbedCouverture);
			if(pageVideoUrlEmbed == null)
				setPageVideoUrlEmbed(pageVideoUrlEmbedCouverture.o);
		}
		pageVideoUrlEmbedCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageVideoUrlEmbed() {
		return pageVideoUrlEmbed;
	}

	public String strPageVideoUrlEmbed() {
		return pageVideoUrlEmbed == null ? "" : pageVideoUrlEmbed;
	}

	public String nomAffichagePageVideoUrlEmbed() {
		return null;
	}

	public String htmTooltipPageVideoUrlEmbed() {
		return null;
	}

	public String htmPageVideoUrlEmbed() {
		return pageVideoUrlEmbed == null ? "" : StringEscapeUtils.escapeHtml4(strPageVideoUrlEmbed());
	}

	//////////////////////
	// pageImageLargeur //
	//////////////////////

	/**	L'entité « pageImageLargeur »
	 *	 is defined as null before being initialized. 
	 */
	protected Integer pageImageLargeur;
	public Couverture<Integer> pageImageLargeurCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("pageImageLargeur").o(pageImageLargeur);

	/**	<br/>L'entité « pageImageLargeur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageLargeur">Trouver l'entité pageImageLargeur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageLargeur(Couverture<Integer> c);

	public Integer getPageImageLargeur() {
		return pageImageLargeur;
	}

	public void setPageImageLargeur(Integer pageImageLargeur) {
		this.pageImageLargeur = pageImageLargeur;
		this.pageImageLargeurCouverture.dejaInitialise = true;
	}
	public MiseEnPage setPageImageLargeur(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.pageImageLargeur = Integer.parseInt(o);
		this.pageImageLargeurCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	protected MiseEnPage pageImageLargeurInit() {
		if(!pageImageLargeurCouverture.dejaInitialise) {
			_pageImageLargeur(pageImageLargeurCouverture);
			if(pageImageLargeur == null)
				setPageImageLargeur(pageImageLargeurCouverture.o);
		}
		pageImageLargeurCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public Integer solrPageImageLargeur() {
		return pageImageLargeur;
	}

	public String strPageImageLargeur() {
		return pageImageLargeur == null ? "" : pageImageLargeur.toString();
	}

	public String nomAffichagePageImageLargeur() {
		return null;
	}

	public String htmTooltipPageImageLargeur() {
		return null;
	}

	public String htmPageImageLargeur() {
		return pageImageLargeur == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageLargeur());
	}

	//////////////////////
	// pageImageHauteur //
	//////////////////////

	/**	L'entité « pageImageHauteur »
	 *	 is defined as null before being initialized. 
	 */
	protected Integer pageImageHauteur;
	public Couverture<Integer> pageImageHauteurCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("pageImageHauteur").o(pageImageHauteur);

	/**	<br/>L'entité « pageImageHauteur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageHauteur">Trouver l'entité pageImageHauteur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageHauteur(Couverture<Integer> c);

	public Integer getPageImageHauteur() {
		return pageImageHauteur;
	}

	public void setPageImageHauteur(Integer pageImageHauteur) {
		this.pageImageHauteur = pageImageHauteur;
		this.pageImageHauteurCouverture.dejaInitialise = true;
	}
	public MiseEnPage setPageImageHauteur(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.pageImageHauteur = Integer.parseInt(o);
		this.pageImageHauteurCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	protected MiseEnPage pageImageHauteurInit() {
		if(!pageImageHauteurCouverture.dejaInitialise) {
			_pageImageHauteur(pageImageHauteurCouverture);
			if(pageImageHauteur == null)
				setPageImageHauteur(pageImageHauteurCouverture.o);
		}
		pageImageHauteurCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public Integer solrPageImageHauteur() {
		return pageImageHauteur;
	}

	public String strPageImageHauteur() {
		return pageImageHauteur == null ? "" : pageImageHauteur.toString();
	}

	public String nomAffichagePageImageHauteur() {
		return null;
	}

	public String htmTooltipPageImageHauteur() {
		return null;
	}

	public String htmPageImageHauteur() {
		return pageImageHauteur == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageHauteur());
	}

	//////////////////////////
	// pageImageTypeContenu //
	//////////////////////////

	/**	L'entité « pageImageTypeContenu »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageImageTypeContenu;
	public Couverture<String> pageImageTypeContenuCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageTypeContenu").o(pageImageTypeContenu);

	/**	<br/>L'entité « pageImageTypeContenu »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageTypeContenu">Trouver l'entité pageImageTypeContenu dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageTypeContenu(Couverture<String> c);

	public String getPageImageTypeContenu() {
		return pageImageTypeContenu;
	}

	public void setPageImageTypeContenu(String pageImageTypeContenu) {
		this.pageImageTypeContenu = pageImageTypeContenu;
		this.pageImageTypeContenuCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageImageTypeContenuInit() {
		if(!pageImageTypeContenuCouverture.dejaInitialise) {
			_pageImageTypeContenu(pageImageTypeContenuCouverture);
			if(pageImageTypeContenu == null)
				setPageImageTypeContenu(pageImageTypeContenuCouverture.o);
		}
		pageImageTypeContenuCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageImageTypeContenu() {
		return pageImageTypeContenu;
	}

	public String strPageImageTypeContenu() {
		return pageImageTypeContenu == null ? "" : pageImageTypeContenu;
	}

	public String nomAffichagePageImageTypeContenu() {
		return null;
	}

	public String htmTooltipPageImageTypeContenu() {
		return null;
	}

	public String htmPageImageTypeContenu() {
		return pageImageTypeContenu == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageTypeContenu());
	}

	/////////////////////
	// pageTypeContenu //
	/////////////////////

	/**	L'entité « pageTypeContenu »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageTypeContenu;
	public Couverture<String> pageTypeContenuCouverture = new Couverture<String>().p(this).c(String.class).var("pageTypeContenu").o(pageTypeContenu);

	/**	<br/>L'entité « pageTypeContenu »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageTypeContenu">Trouver l'entité pageTypeContenu dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageTypeContenu(Couverture<String> c);

	public String getPageTypeContenu() {
		return pageTypeContenu;
	}

	public void setPageTypeContenu(String pageTypeContenu) {
		this.pageTypeContenu = pageTypeContenu;
		this.pageTypeContenuCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageTypeContenuInit() {
		if(!pageTypeContenuCouverture.dejaInitialise) {
			_pageTypeContenu(pageTypeContenuCouverture);
			if(pageTypeContenu == null)
				setPageTypeContenu(pageTypeContenuCouverture.o);
		}
		pageTypeContenuCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageTypeContenu() {
		return pageTypeContenu;
	}

	public String strPageTypeContenu() {
		return pageTypeContenu == null ? "" : pageTypeContenu;
	}

	public String nomAffichagePageTypeContenu() {
		return null;
	}

	public String htmTooltipPageTypeContenu() {
		return null;
	}

	public String htmPageTypeContenu() {
		return pageTypeContenu == null ? "" : StringEscapeUtils.escapeHtml4(strPageTypeContenu());
	}

	//////////////
	// pageCree //
	//////////////

	/**	L'entité « pageCree »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime pageCree;
	public Couverture<LocalDateTime> pageCreeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("pageCree").o(pageCree);

	/**	<br/>L'entité « pageCree »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageCree">Trouver l'entité pageCree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageCree(Couverture<LocalDateTime> c);

	public LocalDateTime getPageCree() {
		return pageCree;
	}

	public void setPageCree(LocalDateTime pageCree) {
		this.pageCree = pageCree;
		this.pageCreeCouverture.dejaInitialise = true;
	}
	public MiseEnPage setPageCree(Instant o) {
		this.pageCree = LocalDateTime.from(o);
		this.pageCreeCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public MiseEnPage setPageCree(String o) {
		this.pageCree = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.pageCreeCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	public MiseEnPage setPageCree(Date o) {
		this.pageCree = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.pageCreeCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	protected MiseEnPage pageCreeInit() {
		if(!pageCreeCouverture.dejaInitialise) {
			_pageCree(pageCreeCouverture);
			if(pageCree == null)
				setPageCree(pageCreeCouverture.o);
		}
		pageCreeCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public Date solrPageCree() {
		return pageCree == null ? null : Date.from(pageCree.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strPageCree() {
		return pageCree == null ? "" : pageCree.toString();
	}

	public String nomAffichagePageCree() {
		return null;
	}

	public String htmTooltipPageCree() {
		return null;
	}

	public String htmPageCree() {
		return pageCree == null ? "" : StringEscapeUtils.escapeHtml4(strPageCree());
	}

	//////////////////
	// pageModifiee //
	//////////////////

	/**	L'entité « pageModifiee »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime pageModifiee;
	public Couverture<LocalDateTime> pageModifieeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("pageModifiee").o(pageModifiee);

	/**	<br/>L'entité « pageModifiee »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageModifiee">Trouver l'entité pageModifiee dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageModifiee(Couverture<LocalDateTime> c);

	public LocalDateTime getPageModifiee() {
		return pageModifiee;
	}

	public void setPageModifiee(LocalDateTime pageModifiee) {
		this.pageModifiee = pageModifiee;
		this.pageModifieeCouverture.dejaInitialise = true;
	}
	public MiseEnPage setPageModifiee(Instant o) {
		this.pageModifiee = LocalDateTime.from(o);
		this.pageModifieeCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public MiseEnPage setPageModifiee(String o) {
		this.pageModifiee = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.pageModifieeCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	public MiseEnPage setPageModifiee(Date o) {
		this.pageModifiee = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.pageModifieeCouverture.dejaInitialise = true;
		return (MiseEnPage)this;
	}
	protected MiseEnPage pageModifieeInit() {
		if(!pageModifieeCouverture.dejaInitialise) {
			_pageModifiee(pageModifieeCouverture);
			if(pageModifiee == null)
				setPageModifiee(pageModifieeCouverture.o);
		}
		pageModifieeCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public Date solrPageModifiee() {
		return pageModifiee == null ? null : Date.from(pageModifiee.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strPageModifiee() {
		return pageModifiee == null ? "" : pageModifiee.toString();
	}

	public String nomAffichagePageModifiee() {
		return null;
	}

	public String htmTooltipPageModifiee() {
		return null;
	}

	public String htmPageModifiee() {
		return pageModifiee == null ? "" : StringEscapeUtils.escapeHtml4(strPageModifiee());
	}

	//////////////////
	// pageMotsCles //
	//////////////////

	/**	L'entité « pageMotsCles »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageMotsCles;
	public Couverture<String> pageMotsClesCouverture = new Couverture<String>().p(this).c(String.class).var("pageMotsCles").o(pageMotsCles);

	/**	<br/>L'entité « pageMotsCles »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageMotsCles">Trouver l'entité pageMotsCles dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageMotsCles(Couverture<String> c);

	public String getPageMotsCles() {
		return pageMotsCles;
	}

	public void setPageMotsCles(String pageMotsCles) {
		this.pageMotsCles = pageMotsCles;
		this.pageMotsClesCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageMotsClesInit() {
		if(!pageMotsClesCouverture.dejaInitialise) {
			_pageMotsCles(pageMotsClesCouverture);
			if(pageMotsCles == null)
				setPageMotsCles(pageMotsClesCouverture.o);
		}
		pageMotsClesCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageMotsCles() {
		return pageMotsCles;
	}

	public String strPageMotsCles() {
		return pageMotsCles == null ? "" : pageMotsCles;
	}

	public String nomAffichagePageMotsCles() {
		return null;
	}

	public String htmTooltipPageMotsCles() {
		return null;
	}

	public String htmPageMotsCles() {
		return pageMotsCles == null ? "" : StringEscapeUtils.escapeHtml4(strPageMotsCles());
	}

	/////////////////////
	// pageDescription //
	/////////////////////

	/**	L'entité « pageDescription »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageDescription;
	public Couverture<String> pageDescriptionCouverture = new Couverture<String>().p(this).c(String.class).var("pageDescription").o(pageDescription);

	/**	<br/>L'entité « pageDescription »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageDescription">Trouver l'entité pageDescription dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageDescription(Couverture<String> c);

	public String getPageDescription() {
		return pageDescription;
	}

	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
		this.pageDescriptionCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageDescriptionInit() {
		if(!pageDescriptionCouverture.dejaInitialise) {
			_pageDescription(pageDescriptionCouverture);
			if(pageDescription == null)
				setPageDescription(pageDescriptionCouverture.o);
		}
		pageDescriptionCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageDescription() {
		return pageDescription;
	}

	public String strPageDescription() {
		return pageDescription == null ? "" : pageDescription;
	}

	public String nomAffichagePageDescription() {
		return null;
	}

	public String htmTooltipPageDescription() {
		return null;
	}

	public String htmPageDescription() {
		return pageDescription == null ? "" : StringEscapeUtils.escapeHtml4(strPageDescription());
	}

	////////////////////
	// pageAccueilUri //
	////////////////////

	/**	L'entité « pageAccueilUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageAccueilUri;
	public Couverture<String> pageAccueilUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageAccueilUri").o(pageAccueilUri);

	/**	<br/>L'entité « pageAccueilUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageAccueilUri">Trouver l'entité pageAccueilUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageAccueilUri(Couverture<String> c);

	public String getPageAccueilUri() {
		return pageAccueilUri;
	}

	public void setPageAccueilUri(String pageAccueilUri) {
		this.pageAccueilUri = pageAccueilUri;
		this.pageAccueilUriCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageAccueilUriInit() {
		if(!pageAccueilUriCouverture.dejaInitialise) {
			_pageAccueilUri(pageAccueilUriCouverture);
			if(pageAccueilUri == null)
				setPageAccueilUri(pageAccueilUriCouverture.o);
		}
		pageAccueilUriCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageAccueilUri() {
		return pageAccueilUri;
	}

	public String strPageAccueilUri() {
		return pageAccueilUri == null ? "" : pageAccueilUri;
	}

	public String nomAffichagePageAccueilUri() {
		return null;
	}

	public String htmTooltipPageAccueilUri() {
		return null;
	}

	public String htmPageAccueilUri() {
		return pageAccueilUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageAccueilUri());
	}

	///////////////////
	// pageCalculInr //
	///////////////////

	/**	L'entité « pageCalculInr »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageCalculInr;
	public Couverture<String> pageCalculInrCouverture = new Couverture<String>().p(this).c(String.class).var("pageCalculInr").o(pageCalculInr);

	/**	<br/>L'entité « pageCalculInr »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageCalculInr">Trouver l'entité pageCalculInr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageCalculInr(Couverture<String> c);

	public String getPageCalculInr() {
		return pageCalculInr;
	}

	public void setPageCalculInr(String pageCalculInr) {
		this.pageCalculInr = pageCalculInr;
		this.pageCalculInrCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageCalculInrInit() {
		if(!pageCalculInrCouverture.dejaInitialise) {
			_pageCalculInr(pageCalculInrCouverture);
			if(pageCalculInr == null)
				setPageCalculInr(pageCalculInrCouverture.o);
		}
		pageCalculInrCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageCalculInr() {
		return pageCalculInr;
	}

	public String strPageCalculInr() {
		return pageCalculInr == null ? "" : pageCalculInr;
	}

	public String nomAffichagePageCalculInr() {
		return null;
	}

	public String htmTooltipPageCalculInr() {
		return null;
	}

	public String htmPageCalculInr() {
		return pageCalculInr == null ? "" : StringEscapeUtils.escapeHtml4(strPageCalculInr());
	}

	////////////////////
	// pageAProposUri //
	////////////////////

	/**	L'entité « pageAProposUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageAProposUri;
	public Couverture<String> pageAProposUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageAProposUri").o(pageAProposUri);

	/**	<br/>L'entité « pageAProposUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageAProposUri">Trouver l'entité pageAProposUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageAProposUri(Couverture<String> c);

	public String getPageAProposUri() {
		return pageAProposUri;
	}

	public void setPageAProposUri(String pageAProposUri) {
		this.pageAProposUri = pageAProposUri;
		this.pageAProposUriCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageAProposUriInit() {
		if(!pageAProposUriCouverture.dejaInitialise) {
			_pageAProposUri(pageAProposUriCouverture);
			if(pageAProposUri == null)
				setPageAProposUri(pageAProposUriCouverture.o);
		}
		pageAProposUriCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageAProposUri() {
		return pageAProposUri;
	}

	public String strPageAProposUri() {
		return pageAProposUri == null ? "" : pageAProposUri;
	}

	public String nomAffichagePageAProposUri() {
		return null;
	}

	public String htmTooltipPageAProposUri() {
		return null;
	}

	public String htmPageAProposUri() {
		return pageAProposUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageAProposUri());
	}

	////////////////
	// pageFaqUri //
	////////////////

	/**	L'entité « pageFaqUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageFaqUri;
	public Couverture<String> pageFaqUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageFaqUri").o(pageFaqUri);

	/**	<br/>L'entité « pageFaqUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageFaqUri">Trouver l'entité pageFaqUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageFaqUri(Couverture<String> c);

	public String getPageFaqUri() {
		return pageFaqUri;
	}

	public void setPageFaqUri(String pageFaqUri) {
		this.pageFaqUri = pageFaqUri;
		this.pageFaqUriCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageFaqUriInit() {
		if(!pageFaqUriCouverture.dejaInitialise) {
			_pageFaqUri(pageFaqUriCouverture);
			if(pageFaqUri == null)
				setPageFaqUri(pageFaqUriCouverture.o);
		}
		pageFaqUriCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageFaqUri() {
		return pageFaqUri;
	}

	public String strPageFaqUri() {
		return pageFaqUri == null ? "" : pageFaqUri;
	}

	public String nomAffichagePageFaqUri() {
		return null;
	}

	public String htmTooltipPageFaqUri() {
		return null;
	}

	public String htmPageFaqUri() {
		return pageFaqUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageFaqUri());
	}

	////////////////////////
	// pageUtilisateurUri //
	////////////////////////

	/**	L'entité « pageUtilisateurUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUtilisateurUri;
	public Couverture<String> pageUtilisateurUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageUtilisateurUri").o(pageUtilisateurUri);

	/**	<br/>L'entité « pageUtilisateurUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUtilisateurUri">Trouver l'entité pageUtilisateurUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUtilisateurUri(Couverture<String> c);

	public String getPageUtilisateurUri() {
		return pageUtilisateurUri;
	}

	public void setPageUtilisateurUri(String pageUtilisateurUri) {
		this.pageUtilisateurUri = pageUtilisateurUri;
		this.pageUtilisateurUriCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageUtilisateurUriInit() {
		if(!pageUtilisateurUriCouverture.dejaInitialise) {
			_pageUtilisateurUri(pageUtilisateurUriCouverture);
			if(pageUtilisateurUri == null)
				setPageUtilisateurUri(pageUtilisateurUriCouverture.o);
		}
		pageUtilisateurUriCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageUtilisateurUri() {
		return pageUtilisateurUri;
	}

	public String strPageUtilisateurUri() {
		return pageUtilisateurUri == null ? "" : pageUtilisateurUri;
	}

	public String nomAffichagePageUtilisateurUri() {
		return null;
	}

	public String htmTooltipPageUtilisateurUri() {
		return null;
	}

	public String htmPageUtilisateurUri() {
		return pageUtilisateurUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageUtilisateurUri());
	}

	////////////////////////
	// pageDeconnexionUri //
	////////////////////////

	/**	L'entité « pageDeconnexionUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageDeconnexionUri;
	public Couverture<String> pageDeconnexionUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageDeconnexionUri").o(pageDeconnexionUri);

	/**	<br/>L'entité « pageDeconnexionUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.cardiaque.page.MiseEnPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageDeconnexionUri">Trouver l'entité pageDeconnexionUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageDeconnexionUri(Couverture<String> c);

	public String getPageDeconnexionUri() {
		return pageDeconnexionUri;
	}

	public void setPageDeconnexionUri(String pageDeconnexionUri) {
		this.pageDeconnexionUri = pageDeconnexionUri;
		this.pageDeconnexionUriCouverture.dejaInitialise = true;
	}
	protected MiseEnPage pageDeconnexionUriInit() {
		if(!pageDeconnexionUriCouverture.dejaInitialise) {
			_pageDeconnexionUri(pageDeconnexionUriCouverture);
			if(pageDeconnexionUri == null)
				setPageDeconnexionUri(pageDeconnexionUriCouverture.o);
		}
		pageDeconnexionUriCouverture.dejaInitialise(true);
		return (MiseEnPage)this;
	}

	public String solrPageDeconnexionUri() {
		return pageDeconnexionUri;
	}

	public String strPageDeconnexionUri() {
		return pageDeconnexionUri == null ? "" : pageDeconnexionUri;
	}

	public String nomAffichagePageDeconnexionUri() {
		return null;
	}

	public String htmTooltipPageDeconnexionUri() {
		return null;
	}

	public String htmPageDeconnexionUri() {
		return pageDeconnexionUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageDeconnexionUri());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseMiseEnPage = false;

	public MiseEnPage initLoinMiseEnPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseMiseEnPage) {
			dejaInitialiseMiseEnPage = true;
			initLoinMiseEnPage();
		}
		return (MiseEnPage)this;
	}

	public void initLoinMiseEnPage() {
		initMiseEnPage();
	}

	public void initMiseEnPage() {
		pageDocumentSolrInit();
		wInit();
		pageVisibleAuxBotsInit();
		pageH1Init();
		pageH2Init();
		pageH1CourtInit();
		pageH2CourtInit();
		pageTitreInit();
		pageUriInit();
		pageUrisInit();
		pageUrlInit();
		pageImageUriInit();
		pageImageUrlInit();
		pageVideoIdInit();
		pageVideoUrlInit();
		pageVideoUrlEmbedInit();
		pageImageLargeurInit();
		pageImageHauteurInit();
		pageImageTypeContenuInit();
		pageTypeContenuInit();
		pageCreeInit();
		pageModifieeInit();
		pageMotsClesInit();
		pageDescriptionInit();
		pageAccueilUriInit();
		pageCalculInrInit();
		pageAProposUriInit();
		pageFaqUriInit();
		pageUtilisateurUriInit();
		pageDeconnexionUriInit();
	}

	public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinMiseEnPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteMiseEnPage(RequeteSite requeteSite_) {
		w.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteMiseEnPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirMiseEnPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirMiseEnPage(String var) throws Exception {
		MiseEnPage oMiseEnPage = (MiseEnPage)this;
		switch(var) {
			case "requeteSite_":
				return oMiseEnPage.requeteSite_;
			case "pageDocumentSolr":
				return oMiseEnPage.pageDocumentSolr;
			case "w":
				return oMiseEnPage.w;
			case "pageVisibleAuxBots":
				return oMiseEnPage.pageVisibleAuxBots;
			case "pageH1":
				return oMiseEnPage.pageH1;
			case "pageH2":
				return oMiseEnPage.pageH2;
			case "pageH1Court":
				return oMiseEnPage.pageH1Court;
			case "pageH2Court":
				return oMiseEnPage.pageH2Court;
			case "pageTitre":
				return oMiseEnPage.pageTitre;
			case "pageUri":
				return oMiseEnPage.pageUri;
			case "pageUris":
				return oMiseEnPage.pageUris;
			case "pageUrl":
				return oMiseEnPage.pageUrl;
			case "pageImageUri":
				return oMiseEnPage.pageImageUri;
			case "pageImageUrl":
				return oMiseEnPage.pageImageUrl;
			case "pageVideoId":
				return oMiseEnPage.pageVideoId;
			case "pageVideoUrl":
				return oMiseEnPage.pageVideoUrl;
			case "pageVideoUrlEmbed":
				return oMiseEnPage.pageVideoUrlEmbed;
			case "pageImageLargeur":
				return oMiseEnPage.pageImageLargeur;
			case "pageImageHauteur":
				return oMiseEnPage.pageImageHauteur;
			case "pageImageTypeContenu":
				return oMiseEnPage.pageImageTypeContenu;
			case "pageTypeContenu":
				return oMiseEnPage.pageTypeContenu;
			case "pageCree":
				return oMiseEnPage.pageCree;
			case "pageModifiee":
				return oMiseEnPage.pageModifiee;
			case "pageMotsCles":
				return oMiseEnPage.pageMotsCles;
			case "pageDescription":
				return oMiseEnPage.pageDescription;
			case "pageAccueilUri":
				return oMiseEnPage.pageAccueilUri;
			case "pageCalculInr":
				return oMiseEnPage.pageCalculInr;
			case "pageAProposUri":
				return oMiseEnPage.pageAProposUri;
			case "pageFaqUri":
				return oMiseEnPage.pageFaqUri;
			case "pageUtilisateurUri":
				return oMiseEnPage.pageUtilisateurUri;
			case "pageDeconnexionUri":
				return oMiseEnPage.pageDeconnexionUri;
			default:
				return null;
		}
	}

	///////////////
	// attribuer //
	///////////////

	public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerMiseEnPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerMiseEnPage(String var, Object val) {
		MiseEnPage oMiseEnPage = (MiseEnPage)this;
		switch(var) {
			default:
				return null;
		}
	}

	/////////////
	// definir //
	/////////////

	public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirMiseEnPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirMiseEnPage(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////
	// html //
	//////////

	public void html() {
		htmlMiseEnPage();
	}

	public void htmlMiseEnPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	public void htmlMeta() {
		htmlMetaMiseEnPage();
	}

	public void htmlMetaMiseEnPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsMiseEnPage();
	}

	public void htmlScriptsMiseEnPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	public void htmlScript() {
		htmlScriptMiseEnPage();
	}

	public void htmlScriptMiseEnPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	public void htmlStyles() {
		htmlStylesMiseEnPage();
	}

	public void htmlStylesMiseEnPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	public void htmlStyle() {
		htmlStyleMiseEnPage();
	}

	public void htmlStyleMiseEnPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyMiseEnPage();
	}

	public void htmlBodyMiseEnPage() {
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(pageVisibleAuxBots, pageH1, pageH2, pageH1Court, pageH2Court, pageTitre, pageUri, pageUris, pageUrl, pageImageUri, pageImageUrl, pageVideoId, pageVideoUrl, pageVideoUrlEmbed, pageImageLargeur, pageImageHauteur, pageImageTypeContenu, pageTypeContenu, pageCree, pageModifiee, pageMotsCles, pageDescription, pageAccueilUri, pageCalculInr, pageAProposUri, pageFaqUri, pageUtilisateurUri, pageDeconnexionUri);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof MiseEnPage))
			return false;
		MiseEnPage that = (MiseEnPage)o;
		return Objects.equals( pageVisibleAuxBots, that.pageVisibleAuxBots )
				&& Objects.equals( pageH1, that.pageH1 )
				&& Objects.equals( pageH2, that.pageH2 )
				&& Objects.equals( pageH1Court, that.pageH1Court )
				&& Objects.equals( pageH2Court, that.pageH2Court )
				&& Objects.equals( pageTitre, that.pageTitre )
				&& Objects.equals( pageUri, that.pageUri )
				&& Objects.equals( pageUris, that.pageUris )
				&& Objects.equals( pageUrl, that.pageUrl )
				&& Objects.equals( pageImageUri, that.pageImageUri )
				&& Objects.equals( pageImageUrl, that.pageImageUrl )
				&& Objects.equals( pageVideoId, that.pageVideoId )
				&& Objects.equals( pageVideoUrl, that.pageVideoUrl )
				&& Objects.equals( pageVideoUrlEmbed, that.pageVideoUrlEmbed )
				&& Objects.equals( pageImageLargeur, that.pageImageLargeur )
				&& Objects.equals( pageImageHauteur, that.pageImageHauteur )
				&& Objects.equals( pageImageTypeContenu, that.pageImageTypeContenu )
				&& Objects.equals( pageTypeContenu, that.pageTypeContenu )
				&& Objects.equals( pageCree, that.pageCree )
				&& Objects.equals( pageModifiee, that.pageModifiee )
				&& Objects.equals( pageMotsCles, that.pageMotsCles )
				&& Objects.equals( pageDescription, that.pageDescription )
				&& Objects.equals( pageAccueilUri, that.pageAccueilUri )
				&& Objects.equals( pageCalculInr, that.pageCalculInr )
				&& Objects.equals( pageAProposUri, that.pageAProposUri )
				&& Objects.equals( pageFaqUri, that.pageFaqUri )
				&& Objects.equals( pageUtilisateurUri, that.pageUtilisateurUri )
				&& Objects.equals( pageDeconnexionUri, that.pageDeconnexionUri );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MiseEnPage {");
		sb.append( "pageVisibleAuxBots: " ).append(pageVisibleAuxBots);
		sb.append( ", pageH1: \"" ).append(pageH1).append( "\"" );
		sb.append( ", pageH2: \"" ).append(pageH2).append( "\"" );
		sb.append( ", pageH1Court: \"" ).append(pageH1Court).append( "\"" );
		sb.append( ", pageH2Court: \"" ).append(pageH2Court).append( "\"" );
		sb.append( ", pageTitre: \"" ).append(pageTitre).append( "\"" );
		sb.append( ", pageUri: \"" ).append(pageUri).append( "\"" );
		sb.append( ", pageUris: " ).append(pageUris);
		sb.append( ", pageUrl: \"" ).append(pageUrl).append( "\"" );
		sb.append( ", pageImageUri: \"" ).append(pageImageUri).append( "\"" );
		sb.append( ", pageImageUrl: \"" ).append(pageImageUrl).append( "\"" );
		sb.append( ", pageVideoId: \"" ).append(pageVideoId).append( "\"" );
		sb.append( ", pageVideoUrl: \"" ).append(pageVideoUrl).append( "\"" );
		sb.append( ", pageVideoUrlEmbed: \"" ).append(pageVideoUrlEmbed).append( "\"" );
		sb.append( ", pageImageLargeur: " ).append(pageImageLargeur);
		sb.append( ", pageImageHauteur: " ).append(pageImageHauteur);
		sb.append( ", pageImageTypeContenu: \"" ).append(pageImageTypeContenu).append( "\"" );
		sb.append( ", pageTypeContenu: \"" ).append(pageTypeContenu).append( "\"" );
		sb.append( ", pageCree: " ).append(pageCree);
		sb.append( ", pageModifiee: " ).append(pageModifiee);
		sb.append( ", pageMotsCles: \"" ).append(pageMotsCles).append( "\"" );
		sb.append( ", pageDescription: \"" ).append(pageDescription).append( "\"" );
		sb.append( ", pageAccueilUri: \"" ).append(pageAccueilUri).append( "\"" );
		sb.append( ", pageCalculInr: \"" ).append(pageCalculInr).append( "\"" );
		sb.append( ", pageAProposUri: \"" ).append(pageAProposUri).append( "\"" );
		sb.append( ", pageFaqUri: \"" ).append(pageFaqUri).append( "\"" );
		sb.append( ", pageUtilisateurUri: \"" ).append(pageUtilisateurUri).append( "\"" );
		sb.append( ", pageDeconnexionUri: \"" ).append(pageDeconnexionUri).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
