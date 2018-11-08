package com.company.team.utility;

import java.util.Enumeration;
import java.util.function.Consumer;

public class Extensions {
    public static <T> void forEach(Enumeration<T> e, Consumer<? super T> c) {
        while(e.hasMoreElements()) c.accept(e.nextElement());
    }

    /**
     * A common method for all enums since they can't have another base class
     * @param <T> Enum type
     * @param c enum type. All enums must be all caps.
     * @param string case insensitive
     * @return corresponding enum, or null
     */
    public static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
        if( c != null && string != null ) {
            try {
                return Enum.valueOf(c, string.trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
            }
        }
        return null;
    }
}
