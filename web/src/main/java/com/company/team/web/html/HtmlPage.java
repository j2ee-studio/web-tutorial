package com.company.team.web.html;

import j2html.tags.Tag;

import static j2html.TagCreator.*;

public abstract class HtmlPage extends HtmlTag {

    protected final TemplateView templateView;

    protected HtmlPage(TemplateView templateView) {
        this.templateView = templateView;
    }

    public String render() {
        return document(
                html(
                        head(
                                // meta().atr("http-equiv", "Content-Type").withContent("text/html;charset=ISO-8859-1"), // HTML4
                                // meta().withCharset("UTF-8"), // HTML5
                                meta().withName("description").withContent("Free Web tutorials"),
                                meta().withName("keywords").withContent("HTML,CSS,XML,JavaScript"),
                                meta().withName("author").withContent("Hossein Mohammadi"),
                                meta().withName("viewport").withContent("width=device-width, initial-scale=1.0"),
                                title(getTitle())
                        ).withLang("en"),
                        body(
                                header(
                                        getHeaderContent()
                                ),
                                main(
                                        getMainContent() //the view from the partials example
                                ),
                                footer(
                                        getFooterContent()
                                )
                        )
                )
        );
    }

    public String getDocType() {
        return "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">";
    }

    protected abstract String getTitle();

    protected abstract Tag[] getHeaderContent();

    protected abstract Tag[] getMainContent();

    protected abstract Tag[] getFooterContent();
}