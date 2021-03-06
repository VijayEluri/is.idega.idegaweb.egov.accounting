/*
 * $Id$ Created on Dec 18, 2006
 * 
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 * 
 * This software is the proprietary information of Idega hf. Use is subject to license terms.
 */
package is.idega.idegaweb.egov.accounting.presentation;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;

import com.idega.presentation.IWBaseComponent;
import com.idega.webface.WFUtil;

public class UpdateAgresso extends IWBaseComponent {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.idega.presentation.IWBaseComponent#initializeComponent(javax.faces.context.FacesContext)
	 */
	protected void initializeComponent(FacesContext context) {
		// TODO Auto-generated method stub

		setId(getParent().getId() + "_updateagresso");

		super.initializeComponent(context);

		MethodBinding binding = WFUtil.createMethodBinding("#{AgressoBusinessBean.executeAfterSchoolCareUpdate}", null);

		HtmlCommandButton button = new HtmlCommandButton();
		button.setId(this.getId() + "_agressoafterschoolcareupdatebutton");
		button.setAction(binding);
		button.setValue("Update after school care");

		add(button);

		binding = WFUtil.createMethodBinding("#{AgressoBusinessBean.executeCourseUpdate}", null);

		button = new HtmlCommandButton();
		button.setId(this.getId() + "_agressocourseupdatebutton");
		button.setAction(binding);
		button.setValue("Update course");

		add(button);
	}
}