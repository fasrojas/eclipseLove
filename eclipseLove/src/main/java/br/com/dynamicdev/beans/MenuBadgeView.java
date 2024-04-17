package br.com.dynamicdev.beans;

import org.primefaces.model.badge.BadgeModel;
import org.primefaces.model.badge.DefaultBadgeModel;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@Named
@RequestScoped
public class MenuBadgeView {

    private BadgeModel badgeModel;

    @PostConstruct
    public void init() {
        badgeModel = DefaultBadgeModel.builder()
                .severity("danger")
                .build();
    }

    public BadgeModel getBadgeModel() {
        return badgeModel;
    }

}
