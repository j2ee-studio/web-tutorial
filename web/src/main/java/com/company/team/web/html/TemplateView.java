package com.company.team.web.html;

import j2html.tags.Tag;

public interface TemplateView {
    default String getTitle(){
        return "";
    }

    default Tag[] getHeaderContent(){
        return new Tag[0];
    }

    default Tag[] getMainContent() {
        return new Tag[0];
    }

    default Tag[] getFooterContent() {
        return new Tag[0];
    }
}
