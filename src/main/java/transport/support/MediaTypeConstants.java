package transport.support;

import java.nio.charset.Charset;

import org.springframework.http.MediaType;

/**
 * Media type constants that extend the MediaType constants defined in
 * {@link MediaType} and can be referenced by web controllers. Note that for
 * each MediaType constant there is also a String value constant defined so that
 * it can be used in annotations.
 * 
 * @author n.kazarian
 *
 */
public class MediaTypeConstants {

	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType("application", "json", Charset.forName("UTF-8"));

	public static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";
}
