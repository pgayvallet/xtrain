package fr.xebia.training.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * ValidationUtils -
 *
 * @author spark <pierre.gayvallet@gmail.com>
 */
public final class ValidationUtils {

    private static final String PERMALINK_REGEXP = "[a-z0-9\\-]*";

    private ValidationUtils() {
    }

    public static boolean isValidPermalink(String permalink) {
        if(StringUtils.isBlank(permalink)) {
            return false;
        }
        return permalink.matches(PERMALINK_REGEXP);
    }

}
