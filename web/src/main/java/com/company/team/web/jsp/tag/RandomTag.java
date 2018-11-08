package com.company.team.web.jsp.tag;

import jar.core.Primes;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.math.BigInteger;

public class RandomTag extends TagSupport {

    private static final long serialVersionUID = 3440101932047245924L;

    protected int len = 50;

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            BigInteger prime = Primes.nextPrime(Primes.random(len));
            out.print(prime);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    public void setLength(String length) {
        try {
            len = Integer.parseInt(length);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            len = 50;
        }
    }
}
